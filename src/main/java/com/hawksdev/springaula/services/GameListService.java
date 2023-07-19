package com.hawksdev.springaula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hawksdev.springaula.dto.GameListDto;
import com.hawksdev.springaula.repositories.IGameListRepository;
import com.hawksdev.springaula.repositories.IGameRepository;

@Service
public class GameListService {

  @Autowired
  private IGameListRepository _gameListRepository;

  @Autowired
  private IGameRepository _gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDto> findAll() {
    var result = _gameListRepository.findAll();
    return result.stream().map(x -> new GameListDto(x)).toList();
  }

  @Transactional
  public void move(long listId, int sourceIndex, int destinationIndex) {
    var listResult = _gameRepository.searchByList(listId);
    var obj = listResult.remove(sourceIndex);
    listResult.add(destinationIndex, obj);

    var min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    var max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

    for (int ps = min; ps <= max; ps++)
      _gameListRepository.updateBelongingPosition(listId, listResult.get(ps).getId(), ps);

  }

}

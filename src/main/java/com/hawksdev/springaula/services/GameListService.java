package com.hawksdev.springaula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hawksdev.springaula.dto.GameListDto;
import com.hawksdev.springaula.repositories.IGameListRepository;

@Service
public class GameListService {

  @Autowired
  private IGameListRepository _gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDto> findAll() {
    var result = _gameListRepository.findAll();
    return result.stream().map(x -> new GameListDto(x)).toList();
  }
}

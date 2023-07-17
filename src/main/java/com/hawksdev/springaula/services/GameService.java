package com.hawksdev.springaula.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hawksdev.springaula.dto.GameDto;
import com.hawksdev.springaula.dto.GameMinDto;
import com.hawksdev.springaula.repositories.IGameRepository;

@Service // Ou @Component - Injeção de dependência
public class GameService {

  @Autowired // Injeção
  private IGameRepository _gameRepository;

  @Transactional(readOnly = true) // Do pacote springframework
  public List<GameMinDto> findAll() {
    var result = _gameRepository.findAll();
    return result.stream().map(x -> new GameMinDto(x)).toList();
  }

  @Transactional(readOnly = true) // Do pacote springframework
  public GameDto getById(long gameId) {
    var result = _gameRepository.findById(gameId).get();
    return new GameDto(
        result.getId(),
        result.getTitle(),
        result.getYear(),
        result.getGenre(),
        result.getPlatforms(),
        result.getScore(),
        result.getImgUrl(),
        result.getShortDescription(),
        result.getLongDescription());
  }

  @Transactional(readOnly = true)
  public List<GameMinDto> findGamesByList(long listId) {
    var result = _gameRepository.searchByList(listId);
    return result.stream().map(x -> new GameMinDto(x)).toList();
  }
}

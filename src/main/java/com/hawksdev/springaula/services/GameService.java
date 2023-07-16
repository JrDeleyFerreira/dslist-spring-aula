package com.hawksdev.springaula.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hawksdev.springaula.dto.GameMinDto;
import com.hawksdev.springaula.repositories.IGameRepository;

@Component // Ou @Service - Injeção de dependência
public class GameService {

  @Autowired // Injeção
  private IGameRepository _gameRepository;

  public List<GameMinDto> findAll() {
    var result = _gameRepository.findAll();
    return result.stream().map(x -> new GameMinDto(x)).toList();
  }
}

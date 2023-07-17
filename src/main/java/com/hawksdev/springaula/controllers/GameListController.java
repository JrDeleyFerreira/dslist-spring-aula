package com.hawksdev.springaula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawksdev.springaula.dto.GameListDto;
import com.hawksdev.springaula.dto.GameMinDto;
import com.hawksdev.springaula.services.GameListService;
import com.hawksdev.springaula.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService _gameListService;

  @Autowired
  private GameService _gameService;

  @GetMapping
  public List<GameListDto> findAll() {
    return _gameListService.findAll();
  }

  @GetMapping(value = "/{listId}/games")
  public List<GameMinDto> findGamesByList(@PathVariable long listId) {
    return _gameService.findGamesByList(listId);
  }
}

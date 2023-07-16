package com.hawksdev.springaula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawksdev.springaula.dto.GameDto;
import com.hawksdev.springaula.dto.GameMinDto;
import com.hawksdev.springaula.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameService _gameService;

  @GetMapping // Verbo Http GET
  public List<GameMinDto> findAll() {
    return _gameService.findAll();
  }

  @GetMapping(value = "/{id}")
  public GameDto getById(@PathVariable long id) { // @PathVariable garante q será o mesmo id
    return _gameService.getById(id);
  }
}

package com.hawksdev.springaula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

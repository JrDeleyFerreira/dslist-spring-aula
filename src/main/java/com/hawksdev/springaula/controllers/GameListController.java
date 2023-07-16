package com.hawksdev.springaula.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hawksdev.springaula.dto.GameListDto;
import com.hawksdev.springaula.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService _gameListService;

  @GetMapping
  public List<GameListDto> findAll() {
    return _gameListService.findAll();
  }
}

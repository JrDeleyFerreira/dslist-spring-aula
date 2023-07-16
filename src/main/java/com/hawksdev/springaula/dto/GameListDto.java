package com.hawksdev.springaula.dto;

import org.springframework.beans.BeanUtils;

import com.hawksdev.springaula.entities.GameList;

public class GameListDto {

  private Long id;
  private String name;

  public GameListDto() {
  }

  public GameListDto(GameList entity) {
    BeanUtils.copyProperties(entity, this);
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

}

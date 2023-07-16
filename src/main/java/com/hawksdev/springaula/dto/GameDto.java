package com.hawksdev.springaula.dto;

public record GameDto(
    long id,
    String title,
    int year,
    String genre,
    String platforms,
    Double score,
    String imgUrl,
    String shortDescription,
    String longDescription) {
  /*
   * public GameDto(Game entity){
   * BeanUtils.copyProperties(entity, this);
   * }
   * 
   * Além disso, criar construtor default e Getters and Setters
   */

}

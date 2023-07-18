package com.hawksdev.springaula.projections;

/* Interfaces utilizadas para consultas com SQL Nativo:
* Nessas situações, cada campo da sentença deve ter um método get()
*/
public interface IGameMinProjection {

  long getId();

  String getTitle();

  int getGameYear();

  String getImgUrl();

  String getShortDescription();

  int getPosition();
}

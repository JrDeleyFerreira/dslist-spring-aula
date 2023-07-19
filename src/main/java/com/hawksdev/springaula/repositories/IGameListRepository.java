package com.hawksdev.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hawksdev.springaula.entities.GameList;

public interface IGameListRepository extends JpaRepository<GameList, Long> {

  @Modifying // Anotation para comandos que manipulem o banco.
  @Query(nativeQuery = true, value = """
      UPDATE tb_belonging
      SET position = :newPosition
      WHERE list_id = :listId
        AND game_id = :gameId """)

  void updateBelongingPosition(long listId, long gameId, int newPosition);
}

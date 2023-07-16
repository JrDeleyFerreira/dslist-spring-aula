package com.hawksdev.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hawksdev.springaula.entities.GameList;

public interface IGameListRepository extends JpaRepository<GameList, Long> {

}

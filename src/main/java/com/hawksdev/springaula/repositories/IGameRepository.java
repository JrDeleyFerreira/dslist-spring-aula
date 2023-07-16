package com.hawksdev.springaula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hawksdev.springaula.entities.Game;

public interface IGameRepository extends JpaRepository<Game, Long> {

}

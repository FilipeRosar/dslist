package com.filiperosa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filiperosa.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

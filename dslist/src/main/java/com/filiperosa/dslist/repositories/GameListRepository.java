package com.filiperosa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filiperosa.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}

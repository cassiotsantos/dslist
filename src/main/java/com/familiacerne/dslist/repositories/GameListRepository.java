package com.familiacerne.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.familiacerne.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

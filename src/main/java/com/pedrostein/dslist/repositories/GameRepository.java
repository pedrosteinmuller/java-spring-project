package com.pedrostein.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrostein.dslist.entities.Game;

// o nome repository significa que neste arquivo será a camada de acesso a dados
public interface GameRepository extends JpaRepository<Game, Long> {
	
}

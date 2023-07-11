package com.pedrostein.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrostein.dslist.dto.GameMinDTO;
// import com.pedrostein.dslist.dto.GameMinDTO;
import com.pedrostein.dslist.entities.Game;
import com.pedrostein.dslist.repositories.GameRepository;

//o service é responsável por implementar as regras de negócio da aplicação, ou seja, regra que deve acontecer
@Service
public class GameService {
	
	@Autowired
	// aqui estou injetando uma instância do gameRepository dentro do GameService
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		 List<Game> result = gameRepository.findAll();
		 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		 return dto;
	}
}

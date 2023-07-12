package com.pedrostein.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pedrostein.dslist.dto.GameListDTO;
import com.pedrostein.dslist.entities.GameList;
import com.pedrostein.dslist.repositories.GameListRepository;

//o service é responsável por implementar as regras de negócio da aplicação, ou seja, regra que deve acontecer
@Service
public class GameListService {
	
	@Autowired
	// aqui estou injetando uma instância do gameRepository dentro do GameService
	private GameListRepository gameListRepository;
		
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		 List<GameList> result = gameListRepository.findAll();
		 return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}

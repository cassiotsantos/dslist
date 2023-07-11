package com.familiacerne.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.familiacerne.dslist.dto.GameMInDTO;
import com.familiacerne.dslist.repositories.GameRepository;

@Service

public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMInDTO> findAll() {
		var result = gameRepository.findAll();
		List<GameMInDTO> dto = result.stream().map(x -> new GameMInDTO(x)).toList();
		return dto;		
	}
	
	

}

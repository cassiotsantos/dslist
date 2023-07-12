package com.familiacerne.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.familiacerne.dslist.dto.GameDTO;
import com.familiacerne.dslist.dto.GameMInDTO;
import com.familiacerne.dslist.entities.Game;
import com.familiacerne.dslist.repositories.GameRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMInDTO> findAll() {
		var result = gameRepository.findAll();
		List<GameMInDTO> dto = result.stream().map(x -> new GameMInDTO(x)).toList();
		return dto;		
	}
	

}

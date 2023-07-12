package com.familiacerne.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.familiacerne.dslist.dto.GameDTO;
import com.familiacerne.dslist.dto.GameMInDTO;
import com.familiacerne.dslist.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMInDTO> findAll(){
		List<GameMInDTO> result = gameService.findAll();
		return result;
	}
	
	@GetMapping (value ="/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	
	
	

}

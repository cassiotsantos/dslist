package com.familiacerne.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.familiacerne.dslist.dto.GameListDTO;
import com.familiacerne.dslist.dto.GameMInDTO;
import com.familiacerne.dslist.services.GameListService;
import com.familiacerne.dslist.services.GameService;



@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}	
	
	@GetMapping(value = "/{listId}/game")
	public List<GameMInDTO> findByList(@PathVariable Long listId){
		List<GameMInDTO> result = gameService.findByList(listId);
		return result;
	}
	
	

}

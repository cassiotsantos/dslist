package com.familiacerne.dslist.dto;

import com.familiacerne.dslist.entities.Game;
import com.familiacerne.dslist.projections.GameMinProjection;

public class GameMInDTO {
		

		private Long id;
		private String title;		
		private Integer year;
		
		private String imgUrl;
		private String shortDescription;	
		
		public GameMInDTO () {			
			
		}

		public GameMInDTO(Game entity) {
			id = entity.getId();
			title = entity.getTitle();
			year = entity.getYear();
			imgUrl = entity.getImgUrl();
			shortDescription = entity.getShortDescription();
			
		}

		public GameMInDTO(GameMinProjection projection) {
			id = projection.getId();
			title = projection.getTitle();
			year = projection.getYear();
			imgUrl = projection.getImgUrl();
			shortDescription = projection.getShortDescription();
			
		}

		
		public Long getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public Integer getYear() {
			return year;
		}

		public String getImgUrl() {
			return imgUrl;
		}

		public String getShortDescription() {
			return shortDescription;
		}
		
		
		

}

package com.emna.plantes.dto;

import java.util.Date;

import com.emna.plantes.entites.Famille;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class PlanteDTO {
	private Long idPlante; 
	private String nomPlante; 
	//private Double prixPlante; 
	private Date dateAjout; 
	private Famille famille; 
}
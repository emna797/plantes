package com.emna.plantes.entites;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Famille {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFam;
    private String nomFam;
    private String descriptionFam;
    @OneToMany(mappedBy="famille")
    private List<plante>plantes;
	public Long getIdFam() {
		return idFam;
	}
	public void setIdFam(Long idFam) {
		this.idFam = idFam;
	}
	public String getNomFam() {
		return nomFam;
	}
	public void setNomFam(String nomFam) {
		this.nomFam = nomFam;
	}
	public String getDescriptionFam() {
		return descriptionFam;
	}
	public void setDescriptionFam(String descriptionFam) {
		this.descriptionFam = descriptionFam;
	}
	public Famille() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

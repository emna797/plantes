package com.emna.plantes.entites;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
@Entity
public class plante {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlante;
	@NotNull 
	@Size (min = 4,max = 15)
    private String nomPlante;
	@Min(value = 10) 
	@Max(value = 10000) 
    private Double prixPlante;
    @Temporal(TemporalType.DATE) 
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent 
    private Date dateAjout;
    @ManyToOne
    private Famille famille;
    
	public plante() {
		super();
	}
	
	public plante(String nomPlante, Double prixPlante, Date dateAjout) {
		super();
		this.nomPlante = nomPlante;
		this.prixPlante = prixPlante;
		this.dateAjout = dateAjout;
	}

	public Long getIdPlante() {
		return idPlante;
	}
	public void setIdPlante(Long idPlante) {
		this.idPlante = idPlante;
	}
	public String getNomPlante() {
		return nomPlante;
	}
	public void setNomPlante(String nomPlante) {
		this.nomPlante = nomPlante;
	}
	public Double getPrixPlante() {
		return prixPlante;
	}
	public void setPrixPlante(Double prixPlante) {
		this.prixPlante = prixPlante;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	@Override
	public String toString() {
		return "plante [idPlante=" + idPlante + ", nomPlante=" + nomPlante + ", prixPlante=" + prixPlante
				+ ", dateAjout=" + dateAjout + "]";
	}

	public Famille getFamille() {
		return famille;
	}

	public void setFamille(Famille famille) {
		this.famille = famille;
	}
	
    
}

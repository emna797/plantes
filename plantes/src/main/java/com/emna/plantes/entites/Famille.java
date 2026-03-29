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
    
}
    


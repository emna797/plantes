package com.emna.plantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.emna.plantes.dto.PlanteDTO;
import com.emna.plantes.entites.plante;
import com.emna.plantes.service.PlanteService;

/*@RestController
@RequestMapping("/api")
@CrossOrigin
public class PlanteRESTController {

    @Autowired
    PlanteService planteService;

    @GetMapping
    public List<PlanteDTO> getAllPlantes() {
        return planteService.getAllPlantes();
    }

    @GetMapping("/{id}")
    public PlanteDTO getPlanteById(@PathVariable Long id) {
        return planteService.getPlante(id);
    }

    @PostMapping
    public PlanteDTO createPlante(@RequestBody PlanteDTO planteDTO) {
        return planteService.savePlante(planteDTO);
    }

    @PutMapping
    public PlanteDTO updatePlante(@RequestBody PlanteDTO planteDTO) {
        return planteService.updatePlante(planteDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePlante(@PathVariable Long id) {
        planteService.deletePlanteById(id);
    }
}*/

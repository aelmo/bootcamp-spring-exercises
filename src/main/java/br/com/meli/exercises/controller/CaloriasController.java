package br.com.meli.exercises.controller;

import br.com.meli.exercises.model.Ingrediente;
import br.com.meli.exercises.service.CaloriasService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaloriasController {
    private final CaloriasService caloriasService;

    public CaloriasController(CaloriasService caloriasService){
        this.caloriasService = caloriasService;
    }

    @GetMapping("/ingredientes/{nomeIngrediente}")
    public ResponseEntity getCaloriasPorIngrediente(@PathVariable String nomeIngrediente){
        double qtdCalorias = caloriasService.qtdCaloriasIngrediente(nomeIngrediente);
        return new ResponseEntity(qtdCalorias, HttpStatus.OK);
    }

    @GetMapping("/pratos/{nomePratoAlimento}")
    public ResponseEntity getTotalCalorias(@PathVariable String nomePratoAlimento){
        double qtdCalorias = caloriasService.qtdTotalCalorias(nomePratoAlimento);
        return new ResponseEntity(qtdCalorias,HttpStatus.OK);
    }

    @GetMapping("/pratos/max-calorias/{nomePratoAlimento}")
    public ResponseEntity getMaxCalorias(@PathVariable String nomePratoAlimento){
        Ingrediente ingredienteMaxCalorias = caloriasService.maxCaloriasIngrediente(nomePratoAlimento);
        return new ResponseEntity(ingredienteMaxCalorias,HttpStatus.OK);
    }


}

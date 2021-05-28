package br.com.meli.exercises.service;

import br.com.meli.exercises.model.Ingrediente;
import br.com.meli.exercises.model.PratoAlimento;

public interface CaloriasService {
    Double qtdTotalCalorias(String nomePratoAlimento);
    Double qtdCaloriasIngrediente(String nomeIngrediente);
    Ingrediente maxCaloriasIngrediente(String nomePratoAlimento);
}

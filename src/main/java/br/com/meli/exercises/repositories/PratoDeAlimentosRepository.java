package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Ingrediente;
import br.com.meli.exercises.model.PratoAlimento;

import java.util.List;

public interface PratoDeAlimentosRepository {
    Ingrediente findIngredienteByNome(String nomeIngrediente);
    PratoAlimento findPratoAlimentoByNome(String nomePrato);
    List<Ingrediente> loadFoodDataBase();
    List<PratoAlimento> loadPratoAlimentoDataBase();
}

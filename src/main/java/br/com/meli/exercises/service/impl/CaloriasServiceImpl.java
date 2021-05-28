package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.model.Ingrediente;
import br.com.meli.exercises.model.PratoAlimento;
import br.com.meli.exercises.repositories.PratoDeAlimentosRepository;
import br.com.meli.exercises.service.CaloriasService;
import org.springframework.stereotype.Service;

@Service
public class CaloriasServiceImpl implements CaloriasService {
    private final PratoDeAlimentosRepository pratoDeAlimentosRepository;
    public CaloriasServiceImpl(PratoDeAlimentosRepository pratoDeAlimentosRepository){
        this.pratoDeAlimentosRepository = pratoDeAlimentosRepository;
    }

    @Override
    public Double qtdTotalCalorias(String nomePratoAlimento) {
        PratoAlimento pratoAlimento = pratoDeAlimentosRepository.findPratoAlimentoByNome(nomePratoAlimento);
        return pratoAlimento.getTotalCalorias();
    }

    @Override
    public Double qtdCaloriasIngrediente(String nomeIngrediente) {
        Ingrediente ingrediente = pratoDeAlimentosRepository.findIngredienteByNome(nomeIngrediente);
        return ingrediente.getCalorias();
    }

    @Override
    public Ingrediente maxCaloriasIngrediente(String nomePratoAlimento) {
        PratoAlimento pratoAlimento = pratoDeAlimentosRepository.findPratoAlimentoByNome(nomePratoAlimento);
        return pratoAlimento.getMaxCaloriasIngrediente();
    }

}

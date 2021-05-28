package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Ingrediente;
import br.com.meli.exercises.model.PratoAlimento;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class PratoDeAlimentosRepositoryImp implements PratoDeAlimentosRepository{
    @Override
    public Ingrediente findIngredienteByNome(String nomeIngrediente) {
        List<Ingrediente> ingredientes = null;
        ingredientes = loadFoodDataBase();
        Ingrediente result = null;
        if (ingredientes != null){
            Optional<Ingrediente> item = ingredientes.stream()
                    .filter(ingrediente -> ingrediente.getNome().equals(nomeIngrediente))
                    .findFirst();
            if(item.isPresent()){
                result = item.get();
            }
        }
        return result;
    }

    @Override
    public PratoAlimento findPratoAlimentoByNome(String nomePrato) {
        List<PratoAlimento> pratos = null;
        pratos = loadPratoAlimentoDataBase();
        PratoAlimento result = null;
        if (pratos != null){
            Optional<PratoAlimento> item = pratos.stream()
                    .filter(pratoAlimento -> pratoAlimento.getNome().equals(nomePrato))
                    .findFirst();
            if(item.isPresent()){
                result = item.get();
            }
        }
        return result;
    }


    @Override
    public List<Ingrediente> loadFoodDataBase() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:food.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeReference = new TypeReference<List<Ingrediente>>() {
        };
        List<Ingrediente> ingredientes = null;
        try{
            ingredientes = objectMapper.readValue(file, typeReference);
        } catch (IOException e){
            e.printStackTrace();
        }
        return ingredientes;
    }

    @Override
    public List<PratoAlimento> loadPratoAlimentoDataBase() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:pratosDeComida.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PratoAlimento>> typeReference = new TypeReference<List<PratoAlimento>>() {
        };
        List<PratoAlimento> pratos = null;
        try{
            pratos = objectMapper.readValue(file, typeReference);
        } catch (IOException e){
            e.printStackTrace();
        }
        return pratos;
    }

}

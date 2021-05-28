package br.com.meli.exercises.model;

import java.util.List;

public class PratoAlimento {
    private String nome;
    private List<Ingrediente> ingredientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Ingrediente getMaxCaloriasIngrediente() {
        Ingrediente maiorIngrediente = this.ingredientes.get(0);
        for(Ingrediente ingrediente : this.ingredientes){
            if(ingrediente.getCalorias() >= maiorIngrediente.getCalorias())
                maiorIngrediente = ingrediente;
        }
        return maiorIngrediente;
    }

    public Double getTotalCalorias() {
        double somaCalorias = 0;
        for(Ingrediente ingrediente : this.ingredientes){
            somaCalorias += ingrediente.getCalorias();
        }
        return somaCalorias;
    }
}

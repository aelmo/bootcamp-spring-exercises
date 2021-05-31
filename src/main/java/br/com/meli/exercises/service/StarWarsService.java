package br.com.meli.exercises.service;

import br.com.meli.exercises.model.Character;

import java.util.List;

public interface StarWarsService {
    List<Character> findCharacter(String characterName);
}

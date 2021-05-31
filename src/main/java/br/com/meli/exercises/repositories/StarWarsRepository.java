package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Character;

import java.util.List;

public interface StarWarsRepository {
    List<Character> findCharacteresByName(String nameCharacter);

}

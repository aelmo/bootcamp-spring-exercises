package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.model.Character;
import br.com.meli.exercises.repositories.StarWarsRepository;
import br.com.meli.exercises.service.StarWarsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarWarsServiceImpl implements StarWarsService {
    private final StarWarsRepository starWarsRepository;

    public StarWarsServiceImpl(StarWarsRepository starWarsRepository){
        this.starWarsRepository = starWarsRepository;
    }

    @Override
    public List<Character> findCharacter(String characterName) {
        return starWarsRepository.findCharacteresByName(characterName);
    }
}

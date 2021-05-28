package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Character;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StarWarsRepositoryImpl implements StarWarsRepository{

    private boolean matchWith(String query, Character character) {
        return character.getName().toUpperCase().contains(query.toUpperCase());
    }

    @Override
    public List<Character> findCharacteresByName(String nameCharacter) {
        List<Character> characteres = loadCharacteresDataBase();
        return characteres.stream()
                .filter(character -> matchWith(nameCharacter, character))
                .collect(Collectors.toList());

    }

    public List<Character> loadCharacteresDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Character>> typeRef = new TypeReference<>() {};
        List<Character> characters = null;
        try {
            characters = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return characters;
    }
}

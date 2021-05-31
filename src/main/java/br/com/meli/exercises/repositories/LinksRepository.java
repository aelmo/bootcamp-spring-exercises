package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Link;

public interface LinksRepository {
    Link save(Link link);
    Link findById(int id);
    void deleteById(int id);
}

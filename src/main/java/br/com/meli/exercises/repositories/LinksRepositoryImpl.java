package br.com.meli.exercises.repositories;

import br.com.meli.exercises.model.Link;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LinksRepositoryImpl implements LinksRepository {
    List<Link> listaLinks = new ArrayList<>();

    public Link save(Link link){
        listaLinks.add(link);
        return link;
    }

    @Override
    public Link findById(int id) {
        for(Link link : listaLinks){
            if(link.getId()==id)
                return link;
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        Link link = findById(id);
        listaLinks.remove(link);
    }

}

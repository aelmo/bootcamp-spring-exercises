package br.com.meli.exercises.controller;

import br.com.meli.exercises.dtos.LinkIdResponse;
import br.com.meli.exercises.dtos.LinkUrlRequest;
import br.com.meli.exercises.model.Link;
import br.com.meli.exercises.repositories.LinksRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/link")
public class LinkController {

    private final LinksRepository linksRepository;
    LinkController(LinksRepository linksRepository){
        this.linksRepository = linksRepository;
    }

    @PostMapping()
    public ResponseEntity createLink(@RequestBody LinkUrlRequest url){
        Link link = new Link(url.getUrl());
        linksRepository.save(link);
        return new ResponseEntity(new LinkIdResponse(link.getId()), HttpStatus.CREATED);
    }

    @GetMapping("/{linkid}")
    public ResponseEntity redirectToLink(@PathVariable int linkid) throws URISyntaxException {
        Link link = linksRepository.findById(linkid);
        link.incrementCounterMetrics();
        URI linkUrl = new URI(link.getUrl());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(linkUrl);
        return new ResponseEntity<>(httpHeaders, HttpStatus.SEE_OTHER);
    }

    @GetMapping("/metrics/{linkId}")
    public ResponseEntity getStatistics(@PathVariable int linkId){
        Link link = linksRepository.findById(linkId);
        return new ResponseEntity(link.getCounterMetrics(),HttpStatus.OK);
    }

    @DeleteMapping("/invalidate/{linkId}")
    public ResponseEntity invalidateLink(@PathVariable int linkId){
        linksRepository.deleteById(linkId);
        return new ResponseEntity(HttpStatus.OK);
    }


}

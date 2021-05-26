package br.com.meli.exercises.service;

import org.springframework.stereotype.Service;

@Service
public interface CodigoMorseService {

    String traduzCodigoMorse(String codigoMorse);

}

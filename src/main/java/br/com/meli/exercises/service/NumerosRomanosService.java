package br.com.meli.exercises.service;

import org.springframework.stereotype.Service;

@Service
public interface NumerosRomanosService {

    String decimalParaNumeroRomano(int decimal);

}

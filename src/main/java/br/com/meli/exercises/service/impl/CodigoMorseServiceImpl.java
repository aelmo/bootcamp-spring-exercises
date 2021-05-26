package br.com.meli.exercises.service.impl;

import br.com.meli.exercises.service.CodigoMorseService;
import org.springframework.stereotype.Component;

@Component
public class CodigoMorseServiceImpl implements CodigoMorseService {

    final String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
            "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
            ",", ".", "?", " "};

    final String[] codigosMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", ""};

    @Override
    public String traduzCodigoMorse(String codigoMorse) {
        String[] morseArray = codigoMorse.split(" ");
        StringBuilder traducao = new StringBuilder();

        for (String s : morseArray) {
            for (int i = 0; i < alfabeto.length; i++) {
                if (s.compareTo(codigosMorse[i]) == 0) {
                    traducao.append(alfabeto[i]);
                }
            }
        }

        return traducao.toString().replace("  ", " ");
    }
}

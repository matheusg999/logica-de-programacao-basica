package com.nines.logica;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDeRepeticao {

    public static void main(String[] args) {
        //listadePalavras();
        //forClassico();
        inverteString();

    }

    private static void listadePalavras() {
        List<String> palavraList = new ArrayList<>();
        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        palavraList.forEach(palavra -> System.out.println(palavra));

    }
    private static void forClassico() {
        ArrayList<String> palavraList = new ArrayList<>();
        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (int posicao = 1; posicao < palavraList.size(); posicao++) {
            System.out.println(palavraList.get(posicao));

        }
    }
    private static void inverteString() {
        String normal = "12345";

        String invertida = "";

        for (int posicao = normal.length() -1; posicao>= 0 ; posicao = posicao -1) {
            invertida = invertida + normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
    }

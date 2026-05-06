package com.nines.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
        //numeroPar();
        //stringIgual();
        //stringInicia();
        datas();
    }

    private static void numeroPar() {
        Integer numero =2;

        if (numero % 2 == 0){
            // executo codigo daqui  verdadeiro
            System.out.println("par");
        }else{
            // executo aqui quando falso
            System.out.println("impar");
        }
    }

    private static void stringIgual() {
        String frase ="Hoje é segunda feira seis da tarde";

        if (frase.contains("segunda feira")){
            if (frase.contains("seis da tarde")){
                System.out.println("hora de alegria");
            }else {
                System.out.println("dia de tristeza");
            }
        }else if (frase.contains("sexta feira")
                ||
                frase.contains("sabado")
                ||
                frase.contains("domingo")
        ){
            System.out.println("sextoou");
        }else{

            System.out.println("dia normal");

        }
    }

    private static void stringInicia() {
        String palavra ="bobo";

        if (palavra.startsWith("a")){
           System.out.println("palavra iniciada em A");
        }else{

            System.out.println("palavra iniciada em outra letra");

        }

    }

    private static void datas() throws ParseException {
        Date data = new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2002");

        if (data.before(new Date())){
            System.out.println("esse dia ja passsou");
        }else{

            System.out.println("esse dia esta por vir");

        }

    }

}

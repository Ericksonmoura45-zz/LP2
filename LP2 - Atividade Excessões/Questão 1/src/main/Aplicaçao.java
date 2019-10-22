package main;

import exceptions.*;

public class Aplicaçao {
    public static void main(String[] args){
        Pista pista = new Pista();
        try {
            pista.iniciar();
        } catch (Pista e) {
            e.printStackTrace();
        }

    }
}

package com.mycompany.projetogrupo;

class Exercicio9Excecao {
    public void metodoComExcecao() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[2];
        int valor = array[9]; 
    }
}

public class Exercicio9 {
    public void chamarMetodoComExcecao() {
        Exercicio9Excecao exemplo = new Exercicio9Excecao();
        try {
            exemplo.metodoComExcecao();
            System.out.println("Método chamado corretamente");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção capturada(erro): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exercicio9 Exercicio9Excecao = new Exercicio9();
        Exercicio9Excecao.chamarMetodoComExcecao();
    }
}

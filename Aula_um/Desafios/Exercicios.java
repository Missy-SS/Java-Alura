package Desafios;

public class Exercicios {
    //Exercício 1
    public static void main(String[] args) {
        char letra = 'a';
    String palavra = "mora";

    String completa = ("Palavra completa: " + letra + palavra);

    System.out.println(completa);

    //Exercício 2
    double precoProduto = 25.50;
    int quantidade = 3;

    double totalPago = (precoProduto * quantidade);

    System.out.println("O total a ser pago é: " + totalPago);

    //Exercício 3
    double precoOriginal = 10.50;
    double percentualDesconto = 0.10;

    double novoPreco = (precoOriginal - (precoOriginal * percentualDesconto));

    System.out.println("O preço novo é: " + novoPreco);
    }


}
    

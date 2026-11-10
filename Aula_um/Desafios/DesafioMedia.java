package Desafios;

public class DesafioMedia {
    public static void main(String[] args) {
        double nota1 = 6;
        double nota2 = 10;

        double media = (nota1 + nota2)/2;

        String notasMedias = String.format("Nota 1: %.2f | Nota 2: %.2f | Média: %.2f", nota1, nota2, media);

        System.out.println(notasMedias);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Adicionando a media da nota do filme
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);

        //Adicionando uma sinopse no filme
        String sinopse;
        //Concatenação da String sinopse
        sinopse = """
                Filme Top Gun
                Film de aventura com galã dos anos 90
                Muito bom!
                Ano de Lançamento        
                """ + anoDeLancamento;
    }
}
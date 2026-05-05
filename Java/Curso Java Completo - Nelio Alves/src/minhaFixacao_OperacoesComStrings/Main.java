package minhaFixacao_OperacoesComStrings;

public class Main {
    static void main(String[] args) {

        String original = "ABC abc XYZ xyz ABC XYZ abc xyz";

        String minuscula = original.toLowerCase();
        String maiuscula = original.toUpperCase();
        String substituicao = original.replace("A", "H");
        String substituicaoMaior = original.replace("ABC", "RHS");
        int acharIndice = original.indexOf("XYZ");
        int acharUltimoIndice = original.lastIndexOf("xyz");
        String[] dividida = original.split(" ");
        String recorte1 = original.substring(4);
        String recorte2 = original.substring(4, 11);

        System.out.printf("""
                %s
                %s
                %s
                %s
                %s
                %d
                %d
                %s
                %s
                %s""", original, minuscula, maiuscula, substituicao, substituicaoMaior, acharIndice, acharUltimoIndice, dividida[0], recorte1, recorte2);


    }

}

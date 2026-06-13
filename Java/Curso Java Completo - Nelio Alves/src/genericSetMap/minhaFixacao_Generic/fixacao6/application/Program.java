package genericSetMap.minhaFixacao_Generic.fixacao6.application;

import genericSetMap.minhaFixacao_Generic.fixacao6.entities.Client;

public class Program {
    static void main(String[] args) {

        Client c1 = new Client("Bob", "bob@gmail.com");
        Client c2 = new Client("Bob", "bobnaldson@gmail.com");
        Client c4 = new Client("Bob", "bobnaldson@gmail.com");
        Client c3 = new Client("Maria", "maria@gmail.com");
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");

        IO.println(c1.hashCode());
        IO.println(c2.hashCode());
        IO.println(c3.hashCode());
        IO.println(c4.hashCode());
        IO.println("-------------------------");
        IO.println(c1.equals(c2));
        IO.println(c1.equals(c3));
        IO.println(c2.equals(c4));
        IO.println("-------------------------");
        IO.println(c2 == c4);
        IO.println("-------------------------");
        IO.println(s1 == s2);
        IO.println(s1 == s3);
        IO.println(s1.equals(s3));
        IO.println(s1.hashCode());
        IO.println(s2.hashCode());
        IO.println(s3.hashCode());
    }
}

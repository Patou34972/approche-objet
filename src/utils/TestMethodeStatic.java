package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int entier = Integer.parseInt(chaine);
        int a = 5;
        int b = 8;

        int maximum = Integer.max(a, entier);
        System.out.println("Le nombre maximum entre " + a + " et " + entier + " est : " + maximum);
    }
}

import java.util.Scanner;

public class Citire {

    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        Scanner cititorText = new Scanner(System.in);
        // asta e pentru texte, trebuie sa fie separat pentru numere si texte
        // clasa scanner

        System.out.println("Introduceti textul dorit:");
        String textIntrodus = cititorText.nextLine();
        System.out.println("Am introdus textul" + textIntrodus);

        System.out.println("Introduceti numarul dorit:");
        int numarIntrodus = cititor.nextInt();
        System.out.println("Am introdus numarul: " + numarIntrodus);

        System.out.println("Introduceti textul dorit:");
        String textIntrodus2 = cititorText.nextLine();
        System.out.println("Am introdus textul" + textIntrodus2);

        System.out.println("Introduceti un numar float");
        float floatIntrodus = cititor.nextFloat();
        System.out.println("Am introdus numarul float: " + floatIntrodus);

        System.out.println("Introduceti un numar long");
        long longIntrodus = cititor.nextLong();
        System.out.println("Am introdus numarul long: " + longIntrodus);

        System.out.println("Introduceti un boolean");
        boolean booleanIntrodus = cititor.nextBoolean();
        System.out.println("Am introdus un boolean: " + booleanIntrodus);

        System.out.println("Introduceti caracterul dorit");
        char caracterIntrodus = cititorText.next().charAt(0);
        System.out.println("Am introdus textul " + caracterIntrodus);

    }
}

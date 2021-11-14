import java.util.Scanner;

public class Exercitii {

    public static void main(String[] args) {
        //1. Afisati in consola urmatorul text "Ca profesie iti doresti?" Introduceti de la consola profesia dorita
        // dupa care printati mesajul "Tine-o tot asa si in curand vei deveni" + valoare citita de la consola


        //Scanner exercitiu = new Scanner(System.in);


        //System.out.println("Ca profesie iti doresti?");
        //String profesieDorita = exercitiu.nextLine();
        //System.out.println("Tine-o tot asa si in curand vei deveni " + profesieDorita);


        // 2. Scrieti un program care sa afiseze urmatorul test: "Salut, cati ani ai?". Intorduceti de la consola varsta voastra
        //si bagati-o intr-o variabila corespunzatoare. Afisati la consola un text de forma "Intelg ca ai x ani".

        //Scanner exercitiu = new Scanner(System.in);
        //System.out.println("Salut, cati ani ai?");
        //int varstaIntrodusa = exercitiu.nextInt();
        //System.out.println("Inteleg ca ai " + varstaIntrodusa + " ani");
        //System.out.printf("Inteleg ca ai %d ani." varstaIntrodusa);

        // 3. Scrieti un program care va intreaba care este sexul vostru si va cere sa introduceti de la consola M (masculin)
        //sau F (feminin). Strocati litera intr- variabila corespunzatoare, apoi afisati la consola "Sexul ales: X";

        //Scanner exercitiuText = new Scanner(System.in);
        //System.out.println("Inroduceti sexul vostru.");
        //char sexIntrodus = exercitiuText.next().charAt(0);
        //System.out.println("Sexul ales: " + sexIntrodus);
        //System.out.printf("Sexul nostru: %d ", sexIntrodus);

        // 4. Cereti de la user 3 numere. Salvati numerele citite de la consola in 3 variabile. Afisati suma, diferenta,
        //produsul si media lor pe randuri diferite, utilizand formatul: "Suma este: ....", "Diferenta este: ...", etc.
        //Incercati sa puneti aceste expresii pe randuri diferite folosind un singur apel al consolei. Hint: "\n".

/*        Scanner exercitiu = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int nrIntrodus1 = exercitiu.nextInt();
        System.out.println("Introduceti al doilea numar");
        int nrIntrodus2 = exercitiu.nextInt();
        System.out.println("Introduceti al treilea numar");
        int nrIntrodus3 = exercitiu.nextInt();
        int suma = nrIntrodus1 + nrIntrodus2 + nrIntrodus3;
        int diferenta = nrIntrodus1 - nrIntrodus2 - nrIntrodus3;
        int produs = nrIntrodus1 * nrIntrodus2 * nrIntrodus3;
        int medie = (nrIntrodus1 + nrIntrodus2 + nrIntrodus3) / 3;

        System.out.printf("Suma este: %d \n Diferenta lor este  %d \n Media lor este %d \n ", suma, diferenta, medie);*/

        // 5. Scrieti un program care cere o temperatura in grade Celsiusi si o transforma si afiseaza in grade Farenheit.
        //(gasiti formula pe Google.)

        /*Scanner exercitiu = new Scanner(System.in);
        System.out.println("Va rog scrieti ce temperatura aveti in camera in grade Celsius.");
        int gradeCelsius = exercitiu.nextInt();
        int temperaturaFarenheit = gradeCelsius * (9/5) + 32;
        System.out.println("Aveti atatea grade Farenheit:" + temperaturaFarenheit);*/


        // 6. Scrieti un program care cere un umar (raza cercului) apoi calculeaza si afiseaza perimetrul si aria acestuia.

        /*Scanner cititor = new Scanner(System.in);
        System.out.println("Introduceti raza cercului");
        double razaCerc = cititor.nextDouble();
        double perimetruCerc = 2 * Math.PI * razaCerc;
        double ariaCerc = Math.PI * Math.pow(razaCerc,2);
        System.out.println("Perimterul cercului este egala cu " + perimetruCerc);
        System.out.println("Aria cercului este egala cu " + ariaCerc);*/


        // 7. Scrieti un program care va cere sa introduceti lungimea unui dreptunghi , apoi latimea acestuia.
        //Calculati aria si perimetrulsi printati text de forma
        //"Aria/Perimetrul unui dreptunghi de lungime x si latime Y este egal/egala cu.."

      /*  Scanner cititor = new Scanner(System.in);
        System.out.println("Va rog sa introduceti lungimea unui dreptunghi");
        int lungimeDreptunghi = cititor.nextInt();
        System.out.println("Va rog introduceti latimea unui dreptunghi");
        int latimeDreptunghi = cititor.nextInt();
        int ariaDreptunghi = lungimeDreptunghi * latimeDreptunghi;
        int perimetruDreptunghi = 2 * (lungimeDreptunghi + latimeDreptunghi);
        System.out.printf("Aria unui dreptunghi de lungime %d si latime %d este egala cu %d \n Perimetrul unui dreptunghi de lungime %d si latime %d este egala cu %d \n" , lungimeDreptunghi , latimeDreptunghi , ariaDreptunghi , lungimeDreptunghi , latimeDreptunghi , perimetruDreptunghi);
*/


        // 8. Scrieti un program care va cere de la consola ora actuala, apoi printeaza cate ore au mai ramas pana la mierzul noptii.

        /*Scanner cititor = new Scanner(System.in);
        System.out.println("Scrieti va rog ora actuala.");
        int oraActuala = cititor.nextInt();
        System.out.println("Pana la miezul noptii au mai ramas " + (24 - oraActuala));*/

        // 9. Scrieti un program care cere de la consola anul nasterii dumneavoastra, apoi afiseaza ce varsta aveti

        /*Scanner cititor = new Scanner(System.in);
        System.out.println("Scrieti anul nasterii dumneavostra");
        int anulNasterii = cititor.nextInt();
        int anulCurent = 2021;
        int varstaMea = anulCurent - anulNasterii;
        System.out.println("Am varsta de " + varstaMea + " ani");*/



// 10. Scrieti un program care cere de la consola cate pagini are cartea vostra, cate pagini intentionati sa cititi pe zi
//apoi va printeaza un mesaj de forma :"In ritmul asta vei termina cartea in x zile."

        Scanner sc = new Scanner(System.in);
        System.out.println("Cate pagini are cartea voastra");
        int carteaNoastra = sc.nextInt();
        System.out.println("Cat pagini intentionati sa cititi pe zi?");
        int intentieCitire = sc.nextInt();
        int terminareCarte = carteaNoastra / intentieCitire;
        System.out.println("In ritmul asta vei termina cartea in " + terminareCarte + " zile.");



    }
}

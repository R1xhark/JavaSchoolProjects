package main;
import com.rabbit.skola.objects.Automat;
import com.rabbit.skola.objects.Zbozi;

import java.util.Scanner;



public class MiciAutomat extends Automat {

    public static String Krok1=" Voskovani";
    public static String Krok2=" ,Oplachování";
    public static String Krok3=" ,Aktivni Penu";
    public static String Krok4=" ,Efekt Lesku";
    public static String CenaInfo="Cena je 1kč 1 sekunda";
    static int Cena;
    static int Cas;
    static int Kredit;
    static int Krok1a;
    static int Krok2a;
    static int Krok3a;
    static int Krok4a;
    static int zustatek;


    public static void zacatek(){
        System.out.println("Vitejte, nase aktivni myti zahrnuje"+Krok1 + Krok2 + Krok3 + Krok4);
        System.out.println("Info:"+CenaInfo);

    }

    public static int MyckaJadro(){
        Scanner Automat = new Scanner(System.in);
        System.out.println("Zadej Vlozenou Castku kč");
        int Kredit = Automat.nextInt();
        int Cas=Kredit;
        if (Kredit <= 0) {
            System.out.println("Zadej Platnou Castku");
        }
        else if (Kredit>0) {
            System.out.println("Pocet Kreditu je " +Kredit+"kč");
        }
        System.out.println("pocet casu je "+Cas+" Sekund");

      System.out.println("Nyni zvolte cas miti u jednotlivych kroku");
        System.out.println("Zadej Cas Kroku 1:");
        int Krok1a=Automat.nextInt();
        System.out.println("zadej Cas Kroku 2:");
        int Krok2a=Automat.nextInt();
        System.out.println("zadej cas Kroku 3");
        int Krok3a=Automat.nextInt();
        System.out.println("Zadej cas kroku 4:");
        int Krok4a=Automat.nextInt();
        int Cena=Krok1a+Krok2a+Krok3a+Krok4a;
        int zustatek= Kredit - Cena;
        if (zustatek <= 0 ) {
            System.out.println("bohuzel tolik casu nemate :(");
            int rozdil= zustatek - Cena;

        }
        else if(zustatek >0 ) {
            System.out.println("Zustatek" + zustatek);
        }
        if (zustatek <= 0) {
            System.out.println("Uz nemate zadne kredity :(");
        }
        else if (zustatek > 0) {
            System.out.println("Vas zustatek kreditu je " + zustatek);
            System.out.println("Vyplaceni zustatku...");
        }
        return zustatek;

    }

    public MiciAutomat(String display, Zbozi zbozi) {
        super(display, zbozi);
    }

    public static void main(String[]args ){
        zacatek();
        MyckaJadro();
        System.out.println("Dekujeme za vyuziti automatizovaneho miciho automatu od spolecnosti Dubny CORP.");
        System.out.println("richard@dubny.cz");
        System.out.println("www.dubny.cz");
    }
}

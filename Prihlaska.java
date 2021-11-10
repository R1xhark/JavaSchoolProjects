package prihlaska;
import java.util.Scanner;
/**
 *
 * @author richard
 */
public class Prihlaska {
  public static void main (String [] args){
      Scanner sc=new Scanner (System.in);
      
  System.out.println("Jméno:");
  String Jmeno=sc.nextLine();
  
  System.out.println("Přijmení:");
  String Prijmeni=sc.nextLine();
  
  System.out.println("Datum narozeni bez tecek (d/m/r):");
  int DatumNarozeni=sc.nextInt();
  
  System.out.println("Bydliste:");
  String Bydliste=sc.nextLine();
  
  System.out.println("Email:");
  String Email=sc.nextLine();
  
  System.out.println("Telefoni cislo (+420):");
  double TelCislo=sc.nextDouble();
  
  
  System.out.println("udaje pro kontrolu");
  System.out.println("Jmeno a prijmeni:"+Jmeno +Prijmeni);
  System.out.println("Datum Narozeni:"+DatumNarozeni);
  System.out.println("Kontakt:" +Email);
  
  System.out.print("Jsou údaje spravné? ");
   Boolean ans = sc.nextBoolean();
   if (ans.equals("1")) {
            System.out.println ("Dekuji");
        }
        else {
            System.out.println ("Prosim o opetovne vyplneni");
        }
 

      }

}


import java.util.Scanner;


public class NonStaticClass {

    public static void main(String[] args) {
        
        Matematik.Factorial factorial=new Matematik().new Factorial();
        
        Matematik.Asal asal=new Matematik().new Asal();
        
        Matematik.Alan alan=new Matematik().new Alan();
        
        Matematik.Alan.DaireAlan daireAlan=new Matematik().new Alan().new DaireAlan();
        
        Scanner scanner = new Scanner(System.in);
        
           System.out.println("sayı gir:");
           int sayi=scanner.nextInt();
           
           if (asal.asalMi(sayi)) {
               System.out.println("sayı asal");
            
        }
           else {
               System.out.println("asal değil");}
           
           factorial.factorial();
           
           daireAlan.daire_alan(6);
        
        
        
        
    }
}



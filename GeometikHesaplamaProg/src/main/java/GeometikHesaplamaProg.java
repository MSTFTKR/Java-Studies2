
import java.util.Scanner;


public class GeometikHesaplamaProg {

    public static void main(String[] args) {
        
        Sekil sekil;
        Scanner scanner=new Scanner(System.in);
        String islemler="İşlemler.. \n1-Kare alan hesapla..\n2-Üçgen alan hesapla..\n3-Daire alan hesapla..\n Çıkış için 0 bas";
        
        while(true){
            System.out.println(islemler);
            System.out.print("İşlem seçimini yap..:");
            int secim=scanner.nextInt();
            
            if (secim==1){
                System.out.println("Karenin kenarını gir:");
                int kenar=scanner.nextInt();
                
                
                sekil=new kare("Kare1",kenar);
                sekil.alanHesapla();

            }
            else if (secim==2){
                System.out.println("üçgenin a kenarlarını gir:");
                int a=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("üçgenin b kenarlarını gir:");
                int b=scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("üçgenin c kenarlarını gir:");
                int c=scanner.nextInt();
                scanner.nextLine();
                
                
                sekil=new ucgen("Üçgen1",a,b,c);
                sekil.alanHesapla();

            }
            else if (secim==3){
                System.out.println("Daairenin yarıçağını gir:");
                int yaricap=scanner.nextInt();
                
                
                sekil=new daire("Daire",yaricap);
                sekil.alanHesapla();

            }

            else if (secim==0){
                break;

            }

        
        }
  
    }
}


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author musta
 */
public class ProblemsWithInnerClass {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldin...");
        
        String islemler="İŞlemler\n1.Daire Alanı hesapla\n2.Üçgen Çevresi\n3. iki vektörün iç Çarpımı hesapla\n0.Çıkış";
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(islemler);
            System.out.println("İşlemi seç");
            int islem=scanner.nextInt();
            
            if (islem==0){
                System.out.println("programdan çıkılıyor.");
                break;
            }
            
            else if(islem==1){
                System.out.println("Dairenin Yarıçapını gir:");
                int yaricap=scanner.nextInt();
               Problem.Mat.daireALan(yaricap);
            }
            
            else if(islem==2){
                System.out.print("1.Kenarı Gir:");
                int kenar1=scanner.nextInt();
                
                System.out.print("2.Kenarı Gir:");
                int kenar2=scanner.nextInt();
                
                System.out.print("3.Kenarı Gir:");
                int kenar3=scanner.nextInt();
                
                Problem.Mat.ucgenCevresi(kenar1, kenar2, kenar3);

            }
            
             else if(islem==3){
                 Vec vec1=new Vec("vec1");
                 Vec vec2=new Vec("vec2");
                 
                 Problem.fizik.icCarpim(vec1, vec2);
             }
             else {
                 System.out.println("Hatalı Giriş Yaptınız..");
                 continue;
             }
            
        }
    }
}

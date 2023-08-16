
import java.util.Scanner;


public class Matematik {

private double PI=Math.PI;


    public class Factorial{
        
        public void factorial(){
            Scanner scanner=new Scanner(System.in);
            
            System.out.println("Sari gir:");
            int sayi=scanner.nextInt();
            int fakt=1;
            for (int i = 1; i <= sayi; i++) {
                
                fakt*=i;
            }
            System.out.println("faktoyel:"+ fakt);
            
        }

    
    }
    public class Asal{
        public boolean asalMi(int sayi){
            
            int i=2;
            while(i<sayi){
                
                if(sayi%i==0){
                 return false;
                }
                i++;
            
            }
            return true;
        
        }
    }
    
    public class Alan{
        
        public class DaireAlan{public void daire_alan(int yaricap){
        
            System.out.println("Dairenin Alanı:"+PI*yaricap*yaricap);  //matın içinde olduğumdan PI'ye eriştim
        }}
        
    }
    
}

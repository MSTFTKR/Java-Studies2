
public class Problem {
    public static class Mat{
        public static void daireALan(int yaricap){
            System.out.println("Dairenini alanı: "+ (Math.PI*yaricap*yaricap));
        }
        
        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3){
            
            System.out.println("Üçgenin Çevresi..:"+(kenar1+kenar2+kenar3));
        
        }
    }
    public static class fizik{
    
        public static void  icCarpim(Vec vec1,Vec vec2){
            int icCarpim=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" iç Çarpımı"+icCarpim);
        }
            
        
    }
}

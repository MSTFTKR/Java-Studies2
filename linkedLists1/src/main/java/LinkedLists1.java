
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedLists1 {
    
    public static void printList(LinkedList<String> placeToGo){
        
        /*for (String b : placeToGo) {
            System.out.println(b);
        }*/
        
        ListIterator<String> iterator=placeToGo.listIterator();   //  
        
        while(iterator.hasNext()){
        
            System.out.println(iterator.next());
        }
        
    }
    public static void  addSeq(LinkedList<String> placeToGo, String newValue){      //sıralı ekle
            ListIterator<String> iterator=placeToGo.listIterator();
            while(iterator.hasNext()){
                int compare=iterator.next().compareTo(newValue);//Eğer $yeni iteratorün gösterdiğine eşitse 0 eğer  büyükse -1 küçükse 0dan büyük değer çıkar.
                
                if(compare==0){
                    System.out.println("Listeniz bu eleman zaten var");
                    
                    return;
                }
                else if(compare<0){
                    
                }
                else if(compare>0){
                    iterator.previous();
                    iterator.add(newValue);
                 return;
                }
            }
            iterator.add(newValue);
        }
    
    public static void main(String[] args) {
       
        LinkedList<String> placeToGo=new LinkedList<String>();
        
        addSeq(placeToGo, "Postane");
        addSeq(placeToGo, "Market");
        addSeq(placeToGo, "Okul");
        addSeq(placeToGo, "Adana");
        printList(placeToGo);
        /*placeToGo.add("Postane");
        placeToGo.add("Market");
        placeToGo.add("Okul");
        placeToGo.add("Kütüphane");
        placeToGo.add("Spor Salonu");
        placeToGo.add("Ev");
        
        
        printList(placeToGo);
        System.out.println("************************");
        
        
        placeToGo.add(4,"AVM");
        
        printList(placeToGo);
        System.out.println("************************");
        
        placeToGo.remove(3);
        
          printList(placeToGo);*/
        
        
      
        
        
        
        
        /*ArrayList<String> languages =new ArrayList<String>();
        
        languages.add("Java");
        languages.add("Dart");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        
        /*for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
            
            
        }
        
        for(String d:languages){
            System.out.println(d);
        }
        
        System.out.println("******************************");
        languages.add(1,"C#");
        
        for(String d:languages){
            System.out.println(d);
        }*/
        
        
        
        
        
    }
}

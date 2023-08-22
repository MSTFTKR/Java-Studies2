
import java.util.ArrayList;


public class GenericClasses {

    public static void main(String[] args) {
      Character[] charDizi={'J','A','V','A'};
      Integer[] integerDizi={1,2,3,4,5,6};
      
      String[] stringDizi={"C++","CSS","Html","Php","Java"};
      Ogrenci[] ogrenciDizi={new Ogrenci("Mustafa"),new Ogrenci("Ali"),new Ogrenci("hüseyin")};
      
      /*charYazdir.yazdir(charDizi);
      intYazdir.yazdir(integerDizi);
      stringYazdir.yazdir(stringDizi);
      ogrenciYazdir.yazdir(ogrenciDizi);*/
      
      YazdirClass<Character> yazdirChar= new YazdirClass<Character>();
      YazdirClass<Integer> yazdirint= new YazdirClass<Integer>();
      YazdirClass<String> yazdirString= new YazdirClass<String>();
      YazdirClass<Ogrenci> yazdirOgrenci= new YazdirClass<Ogrenci>();
      
      yazdirChar.yazdirt(charDizi);
      yazdirOgrenci.yazdirt(ogrenciDizi);
      yazdirString.yazdirt(stringDizi);
      yazdirint.yazdirt(integerDizi);
      
    }
}

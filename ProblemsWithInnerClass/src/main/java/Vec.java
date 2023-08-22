
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class Vec {
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {
        
        this.isim = isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println("i j ve k gir:");
        i=scanner.nextInt();
        j=scanner.nextInt();
        k=scanner.nextInt();
        scanner.nextLine();
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    
}

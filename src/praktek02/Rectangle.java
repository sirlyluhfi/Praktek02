/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek02;
public class Rectangle {
    double panjang;
    double lebar;

    public Rectangle() {
        panjang=5;
        lebar=2;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
     
     
    void cetakInfo(){
       System.out.println("=====================");
       System.out.println("panjang :"+panjang );
       System.out.println("lebar   :"+lebar ); 
       System.out.println("=====================");
    }
    
      double hitungLuas(){
      double luas;
      luas= panjang*lebar;
      return luas;
      }
     void cetakLuas(){
         System.out.println("Luasnya adalah: "+hitungLuas());
     }  
    
}

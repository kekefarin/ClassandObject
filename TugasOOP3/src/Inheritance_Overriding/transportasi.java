/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance_Overriding;

/**
 *
 * @author keisha
 */
public class transportasi {
    String jenis;
    String bahanbakar;

  public String getjenis() {
      return jenis;
  }
  
  public void setjenis(String jenis) {
      this.jenis = jenis;
  }
  
  public String getbahanbakar() {
      return bahanbakar;
  }
  
  public void setbahanbakar (String bahanbakar){
      this.bahanbakar = bahanbakar;
  }
 
public void tampilkan() {
    System.out.println("Jenis kendaraan : " +getjenis());
    System.out.println("Bahan bakar : " +getbahanbakar());
}
 
}
 class mobil extends transportasi {
    String merk ="HRV",Bensin = "Pertalite";
    
    @Override
    public void tampilkan() {
        
        System.out.println("Type : " +merk);
        System.out.println("Bensin : " +Bensin);
        
    }
    
}

class pesawat extends transportasi {
    String merk ="Air Asia", Bensin = "Avtur";
    
    @Override
    public void tampilkan() {
        
        System.out.println("Type : " +merk);
        System.out.println("Bensin : " +Bensin);
    }
}
class main {
    
    public static void main(String[] args) {
        
        transportasi objSuper = new transportasi();
        mobil objSubA = new mobil();
        pesawat objSubB = new pesawat();
        
        System.out.println("Transportasi");
        
        objSuper.getjenis();
        objSuper.getbahanbakar();
        
        System.out.println("====Mobil====");
        
        objSubA.tampilkan();
        
        System.out.println("====Pesawat====");
        
        objSubB.tampilkan();
        
    }
}
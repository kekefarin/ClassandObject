/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classandobject;

class freshtotal{
    String nama;
    String harga;
}
        
public class Classandobject {
    public static void main(String[] args) {
        freshtotal buah1 = new freshtotal ();
        freshtotal buah2 = new freshtotal ();
        freshtotal buah3 = new freshtotal ();
        
        buah1.nama = "Mangga";
        buah1.harga = "Rp 15000";
        buah2.nama = "Melon";
        buah2.harga = "Rp 12000";
        buah3.nama = "Semangka";
        buah3.harga = "RP 17000";
        
        System.out.println("[ Daftar Buah ]");
        System.out.println("");
        System.out.println("Nama Buah: "+ buah1.nama);
        System.out.println("Harga "+ buah1.harga);
        System.out.println("------------------------");
        System.out.println("Nama Buah: "+ buah2.nama);
        System.out.println("Harga "+ buah2.harga);
        System.out.println("------------------------");
        System.out.println("Nama Buah: "+ buah3.nama);
        System.out.println("Harga "+ buah3.harga);
    }
}

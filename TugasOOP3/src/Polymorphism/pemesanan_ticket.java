/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author keisha
 */
public class pemesanan_ticket {
    public void datapesanan(String Print)
    {
       System.out.println(Print);
    }
    public void datapesanan(int Print)
    {
        System.out.println(Print);
    }
}

class pesanan{
    
   public static void main (String[] args){
       
       pemesanan_ticket data = new pemesanan_ticket();
       
       System.out.println("===== Ticket Kereta =====");
       System.out.println("");
       
       System.out.println("Nama     : ");
       data.datapesanan("Abizar Farin");
       System.out.println("");
       
       System.out.println("Tujuan   : ");
       data.datapesanan("Bandung");
       System.out.println("");
       
       System.out.println("Kelas kereta : ");
       data.datapesanan("Eksekutif");
       System.out.println("");
       
       System.out.println("Harga    : ");
       data.datapesanan("Rp. 120000");
       System.out.println("");
       
   }
   
}


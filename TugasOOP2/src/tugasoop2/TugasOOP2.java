/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasoop2;

/**
 *
 * @author keisha
 */
import java.util.Scanner;
public class TugasOOP2 {

    
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        int pilih;
        
        System.out.println("=====================");
        System.out.println("TICKETING KERETA KE BANDUNG");
        System.out.println("=====================");
        System.out.println("1. EKONOMI");
        System.out.println("2. EKSEKUTIF");
        System.out.println("3. PREMIUM");
        System.out.println("4. LUXURY");
        System.out.println("PILIH KELAS KERETA YANG ANDA INGINKAN :");
        pilih=masuk.nextInt();
        if (pilih==1)
            System.out.println("Harga ticket kereta: Rp 80.000");
        else if (pilih==2)
            System.out.println("Harga ticket kereta: Rp 105.000");
        else if (pilih==3)
            System.out.println("Harga ticket kereta: Rp 135.000");
        else if (pilih==4)
            System.out.println("Harga ticket kereta: Rp 180.000");
        else
            System.out.println("MAAF CODE ANDA TIDAK TERSEDIA, SILAHKAN COBA LAGI");
        for (int i=1; i>0; i--)
        {
            for (int j=1; j>0; j++)
            {
                System.out.println("");
                System.out.println("Apakah yakin dengan pesanan anda?");
                System.out.println("1.YA");
                System.out.println("2.TIDAK");
                System.out.println("Pilih :");
                pilih=masuk.nextInt();
                if (pilih==1)
                    System.out.println("SELAMAT PEMESANAN ANDA BERHASIL DAN LANJUT PROSES PEMBAYARAN");
                else if (pilih==2)
                    System.out.println("PILIH KELAS KERETA YANG ANDA INGINKAN :");
                pilih=masuk.nextInt();
                if (pilih==1)
                    System.out.println("Harga ticket kereta: Rp 80.000");
                else if (pilih==2)
                    System.out.println("Harga ticket kereta: Rp 105.000");
                else if (pilih==3)
                    System.out.println("Harga ticket kereta: Rp 135.000");
                else if (pilih==4)
                    System.out.println("Harga ticket kereta: Rp 180.000");
                else
                    System.out.println("MAAF CODE ANDA TIDAK TERSEDIA, SILAHKAN COBA LAGI");
                
            }
        }
        
    }
}

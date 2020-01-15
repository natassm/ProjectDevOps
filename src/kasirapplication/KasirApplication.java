/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasirapplication;

/**
 *
 * @author Natasha
 */
public class KasirApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nama_barang;
        int jumlah_barang, harga,totalharga;
        double diskon = 0.075 ;
        double totalbayar;
        
        System.out.println("Kasir Application");
        System.out.println("_____________________________");
        System.out.println("Masukan Data berikut :");
        
        nama_barang = "Indomie";
        System.out.println("Nama Barang = " + nama_barang);
        
        jumlah_barang = 3;
        System.out.println("Jumlah Barang = " + jumlah_barang);
        
        if(jumlah_barang <=0) {
            
            System.out.println("Mohon masukan jumlah yang benar dan ulangi program");
            System.exit(0);
        }
        
        harga = 20000;
        System.out.println("Harga Barang = Rp" + harga);
        
        if(harga <100)
        {
            System.out.println("Mohon masukan harga yang valid dan ulangi");
            System.exit(0);
        }
        
        System.out.println("Anda Mendapatkan diskon 7,5%");
        totalharga = jumlah_barang * harga;
        System.out.println("Total harga = Rp" +totalharga);
        diskon = totalharga*diskon;
        totalbayar = totalharga-diskon;
        System.out.println("Total Bayar = Rp" +totalbayar);
        System.out.println("_____________________________");
        System.out.println("Nota Belanja :");
        System.out.println("Nama Barang = " + nama_barang);  
        System.out.println("Jumlah Barang = " +jumlah_barang);
        System.out.println("Harga Barang = Rp" +harga);
        System.out.println("Total Harga = Rp" +totalharga);
        System.out.println("Total Bayar = Rp" +totalbayar);
        System.out.println("_____________________________");
    }
}

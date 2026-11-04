/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum10;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {

        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        String namaElektronik = "Laptop Advan";
        double hargaElektronik = 2000000;

        System.out.println("=== PRODUK ELEKTRONIK ===");
        System.out.println("Nama Barang: " + namaElektronik);
        System.out.println("Harga: Rp" + hargaElektronik);
        System.out.println("Pajak: 10%");
        System.out.println("Pajak yang harus dibayarkan: Rp" + elektronik.hitungPajak(hargaElektronik));

        System.out.println();

        // Objek Makanan
        Pembayaran makanan = new Makanan();
        String namaMakanan = "Roti Croissant";
        double hargaMakanan = 100000;

        System.out.println("=== PRODUK MAKANAN ===");
        System.out.println("Nama Barang: " + namaMakanan);
        System.out.println("Harga: Rp" + hargaMakanan);
        System.out.println("Pajak: 5%");
        System.out.println("Pajak yang harus dibayarkan: Rp" + makanan.hitungPajak(hargaMakanan));
    }
}
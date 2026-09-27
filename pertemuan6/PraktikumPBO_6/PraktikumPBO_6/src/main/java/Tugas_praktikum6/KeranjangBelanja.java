/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class KeranjangBelanja {
    private List<Produk> listProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : listProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanDetail() {
        System.out.println("=== DETAIL KERANJANG BELANJA ===");
        for (Produk p : listProduk) {
            System.out.println("Item: " + p.nama + " | Harga Asli: Rp " + p.harga + " | Diskon: Rp " + p.hitungDiskon() + " | Bayar: Rp " + p.getHargaSetelahDiskon());
        }
        System.out.println("-------------------------------------------");
        System.out.println("Total Pembayaran Setelah Diskon: Rp " + hitungTotalHarga());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum6;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Buku Kisah SiKancil", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse", 200000));
        keranjang.tambahProduk(new Pakaian("Kaos Jamda V", 150000));

        keranjang.tampilkanDetail();
    }
}

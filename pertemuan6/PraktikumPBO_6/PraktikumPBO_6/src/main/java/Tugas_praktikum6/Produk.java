/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_praktikum6;

/**
 *
 * @author acer
 */
public abstract class Produk {
    String nama;
    double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();

    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}

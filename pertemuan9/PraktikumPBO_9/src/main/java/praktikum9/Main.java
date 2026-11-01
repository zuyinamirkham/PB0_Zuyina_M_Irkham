/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
    
        Kendaraan mobil1 = new Mobil();
        Kendaraan sepeda1 = new Sepeda();
        
        mobil1.berjalan();
        mobil1.info();

        sepeda1.berjalan();
        sepeda1.info();
    }
}


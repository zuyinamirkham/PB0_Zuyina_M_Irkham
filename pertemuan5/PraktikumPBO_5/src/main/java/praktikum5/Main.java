/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
       
        System.out.println("Soal 1 dan 2 perwarisan Hewan dan overriding method");
        Kucing Kucing = new Kucing();
        Kucing.nama = "mblung";
        Kucing.jenis = "mamalia(anggora)";
        Kucing.ciri = "Bulu lebat dan halus";
        Kucing.tampilkanInfo();
        System.out.println();
        
        Anjing Anjing = new Anjing();
        Anjing.nama = "sofia";
        Anjing.jenis = "mamalia(pitbul)";
        Anjing.ciri = "gagah berani";
        Anjing.tampilkanInfo();
        System.out.println();
        
         System.out.println("Soal 3 hirarki kendaraan");
        
        mobil mobil = new mobil();
        mobil.nama = "Canter";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 6;
        mobil.jumlahPintu = 2;
        mobil.tampilkanInfo();
        
        System.out.println();

        sepedaMotor motor = new sepedaMotor();
        motor.nama = "Herex";
        motor.kecepatan = 300;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "Honda Tiger";
        motor.tampilkanInfo();
    }
}

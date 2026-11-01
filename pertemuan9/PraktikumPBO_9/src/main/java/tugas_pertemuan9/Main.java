/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_pertemuan9;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        
        Hewan kucing1 = new Kucing();
        Hewan anjing1 = new Anjing();
        
        kucing1.info();
        kucing1.bersuara();

        anjing1.info();
        anjing1.bersuara();
    }
}

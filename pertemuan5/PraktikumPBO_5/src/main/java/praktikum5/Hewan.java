/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author acer
 */
public class Hewan {
    String nama;
    String jenis;
    String ciri;
    
    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis Hewan: " + jenis);
        System.out.println("Ciri Hewan: " + ciri);
    }
    
    public void bersuara() {
        System.out.println("Suara hewan");
    }
}

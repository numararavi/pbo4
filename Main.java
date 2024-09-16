/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak_4;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        pekerja orang1 = new pekerja("Supini",27,"Kuli",5000000);
        
        System.out.println("-- "+orang1.getNama()+" --");
        orang1.OverridemetodetoString();
        
        System.out.println();
        
        orang1.setNama("sukarni");
        orang1.setGaji(2000);
        System.out.println("-- "+orang1.getNama()+" --");
        orang1.OverridemetodetoString();
    }
}

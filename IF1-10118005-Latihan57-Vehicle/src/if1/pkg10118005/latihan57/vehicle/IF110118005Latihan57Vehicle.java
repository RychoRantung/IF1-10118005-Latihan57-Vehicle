/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan57.vehicle;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan data sepeda dan skateboard
 */
public class IF110118005Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bc = new Bicycle();
        bc.setMyBrand("Trek Bike");
        bc.setMyModel("7.4FX");
        bc.setMyGearCount(23);
        System.out.println("Brand : " + bc.getMyBrand());
        System.out.println("Model : " + bc.getMyModel());
        System.out.println("Jumlah Gear: " + bc.getMyGearCount() + "\n");
        
        Skateboard sb = new Skateboard();
        sb.setMyBrand("Ally Skate");
        sb.setMyModel("Rocket");
        sb.setMyBoardLength(54.5);
        System.out.println("Brand : " + sb.getMyBrand());
        System.out.println("Model : " + sb.getMyModel());
        System.out.println("Panjangnya Board : " + sb.getMyBoardLength());
    }
    
}

package hitung;

public class matematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika aan = new Matematika(4,9);
        
        System.out.println("Hasil dari penjumlahan:  " + aan.setPenjumlahan());
        System.out.println("Hasil dari perkurangan:  " + aan.setPengurangan());
        System.out.println("Hasil dari perkalian  :  " + aan.setPeperkalian());
        System.out.println("Hasil dari pembagian  :  " + aan.setPembagian());
       
    }
    
}

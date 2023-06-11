
package hitung;

public class Matematika {
    //variabel
    private double bil1,bil2;
    
    //constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    //method (+,-,*,/)
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    public double setPengurangan(){
        return bil1 - bil2;
    }
    public double setPeperkalian(){
        return bil1 * bil2;
    }
    public double setPembagian(){
        return bil1 / bil2;
    }
}

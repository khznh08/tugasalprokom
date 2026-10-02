
package praktikumalpro1;

import java.util.Scanner;

public class PraktikumAlpro2 {

    public static void main(String[] args) {
    System.out.println("========================================");
    System.out.println("               HTUNG BMI                        ");
    System.out.println("========================================");
    Scanner input = new Scanner (System.in);
    System.out.print("Masukkan Nama Lengkap \t : ");
    String nama = input.nextLine ();
    System.out.print("Masukkan Berat (kg) \t : ");
    double berat = input.nextDouble();
    System.out.print("Masukkan Tinggi (cm) \t : ");
    double tinggi = input.nextDouble ();
    double a = (Math.pow (tinggi/100, 2));
    double bmi =(berat / a);
    double beratideal = (25 * a);
    double selisih = (berat - beratideal);
    System.out.println("========================================");
    System.out.println("                 Hasil                         ");
    System.out.println("========================================");
    System.out.println("Nama Lengkap \t:" + " " + nama );
    System.out.println("Berat Badan \t:" + " " + berat  + "kg");
    System.out.println("Tinggi Badan \t:" + " " + tinggi + "cm");
    System.out.println("BMI \t\t:" + " " + bmi );
    System.out.println("Berat Ideal \t:" + " " + beratideal + "kg");
    System.out.println("Selisih \t:" + " " + selisih + "kg");
    
    
    
    }
    
}

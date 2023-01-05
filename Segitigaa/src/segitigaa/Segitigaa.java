
package segitigaa;
import java.util.Scanner;

public class Segitigaa {

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Luas dan Keliling Segitiga");
        System.out.println("=================================");
        System.out.println(" 1. Luas Segitiga " + "\n" + " 2. Keliling Segitiga " + "\n" +" 3. Selesai ");
        System.out.print(" Masukkan Pilihan : ");
       int pilihan = input.nextInt();
        
        
        Segitiga segitiga = new Segitiga();
        
          switch (pilihan) {
              case 1:
                  System.out.print(" Masukkan Alas : ");
                  double alas = input.nextDouble();
                  System.out.print(" Masukkan Tinggi : ");
                  double tinggi = input.nextDouble();
                  double luas = segitiga.hitungLuas(alas, tinggi);
                  System.out.println(" Luas Segitiga adalah " + luas);
                  break;
              case 2:
                  System.out.print(" Masukkan Sisi ke-1 : ");
                  double sisiA = input.nextDouble();
                  System.out.print(" Masukkan Sisi ke-2 : ");
                  double sisiB = input.nextDouble();
                  System.out.print(" Masukkan Sisi ke-3 : ");
                  double sisiC = input.nextDouble();
                  double keliling = segitiga.hitungKeliling(sisiA, sisiB, sisiC);
                  System.out.println(" Keliling Segitiga Adalah " + keliling);
                  break;
              default:
                  System.out.println(" Pilihan tidak Valid");
                  break;
          }
        
     
    }
    
}

class Segitiga {
    public double hitungLuas(double alas, double tinggi){
        
        return 0.5 * alas * tinggi;
    }
    
    public double hitungKeliling(double sisiA , double sisiB, double sisiC){
        
        return sisiA + sisiB + sisiC;
        
    }
}

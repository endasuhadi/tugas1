import java.util.Scanner;
public class HitungLuas {

public static int cariLuasPersegiPanjang(int a, int b){
   int luas;
   luas = (panjang * lebar);
   return luas;
}

public static void main(String[] args) {
   int panjang;
   int lebar;
   int luas;
   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Luas Persegi Panjang");
   System.out.print("Masukan Panjang: ");
   panjang = scan.nextInt();
   System.out.print("Masukan Lebar: ");
   lebar = scan.nextInt();
   luas = cariLuasPersegiPanjang(panjang,lebar);
   System.out.println("Luas persegi Panjang = " +luas);
   }
}
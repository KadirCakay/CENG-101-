import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int taban,us;
       Scanner input = new Scanner(System.in);
       System.out.println("üssü alınacak sayı : ");
       taban = input.nextInt();
        System.out.println("üs olacak sayı : ");
        us = input.nextInt();
// 3 ^ 4 = 3*3*3*3;
        int toplam = 1;
        for (int i = 1; i <= us ; i++) {
            toplam = toplam * taban;


        }
        System.out.println("Cevap : " + toplam);

        
    }
}
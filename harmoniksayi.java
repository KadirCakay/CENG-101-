import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pay =1;
        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        double payda = input.nextDouble();

        for (double i = 1; i <=payda ; i++) {
            double sonuc = pay / i;
            toplam = toplam + sonuc;


            System.out.print(sonuc + " + ");

        }
        System.out.println(" = " + toplam );
    }
}

import java.util.Scanner;

public class EbobEkok {
    



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = inp.nextInt();

        // EBOB hesaplama
        int ebob = 1;
        int i = 1;
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ebob);

        // EKOK hesaplama
        int ekok = (n1 * n2) / ebob;
        System.out.println(n1 + " ve " + n2 + " sayılarının EBOB'u: " + ekok);

    }
}

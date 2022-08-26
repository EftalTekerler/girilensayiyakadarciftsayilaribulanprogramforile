import java.util.Scanner;
public class forilegirilensayi {
    public static void main(String[] args) {
    int k ;
    Scanner inp = new Scanner(System.in);
    System.out.print("Sayı Giriniz");
    k = inp.nextInt();
    for (int i = 1 ; i <= k ; i++) {
        System.out.println(i);
    }
    }
}

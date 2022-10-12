import java.util.Scanner;
<<<<<<< HEAD

/**
 * Created by tkrud on 12.10.2022.
 *
=======
/**
 * Created by tkrud on 12.10.2022.
>>>>>>> bb94245 (delete blank lines in Zadanie1)
 * Napisz program, w którym zadeklarujesz i utworzysz dziesięcioelementową tablicę
 * odpowiedniego typu. W pętli pobierzesz od użytkownika liczby i je w niej zapiszesz.
 * Następnie wyświetl je na ekranie powiadomienia "Liczba: " dla każdego z podanych
 * parametrów.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<10;i++ ) {
            System.out.println("Podaj liczbe nr: " + (i + 1) + " z " + tab.length);
            tab[i] = scan.nextInt();
        }
        for (int x: tab){
            System.out.println("Liczba: " + x);
        }
    }
}

import java.util.Scanner;

/**
 * Created by tkrud on 12.10.2022.
 * Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od
 * użytkownika. Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy
 * pomocy pętli while.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        n = scan.nextInt();
        int tab[] = new int[n];

        for (int i = 0; i< tab.length; i++){
            System.out.println("Podaj wartosc numer " + (i + 1) + ":");
            tab[i] = scan.nextInt();
        }
        int j = 0;
        while(j<tab.length){
            System.out.println("Liczba w tablicy o indeksie " + j + "to: " + tab[j]);
            j++;
        }
    }
}

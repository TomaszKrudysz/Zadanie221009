import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by tkrud on 12.10.2022.
 * Napisz program, w którym wprowadzisz w konsoli dowolne dane, następnie zapiszesz je do
 * pliku. Odczytaj je z powrotem z pliku i bez użycia dodatkowej zmiennej wyświetl na ekranie.
 */
public class Zadanie3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\ala.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("Co może mieć Ala?");
        String ala = scan.nextLine();
        PrintWriter words = new PrintWriter("src\\ala.txt");
        words.println(ala);
        words.close();
        Scanner in = new Scanner(file);
        String contents = in.nextLine();
        System.out.println("Ala ma: " + contents);




    }
}

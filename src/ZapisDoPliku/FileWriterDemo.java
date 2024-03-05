package ZapisDoPliku;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku");

        String nazwaPliku = scanner.nextLine();


        FileWriter fw = new FileWriter(nazwaPliku,true);

        PrintWriter pw = new PrintWriter(fw);

        pw.println("Marcin kiwa się na krześle i złamie kark.");

        pw.close();

    }
}

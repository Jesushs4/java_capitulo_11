import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String args[]) {

        String line = "";
        String word = args[1];
        int wordCount = 0;


        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            while ((line = br.readLine())!=null) {
                int i = 0;
                while ((i=line.indexOf(word))!=-1) {

                        line = line.substring(i+word.length(), line.length());
                        wordCount++;
                }
            }

            System.out.print("La palabra se encuentra "+wordCount+" veces");

        } catch (FileNotFoundException e) {
            System.out.print("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Hubo un error en la lectura");
        }
    }
}

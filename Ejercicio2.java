import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String args[]) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            String primos = "";

            while (primos!=null) {
                primos = br.readLine();
                if (primos!=null) {
                    System.out.println(primos);
                }
            }
            br.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo");
        } catch (IOException io) {
            System.out.println("No se pudo leer el archivo");
        }
    }
}

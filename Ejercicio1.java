import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String args[]) {

        boolean esPrimo;
        String primos = "";
        for (int i = 2; i<=500; i++) {
            esPrimo = true;
            for (int j = 2; j<i; j++) {
                if (i%j==0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primos+=i+"\n";
            }
        }
        System.out.print(primos);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            bw.write(primos);

            bw.close();

        } catch (IOException e) {
            System.out.print("No se pudo escribir el archivo");
        }
    }
}

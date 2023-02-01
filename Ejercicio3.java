import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String args[]) {

        try {
            BufferedReader br1 = new BufferedReader(new FileReader("fichero1.dat")); ;
            BufferedReader br2 = new BufferedReader(new FileReader("fichero2.dat"));
            String fichero1 = "";
            String fichero2 = "";
            String texto = "";

            while (fichero1!=null || fichero2!=null) {

                fichero1 = br1.readLine();
                if (fichero1!=null) {
                    texto+=fichero1+"\n";
                }
                fichero2 = br2.readLine();
                if (fichero2!=null) {
                    texto+=fichero2+"\n";
                }
            }
            System.out.print(texto);
            br1.close();
            br2.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo");
        } catch (IOException io) {
            System.out.println("No se pudo leer el archivo");
        }
    }
}

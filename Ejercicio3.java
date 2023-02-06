import java.io.*;

public class Ejercicio3 {
    public static void main(String args[]) {

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(args[0])); ;
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
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

            BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

            bw.write(texto);
            bw.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo");
        } catch (IOException io) {
            System.out.println("No se pudo leer el archivo");
        }
    }
}

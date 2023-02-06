import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Error en los argumentos");
        }
        String line = "";
        String file = args[0];
        ArrayList<String> palabras = new ArrayList<String>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line=br.readLine())!=null) {
                palabras.add(line);
                System.out.println(line);
            }
            br.close();
            Collections.sort(palabras);
            int pos = 0;
            String sortedFile = ((pos=file.lastIndexOf(".txt"))!=-1?file.substring(0,pos):file) + "_sorted.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(sortedFile));
            for (String l : palabras) {
            bw.write(l+"\n");
            }
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.print("No se pudo leer el archivo");
        }

    }
}

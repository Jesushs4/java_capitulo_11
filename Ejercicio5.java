import java.io.*;

public class Ejercicio5 {
    public static void main(String args[]) {

        if (args.length!=2) {
            System.out.print("Error en los argumentos");
        }
        String originLine = "";
        String endLine = "";
        boolean blockComment = false;
        int i = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

            while (((originLine = br.readLine()) !=null)) {
                int lineLength = originLine.length();
                endLine = originLine;

                if ((i = originLine.indexOf("/*"))!=-1) {
                    blockComment = true;
                    endLine = originLine.substring(0,i);
                }

                if ((i = originLine.indexOf("*/"))!=-1) {
                    blockComment = false;
                    endLine = originLine.substring(i+2, lineLength);
                }

                if ((i = originLine.indexOf("//"))!=-1 && !blockComment) {
                    endLine = originLine.substring(0, i);
                }

                if (!blockComment) {
                    bw.write(endLine+"\n");
                }

            }

            bw.close();
            br.close();


        } catch (FileNotFoundException fnfe) {
            System.out.println("No se encontró el archivo");
        } catch (IOException io) {
            System.out.println("Hubo un error en el documento");
        }

    }
}

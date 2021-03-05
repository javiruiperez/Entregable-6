import java.io.*;
import java.util.Scanner;

public class AsientosReservados {

public static void ReservarBillete() throws IOException{

    Scanner sc = new Scanner(System.in);
    File PendTarea = new File("src\\asientos.txt");
    File AuxTarea = new File("src\\Tarea\\archivoTemp.txt");
    BufferedReader reader = new BufferedReader(new FileReader(PendTarea));
    BufferedWriter writer = new BufferedWriter(new FileWriter(AuxTarea));
   System.out.println("Que tarea quieres completar");
    String eliminar = sc.nextLine();
    String lineToRemove = eliminar;
    String currentLine;
   while ((currentLine = reader.readLine()) != null) {
        String trimmedLine = currentLine.trim();
        String Titulo = trimmedLine.split("#")[0];
        if (Titulo.equals(lineToRemove)) {
            try {
                FileWriter fichero = new FileWriter("src\\asientos.txt", true);
                PrintWriter pw = new PrintWriter(fichero);
                pw.println(Titulo + ": Tarea completada");
                pw.close();
                System.out.println("Tarea completada");
            } catch (Exception e) {
                System.out.println("No se puede hacer eso");
            }
        }
        if (Titulo.equals(lineToRemove))
            continue;
        writer.write(currentLine + System.getProperty("line.separator"));

    }
   writer.close();
   reader.close();
   PendTarea.delete();
    boolean correcto = AuxTarea.renameTo(PendTarea);

}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AsientosDisponibles {

    public static void VerDisponibilidad() {
        try {
            File fichero = new File("src\\asientos.txt");
            Scanner sc1 = new Scanner(fichero);
            while (sc1.hasNextLine()) {
                String datos = sc1.nextLine();
                System.out.println(datos);
            }
            sc1.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Ha habido un error en su reserva");
            e.printStackTrace();

        }
    }
}

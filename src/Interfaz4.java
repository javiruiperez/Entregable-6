//@author: Javier Ruiperez//


import javax.swing.*;
import java.awt.*;

public class Interfaz4 extends JFrame {

    Interfaz4() {
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(1, 1));
        JLabel l1 = new JLabel("SU RESERVA SE HA REALIZADO CON ÉXITO");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);

    }
        public static void main() {

            Interfaz4 i4 = new Interfaz4();
        }

}

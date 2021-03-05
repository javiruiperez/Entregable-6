//@author: Javier Ruiperez//


import javax.swing.*;
import java.awt.*;

public class Interfaz4 extends JFrame {

    Interfaz4() {
        setLayout(new FlowLayout());
        JPanel panelPrincipal = new JPanel(new GridLayout(4,1));
        JLabel vacio1 = new JLabel("");
        vacio1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        panelPrincipal.add(vacio1);
        JLabel l1 = new JLabel("SU RESERVA SE HA REALIZADO CON ÉXITO");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);
        JLabel vacio2 = new JLabel("");
        vacio2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        panelPrincipal.add(vacio2);
        JLabel vacio3 = new JLabel("");
        vacio3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        panelPrincipal.add(vacio3);


        add(panelPrincipal);
        setSize(400,400);
        setVisible(true);

    }
        public static void main() {

            Interfaz4 i4 = new Interfaz4();
        }

}

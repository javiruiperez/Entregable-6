import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz2 extends JFrame {

    JCheckBox c1 = new JCheckBox("Sr.");
    JCheckBox c2 = new JCheckBox("Sra.");
    JCheckBox c3 = new JCheckBox("Srta.");

    Interfaz2() {
        setLayout(new FlowLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(2, 1));
        JLabel l1 = new JLabel("Datos de Pasajeros");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);


        JPanel p1 = new JPanel(new GridLayout(5, 2));
        JLabel l2 = new JLabel("Tratamiento");
        l2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p1.add(l2);
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        c1.addActionListener(new ListenerButton());
        c2.addActionListener(new ListenerButton1());
        c3.addActionListener(new ListenerButton2());
        JLabel vacio1 = new JLabel("");
        vacio1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p1.add(vacio1);
        panelPrincipal.add(p1);


        add(panelPrincipal);
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {

        Interfaz2 i2 = new Interfaz2();
    }

    private class ListenerButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c1.isSelected()) {
                c2.setSelected(false);
                c3.setSelected(false);
            }


        }
    }

    private class ListenerButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c2.isSelected()) {
                c1.setSelected(false);
                c3.setSelected(false);
            }


        }
    }
    private class ListenerButton2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c3.isSelected()) {
                c1.setSelected(false);
                c2.setSelected(false);
            }


        }
    }
}

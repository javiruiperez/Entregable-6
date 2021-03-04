//@author: Javier Ruiperez//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz2 extends JFrame {

    JCheckBox c1 = new JCheckBox("Sr.");
    JCheckBox c2 = new JCheckBox("Sra.");
    JCheckBox c3 = new JCheckBox("Srta.");

    JCheckBox c11 = new JCheckBox("Hombre");
    JCheckBox c22 = new JCheckBox("Mujer");
    JCheckBox c33 = new JCheckBox("Otro");

    private JButton Continuar;
    private JButton Volver;

    Color asulitoresulon = new Color(49, 112, 255);
    Color rojitoresulon = new Color(255, 43, 43);

    Interfaz2() {
        setLayout(new FlowLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(5, 1));
        JLabel l1 = new JLabel("Datos de Pasajeros");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);


        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 1));
        JLabel l2 = new JLabel("Tratamiento Pasajero 1");
        l2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
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

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6,4, 10,0));
        JLabel l3 = new JLabel("Nombre");
        l3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l3);
        JTextField nombre = new JTextField();
        p2.add(nombre);
        JLabel l4 = new JLabel("Apellido");
        l4.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l4);
        JTextField apellido = new JTextField();
        p2.add(apellido);
        JLabel vacio2 = new JLabel("");
        vacio2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio2);
        JLabel vacio3 = new JLabel("");
        vacio3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio3);
        JLabel vacio4 = new JLabel("");
        vacio4.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio4);
        JLabel vacio5 = new JLabel("");
        vacio5.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio5);
        JLabel l5 = new JLabel("Fecha Nacimiento");
        l5.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l5);
        JTextField FechaNaz = new JTextField();
        p2.add(FechaNaz);
        JLabel l6 = new JLabel("Nacionalidad");
        l6.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l6);
        JTextField Nacionalidad = new JTextField();
        p2.add(Nacionalidad);
        JLabel vacio6 = new JLabel("");
        vacio6.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio6);
        JLabel vacio7 = new JLabel("");
        vacio7.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio7);
        JLabel vacio8 = new JLabel("");
        vacio8.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio8);
        JLabel vacio9 = new JLabel("");
        vacio9.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio9);
        JLabel l7 = new JLabel("Sexo");
        l7.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l7);
        p2.add(c11);
        p2.add(c22);
        p2.add(c33);
        c11.addActionListener(new ListenerButton11());
        c22.addActionListener(new ListenerButton22());
        c33.addActionListener(new ListenerButton33());
        JLabel vacio10 = new JLabel("");
        vacio10.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio10);
        JLabel vacio11 = new JLabel("");
        vacio11.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio11);
        JLabel vacio12 = new JLabel("");
        vacio12.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio12);
        JLabel vacio13 = new JLabel("");
        vacio13.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio13);
        panelPrincipal.add(p2);


        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(3,4, 10,0));
        JLabel l8 = new JLabel("Informacion del Pasaporte");
        l8.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p3.add(l8);
        JLabel vacio14 = new JLabel("");
        vacio14.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio14);
        JLabel vacio15 = new JLabel("");
        vacio15.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio15);
        JLabel vacio16 = new JLabel("");
        vacio16.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio16);
        JLabel l9 = new JLabel("Numero de Pasaporte");
        l9.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p3.add(l9);
        JTextField Pasaporte = new JTextField();
        p3.add(Pasaporte);
        JLabel l10 = new JLabel("Caducidad del Pasaporte");
        l10.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p3.add(l10);
        JTextField CadPasaporte = new JTextField();
        p3.add(CadPasaporte);
        JLabel vacio17 = new JLabel("");
        vacio17.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio17);
        JLabel vacio18 = new JLabel("");
        vacio18.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio18);
        JLabel vacio19 = new JLabel("");
        vacio19.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio19);
        JLabel vacio20 = new JLabel("");
        vacio20.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio20);
        panelPrincipal.add(p3);

        JPanel p4 = new JPanel(new GridLayout(2, 2, 900, 75));
        Volver = new JButton("VOLVER");
        Volver.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p4.add(Volver);
        Volver.setBackground(rojitoresulon);
        Continuar = new JButton("CONTINUAR");
        Continuar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p4.add(Continuar);
        Continuar.setBackground(asulitoresulon);
        JLabel vacio21 = new JLabel("");
        vacio21.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p4.add(vacio21);
        JLabel vacio22 = new JLabel("");
        vacio22.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p4.add(vacio22);
        panelPrincipal.add(p4);

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

    private class ListenerButton11 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c11.isSelected()) {
                c22.setSelected(false);
                c33.setSelected(false);
            }


        }
    }

    private class ListenerButton22 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c22.isSelected()) {
                c11.setSelected(false);
                c33.setSelected(false);
            }


        }
    }
    private class ListenerButton33 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c33.isSelected()) {
                c11.setSelected(false);
                c22.setSelected(false);
            }


        }
    }
}

//@author: Javier Ruiperez//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz3 extends JFrame {

    private JButton Continuar;
    private JButton Volver;
    private JButton Cancelar;

    private JButton Ipaypal;
    private JButton IVisa;
    private JButton Iventanilla;

    JCheckBox c1 = new JCheckBox("PayPal");
    JCheckBox c2 = new JCheckBox("Visa");
    JCheckBox c3 = new JCheckBox("Pago en ventanilla");

    Color asulitoresulon = new Color(49, 112, 255);
    Color rojitoresulon = new Color(255, 43, 43);

    Interfaz3(){
        setLayout(new FlowLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(3, 1));
        JLabel l1 = new JLabel("Seleccione Método De Pago");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);


        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1));


        JPanel p11 = new JPanel();
        p11.setLayout(new GridLayout(2,2, 1000, 0));
        Ipaypal = new JButton();
        Ipaypal.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p11.add(Ipaypal);
        Ipaypal.setBackground(Color.white);
        Imagen Imagen = new Imagen();
        Ipaypal.add(Imagen);
        Ipaypal.addActionListener(new ListenerButton3());
        JLabel vacio1 = new JLabel("");
        vacio1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p11.add(vacio1);
        p11.add(c1);
        c1.addActionListener(new Interfaz3.ListenerButton());
        JLabel vacio2 = new JLabel("");
        vacio2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p11.add(vacio2);
        p1.add(p11);

        JPanel p12 = new JPanel();
        p12.setLayout(new GridLayout(2,2, 1000, 0));
        IVisa = new JButton();
        IVisa.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p12.add(IVisa);
        IVisa.setBackground(Color.white);
        Imagen2 Imagen2 = new Imagen2();
        IVisa.add(Imagen2);
        IVisa.addActionListener(new ListenerButton4());
        JLabel vacio3 = new JLabel("");
        vacio3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p12.add(vacio3);
        p12.add(c2);
        c2.addActionListener(new Interfaz3.ListenerButton1());
        JLabel vacio4 = new JLabel("");
        vacio4.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p12.add(vacio4);
        p1.add(p12);

        JPanel p13 = new JPanel();
        p13.setLayout(new GridLayout(2,2, 1000, 0));
        Iventanilla = new JButton();
        Iventanilla.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p13.add(Iventanilla);
        Iventanilla.setBackground(Color.white);
        Imagen3 Imagen3 = new Imagen3();
        Iventanilla.add(Imagen3);
        Iventanilla.addActionListener(new ListenerButton5());
        JLabel vacio5 = new JLabel("");
        vacio5.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p13.add(vacio5);
        p13.add(c3);
        c3.addActionListener(new Interfaz3.ListenerButton2());
        JLabel vacio6 = new JLabel("");
        vacio6.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p13.add(vacio6);
        p1.add(p13);
        panelPrincipal.add(p1);



        JPanel p4 = new JPanel(new GridLayout(2, 3, 350, 225));
        Volver = new JButton("VOLVER");
        Volver.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p4.add(Volver);
        Volver.addActionListener(new Interfaz3.ListenerButton6());
        Volver.setBackground(rojitoresulon);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p4.add(Cancelar);
        Cancelar.addActionListener(new Interfaz3.ListenerButton7());
        Cancelar.setBackground(rojitoresulon);
        Continuar = new JButton("CONTINUAR");
        Continuar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p4.add(Continuar);
        Continuar.addActionListener(new Interfaz3.ListenerButton8());
        Continuar.setBackground(asulitoresulon);
        JLabel vacio21 = new JLabel("");
        vacio21.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p4.add(vacio21);
        JLabel vacio22 = new JLabel("");
        vacio22.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p4.add(vacio22);
        panelPrincipal.add(p4);
        JLabel vacio23 = new JLabel("");
        vacio23.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p4.add(vacio23);
        panelPrincipal.add(p4);


        add(panelPrincipal);
        setSize(400,400);
        setVisible(true);
    }

    public static void main() {

        Interfaz3 i3 = new Interfaz3();
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
    private class ListenerButton3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                c1.setSelected(true);
        }
    }

    private class ListenerButton4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                c2.setSelected(true);
            }
    }
    private class ListenerButton5 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                c3.setSelected(true);
            }
    }

    private class ListenerButton6 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Interfaz2.main();
            dispose();
        }
    }

    private class ListenerButton7 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Interfaz.main();
            dispose();
        }
    }
    private class ListenerButton8 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Interfaz4.main();
            dispose();
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    SpinnerModel numCaracteres = new SpinnerNumberModel(1, 1, 10, 1);
    JSpinner spin1;

    private JButton Continuar;
    private JButton Cancelar;

    JCheckBox c1 = new JCheckBox("TURISTA");
    JCheckBox c2 = new JCheckBox("BUSSINESS");

    Color asulitoresulon = new Color(49, 112, 255);
    Color rojitoresulon = new Color(255, 43, 43);

    Interfaz(){
        setLayout(new FlowLayout());
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(7, 1));
        JLabel l1 = new JLabel("Seleccione su lugar de destino y de salida");
        l1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        panelPrincipal.add(l1);
        JLabel vacio01 = new JLabel("");
        vacio01.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        panelPrincipal.add(vacio01);


        JPanel p1 = new JPanel(new GridLayout(3, 2, 50, 0));
        JLabel l2 = new JLabel("Lugar de destino");
        l2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));;
        p1.add(l2);
        JLabel l3 = new JLabel("Lugar de salida");
        l3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p1.add(l3);
        JTextField destino = new JTextField();
        p1.add(destino);
        JTextField salida = new JTextField();
        p1.add(salida);
        JLabel vacio1 = new JLabel("");
        vacio1.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p1.add(vacio1);
        JLabel vacio2 = new JLabel("");
        vacio2.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p1.add(vacio2);
        panelPrincipal.add(p1);

        JPanel p2 = new JPanel(new GridLayout(4, 2, 50, 0));
        panelPrincipal.add(p2);
        JLabel l4 = new JLabel("Fecha salida");
        l4.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l4);
        JLabel l5 = new JLabel("Fecha llegada");
        l5.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p2.add(l5);
        JTextField fsalida = new JTextField();
        p2.add(fsalida);
        JTextField fllegada = new JTextField();
        p2.add(fllegada);
        JLabel vacio3 = new JLabel("");
        vacio3.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio3);
        JLabel vacio4 = new JLabel("");
        vacio4.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p2.add(vacio4);

        JPanel p3 = new JPanel(new GridLayout(1, 2, 50, 0));
        JLabel l6 = new JLabel("Pasajeros");
        l6.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p3.add(l6);
        spin1 = new JSpinner(numCaracteres);
        p3.add(spin1);
        JLabel vacio5 = new JLabel("");
        vacio5.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio5);
        JLabel vacio6 = new JLabel("");
        vacio6.setFont(new Font("Comic Sans Ms", Font.PLAIN, 1));
        p3.add(vacio6);
        p2.add(p3);

        JPanel p4 = new JPanel(new GridLayout(2, 2));
        JLabel l7 = new JLabel("Tipo de billete");
        l7.setFont(new Font("Comic Sans Ms", Font.PLAIN, 18));
        p4.add(l7);
        JPanel p33 = new JPanel(new GridLayout(1, 2));
        p4.add(p33);
        p33.add(c1);
        p33.add(c2);
        c1.addActionListener(new ListenerButton());
        c2.addActionListener(new ListenerButton1());
        panelPrincipal.add(p4);

        JPanel p5 = new JPanel(new GridLayout(1, 2, 550, 0));
        panelPrincipal.add(p5);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        Cancelar.setPreferredSize(new Dimension(100, 50));
        p5.add(Cancelar);
        Cancelar.setBackground(rojitoresulon);
        Continuar = new JButton("CONTINUAR");
        Continuar.setFont(new Font("Comic Sans Ms", Font.PLAIN, 25));
        p5.add(Continuar);
        Continuar.setBackground(asulitoresulon);


        add(panelPrincipal);
        setSize(400, 400);
        setVisible(true);

    }
    public static void main(String[] args) {

        Interfaz i = new Interfaz();
    }
    private class ListenerButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c1.isSelected()) {
                c2.setSelected(false);
            }


        }
    }
    private class ListenerButton1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c2.isSelected()) {
                c1.setSelected(false);
            }


        }
    }
}
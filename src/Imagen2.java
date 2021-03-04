//@author: Javier Ruiperez//

import javax.swing.*;
import java.awt.*;

public class Imagen2 extends javax.swing.JPanel {

    public Imagen2(){
        this.setSize(250,500);
    }

    public void paint(Graphics grafico){
        Dimension heigth = getSize();

        ImageIcon Img = new ImageIcon(getClass().getResource("Visa.png"));

        grafico.drawImage(Img.getImage(), 0, 0, heigth.width, heigth.height, null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}
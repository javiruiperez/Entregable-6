//@author: Javier Ruiperez//

import javax.swing.*;
import java.awt.*;

public class Imagen3 extends javax.swing.JPanel {

    public Imagen3(){
        this.setSize(250,500);
    }

    public void paint(Graphics grafico){
        Dimension heigth = getSize();

        ImageIcon Img = new ImageIcon(getClass().getResource("Ventanilla.jpg"));

        grafico.drawImage(Img.getImage(), 0, 0, heigth.width, heigth.height, null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}
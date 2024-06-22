package ec.edu.uce.demo.view;

import ec.edu.uce.demo.interfaz.IDrawable;
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private IDrawable shape;

    public Panel() {
    setPreferredSize(new Dimension(300, 200));
    }

    public void setShape(IDrawable shape) {
        this.shape = shape;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (shape != null) {
            shape.draw(g);
        }
    }
}

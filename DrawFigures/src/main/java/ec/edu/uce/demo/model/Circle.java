package ec.edu.uce.demo.model;

import ec.edu.uce.demo.interfaz.IDrawable;

import java.awt.*;

public class Circle implements IDrawable {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);
        graphics.fillOval(150, 50, 100, 100);
    }
}

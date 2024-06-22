package ec.edu.uce.demo.model;

import ec.edu.uce.demo.interfaz.IDrawable;

import java.awt.*;

public class Square implements IDrawable {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        graphics.fillRect(150, 50, 100, 100);

    }
}

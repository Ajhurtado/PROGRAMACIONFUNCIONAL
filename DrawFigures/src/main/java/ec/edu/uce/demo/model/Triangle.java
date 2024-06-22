package ec.edu.uce.demo.model;

import ec.edu.uce.demo.interfaz.IDrawable;

import java.awt.*;

public class Triangle implements IDrawable {

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        int[] xPoints = {150, 200, 250};
        int[] yPoints = {150, 50, 150};
        int nPoints = 3;
        graphics.fillPolygon(xPoints, yPoints, nPoints);
    }
}

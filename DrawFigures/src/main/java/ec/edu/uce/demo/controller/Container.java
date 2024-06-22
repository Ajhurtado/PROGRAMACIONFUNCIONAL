package ec.edu.uce.demo.controller;

import ec.edu.uce.demo.interfaz.IDrawable;
import ec.edu.uce.demo.view.Panel;

public class Container {

    public void drawShape(Panel panel, IDrawable shape) {
        panel.setShape(shape);
    }


}

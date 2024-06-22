package ec.edu.uce.demo.view;

import javax.swing.*;
import java.awt.*;
import ec.edu.uce.demo.controller.Container;
import ec.edu.uce.demo.model.Circle;
import ec.edu.uce.demo.model.Square;
import ec.edu.uce.demo.model.Triangle;

public class View  extends JFrame{
    private JButton button1, button2, button3;
    private Panel panelDraw;
    private Container shapeController;

    public View() {
        setTitle("Ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapeController = new Container();
        panelDraw = new Panel();

        button1 = new JButton("Triangulo");
        button2 = new JButton("Cuadrado");
        button3 = new JButton("Circulo");

        button1.addActionListener(e -> shapeController.drawShape(panelDraw, new Triangle()::draw));
        button2.addActionListener(e -> shapeController.drawShape(panelDraw, new Square()::draw));
        button3.addActionListener(e -> shapeController.drawShape(panelDraw, new Circle()::draw));

        JPanel panelButton = new JPanel();
        panelButton.add(button1);
        panelButton.add(button2);
        panelButton.add(button3);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panelButton, BorderLayout.NORTH);
        getContentPane().add(panelDraw, BorderLayout.CENTER);
    }

}

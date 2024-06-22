package ec.edu.uce.demo.main;

import ec.edu.uce.demo.view.View;

import javax.swing.*;

public class AppFiguras {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {View window = new View();
            window.setVisible(true);
        });
    }

}

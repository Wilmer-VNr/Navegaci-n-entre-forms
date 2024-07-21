package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel mainPanel;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField fechaNac;
    private JTextField nacionalidad;
    private JTextField ocupacion;
    private JTextField premios;
    private JButton verHobby;

    public form2() {
        nombre.setText("Cristiano");
        apellido.setText("Ronaldo");
        fechaNac.setText("1985-02-05");
        nacionalidad.setText("Portuguesa");
        ocupacion.setText("Futbolista");
        premios.setText("Cristiano Ronaldo dos Santos Aveiro, conocido simplemente como Cristiano Ronaldo, es " +
                "un futbolista portugués considerado uno de los mejores jugadores de la historia. Nacido el 5 de febrero " +
                "de 1985 en Madeira, Portugal.");

        verHobby.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new form3().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

    }
}

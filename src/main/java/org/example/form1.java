package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField usuario;
    public JPanel mainPanel;
    private JTextField password;
    private JButton iniciarSesion;

    public form1() {
        iniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usuario.getText();
                String pass = password.getText();

                if (user.equals("esfot") && pass.equals("1234")) {
                    JFrame frame = new JFrame();
                    frame.setContentPane(new form2().mainPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 400);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);


                    SwingUtilities.getWindowAncestor(mainPanel).dispose();
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Credenciales incorrectos.");
                }
            }
        });
    }


}

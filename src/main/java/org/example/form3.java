package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class form3 {
    public JPanel mainPanel;
    private JButton regresar;
    private JLabel hobby;
    private JLabel hobby2;

    public form3() {

        try {
            // URL de la imagen
            URL imageUrl = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeydINDk-Ko3LRq4gt6uuBz_TSyDzc22Fy0g&s");
            hobby.setIcon(new ImageIcon(imageUrl));

            URL imageUrl1 = new URL("https://us.123rf.com/450wm/butenkow/butenkow1603/butenkow160300622/54523736-resumen-logotipo-para-la-m%C3%BAsica-y-el-sonido-modelo-del-vector.jpg");
            hobby2.setIcon(new ImageIcon(imageUrl1));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Biografía");

                frame.setContentPane(new form2().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}


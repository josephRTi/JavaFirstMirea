package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;

public class MyPicture extends JPanel {
    static Image img = new ImageIcon("./src/ru/mirea/task8/opt2/nebula.jpeg").getImage();

    public void paintComponent (Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public static void main(String [] argv) {
        JFrame F = new JFrame();
        F.setSize(1980, 1920);
        F.add(new MyPicture());
        F.setVisible(true);
    }
}
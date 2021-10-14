package ru.mirea.task8.opt3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyGif extends JPanel {
    static ArrayList<ImageIcon> Gif = new ArrayList<>();
    static JLabel Scr = new JLabel();

    public void gif() throws InterruptedException {
        Scr.setBackground(Color.black);
        int i = 0;
        while (true) {
            i = (i + 1) % 64;
            Scr.setIcon(Gif.get(i));
            if (i != 0)
                Thread.sleep(20);
        }
    }

    public static void main(String[] argv) throws InterruptedException {
        for (int i = 0; i < 64; ++i) {
            Gif.add(new ImageIcon("./src/ru/mirea/task8/opt3/gif/" + i + ".gif"));
        }
        JFrame F = new JFrame();
        F.setBackground(Color.black);
        F.setSize(540, 540);

        MyGif MG = new MyGif();

        F.add(MG);
        F.add(Scr);
        F.setVisible(true);

        MG.gif();
    }
}

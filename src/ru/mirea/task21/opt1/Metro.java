package ru.mirea.task21.task21.opt1;

import java.util.ArrayList;

public class Metro<T> {
    private ArrayList<String> lines;
    private T t;

    public Metro() {
        lines = new ArrayList<String>();

        lines.add("Sokolnicheskaya");
        lines.add("Borovitskaya");
        lines.add("Kaluzhsko-Rizhskaya");
        lines.add("Arbatsko-pokrovskaya");
        lines.add("Zamoskvorechenskaya");
        lines.add("MCC");
        lines.add("BC");
    }

    public void PrintList(Boolean isEven) {
        for (int i = 0; i < lines.size(); i++) {

        }
    }
}

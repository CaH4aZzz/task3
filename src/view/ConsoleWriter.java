package view;

import model.Figure;

import java.util.ArrayList;

public class ConsoleWriter {

    public void printException(Exception e) {
        System.out.println(e.getMessage());
    }

    void printMessage(String message) {
        System.out.println(message);
    }

    public void printTriangleList(ArrayList<Figure> listFigure) {
        int i = 1;
        for (Figure figure : listFigure) {
            System.out.println(i++ + "." + figure.toString());
        }
    }
}

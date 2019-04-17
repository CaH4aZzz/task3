package view;

import controller.FigureComparator;
import model.Figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class View {

    private BufferedReader reader;

    public View(BufferedReader reader) {
        this.reader = reader;
    }

    public void printSortedTriangleList(ArrayList<Figure> listFigure) {
        FigureComparator comparator = new FigureComparator();
        listFigure.sort(comparator);
        int i = 1;
        for (Figure figure : listFigure) {
            System.out.println(i++ + "." + figure.toString());
        }
    }

    void printTriangleList(ArrayList<Figure> listFigure) {
        int i = 1;
        for (Figure figure : listFigure) {
            System.out.println(i++ + "." + figure.toString());
        }
    }

    public String getUserInput(String message) throws IOException {
        System.out.println(message);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public void printException(Exception e) {
        System.out.println(e.getMessage());
    }
}
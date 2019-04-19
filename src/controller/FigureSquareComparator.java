package controller;

import model.Figure;

import java.util.Comparator;

public class FigureSquareComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure f1, Figure f2) {
        if (f1.getSquare() == f2.getSquare()) {
            return 0;
        }
        if (f1.getSquare() > f2.getSquare()) {
            return 1;
        } else return -1;
    }
}

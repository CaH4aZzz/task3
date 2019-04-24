package controller;

import model.Figure;
import validators.IValidator;
import validators.TriangleValidator;
import view.ConsoleReader;
import view.ConsoleWriter;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public void start() {
        final ConsoleReader consoleReader = new ConsoleReader();
        final ConsoleWriter consoleWriter = new ConsoleWriter();
        final IValidator validator = new TriangleValidator();
        ArrayList<Figure> figureList = new ArrayList<>();
        String userInput = "";

        do {
            try {
                userInput = consoleReader.getUserInput("Please enter parameters of Triangle");
                figureList.add(validator.getValidFigure(userInput));
            } catch (Exception e) {
                consoleWriter.printException(e);
            }
            try {
                userInput = consoleReader.getUserInput("Do you want to continue?");
            } catch (IOException e) {
                consoleWriter.printException(e);
            }
        } while ((userInput.equalsIgnoreCase("y")) || userInput.equalsIgnoreCase("yes"));

        consoleWriter.printTriangleList(getSortedList(figureList));
    }

    private ArrayList<Figure> getSortedList(ArrayList<Figure> list) {
        ArrayList<Figure> sortedList = new ArrayList<>();
        list.sort(new FigureSquareComparator());
        for (Figure f : list) {
            sortedList.add(f);
        }
        return sortedList;
    }
}

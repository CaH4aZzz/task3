import model.Figure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by avokado on 15.04.2019.
 */
public class View {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    String readFromConsole() throws IOException {
        String result = READER.readLine();
        return result;
    }

    void printTriangleList(ArrayList<Figure> listFigure) {
        int i = 1;
        for (Figure figure : listFigure) {
            System.out.println(i++ + "." + figure.toString());
        }
    }

    void printException(Exception e) {
        System.out.println(e.toString());
    }
}

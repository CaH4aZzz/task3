package validators;

import model.Triangle;

public class TriangleValidator implements IValidator {

    private final int PARAMETER_COUNT = 4;

    @Override
    public Triangle getValidatesFigure(String params) throws IllegalArgumentException {

        if (params == null) {
            throw new NullPointerException();
        }

        String[] paramArray = params.split(",");
        int paramLength = paramArray.length;

        if (paramLength != PARAMETER_COUNT) {
            throw new IllegalArgumentException("Wrong quantity of parameters!\nPlease enter 4 parameter to create Triangle");
        }

        for (int i = 0; i < paramLength; i++) {
            if (paramArray[i].trim().equals("")) {
                throw new IllegalArgumentException("Empty string cannot be used as a parameter");
            }
        }

        for (int i = 1; i < paramLength; i++) {
            try {
                double param = Double.parseDouble(paramArray[i]);
                if (param < 0)
                    throw new IllegalArgumentException("Negative number \"" + param + "\" cannot be used as as parameter\nPlease enter only positive numbers");
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Entered line cannot be used as a parameter\nPlease enter only positive numbers");
            }
        }

        String name = paramArray[0];
        double firstSide = Double.parseDouble(paramArray[1]);
        double secondSide = Double.parseDouble(paramArray[2]);
        double thirdSide = Double.parseDouble(paramArray[3]);
        return new Triangle(name, firstSide, secondSide, thirdSide);
    }
}

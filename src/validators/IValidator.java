package validators;

import model.Figure;

public interface IValidator {
    Figure getValidFigure(String params) throws IllegalArgumentException;
}

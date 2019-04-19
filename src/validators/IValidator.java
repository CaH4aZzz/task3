package validators;

import model.Figure;

public interface IValidator {
    Figure getValidatesFigure(String params) throws IllegalArgumentException;
}

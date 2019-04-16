package exceptions;

/**
 * Created by avokado on 16.04.2019.
 */
public class WrongParameterQuantityException extends Exception {
    private int paramLength;

    public WrongParameterQuantityException(int paramLength) {
        this.paramLength = paramLength;
    }

    @Override
    public String toString() {
        return "WrongParameterQuantityException{" +
                "paramLength = " + paramLength +
                '}';
    }
}

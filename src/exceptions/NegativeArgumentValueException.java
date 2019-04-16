package exceptions;

/**
 * Created by avokado on 16.04.2019.
 */
public class NegativeArgumentValueException extends Exception {
    private int position;

    public NegativeArgumentValueException(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "NegativeArgumentValueException{" +
                "position = " + position +
                '}';
    }
}

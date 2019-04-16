package exceptions;

/**
 * Created by avokado on 16.04.2019.
 */
public class EmptyStringException extends Exception{
    private int position;

    public EmptyStringException(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EmptyStringException{" +
                "position = " + position +
                '}';
    }
}

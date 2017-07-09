/**
 * Created by HP on 09.07.2017.
 */
public class MyArrayDataException extends NumberFormatException{
    int row, column;

    public MyArrayDataException(int row, int column) {
        super("ATTENTION!! Wrong data in row: " + row + " column: " + column);
        this.row = row;
        this.column = column;
    }
}

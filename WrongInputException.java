import java.util.Scanner;

public class WrongInputException extends Exception {

    public WrongInputException(String output) {

        super(output);
        
    }

}
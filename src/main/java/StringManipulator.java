import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

//import static org.junit.Assert.*;

public class StringManipulator {

    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = "Please enter a word that describes you!";
        System.out.println(message);
        String userInput = scan.nextLine();

        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println();


    }




}

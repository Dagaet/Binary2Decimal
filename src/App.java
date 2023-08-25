import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner keyboard = new Scanner(System.in);

        System.out.println("Insert your binary number -> ");
        String binaryNum = keyboard.nextLine();

        System.out.println("You have writed " + binaryNum);
        System.out.println("This is the output of the binary: ");
        int decimal = Integer.parseInt(binaryNum, 2);
        System.out.println(decimal);
    }
}

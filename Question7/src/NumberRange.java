import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberRange {

    public static void main(String[] args) {
        int number, endRange;

        for (int i=1; i<=6; i++){
             number = ThreadLocalRandom.current().nextInt(1, 49);
            System.out.println(number);
        }
        System.out.println("Please enter the value that you want to end at");
        Scanner scanner = new Scanner(System.in);
        endRange = scanner.nextInt();
        number = ThreadLocalRandom.current().nextInt(1, endRange);
        System.out.println(number);


}
}

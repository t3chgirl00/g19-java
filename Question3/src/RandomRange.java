import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomRange {
    public static void main(String[] args) {

        //Do while loop
        System.out.println("Do while loop");
        int number =4;
        do  {
             number = ThreadLocalRandom.current().nextInt(-3, 3);
            System.out.println(number);
        }
        while (number!=0);

         number =4;
        System.out.println("While loop ");
        while (number != 0) {
            number = ThreadLocalRandom.current().nextInt(-3, 3);
            System.out.println(number);

        }
    }



}

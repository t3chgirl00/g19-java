import java.security.SecureRandomSpi;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Computation {

    public static void main(String[] args) {
        //INTRODUCTION

       /** double rand = Math.random();
        System.out.println("" + rand);

        double n = (int)(Math.random()*10)+1;
        System.out.println("" + n);

        int num = ThreadLocalRandom.current().nextInt();
        System.out.println(num);

        Random ran = new Random();
        System.out.println(ran.nextInt(50)); **/

       //Question 2
        /**Code to generate random integer between 0 and 100 using Random()*/

        Random number = new Random();
        int randomNumber = number.nextInt(100);
        System.out.println(randomNumber);

        if (randomNumber == 0)
            System.out.println("Frozen");
        else if (1 >= randomNumber || randomNumber <= 14 ) System.out.println("Cold");
        else if (15 >= randomNumber || randomNumber <= 24 ) System.out.println("cool");
        else if (25 >= randomNumber || randomNumber <= 40 ) System.out.println("warm");
        else if (41 >= randomNumber || randomNumber <= 60 ) System.out.println("hot");
        else if (61 >= randomNumber || randomNumber <= 14 ) System.out.println("very hot");
        else if (81 >= randomNumber || randomNumber <= 99 ) System.out.println("extremely hot");
        else if (randomNumber==100) System.out.println("boiling");

        int randomNumber2 = number.nextInt(9);





    }
}

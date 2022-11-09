import java.util.Scanner;

public class AverageAndEvenNumber {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int numb, count = 0, avr = 0;

        System.out.print("Enter Number Greater Than 0  : ");
        numb = inp.nextInt();

        while (numb < 0) {
            System.out.println("Please Enter Number Greater Than 0 : ");
            numb = inp.nextInt();
        }

        for (int i = 0; i <= numb; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= numb; i++) {
            if ((i % 3 == 0 && i % 4 == 0)) {
                avr += i;
                count++;
            }
        }
        System.out.println("The average of numbers from 0 to " + numb + "is" + avr / count);
    }
}

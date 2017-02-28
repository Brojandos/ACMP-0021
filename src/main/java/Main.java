import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] salary = {input.nextInt(), input.nextInt(), input.nextInt()};

        int[] difference = {
                Math.abs(salary[0] - salary[1]),
                Math.abs(salary[0] - salary[2]),
                Math.abs(salary[1] - salary[2])
        };

        System.out.print(
                difference[0] > difference[1] ?
                        (difference[0] > difference[2] ? difference[0] : difference[2]) :
                        (difference[1] > difference[2] ? difference[1] : difference[2])
        );
    }
}
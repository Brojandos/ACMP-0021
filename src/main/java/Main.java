import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int x = Math.abs(a - b), y = Math.abs(b - c), z = Math.abs(a - c);
        System.out.print(x > y ? (x > z ? x : z) : (y > z ? y : z));
    }
}
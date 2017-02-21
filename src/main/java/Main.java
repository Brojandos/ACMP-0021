import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int[] salaryValues = getValuesFromInput();
        System.out.println(getDifferenceFromMinMaxValues(salaryValues));
    }

    private static int getDifferenceFromMinMaxValues(int[] values) {
        int min = values[0], max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
                continue;
            }
            if (max < values[i]) max = values[i];
        }
        return max - min;
    }

    private static int[] getValuesFromInput() throws IOException {
        String[] stringValues = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int[] values = new int[stringValues.length];
        for (int i = 0; i < values.length; i++)
            values[i] = Integer.parseInt(stringValues[i]);
        return values;
    }


}

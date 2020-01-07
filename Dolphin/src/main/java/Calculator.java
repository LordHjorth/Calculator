import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("HEJ");
    }

    public int Add(String numbers) {


        if (numbers == null || numbers.length() == 0)
            return 0;

        int sum = 0;

        String[] x = numbers.split("\n");

        ArrayList<String> lines = new ArrayList<String>(Arrays.asList(x));
        String delimeter = ",";

        if (lines.get(0).startsWith("//")) {
            System.out.println("Changes delimiter");
            delimeter = lines.get(0).replace("//", "");
            lines.remove(0);
        }


        for (String line : lines) {

            String[] split = line.split(delimeter);

            for (String s : split) {
                sum += Integer.parseInt(s);
            }


        }

        return sum;
    }


}


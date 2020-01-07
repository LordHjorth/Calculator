public class Calculator {

    public static void main(String[] args) {
        System.out.println("HEJ");
    }

    public int Add(String numbers) {

        int sum = 0;

        if (numbers == null || numbers.length() == 0)
            return 0;

        String[] lines = numbers.split("\n");

        for (String line : lines) {


            String[] split = line.split(",");

            for (String s : split) {
                sum += Integer.parseInt(s);
            }


        }

        return sum;
    }


}

public class Calculator {

    public static void main(String[] args) {
        System.out.println("HEJ");
    }

    public int Add(String numbers){

        if (numbers == null || numbers.length() == 0)
            return 0;

        String[] split = numbers.split(",");

        int sum = 0;
        for (String s : split) {
            sum += Integer.parseInt(s);
        }


        return sum;
    }


}

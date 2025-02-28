import java.util.*;

public class Main {
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return 0;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter numbers separated by space:");
        String[] inputs = scanner.nextLine().split(" ");
        
        for (String input : inputs) {
            numbers.add(parseStringToInteger(input));
        }
        
        System.out.println("The sum of the list is: " + calculateSum(numbers));
        scanner.close();
    }
}

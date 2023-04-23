import java.util.Scanner;

public class Operations {

    public String solution(String num1, String operation, String num2) {
        int result;
        String result1 = "";
        char deistvie = operation.charAt(0);
        switch (deistvie) {
            case '+' -> {
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                result1 = Integer.toString(result);
            }
            case '-' -> {
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                result1 = Integer.toString(result);
            }
            case '*' -> {
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                result1 = Integer.toString(result);
            }
            case '/' -> {
                // Проверяем деление на 0
                if (Integer.parseInt(num2) == 0) {
                    result1 = "Error";

                } else {
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result1 = Integer.toString(result);

                }
            }
        }
        return result1;
    }

    public String vvediteOperation() {
        String result = " ";
        System.out.println("Введите операцию");
        Scanner console = new Scanner(System.in);
        String enter;
        if (console.hasNext()) {
            while (true) {
                enter = console.nextLine();
                if (enter.length() == 1 && (enter.equals("/") || enter.equals("*") || enter.equals("+") ||
                        enter.equals("-") || enter.equals("C") || enter.equals("s"))) {
                    result = enter;
                    break;
                } else {
                    System.out.println("Неправильная операция, введите снова");
                }
            }
        }
        return result;
    }

}

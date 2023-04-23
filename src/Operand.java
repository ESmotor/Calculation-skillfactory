import java.util.Scanner;

public class Operand {

    public String vvediteOperand() {
        String enter = "";
        String enter1 = "";
        String enterLast = "";
        String enterLast1 = "";
        System.out.println("Введите целое число");
        Scanner console = new Scanner(System.in);


        while (true) {
            // Проверка на наличие в введеных данных вначале целого числа
            if (console.hasNextInt()) {
                enter = console.next();
                enterLast = console.nextLine();

            } else {
                enter1 = console.next();
                enterLast1 = console.nextLine();
            }

            if (enter.length() != 0 && enterLast.length() == 0) {
                break;

            } else if ((enter1.equals("C") || enter1.equals("s")) && enterLast1.length() == 0) {
                enter = enter1;
                break;
            } else {
                System.out.println("Некорректный ввод данных, повторите");
            }
        }


        return enter;
    }


}

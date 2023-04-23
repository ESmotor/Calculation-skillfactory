public class Main {
    public static void main(String[] args) {
        String result;
        String number1 = "";
        String number2;
        boolean goNumber1 = true;
        String operationType;
        Operand operand = new Operand();
        Operations operation = new Operations();



        while (true) {
            // Проверяем условие, нужно ли вводить заново первый операнд или нет, если да, то вводим
            if (goNumber1) {
                number1 = operand.vvediteOperand();
                // Проверка обнуления
                if (number1.equals("C")) {
                    System.out.println("Обнуление");
                    continue;
                }
                // Проверка остановки
                if (number1.equals("s")) {
                    System.out.println("Выключение");
                    break;
                }
                goNumber1 = false;
            }

            //Вводим операцию и проверяем допустимость в методе
            operationType = operation.vvediteOperation();

            // Проверка обнуления
            if (operationType.equals("C")) {
                goNumber1 = true;
                System.out.println("Обнуление");
                continue;
            }

            // Проверка остановки
            if (operationType.equals("s")) {
                System.out.println("Выключение");
                break;
            }

            //Вводим второй операнд и проверяем допустимость в методе
            number2 = operand.vvediteOperand();

            // Проверка обнуления
            if (number2.equals("C")) {
                goNumber1 = true;
                System.out.println("Обнуление");
                continue;
            }

            // Проверка остановки
            if (number2.equals("s")) {
                System.out.println("Выключение");
                break;
            }

            // Считаем результат в методе
            result = operation.solution(number1, operationType, number2);
            // Проверяем деление на 0
            if (!result.equals("Error")) {
                System.out.println(number1 + " " + operationType + " " + number2 + " = " + result);
                // Если не было деления на 0, то присваиваем результат первому операнду для дальнейших вычислений
                number1 = result;
            } else {
                System.out.println(result + " : Деление на 0 не возможно");
                goNumber1 = true;
                System.out.println("Обнуление");

            }
        }


    }
}
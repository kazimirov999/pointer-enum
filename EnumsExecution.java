//Написати програму для роботи з Enums (даємо волю фантазії). Це може бути Опис ІТ компаній і їх спеціалізації. Університет і його факультети і т.д.
//        Виконати мінімум 5 завдання на пошук по певним критеріям. Використати Scanner для введення цих критеріїів (наприклад: вивести товари введеної категорії;
//замінити кількість студентів введеної спеціальності на введенну і т.д.)

import java.util.Scanner;

public class EnumsExecution {
    public static void main(String[] args) {
        String i = null;
        boolean entered = true;

        Parametriser.checking();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введіть модель смартфона для ідендифікації порядкової диспозиції: ");
            if (scanner.hasNextLine()) {
                i = scanner.nextLine();
                entered = false;
            } else
                scanner.next();
        } while (entered);

        Parametriser.counter(i);
    }
}

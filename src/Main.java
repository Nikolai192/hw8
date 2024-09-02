public class Main {
    public static void main(String[] args) {
    // Задача 1
    int [] loop = {55_300, 91_541, 68_546, 84_910, 78_053};
    int sum = 0;
    for (int i: loop) {
        sum += i;
    }

    System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    // Задача 2
    int min = loop[0];
    int max = loop[1];
    for (int i = 0; i < loop.length; i++) {
        if (loop[i] < min) {
            min = loop[i];
        }
        if (loop[i] > max) {
            max = loop[i];
        }
    }
        System.out.println("Минимальная сумма трат за неделю составляет " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составляет " + max + " рублей");

    // Задача 3
        double avarageAmount = sum / loop.length;
        {
            System.out.println("Средняя сумма трат за месяц составила " + avarageAmount + " рублей");
        }

        //Задача4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int rightIndex = reverseFullName.length - i - 1;
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[rightIndex];
            reverseFullName[rightIndex] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
    }
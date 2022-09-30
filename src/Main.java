import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int year = 2022;
        determineTheYear(year);

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2017;
        int clientOS = 1;
        checkVersion (clientOS, clientDeviceYear);

        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int countDays = calculationOfDelivery (deliveryDistance); // Получаем количество дней из метода
        if (countDays > 0) {
            System.out.println("Потребуется дней: " + countDays);
        }
        else {
            System.out.println("Некорректное расстояние, нельзя провести расчет");
        }

    }

    public static void determineTheYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " — високосный год");
        }
        else
            System.out.println(year + " — не високосный год");
    }

    public static void checkVersion (int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear <= currentYear && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear <= currentYear && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        if (clientDeviceYear > currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear > currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculationOfDelivery (int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance < 20) {
            return 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        }
        return 0; // Если не вошло ни в один интервал
    }
}

public class Main {

    public static void main(String[] args) {
        // Задача 1
        int year = 2000;
        indicateLeapYear(year);
        // Задача 2
        int osType = 2;
        int deviceYear = 2008;
        chooseOS(deviceYear,osType);
        // Задача 3
        int distance = 100;
        calculateDeliveryDays (distance);
    }

    // Метод для Задачи 1
    public static void indicateLeapYear(int year) {

        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    // Метод для Задачи 2
    public static void chooseOS(int deviceYear, int systemType) {

        if (systemType == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (systemType == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (systemType == 2 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (systemType == 2 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    // Метод для Задачи 3
    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryPeriod = deliveryDistance / 40;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else {
            System.out.println("Потребуется дней: " + (deliveryPeriod + 1));
        }
    }
}

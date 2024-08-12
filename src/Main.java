public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        // Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        // Задание 2
        int yearRelease = 2016;
        String operSystem;
        if (clientOS == 0) {
            operSystem = "iOS";
        } else {
            operSystem = "Android";
        }
        if (yearRelease >= 2015) {
            System.out.println("Установите версию приложения для " + operSystem + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + operSystem + " по ссылке");
        }

        System.out.println("Задание 3");
        // Задание 3
        int year = 2021;
        if ((year % 4 == 0) && year != 100 && (year % 400 == 0) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        System.out.println("Задание 4");
        // Задание 4
        int deliveryDistance = 19;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }


        System.out.println("Задание 5");
        // Задание 5
        int monthNumber = 10;
        if (monthNumber > 0 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
            }
        } else {
            System.out.println("Номер месяца больше 12");
        }
    }
}
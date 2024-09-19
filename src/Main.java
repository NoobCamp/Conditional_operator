//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание №2");
        byte clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS1 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание №3");
        int year = 2021;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("В " + year + " ещё не вёлся отсчёт високосного года");
        }

        System.out.println("Задание №4");
        int deliveryDistance = 91;
        int deliveryDays = 1;
        if (deliveryDistance <= 100) {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
            } else {
                System.out.println("Потребуется дней: " + (deliveryDays + 2));
            }
        } else {
            System.out.println("Доставка невозможна");
        }
        System.out.println("Задание №5");
        byte monthNumber = 1;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
        }
    }
}
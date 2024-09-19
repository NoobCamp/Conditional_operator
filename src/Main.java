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
        // если используются мелкие числа, то можно ли использовать byte, а не int, как было в уроках? В прошлом домашке тоже byte использовал
        System.out.println("Задание №2");
        byte clientOS1 = 0;
        int clientDeviceYear = 2014;
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
        int year = 1585;
        boolean isIt1584 = year > 1584; // по условия не совсем понял, а в 1584 уже вёлся отсчёт и это високосный год или нет?
        if (isIt1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("В " + year + " ещё не вёлся отсчёт високосного года");
        }

        System.out.println("Задание №4");
        int deliveryDistance = 101;
        boolean lessThan100km = deliveryDistance <= 100;
        int deliveryDays = 1;
        if (lessThan100km) {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
                deliveryDays = deliveryDays + 1;
                System.out.println("Потребуется дней: " + deliveryDays);
            } else {
                deliveryDays = deliveryDays + 2;
                System.out.println("Потребуется дней: " + deliveryDays);
            }
        } else {
            System.out.println("Доставка невозможна"); // в задании указано так, будто срок доставки должен быть указан переменной
            // но ведь можно обойтись без переменной срока доставки и сразу писать число в зависимости от расстояния
            // в задании написано: "сообщение в консоль: "Потребуется дней: " + срок доставки."
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
        // на счёт 5 задания не уверен, как бы всё максимально просто, но объёмно и кажется смысл был использовать else-if для группировки месяцев во времена года
        // но с другой стороны это выдавать внутри условного оператора переменным число, которое будет в case читать и всё равно выйдет фигня
        // подскажите тогда, правильно ли решил или может надо было иначе, а не максимально простой метод с кучей строк
    }
}
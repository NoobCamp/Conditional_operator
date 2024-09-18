//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        {
        System.out.println("Задание №2");
        byte temp = 4;
            if (temp < 5) {
                System.out.println("На улице " + temp + " градуса, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temp + " градусов, можно идти без шапки");
            }
            {
                System.out.println("Задание №3");
                int speed = 70;
                if(speed > 60) {
                    System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
                } else {
                    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
                }
                {
                    System.out.println("Задание №4");
                    byte age1 = 19;
                    boolean howOld = age1 < 18;
                    if(howOld) {
                        if (age1 >= 2 && age1 < 7) {
                            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
                        } else {
                            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
                        }
                    } else {
                        if (age1 < 24) {
                            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
                        } else {
                            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
                            // очень сложно получилось с двойным if-else, не уверен на счёт правильности, но только так придумал
                            // и ещё возраст 1 год не учитывается, по такой системе в 1 год должен ходить в школу и как его учесть не придумал
                        }
                        {
                            System.out.println("Задание №5");
                            byte age2 = 13;
                            if (age2 < 5) {
                                System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе");
                            } else {
                                if (age2 < 14) {
                                    System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься в сопровождении взрослого");
                                } else {
                                    System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься без сопровождения взрослого");
                                }
                            }
                            {
                                System.out.println("Задание №6");
                                byte yourNumber = 103;
                                if (yourNumber <= 60) {
                                    System.out.println("Вам доступно сидячее место");
                                } else {
                                    if (yourNumber <= 102) {
                                        System.out.println("Сидячих мест не осталось, доступно только ехать стоя");
                                    } else {
                                        System.out.println("К сожалению в вагоне больше не осталось мест");
                                    }
                                }
                            }
                            {
                                System.out.println("Задание №7");
                                int one = 15;
                                int two = 21;
                                int three = 20;
                                boolean compare1 = one > two && one > three;
                                boolean compare2 = two > three;
                                if (compare1) {
                                    System.out.println("Число " + one + " больше других");
                                } else {
                                    if (compare2) {
                                        System.out.println("Число " + two + " больше других");
                                    } else {
                                        System.out.println("Число " + three + " больше других");
                                        // пока кажется всё муторно немного и использовал разные методы решения в задачах, но оптимальным кажется именно в последнем задании, он короче остальных
                                }
                            }
                            }
                        }
                    }
                }
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
        System.out.println(" Если возраст человека равен " + age + " лет, то он совершеннолетний");
        }
        int humanAge = 17;
        if (humanAge <= 17) {
            System.out.println(" Если возраст человека равен " + humanAge + " лет, то он не совершеннолетний"); }

        System.out.println(" Задание 2");
        int minus = -5;
        if (minus <= -5) {
            System.out.println(" На улице " + minus + " градусов, нужно надеть шапку ");
        }
        byte plus = 5;
        if (plus >= 5) {
            System.out.println(" На улице " + plus + " градусов, можно идти без шапки");
        }
        System.out.println(" Задание 3");
        byte speed = 61;
        if (speed >= 61) {
            System.out.println(" Если скорость 61 или более км/ч, то придется заплатить штраф");
        }
        byte speedCar = 60;
        if (speedCar <= 60) {
            System.out.println(" Если скорость 60 или меньше км/ч, то штраф платить не нужно");
        }
        System.out.println(" Задание 4");
        byte kindergarten = 3;
        if (kindergarten >= 2 && kindergarten <= 6) {
            System.out.println(" Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        byte shool = 15;
        if (shool >= 7 && shool <= 17) {
            System.out.println(" Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }
        byte university = 18;
        if (university >= 18 && university <= 24) {
            System.out.println(" Если возраст человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        }
        byte job = 24;
        if (job >= 24) {
            System.out.println(" Если возраст человека равен 24 года и больше, то ему нужно ходить на работу");
        }
        System.out.println(" Задание 5");
        byte forbidden = 4;
        if (forbidden < 5) {
            System.out.println(" Если возраст ребенка равен 5 или меньше лет, то ему нельзя кататься на аттракционах");
        }
        byte limitation = 7;
        if (limitation >5 && limitation <13) {
            System.out.println(" Если возраст ребенка равен больше 5, но меньше 13 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        byte allowed = 15;
        if (allowed >14) {
            System.out.println(" Если возраст ребенка равен больше 14 лет, то он может кататься без сопровождения взрослого");
        }
        System.out.println(" Задание 6");
        byte vagon = 102;
        byte seating = 60;
        byte standing = 42;
        if (seating >=60 && vagon <=102 ) {
            System.out.println(" В вагоне остиались стоячие места");
        }
        if ( vagon <=102 && standing >=42) {
            System.out.println(" В вагоне есть сидячие места");
        }
        if (vagon ==102) {
            System.out.println(" В вагоне больше нет мест");
        }
        System.out.println(" Задание 7");
        byte one = 1;
        byte two = 2;
        byte there = 3;
        if (one>two && one > there) {
            System.out.println(" Наибольшее число one");
        } else {
            System.out.println(" Наибольшее число there");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + " лет, то он совершеннолетний");
        } else {
                System.out.println(" Если возраст человека равен " + age + " лет, то он не совершеннолетний");
            }
        System.out.println(" Задание 2");
        byte temp = -5;
        if (temp <= -5) {
            System.out.println(" На улице " + temp + " градусов, нужно надеть шапку ");
        } else {
            System.out.println(" На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println(" Задание 3");
        byte speed = 61;
        if (speed >= 61) {
            System.out.println(" Если скорость 61 или более км/ч, то придется заплатить штраф");
        } else {
            System.out.println(" Если скорость 60 или меньше км/ч, то штраф платить не нужно");
        }
        System.out.println(" Задание 4");
        byte employmentByAge = 30;
        if (employmentByAge >= 2 && employmentByAge <= 6) {
            System.out.println(" Если возраст человека равен от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        if (employmentByAge >=7 && employmentByAge <=17) {
            System.out.println(" Если возраст человека равен от 7 до 17 лет, то ему нужно ходить в школу");
        }
        if (employmentByAge >= 18 && employmentByAge <= 24) {
            System.out.println(" Если возраст человека равен от 18 до 24 лет, то ему нужно ходить в университет");
        } else {
            System.out.println(" Если возраст человека равен 24 года и больше, то ему нужно ходить на работу");
        }
        System.out.println(" Задание 5");
        byte prohibitedOrAllowed = 16;
        if (prohibitedOrAllowed <= 5) {
            System.out.println(" Если возраст ребенка равен 5 или меньше лет, то ему нельзя кататься на аттракционах");
        }
        if (prohibitedOrAllowed >= 5 && prohibitedOrAllowed <= 13) {
            System.out.println(" Если возраст ребенка равен больше 5, но меньше 13 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя ");
        } else {
        System.out.println(" Если возраст ребенка равен или больше 14 лет, то он может кататься без сопровождения взрослого");
        }
        System.out.println(" Задание 6");
        byte vagon = 95;
        if (vagon >=60 && vagon <=101 ) {
            System.out.println(" В вагоне остиались стоячие места");
        }
        if ( vagon ==1 || vagon <=59) {
            System.out.println(" В вагоне есть сидячие места");
        }
        if (vagon >= 102) {
            System.out.println(" В вагоне больше нет мест");
        }
        System.out.println(" Задание 7");
        byte one = 1;
        byte two = 2;
        byte there = 3;
        if (there > one && there > two ) {
            System.out.println(" три больше двух и одного ");
        } else if (two > one && two < there )
            System.out.println(" два больше одного, но два меньше трех ");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

	    // Задание 1
        byte orange = 1;
        short lemon = 2;
        int apple = 8;
        long grape = 100L;
        float peachWeight = 55.9f;
        double cherryWeight = 68.8;

        boolean fruit = apple > 3;
        System.out.println(fruit);

        char blueberry = 33;
        System.out.println(blueberry);

        // Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxerWeight = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров= " + boxerWeight + " кг");
        System.out.println("Разница в весе боксеров= " + weightDifference + " кг");

        // Задание 3

        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;

        int bananasWeight = banana * 80;
        int milkWeight = milk * 105;
        int iceCreamWeight = iceCream * 100;
        int eggsWeight = eggs * 70;

        double breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println(breakfastWeight + " g");

        double breakfast = breakfastWeight / 1000;
        System.out.println(breakfast + " kg");

        // Задание 4

        int loseWeight1 = (int) (7 / 0.25);
        System.out.println (loseWeight1 + " дней");

        int loseWeight2 = (int) (7 / 0.5);
        System.out.println (loseWeight2 + " дней");

        int mean = (loseWeight1 + loseWeight2) / 2;
        System.out.println(mean + " дней");

        // Задание 5

        double mashaSalary = 67760;
        double mashaIncrease = (10 * mashaSalary / 100) + mashaSalary ;
        double mashaSalaryDifference = mashaIncrease - mashaSalary;
        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей." );

        double denisSalary = 83690;
        double denisIncrease = (10 * denisSalary / 100) + denisSalary ;
        double denisSalaryDifference = denisIncrease - denisSalary;
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей." );


        double kristinaSalary = 76230;
        double kristinaIncrease = (10 * kristinaSalary / 100) + kristinaSalary ;
        double kristinaSalaryDifference = kristinaIncrease - kristinaSalary;
        System.out.println("Кристина теперь получает " + kristinaIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей." );




    }
}

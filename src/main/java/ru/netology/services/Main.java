package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelancerService service = new FreelancerService();

        // Пример 1
        int income1 = 10000;
        int expenses1 = 3000;
        int threshold1 = 20000;
        int restMonths1 = service.calculateRestMonths(income1, expenses1, threshold1);
        System.out.println("Количество месяцев отдыха (пример 1): " + restMonths1); // Ожидается 3

        // Пример 2
        int income2 = 100000;
        int expenses2 = 60000;
        int threshold2 = 150000;
        int restMonths2 = service.calculateRestMonths(income2, expenses2, threshold2);
        System.out.println("Количество месяцев отдыха (пример 2): " + restMonths2); // Ожидается 2


    }
}





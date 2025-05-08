package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {

    @Test
    public void testCalculateRestMonths_WithSufficientIncome() {
        FreelancerService service = new FreelancerService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int result = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(3, result); // Ожидаем 3 месяца отдыха
        System.out.println("Количество месяцев отдыха (пример 1): " + result);
    }

    @Test
    public void testCalculateRestMonths_WithHighIncome() {
        FreelancerService service = new FreelancerService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int result = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(2, result); // Ожидаем 2 месяца отдыха
        System.out.println("Количество месяцев отдыха (пример 2): " + result);
    }

    @Test
    public void testCalculateRestMonths_WithInsufficientIncome() {
        FreelancerService service = new FreelancerService();
        int income = 1000;
        int expenses = 1200;
        int threshold = 1500;

        int result = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(0, result); // Ожидаем 0 месяцев отдыха
    }

    @Test
    public void testCalculateRestMonths_NoVacations() {
        FreelancerService service = new FreelancerService();
        int income = 500;
        int expenses = 600;
        int threshold = 1000;

        int result = service.calculateRestMonths(income, expenses, threshold);

        assertEquals(0, result); // Ожидаем 0 месяцев отдыха
    }

}








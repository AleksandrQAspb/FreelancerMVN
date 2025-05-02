package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {

    @Test
    public void testCalculateRestMonths() {
        FreelancerService service = new FreelancerService();

        // Тест 1
        int result1 = service.calculateRestMonths(10000, 3000, 20000);
        assertEquals(4, result1); // Ожидаем 4 месяца отдыха

        // Тест 2
        int result2 = service.calculateRestMonths(100000, 60000, 150000);
        assertEquals(3, result2); // Ожидаем 3 месяца отдыха
    }
}






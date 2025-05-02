package ru.netology.services;

public class FreelancerService {
    public int calculateRestMonths(int income, int expenses, int threshold) {
        int count = 0; // Счётчик месяцев отдыха
        int money = 0; // Количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Если денег достаточно для отдыха
                count++; // Увеличиваем счётчик месяцев отдыха
                money -= expenses; // Тратим на обязательные расходы
                money -= (money / 3); // Тратим на отдых
            } else { // Если денег недостаточно, работаем
                money += income; // Зарабатываем
                money -= expenses; // Тратим на обязательные расходы
            }
        }
        return count; // Возвращаем общее количество месяцев отдыха
    }
}
















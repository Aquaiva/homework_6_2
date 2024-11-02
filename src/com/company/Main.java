package com.company;

import java.time.LocalDate;

public class Main {
    public static int chekLeapOrNot(int year) {
        boolean leap = (year >= 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
        if (leap) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
        return year;
    }

    public static int getAppForOS(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        boolean oldIOS = (year < currentYear && os == 0);
        boolean oldAndroidOS = (year < currentYear && os == 1);
        boolean currentIOS = (year == currentYear && os == 0);
        if (oldIOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oldAndroidOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (currentIOS) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }

        return currentYear;
    }

    public static int countTheDays(int distance) {
        byte days = 0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance < 60) {
            days = 2;
        } else if (distance >= 60 && distance <= 100) {
            days = 3;
        } else {
            days = 0;
        }
        return days;
    }

    public static void main(String[] args) {
        // task 1
        System.out.println("task 1");
        int year = 2096;
        chekLeapOrNot(year);
        // task 2
        System.out.println("Task 2");
        int clientOS = 1;
        int yearOfOS = 2024;
        getAppForOS(clientOS, yearOfOS);
        //task 3
        System.out.println("Task 3");
        int deliveryDistance = 95;
        if (countTheDays(deliveryDistance) != 0) {
            System.out.println("Потребуется дней для доставки: " + countTheDays(deliveryDistance));
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

    }
}

/*
 * This source file was generated by the Gradle 'init' task
 */
package oop.exercise;

import java.time.LocalDate;

public class App {
    public int getTicketPrice(int age, int hour) {
        int price = 2500;

        if (age >= 20) {
            if (hour < 10) {
                price = 2000;
            } else if (hour > 18) {
                price = 2000;
            }
        } else if (age >= 3) {
            if (hour < 10) {
                price = 1200;
            } else if (hour > 18) {
                price = 1200;
            } else {
                price = 1500;
            }
        } else {
            price = 0;
        }

        return price;
    }

    public static void main(String[] args) {
        int customerAge = 20;
        int screeningHour = 12;
        int specialDay = 10;
        boolean isDiscount = false;
        if (LocalDate.now().equals(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), specialDay))) {
            if (isDiscount) {
                System.out.println(new App().getTicketPrice(customerAge, screeningHour) - 300);
            } else {
                System.out.println(new App().getTicketPrice(customerAge, screeningHour) - 200);
            }
        } else {
            if (isDiscount) {
                System.out.println(new App().getTicketPrice(customerAge, screeningHour) - 300);
            } else {
                System.out.println(new App().getTicketPrice(customerAge, screeningHour));
            }
        }
    }
}

package ru.netology.stats;

public class StatisticsService {

    public int sumAllMonth(int[] sales) {
        int sum = 0;
        for (int purchase : sales) {

            sum += purchase;

        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int sum = sumAllMonth(sales);
        int month = sales.length;
        int amount = 0;

            amount = sum / month;

        return amount;
    }

    public static int maxSalesMonth(int[] sales) {
        int max = sales[0];
        int maxMonth = 0;
        int month = 0;

        for (int number : sales) {
            maxMonth = maxMonth + 1;

            if (max <= number) {
                max = number;
                month = maxMonth;
            }
        }
        return month;
    }

    public static int minSalesMonth(int[] sales) {
        int max = sales[0];
        int minMonth = 0;
        int month = 0;

        for (int number : sales) {
            minMonth = minMonth + 1;

            if (max >= number) {
                max = number;
                month = minMonth;
            }
        }
        return month;
    }


    public int monthDownMid(int[] sales) {

        int amount = averageAmount(sales);
        int monthDown = 0;
        for (int downMid : sales) {

            if (amount > downMid) {
                monthDown = monthDown + 1;

            }
        }
        return monthDown;
    }

    public int monthUpMid(int[] sales) {

        int amount = averageAmount(sales);
        int monthUp = 0;
        for (int downMid : sales) {

            if (amount <= downMid) {
                monthUp = monthUp + 1;
            }
        }
        return monthUp;
    }
}












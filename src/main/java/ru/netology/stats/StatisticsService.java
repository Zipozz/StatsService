package ru.netology.stats;

public class StatisticsService {

    public int SumAllMonth(int[] sales) {
        int sum = 0;
        for (int purchase : sales) {

            sum += purchase;

        }
        return sum;
    }

    public int AverageAmount(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int purchase : sales) {
            month = month + 1;

            sum += purchase;

        }
        return sum / month;
    }

    public static int MaxSalesMonth(int[] sales) {
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

    public static int MinSalesMonth(int[] sales) {
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


    public int MonthDownMid(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int purchase : sales) {
            month = month + 1;

            sum += purchase;

        }
        int amount = sum / month;
        int MonthDown = 0;
        for (int downMid : sales) {

            if (amount > downMid) {
                MonthDown = MonthDown + 1;

            }
        }
        return MonthDown;
    }

    public int MonthUpMid(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int purchase : sales) {
            month = month + 1;

            sum += purchase;

        }
        int amount = sum / month;
        int MonthUp = 0;
        for (int downMid : sales) {

            if (amount <= downMid) {
                MonthUp = MonthUp + 1;
            }
        }
        return MonthUp;
    }
}












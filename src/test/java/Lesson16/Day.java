package Lesson16;

import Lesson16.DaysOfWeek.*;

public class Day {
    String dayOfWeek; // День недели. Не статическое

    int dayOfMonth; // Дата в месяце. Не статическое
    String month; // Месяц
    int maxDaysInMonth; // Число дней в месяце
    String[] months = new String[]

            {
                    "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
            };

    Day(int WeekOfYear, int dayOfWeek) {


        int i = 0;        // вычисляем месяц
        int numFirstMondayInYear = (WeekOfYear - 1) * 7 + 3; // Порядковый номер понедельника в году. Для 2022 года считаем первую неделю с 03.01.2022
        if (numFirstMondayInYear <= 31) {
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear;
        }
        if (31 < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28)) {
            i = 1;
            month = months[i];
            maxDaysInMonth = 28;
            dayOfMonth = numFirstMondayInYear - 31;
        }
        if ((31 + 28) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31)) {
            i = 2;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 59;
        }
        if ((31 + 28 + 31) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30)) {
            i = 3;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numFirstMondayInYear - 90;
        }
        if ((31 + 28 + 31 + 30) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31)) {
            i = 4;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 120;
        }
        if ((31 + 28 + 31 + 30 + 31) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30)) {
            i = 5;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numFirstMondayInYear - 151;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31)) {
            i = 6;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 181;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31)) {
            i = 7;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 212;
        }

        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30)) {
            i = 8;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numFirstMondayInYear - 243;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31)) {
            i = 9;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 273;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30)) {
            i = 10;
            month = months[i];
            maxDaysInMonth = 30;
            dayOfMonth = numFirstMondayInYear - 304;
        }
        if ((31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) < numFirstMondayInYear && numFirstMondayInYear <= (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31)) {
            i = 11;
            month = months[i];
            maxDaysInMonth = 31;
            dayOfMonth = numFirstMondayInYear - 334;
        }

        dayOfMonth = dayOfMonth + dayOfWeek;
        if (dayOfMonth > maxDaysInMonth && i < 11) {

            i++;
            dayOfMonth = dayOfMonth - maxDaysInMonth;
            month = months[i];

        }
    }
}





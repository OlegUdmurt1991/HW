package Lesson16.Enum;



public class Main {// Для 2022 года считаем первую неделю с 03.01.2022

    public static void main(String[] args) {


    int weekNum = 4;
        System.out.println("Неделя " + weekNum + ":");
    Week firstWeek = new Week(weekNum);
        System.out.println(" ");
    weekNum = 10;
        System.out.println("Неделя " + weekNum + ":");
    Week secondWeek = new Week(weekNum);
        System.out.println(" ");
    weekNum = 20;
        System.out.println("Неделя " + weekNum + ":");
    Week thirdWeek = new Week(weekNum);
}
}

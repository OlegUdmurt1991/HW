package Lesson16.Enum;



public class Week {

    Day day1;
    Day day2;
    Day day3;
    Day day4;
    Day day5;
    Day day6;
    Day day7;

    Week(int weekNum) {
        int numFirstMondayInWeek = weekNum;
        day1 = new Day(numFirstMondayInWeek, 0);

//        day2 = new
//
//                Day(weekOfYear, 1);
//
//        day3 = new
//
//                Day(weekOfYear, 2);
//
//        day4 = new
//
//                Day(weekOfYear, 3);
//
//        day5 = new
//
//                Day(weekOfYear, 4);
//
////        day6 = new
////
////                Lesson16.Day(weekOfYear, 5);
//
//        day7 = new
//
//                Day(weekOfYear, 6);
    }
}

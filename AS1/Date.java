
/**
 * class date
 * prints the date
 * Joey Koumjian
 * 6/6/22
 */


public class Date
{
    public static void main(String [] args){
        String day, month;
        int date, year;
        day = "Monday";
        month = "June";
        date = 6;
        year = 2022;
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + ", " + year);

    }
}

/* 2)
 * Monday
   June
   6
   2020
   
   3)
   Monday
   June, 6
   2020
   
   4)
   Monday, June 6, 2022
   
   5)
   American Format:
   Monday, June 6, 2022
   European Format:
   Monday 6 June, 2022
 */

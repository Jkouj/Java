
/**
 * time.java
 * Joey Koumjian
 */
public class Time
{
    public static void main(String [] args){
        int hour, minute, second, midnight, remaining, percent;
        hour = 12;
        minute = 42;
        second = 16;
        midnight = hour*3600 + minute*60 + second;
        remaining = 86400 - midnight;
        percent = 100 * midnight / 86400;
        System.out.println(midnight);
        System.out.println(remaining);
        System.out.println(percent + "%");
    }
}

/*
 * 86400 total seconds in a day
 * 2)
 * 45736
 * 
 * 3)
 * 40664
 * 
 * 4)
 * 52%
 */
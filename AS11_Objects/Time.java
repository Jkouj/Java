/**
 * class Time represents a time of day in hours, min, sec
 *   We develop this class in the lecture, watch the video
 *   to see the class being developed and follow along
 */
class Time
{
    private int hour, minute; //instance variables for Time objects
    private double second;

   
    // add the no-arg (default) constructor here
    public Time() {
        this.hour = 12;
        this.minute = 0;
        this.second= 0.0;
        
    }
    
    // add the overloaded (explicit) constructor here
    public Time(int hour, int minute, double second) {
        this.hour = hour; //the instance hour (objects long term storage)
        this.minute = minute;
        this.second= second;
        
    }
    
    // add the getHour method here
    public int getHour(){
        return hour;
    }
    // add the getMinute method here
    public int getMinute() {
        return minute;
    }
    // add the getSecond method here
    public double getSecond() {
        return second; //could say this.second
    }
    // add the setHour method here
    public void setHour(int hour){
        this.hour = hour;
    }
        
    // add the setMinute method here
    public void setMinute(int minute) {
        if (minute >= 0 && minute <=59){
            this.minute = minute;
        }
    }
    // add the setSecond method here
    public void setSecond(double second) {
        this.second = second;
    }
    
    public void print() {
        System.out.println("Your appointment is at: " + this.getHour() + ":" 
                            + this.getMinute() + ":" + this.getSecond());
    }
}
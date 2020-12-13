package problemSolving5.exerciseA;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }



    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour <25)
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute < 60)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second>=0 && second<60)
            this.second = second;
    }

    @Override
    public String toString() {
        String h,m,s,time="";

        if(hour < 10)
            h = "0"+hour;
        else
            h = Integer.toString(hour);

        if(minute < 10)
            m = "0"+minute;
        else
            m = Integer.toString(minute);

        if(second < 10)
            s = "0"+second;
        else
            s = Integer.toString(second);

        time = h+":"+m+":"+s;

        return time;
    }
}

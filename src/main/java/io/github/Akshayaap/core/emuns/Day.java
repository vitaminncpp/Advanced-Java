package io.github.Akshayaap.core.emuns;

public enum Day {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private int currDay;
    Day(int day){
        this.currDay=day;
    }

    public int getValue(){
        return  this.currDay;
    }

}

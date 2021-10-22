/**
 *
 *
 * @Author Akshay
 */
package io.github.Akshayaap.core.emuns;


public class EmunTest {
    public static void main(String[] args) {
        Day monday=Day.MONDAY;
        Day today=Day.FRIDAY;
        Day tomorrow=Day.SATURDAY;
        Day yesterday=Day.THURSDAY;

        System.out.println("Today is : "+today);
        System.out.println("Tomorrow is : "+tomorrow);
        System.out.println("Yesterday was : "+yesterday);
        System.out.println("A Daya on Monday : "+monday);
        System.out.println("Day Values");
        for (Day day:Day.values()){
            System.out.println(day);
        }

    }
}

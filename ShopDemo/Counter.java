import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int totalCount;

    public Counter(int x){
       //sets counter to the parameter number specified when instantiated
       totalCount=x;
       setImage(new GreenfootImage("" + totalCount, 20, Color.WHITE, Color.BLACK));
        
    }
    public void bumpCounter(){
        totalCount++;
        setImage(new GreenfootImage(""+totalCount, 20, Color.WHITE, Color.BLACK));
    }
    public int returnValue(){
        //returns the number on the counter
        return totalCount;
    }
    public void setCurrentValue(int x)
    {
        //changes the counter value when item is purchased
        totalCount = totalCount - x;
        setImage(new GreenfootImage(""+totalCount, 20, Color.WHITE, Color.BLACK));
    }
    
}

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
    private static final Color transparent = new Color (0,0,0,0);
    private GreenfootImage background;
    
    public Counter(int x){
       //sets counter to the parameter number specified when instantiated
       totalCount=x;
       setImage(new GreenfootImage("Score: " + totalCount, 20, Color.WHITE, transparent));
        
    }
    public void bumpCounter(){
        totalCount++;
        setImage(new GreenfootImage("Score: "+totalCount, 20, Color.WHITE, transparent));
    }
    public int returnValue(){
        //returns the number on the counter
        return totalCount;
    }
    public void setCurrentValue(int x)
    {
        //changes the counter value when item is purchased
        totalCount = totalCount - x;
        setImage(new GreenfootImage("Score: "+totalCount, 20, Color.BLACK, transparent));
    }
    public void gainPoints(int z){
        totalCount = totalCount + z;
        setImage(new GreenfootImage("Score: "+totalCount, 20, Color.BLACK, transparent));
    }
    
}

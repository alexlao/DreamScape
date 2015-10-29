import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends World
{
    //created some class constructors
    Weapon1 weapon1 = new Weapon1(); 
    Weapon2 weapon2 = new Weapon2();
    Weapon3 weapon3 = new Weapon3();
    Counter counter;
    int z;
    public Shop(int totalCount )
    {
        //takes in paramaters to continue the counter
        super(600, 400, 1); 
        prepare();
        counter = new Counter(totalCount);
        act();
        addObject(counter, 36, 12);

    }
 
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
 
        addObject(weapon1, 110, 240);  
        showText("3 Points", 110, 270);
        addObject(weapon2, 296, 240);
        showText("1 Point", 296, 270);
        addObject(weapon3, 483, 240);
        showText("2 Points", 483, 270);
    }
    
   
    
    public void act(){
    //code that runs in the shop to see which item to purchase and if sufficient credits to purchase
    if(Greenfoot.mouseClicked(weapon1) && counter.returnValue()>=3){
        removeObject(weapon1);
        counter.setCurrentValue(3);
 
    }
    if((Greenfoot.mouseClicked(weapon2) && counter.returnValue()>=1)){
        removeObject(weapon2);
        counter.setCurrentValue(1);
    }
    if((Greenfoot.mouseClicked(weapon3) && counter.returnValue()>=2)){
        removeObject(weapon3);    
        counter.setCurrentValue(2);
    }  
    }
    public Counter getCounter()
    {
        //gets counter, similar to lab exercise
        return counter;
    }
}

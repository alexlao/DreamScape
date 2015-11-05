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
    int shopNumA;
    int shopNumB;
    int shopNumC;
    
    Lives hp;
    public Shop(int totalCount, Lives life )
    {
        //takes in paramaters to continue the counter
        super(1000, 600, 1); 
        prepare();
        counter = new Counter(totalCount);
        act();
        hp = life;
        addObject(counter, 36, 12);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        addObject(weapon1, getWidth()*1/3, getHeight()/2);  
        showText("3 Points",getWidth()*1/3, getHeight()/2-50);
        addObject(weapon2,getWidth()*1/3+100, getHeight()/2);
        showText("1 Point",getWidth()*1/3+100, getHeight()/2-50);
        addObject(weapon3, getWidth()*1/3+200, getHeight()/2);
        showText("2 Points", getWidth()*1/3+200, getHeight()/2-50);
        shopNumA = 0;
        shopNumB =0;
        shopNumC = 0;
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
        
        if(Greenfoot.mouseClicked(this))
        {
            LevelTwo nextLevel = new LevelTwo(counter,hp);
            Greenfoot.setWorld(nextLevel);
        }

    }
}

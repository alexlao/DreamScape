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
    TopDownPlayer td1 = new TopDownPlayer(0);
    Counter counter;
    Timer time;
    int z;
    int shopNumA;
    int shopNumB;
    int shopNumC;
    int p;
    int o;
    int shottype;
    boolean left;
    boolean mid;
    boolean right;
    boolean saved = false;
    Lives hp;
    InvisibileBox inv1 = new InvisibileBox();
    public Shop(int totalCount, Lives life, Timer t )
    {
        //takes in paramaters to continue the counter
        super(1000, 600, 1); 
        prepare();
        counter = new Counter(totalCount);
        act();
        hp = life;
        time = t;
        addObject(counter, 36, 12);
        if (hp.returnLives() >= 5)
        {
            showText("Already at full hp!",getWidth()*1/3, getHeight()/2-50);
        }



}

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        addObject(weapon1, getWidth()*1/3, getHeight()/2);  
        
        
        addObject(weapon2,getWidth()*1/3+150, getHeight()/2);
        
        
        addObject(weapon3, getWidth()*1/3+300, getHeight()/2);
        addObject(inv1, 100, 100);
        
        showText("Press Space to Continue...", getWidth()*1/3+200, 500);
        shopNumA = 0;
        shopNumB =0;
        shopNumC = 0;
    }

    
    public void act(){
        if(inv1.isItTouching(Weapon1.class)){
          showText("+HP",getWidth()*1/3, getHeight()/2+50);
          showText("3 Points", getWidth()*1/3, getHeight()/2-50);  
        }
        else if(inv1.isItTouching(Weapon2.class)){
            showText("1 Point",getWidth()*1/3+150, getHeight()/2-50);
            showText("Extra Game Attempt", getWidth()*1/3+150, getHeight()/2+50);
        }
        else if(inv1.isItTouching(Weapon3.class)){
           showText("2 Points", getWidth()*1/3+300, getHeight()/2-50);
            showText("Upgraded Shot", getWidth()*1/3+300, getHeight()/2+50); 
        }
        else{
            showText(null,getWidth()*1/3, getHeight()/2+50);
            showText(null, getWidth()*1/3, getHeight()/2-50); 
            showText(null,getWidth()*1/3+150, getHeight()/2-50);
            showText(null, getWidth()*1/3+150, getHeight()/2+50);
            showText(null, getWidth()*1/3+300, getHeight()/2-50);
            showText(null, getWidth()*1/3+300, getHeight()/2+50); 
        }
       
        //code that runs in the shop to see which item to purchase and if sufficient credits to purchase
        if(Greenfoot.mouseClicked(weapon1) && counter.returnValue()>=3&&inv1.isItTouching(Weapon1.class)){
            if(hp.returnLives() < 5)
            {
            removeObject(weapon1);
            counter.setCurrentValue(3);
            hp.life++;
            hp.removeLife();
        }

        }
        if((Greenfoot.mouseClicked(weapon2) && counter.returnValue()>=1&&inv1.isItTouching(Weapon2.class))){
            removeObject(weapon2);
            counter.setCurrentValue(1);
            saved = true;
        }
        if((Greenfoot.mouseClicked(weapon3) && counter.returnValue()>=2) &&inv1.isItTouching(Weapon3.class)){
            removeObject(weapon3);    
            counter.setCurrentValue(2);
            td1.purchasedNew();
            shottype = td1.purchasedAmount();
            System.out.println("Copped");
        }  
        
        if(Greenfoot.isKeyDown("space"))
        {
            if(saved == true)
            {
               LevelTwo nextLevel = new LevelTwo(counter, hp, true, time, shottype);
               Greenfoot.setWorld(nextLevel);
            }
            else{
            LevelTwo nextLevel = new LevelTwo(counter,hp, time, shottype);
            Greenfoot.setWorld(nextLevel);
           }
        }

    }
}

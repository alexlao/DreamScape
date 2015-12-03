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
    Shot3Still shot3 = new Shot3Still();
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
    int shopRound;
    int x;
    public Shop(int totalCount, Lives life, Timer t, int i, int z )
    {
        //takes in paramaters to continue the counter
        super(1000, 600, 1); 
        x = i;
        shopRound = z;
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
        
        if(x == 0){
            addObject(weapon3, getWidth()*1/3+300, getHeight()/2);
        }
        else if(x == 1){
            addObject(shot3, getWidth()*1/3+300, getHeight()/2);
        }
        addObject(inv1, 100, 100);

        shopNumA = 0;
        shopNumB =0;
        shopNumC = 0;
    }

    public void act(){
        if(inv1.isItTouching(Weapon1.class)){
            showText("+HP",getWidth()*1/3, getHeight()/2+65);
            showText("4 Points", getWidth()*1/3, getHeight()/2-50);  
        }
        else if(inv1.isItTouching(Weapon2.class)){
            showText("1 Point",getWidth()*1/3+150, getHeight()/2-50);
            showText("Extra Game Attempt", getWidth()*1/3+150, getHeight()/2+65);
        }
        else if(inv1.isItTouching(Weapon3.class)){
            showText("5 Points", getWidth()*1/3+300, getHeight()/2-50);
            showText("Upgraded Shot", getWidth()*1/3+300, getHeight()/2+65); 
        }
        else if(inv1.isItTouching(Shot3Still.class)){
            showText("10 Points", getWidth()*1/3+300, getHeight()/2-50);
            showText("Upgraded Shot", getWidth()*1/3+300, getHeight()/2+65); 
        }
        else{
            showText(null,getWidth()*1/3, getHeight()/2+65);
            showText(null, getWidth()*1/3, getHeight()/2-50); 
            showText(null,getWidth()*1/3+150, getHeight()/2-50);
            showText(null, getWidth()*1/3+150, getHeight()/2+65);
            showText(null, getWidth()*1/3+300, getHeight()/2-50);
            showText(null, getWidth()*1/3+300, getHeight()/2+65); 
        }

        //code that runs in the shop to see which item to purchase and if sufficient credits to purchase
        if((Greenfoot.mouseClicked(inv1)||Greenfoot.mouseClicked(weapon1))  && counter.returnValue()>=4&&inv1.isItTouching(Weapon1.class)){
            if(hp.returnLives() < 5)
            {
                removeObject(weapon1);
                counter.setCurrentValue(4);
                hp.life++;
                hp.removeLife();
            }
            Greenfoot.playSound("CashOut.mp3");
        }
        if((Greenfoot.mouseClicked(weapon2) || Greenfoot.mouseClicked(inv1)) && counter.returnValue()>=1&&inv1.isItTouching(Weapon2.class)){
            removeObject(weapon2);
            counter.setCurrentValue(1);
            saved = true;
            Greenfoot.playSound("CashOut.mp3");
        }
        if((Greenfoot.mouseClicked(weapon3) || Greenfoot.mouseClicked(inv1)) && counter.returnValue()>=5 &&inv1.isItTouching(Weapon3.class)){
            removeObject(weapon3);    
            counter.setCurrentValue(5);
            //td1.purchasedNew();
            //shottype = td1.purchasedAmount();
            x++;
            shottype = x;
            System.out.println(x);
            //Greenfoot.playSound("CashOut.mp3");
            System.out.println("Copped");
        }  
        if((Greenfoot.mouseClicked(shot3) || Greenfoot.mouseClicked(inv1)) && counter.returnValue()>=10 &&inv1.isItTouching(Shot3Still.class)){
            removeObject(shot3);    
            counter.setCurrentValue(10);
            x++;
            shottype = x;
            System.out.println(x);
            //System.out.println("Copped New");
            Greenfoot.playSound("CashOut.mp3");
        }  

        if(Greenfoot.isKeyDown("space"))
        {
            if(shopRound == 0){
                if(saved == true)
                {
                    shottype = x;
                    LevelTwo nextLevel = new LevelTwo(counter, hp, true, time, shottype);
                    Greenfoot.setWorld(nextLevel);
                }
                else{
                    shottype = x;
                    LevelTwo nextLevel = new LevelTwo(counter,hp, time, shottype);
                    Greenfoot.setWorld(nextLevel);
                }
            }
        
        else if(shopRound == 2){
            if(saved == true)
                {
                    //LevelThree nextLevel = new LevelThree(counter, hp, true, time, shottype);
                    //Greenfoot.setWorld(nextLevel);
                }
                else{
                    shottype = x;
                    LevelThree nextLevel = new LevelThree(counter,hp, time, shottype);
                    Greenfoot.setWorld(nextLevel);
                }
            
        }

    }
}
}
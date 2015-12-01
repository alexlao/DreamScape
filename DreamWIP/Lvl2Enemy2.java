import greenfoot.*;

/**
 * Write a description of class Lvl2Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2Enemy2 extends Enemy
{
    int turnAmount = 0;
    
    GifImage skeleton = new GifImage("skeleton.gif");
    GifImage skeleton2 = new GifImage("skeleton2.gif");
    
    /**
     * Act - do whatever the Lvl2Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (turnAmount >= 0 &&  turnAmount <= 150)
        {
            setImage(skeleton.getCurrentImage());
            
        }  
        if (turnAmount > 150)        {
            setImage(skeleton2.getCurrentImage());
        }// Add your action code here.
        pattern();
        turnAmount++;
    }    
    public void pattern()
    {
        if (turnAmount == 5)
        {
            shoot();
        }
        if (turnAmount >= 10 &&  turnAmount <= 150)
        {
            move(3);
            
        }  
        
        if (turnAmount > 150 && turnAmount <=300)
        {
            move(-3);
        }
        
        if (turnAmount > 300)
        {

           turnAmount = 0;
        }
    }
    public void shoot()
    {
        World w = getWorld();
        bone b = new bone();
        w.addObject(b, getX()+10,getY()+15);
    }
     public void shoot2()
    {
        World w = getWorld();
        bone2 b2 = new bone2();
        w.addObject(b2, getX()-10,getY()+15);
    }
}

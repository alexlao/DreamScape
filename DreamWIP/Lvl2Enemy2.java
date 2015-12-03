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
    int totalCount = 0;
    int n = 30;
    int x = 1;
    GifImage skeleton = new GifImage("skeleton.gif");
    GifImage skeleton2 = new GifImage("skeleton-33.gif");
    
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
        if (turnAmount == 151)
        {
            setLocation(getX(), getY()+ 30);
        }
        pattern();
        turnAmount++;
    }    
    public void pattern()
    {
        if (turnAmount == 1 && totalCount > 0)
        {
            setLocation(getX(), getY()-30);
        } else if (turnAmount == 1 )
        {
            totalCount++;

        }
        
        if (turnAmount == 5)
        {
            shoot();
        }
        if (turnAmount >= 10 &&  turnAmount <= 150)
        {
            move(3);
            
        }  
        
        if (turnAmount > 150 && turnAmount <=290)
        {
            move(-3);
        }
        
        if (turnAmount > 290)
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
   
}

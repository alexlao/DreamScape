import greenfoot.*;

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bee()
    {
         GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act() 
    {
       move(4);
       if (Greenfoot.getRandomNumber(100)<2)
       {
           turn (10);// Add your action code here.
       }
       if (Greenfoot.getRandomNumber(4) > 3)
       
       { 
           turn(10);
        }
       if (isAtEdge())
       {
           turn (180);
           
        }
          Actor bullet = getOneObjectAtOffset(0,0,Bullet.class);
        if( bullet !=null)
        {
            World world = getWorld();
            Splat splat = new Splat();
            world.addObject(splat,getX(), getY());
            world.removeObject(this);
            world.removeObject(bullet);
           
            
        }
            
        
       
    }   
      
}

import greenfoot.*;

/**
 * Write a description of class Level3Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Enemy1 extends Enemy
{
    int count = 0;
    int turnCount = 0;
    GifImage e1 = new GifImage("ebird.gif");
    GifImage e2 = new GifImage("ebird2.gif");
    /**
     * Act - do whatever the Level3Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (count >= 0 && count <= 100)
        {
            setImage(e1.getCurrentImage());
        }
        if (count >= 101 && count <= 210)
        {
            setImage(e2.getCurrentImage());
        }
        pattern();
        count++;
    }    
    public void pattern()
    {
     if( turnCount == 0){
    
       if (count >= 0 && count < 100)
      {
        move(2);
        if(Greenfoot.getRandomNumber(1000) < 10)
        {
            shoot();
        }
     } else if( count == 105)
     {
         shoot();
        }
      else if (count >= 110 && count <= 210)
      {
          move(-2);
         
    } else if (count > 210)
    {
        count = 0;
        turnCount = 1;
    }
   }
        if( turnCount == 1){
     if (count == 5)
     {
         //shoot();
        }
       if (count >= 0 && count < 100)
      {
        move(2);
        
     } else if( count == 105)
     {
         //shoot();
        }
      else if (count >= 110 && count <= 210)
      {
          move(-2);
         
    } else if (count > 210)
    {
        count = 0;
        turnCount = 2;
    }
   }
        if( turnCount == 2){
   
       if (count >= 0 && count < 100)
      {
        move(2);
       
        
     } else if( count == 105)
     {
         //shoot();
        }
      else if (count >= 110 && count <= 210)
      {
          move(-2);
           if(Greenfoot.getRandomNumber(1000) < 10)
        {
            shoot();
        }
         
    } else if (count > 210)
    {
        count = 0;
        turnCount = 0;
    }
   }
}
   public void shoot()
   {
       World w = getWorld();
       w.addObject(new poop(this), getX(), getY()+10);
    }
    
}

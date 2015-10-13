import greenfoot.*;

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    /**
     * Act - do whatever the Alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndTurn();
        eat();
        
    }    
    private void moveAndTurn(){
        //basic movement
        move(5);
        if(Greenfoot.isKeyDown("left")){
            turn(-10);
        }
        if(Greenfoot.isKeyDown("right")){       
            turn(5);
        }
        }
      
    private void eat(){
        //bumps counter when eats, similar to shooting lab
        TestShooter shooterWorld = (TestShooter)getWorld();
            Counter counter = shooterWorld.getCounter();
        Actor wombat;
        wombat = getOneObjectAtOffset(0,0,Wombat.class);
        if(wombat!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(wombat);
            
            counter.bumpCounter();
        }
    }
}
 
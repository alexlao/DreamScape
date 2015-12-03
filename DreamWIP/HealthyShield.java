import greenfoot.*;

/**
 * Write a description of class HealthyShield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthyShield extends Actor
{
    /**
     * Act - do whatever the HealthyShield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public boolean isItTouching(java.lang.Class cls){
        return isTouching(cls);
    }
    public void removeTouchingObj(){
        removeTouching(Ghostshot.class);
        removeTouching(Ghostshot2.class);
    }
}

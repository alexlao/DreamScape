import greenfoot.*;

/**
 * Write a description of class InvisibileBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisibileBox extends Actor
{
    /**
     * Act - do whatever the InvisibileBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followMouse();
    }    

    public void followMouse(){
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi !=null){
            setLocation(mi.getX(), mi.getY());
        }
    }
    public boolean isItTouching(java.lang.Class cls){
        return isTouching(cls);
    }
//     private void checkForCollisions(){
//         Actor cop = getOneIntersectingObject(null);
//         if(cop!= null){
//             
//         }
//     }
}

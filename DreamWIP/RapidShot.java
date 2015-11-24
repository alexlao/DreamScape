import greenfoot.*;

/**
 * Write a description of class RapidShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RapidShot extends Shot
{
    private TopDownPlayer p;
    
    public RapidShot(TopDownPlayer player)
    {
        p = player;
        setRotation(player.getRotation());
    } 
   public void act() 
    {
        World world = getWorld();
        if (!isAtEdge())
        {
            move(10);
        }
        else
        {
            world.removeObject(this);
         }
        //juice();//animates the spider when hit; I added this code here because the shot class seems to be better at detecting the spider than the spider detecting the shot
        
   }
}

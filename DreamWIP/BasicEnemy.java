import greenfoot.*;


public class BasicEnemy extends TDEnemy
{
    private TopDownPlayer Hero;
    public BasicEnemy(TopDownPlayer p)
    {
        Hero = p;
    }
    public void act() 
    {
        movement(Hero,1);
        checkForCollisions();
    }    
}

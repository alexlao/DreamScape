import greenfoot.*;


public class BasicEnemy extends TDEnemy
{
    private TopDownPlayer Hero;
    Counter score;
    public BasicEnemy(TopDownPlayer p, Counter c)
    {
        Hero = p;
        c = score;
    }
    public void act() 
    {
        movement(Hero,1);
        checkForCollisions();
    }    
  
}

import greenfoot.*;

/**
 * Write a description of class Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    public int life = 5;
    GreenfootImage five = new GreenfootImage("fiveLives.png");
    GreenfootImage four = new GreenfootImage("fourLives.png");
    GreenfootImage three = new GreenfootImage("threeLives.png");
    GreenfootImage two = new GreenfootImage("twoLives.png");
    GreenfootImage one = new GreenfootImage("oneLife.png");
    
    GreenfootImage current = new GreenfootImage("fiveLives.png");
    /**
     * Act - do whatever the Lives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setImage(current);
        
    }   
    public int returnLives ()//Zarah G Lives
    {
     return life;  
    }
    public void removeLife()
    {
        life--;
        if (life == 5)
        {
            current = five;
        }else if( life == 4)
        {
            current = four;
        } else if (life == 3)
        {
            current = three;
        } else if (life == 2)
        {
            current = two;
        } else if (life == 1){
            current = one;
        } else if (life == 0)
        {
           //GameOver w = new GameOver();
          // Greenfoot.setWorld(w);
           

        }
    }
        public void addLife()
    {
        life++;
        if (life == 5)
        {
            current = five;
        }else if( life == 4)
        {
            current = four;
        } else if (life == 3)
        {
            current = three;
        } else if (life == 2)
        {
            current = two;
        } else if (life == 1){
            current = one;
        } else if (life == 0)
        {
           //GameOver w = new GameOver();
          // Greenfoot.setWorld(w);
           

        }
    }
    /*
    public void updateLife()
    {
        if (life == 5)
        {
            current = five;
        }else if( life == 4)
        {
             current = four;
        } else if (life == 3)
        {
             current = three;
        } else if (life == 2)
        {
             current = two;
        } else if (life == 1){
             current = one;
        } else if (life == 0)
        {
           GameOver w = new GameOver();
           Greenfoot.setWorld(w);
           

        }
        
    }
    */
}

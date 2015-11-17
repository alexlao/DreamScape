import greenfoot.*;

/**
 * Write a description of class TopDownWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopDownWorld extends World
{

    TopDownPlayer p;
    
    
    public TopDownWorld()
    {    
        
        super(800, 800, 1); 
        TopDownPlayer player = new TopDownPlayer(new Lives());
        p = player;
        prepare();
    }
    
    public void prepare()
    {
        addObject(p, 400,400);
    }
}

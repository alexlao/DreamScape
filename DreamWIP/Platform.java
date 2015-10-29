import greenfoot.*;

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends ScrollingActor
{
    ScrollingWorld world;
    
    
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform()
       {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth();
        myImage.scale(myNewWidth, myNewHeight);
        
        
    }
  
        
    }



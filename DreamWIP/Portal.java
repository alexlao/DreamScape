import greenfoot.*;

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends ScrollingActor
{
    String type;
    GifImage portalImage = new GifImage("Blue portal.gif");
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
             type = getWorld().getClass().getName();
        
        if(type == "TutorialWorld"){
            setImage(portalImage.getCurrentImage());
        }
        else if(type == "LevelOneB"){
           setImage(portalImage.getCurrentImage());

        }
        else if(type == "LevelOne")
        {

             setImage(portalImage.getCurrentImage());

        }
        else if(type == "TutorialPart2")
        {
            setImage(portalImage.getCurrentImage());
        }
        else if(type == "LastTut")
        {
           setImage(portalImage.getCurrentImage());
        }
        else if(type == "LevelTwo")
        {
            setImage(portalImage.getCurrentImage());
        } else if (type == "LevelThree")
        {
             setImage(portalImage.getCurrentImage());
        } else if (type == "FinalCutsceneThree")
        {
            setImage("FinalCutscene3Portal.png");
        }
        else if (type == "FinalCutsceneTwo")
        {
          setImage(portalImage.getCurrentImage());
        }
        else if (type == "FinalCutscene")
        {
            setImage(portalImage.getCurrentImage());
        }
    
   
       
    }    
}

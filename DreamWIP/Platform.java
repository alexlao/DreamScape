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
    String type;

    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform()
    {

    }
    public void act(){
        type = getWorld().getClass().getName();
        if(type == "TutorialWorld"){
            setImage("tutplat.png");
        }
        else if(type == "LevelOneB"){
            setImage("LargePlatform.png");

        }
        else if(type == "LevelOne")
        {

            setImage("LargePlatform2.png");

        }
        else if(type == "TutorialPart2")
        {
            setImage("tutplat.png");
        }
        else if(type == "LastTut")
        {
            setImage("tutplat.png");
        }
    }

}


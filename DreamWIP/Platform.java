import greenfoot.*;

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends ScrollingActor
{
    
    String type;

    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform()
    {

    }
    public void act(){
        //platform changes depending on the world. it checks the worlds name and depending on that, it will change.
        type = getWorld().getClass().getName();
        try
        {
        if(type == "TutorialWorld"){
            setImage("LogPlatform.png");
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
            setImage("LogPlatform.png");
        }
        else if(type == "LastTut")
        {
            setImage("LogPlatform.png");
        }
        else if(type == "LevelTwo")
        {
            setImage("DarkPlatform.png");
        }
    }
    catch(Exception e)
    {
    }
    }

}


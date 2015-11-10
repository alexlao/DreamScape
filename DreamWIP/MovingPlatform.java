import greenfoot.*;

/**
 * Write a description of class MovingPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovingPlatform extends ScrollingActor
{
    String type;
    int turnAmount;
    public void act()
  {
    //platform changes depending on the world. it checks the worlds name and depending on that, it will change.
    type = getWorld().getClass().getName();
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
        pattern();
   }  
    public void pattern()
    {
        if (turnAmount >= 0 && turnAmount < 200)
        {
            setLocation(getX() + 2 , getY());
            turnCount(1);
        }

        if(turnAmount >= 300 &&  turnAmount < 500)
        {
            setLocation(getX() - 2  , getY());
            turnCount(1);            
        }


        turnCount(1);            
        

        if(turnAmount == 600)
        {
            turnCount(-600);

        }
    }
        public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }
}

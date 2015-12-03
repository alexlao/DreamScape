import greenfoot.*;

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
    Timer time;
    /**
     * Constructor for objects of class End.
     * 
     */
    public End(Timer t)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);                
        //addObject(new ScoreBoard(600, 600), getWidth() / 2, getHeight() / 2);//add the scoreboard
        time = t;
        
      if (UserInfo.isStorageAvailable()) {//test to see if your data is avalable(logged in)
       UserInfo myInfo = UserInfo.getMyInfo(); //set myInfo to UserInfo 
        myInfo.setScore(-time.count);//set the score to your info
         myInfo.store();
     }

    }
    
    public void act()
    {
        if(time.getElapsedTime() <= 300)
        {
            showText("You got a 36!", getWidth()/2, getHeight()/2);
        }
        if((time.getElapsedTime() > 300) && (time.getElapsedTime() <= 400))
        {
            showText("You got a 35!", getWidth()/2, getHeight()/2);
        }
                if((time.getElapsedTime() > 400) && (time.getElapsedTime() <= 500))
        {
            showText("You got a 34!", getWidth()/2, getHeight()/2);
        }
                        if((time.getElapsedTime() > 500) && (time.getElapsedTime() <= 600))
        {
            showText("You got a 33!", getWidth()/2, getHeight()/2);
        }
         if((time.getElapsedTime() > 600) && (time.getElapsedTime() <= 700))
        {
            showText("You got a 32!", getWidth()/2, getHeight()/2);
        }
                                if((time.getElapsedTime() > 700) && (time.getElapsedTime() <= 800))
        {
            showText("You got a 32!", getWidth()/2, getHeight()/2);
        }
                                if((time.getElapsedTime() > 800) && (time.getElapsedTime() <= 900))
        {
            showText("You got a 31!", getWidth()/2, getHeight()/2);
        }
         if(time.getElapsedTime() > 900) 
        {
            showText("You got a 30!", getWidth()/2, getHeight()/2);
        }
         showText("Press L to go back to the main menu!", getWidth()/2, getHeight()/2 + 200);
         if(Greenfoot.isKeyDown("l"))
         {
             StartMenu m = new StartMenu();
             Greenfoot.setWorld(m);
            }
    }
}

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
}

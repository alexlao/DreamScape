import greenfoot.*;

/**
 * Write a description of class HighScoreMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScoreMenu extends World
{
    GifImage Image = new GifImage("StartMenu2.gif");
    /**
     * Constructor for objects of class HighScoreMenu.
     * 
     */
    public HighScoreMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new ScoreBoard(600, 600), getWidth() / 2, getHeight() / 2);//add the scoreboard
    }
    public void act()
    {
       setBackground(Image.getCurrentImage());
    }
}

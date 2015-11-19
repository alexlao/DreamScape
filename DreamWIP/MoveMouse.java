import greenfoot.*;

/**
 * Write a description of class MoveMouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveMouse extends Actor
{
    GifImage move = new GifImage("movemouse.gif");
    GreenfootImage left;
    /**
     * Act - do whatever the LeftClick wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     setImage(move.getCurrentImage());
    } 
}

import greenfoot.*;

/**
 * Write a description of class Splat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splat extends Actor

{
    public Splat()
    {
         GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/3;
        int myNewWidth = (int)myImage.getWidth()/3;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        
    }
   
}

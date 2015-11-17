import greenfoot.*;

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    GifImage Image = new GifImage("StartMenu2.gif");
    public StartMenu()
    {
        super (1000,600, 1);

        prepare();
    }


    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public void act()
    {    
        setBackground(Image.getCurrentImage());
       
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        HaungsMode haungsmode = new HaungsMode();
        addObject(haungsmode, 734, 562);
        haungsmode.setLocation(734, 552);
        haungsmode.setLocation(737, 469);
        Credits credits = new Credits();
        addObject(credits, 798, 557);
        credits.setLocation(795, 552);
        Start start = new Start();
        addObject(start, 178, 473);
        start.setLocation(178, 472);
        start.setLocation(178, 471);
        start.setLocation(161, 467);
        start.setLocation(161, 469);
        Clicker clicker = new Clicker();
        addObject(clicker, 395, 294);
        EndlessTD TD = new EndlessTD();
        TD.setLocation(170, 469);
        EndlessTD endlesstd = new EndlessTD();
        addObject(endlesstd, 153, 562);
        endlesstd.setLocation(159, 554);
    }
}

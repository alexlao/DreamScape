import greenfoot.*;

/**
 * Write a description of class Cork here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cork extends World
{

    /**
     * Constructor for objects of class Cork.
     * 
     */
    public Cork()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400,  1, false); 

        
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Enemy1 enemy1 = new Enemy1();
        addObject(enemy1, 50, 206);
        Enemy2 enemy2 = new Enemy2();
        addObject(enemy2, 281, 219);
        Enemy3 enemy3 = new Enemy3();
        addObject(enemy3, 499, 218);
        enemy1.setLocation(288, 87);
        enemy3.setLocation(287, 330);
        enemy1.setLocation(186, 83);
        enemy2.setLocation(189, 216);
        enemy3.setLocation(47, 353);
        enemy1.setLocation(192, 30);
        enemy2.setLocation(196, 123);
        Platform platform = new Platform();
        addObject(platform, 458, 368);
        Platform platform2 = new Platform();
        addObject(platform2, 203, 289);
        enemy3.setLocation(286, 173);
        platform2.setLocation(157, 368);
        enemy3.setLocation(290, 331);
        enemy3.setLocation(290, 327);
        enemy2.setLocation(200, 192);
        enemy1.setLocation(205, 44);
        enemy3.setLocation(387, 328);
        Player player = new Player();
        addObject(player, 62, 333);
        player.setLocation(54, 322);
        enemy2.setLocation(62, 206);
        enemy1.setLocation(60, 46);
        enemy3.setLocation(402, 321);
    }



    }


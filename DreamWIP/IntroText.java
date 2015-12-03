import greenfoot.*;

/**
 * Write a description of class IntroText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroText extends World
{
    IntroTrans t1;
    Dots dots;
    OhNo no;
    OK2 ok;
    IntroTrans introtrans;
    int x;
    GreenfootSound dream;
    Lives lives;
    /**
     * Constructor for objects of class IntroText.
     * 
     */
    public IntroText(Lives l)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        lives = l;
        t1 = new IntroTrans();
        no = new OhNo();
        ok = new OK2();
        x = 0;
        prepare();
        dream = new GreenfootSound("dream-harp.mp3");
        dream.playLoop();
    }

    public void prepare(){
        introtrans = new IntroTrans();
        addObject(introtrans, 478, 295);
        dots = new Dots();
        addObject(dots, 490, 395);

        
    }

    public void act(){
        sequence();
    }
    public void sequence(){
        if(Greenfoot.mouseClicked(dots)){
            introtrans.setImage("nightmares.png");
            removeObject(dots);
            addObject(no, 490, 444);
        }
        if(Greenfoot.mouseClicked(no)){
            introtrans.setImage("finalstart.png");
            removeObject(no);
            x++;
            addObject(ok, 490, 426);
            
        }
        if(Greenfoot.mouseClicked(ok) && x == 1){
            
             if (lives.life < -1)
        {
             Greenfoot.setWorld(new LevelOne(lives));
            dream.stop();
        }
        if (lives.life <= 5 && lives.life >=0)
        {
            
            Greenfoot.setWorld(new LevelOne(new Lives()));
            dream.stop();        
        }
    }
           
        }
    }


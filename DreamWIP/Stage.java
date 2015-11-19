import greenfoot.*;

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{
    //private Counter theCounter;
    Counter counter;
    int z;
    private GreenfootSound bkgMusic; 
    Lives life;
    Timer time;
    BossHealth health;
    Boss boss;
    boolean isOn;   
    MenuTopDown bubble1;
    OK ok1;
    int x;
    boolean first;
    MoveMouse pic1;
    LeftClick pic2;
    OK ok2;
    OK ok3;
    OK ok4;
    boolean done;
    /**
     * Constructor for objects of class Stage.
     * 
     */

    public Stage(int totalCount, Lives lives,  Timer timer)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        bkgMusic = new GreenfootSound("sounds/Spidermusic.mp3");
        bkgMusic.playLoop();
        counter = new Counter(totalCount);
         life = lives;
         time = timer;
        addObject(life, 925, 25);
        addObject(time, 40, 30);
          TopDownPlayer topdownplayer = new TopDownPlayer(life);
           topdownplayer.setLocation(305, 555);
        addObject(topdownplayer, 301, 353);
        prepare();
        health = new BossHealth();
        addObject(health, 930, 80);
        boss = new Boss(counter, health, bkgMusic);
        addObject(boss, 302, 31);
        bubble1= new MenuTopDown();
        ok1 = new OK();
        ok2 = new OK();
        ok3 = new OK();
        ok4 = new OK();
        isOn = false;
        x =0;
        pic1 = new MoveMouse();
        pic2 = new LeftClick();
        done = false;
        


    }

    //     public void musiolor (int amount)
    //     {
    //         this.brickType += amount;
    //     }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 36, 12);

    }

    public void act(){
        menuInstructions();
    }
    public boolean isMenu(){
        return isOn;
    }
    public void menuInstructions()
    {
        if(boss.getY()==149 && isOn== false &&done==false){
            addObject(bubble1, 500,300);
            addObject(ok1, 494, 435);
            isOn=true;
            done=true;

        }
        if(Greenfoot.mouseClicked(ok1)){
            System.out.println("test");
            bubble1.setImage("instruction2.png");
            removeObject(ok1);
            addObject(ok2, 494, 435);
        }
        if(Greenfoot.mouseClicked(ok2)){
            bubble1.setImage("mouseinstructions.png");
            addObject(pic1, 345, 349);
            addObject(pic2, 663, 349);
            removeObject(ok2);
            addObject(ok3, 494,435);
            x++;
        }
        if(Greenfoot.mouseClicked(ok3)){
            removeObject(pic1);
            removeObject(pic2);
            bubble1.setImage("FightBubble.png");
            removeObject(ok3);
            addObject(ok4, 494, 435);
        }
        if(Greenfoot.mouseClicked(ok4)){
            removeObject(ok4);
            removeObject(bubble1);
            isOn=false;
            boss.setLocation(boss.getX(), boss.getY() + 1);
        }
    }

    public void goToShop()
    {
        int totalCount = counter.returnValue();
        Shop shop = new Shop(totalCount, life, time);
        Greenfoot.setWorld(shop);
    }

}

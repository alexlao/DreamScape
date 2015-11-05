import greenfoot.*;

/**
 * Write a description of class Allistar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Allistar extends ScrollingActor
{
    private int vSpeed = 0;//fall speed
    private int accel = 1; //gravity acceleration
    private int walk = 0;
    private GreenfootSound bkgMusic;
    private boolean inAir;
    private int jumpHeight = 18;
    private GreenfootImage run1 = new GreenfootImage("AllistarStepOne.png");
    private GreenfootImage run2 = new GreenfootImage("AllistarStepTwo.png");
    private Counter score;
    private boolean stand = true;
    private Lives lives;
    
    private String type;
    public void act() 
    {
        keyPress();
        checkFall();
        eatCoin();
        checkDeath();
        checkPortal();
    }    

    public Allistar(Counter s, Lives l)
    {
        score = s;
        lives = l;
        getImage().mirrorHorizontally();
    }

    public void keyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            getWorld().moveCamera(5);
            //getImage().mirrorHorizontally();
            Animate();
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            getWorld().moveCamera(-5);
            //getImage().mirrorHorizontally();
           Animate();
        }
        if(Greenfoot.isKeyDown("w"))
        {
            jump();
        }
    }
    private void Animate()
    {
        if (walk == 5)
        {
            setImage(run1);
        }else if (walk == 10)
        {
            setImage(run2);
            walk = 0;
        }
        walk++;
    }

    public void checkFall()
    {
        if(checkGround() == true)
        {
            vSpeed = 0;
            //setImage(new GreenfootImage("Allistar.png"));
            //getImage().mirrorHorizontally();
        }
        else
        {
            fall();
        } 
    }

    public boolean checkGround()
    {
        int pHeight = getImage().getHeight();
        int onGround = (int)(pHeight/2);

        Actor ground = getOneObjectAtOffset(0, onGround, Platform.class);

        //if pjlayer is on nothing, return false, else return true
        if(ground == null)
        {
            inAir = true;
            return false;
        }
        else
        {
            inAir = false;
            return true;
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if (vSpeed <= 9)
        {
            vSpeed = vSpeed + accel; //fall speed gets larger by accel every tick
        } 
        inAir = true;
    }

    public void jump()
    {
        if (inAir == false)
        {
            vSpeed = vSpeed - jumpHeight;
            setImage(new GreenfootImage("AllistarJump.png"));
            getImage().mirrorHorizontally();
            inAir = true;
            fall();

        }

    }

    public void eatCoin()
    {
        Actor coin;
        coin = getOneObjectAtOffset(0,0,Coin.class);
        // ScrollingWorld scrollingWorld = (ScrollingWorld)getWorld();
        // Counter counter = scrollingWorld.getCounter();
        if (coin!=null)
        {
            World world;
            world = getWorld();
            world.removeObject(coin);
            Greenfoot.playSound("Beep.mp3");
            //LevelOne w = (LevelOne)getWorld();
            // w.getCounter().bumpCounter();
            score.bumpCounter();
        }

    }

    public void checkDeath()
    {
        if (getY() >= getWorld().getHeight()*9/10)
        {
            //World Game = new GameOver();
            //Greenfoot.setWorld(Game);
            health();
            respawn();
            
            

        }
    }
    public void health()
    {
         lives.life--;
         lives.removeLife();
         //System.out.println("" + lives.returnLives());
          
            
    }
    public void respawn()
    {
     World w = getWorld();
      if (getY() >= w.getHeight()*9/10)
       {
           setLocation(getX()+20, w.getHeight()*1/10);
       }
    }

    public void checkPortal()
    {
        //Actor portal = getOneIntersectingObject(Portal.class);
        //depending on the current world you're at, the portal will take you somewhere different.
        if(isTouching(Portal.class))
        {
            type = getWorld().getClass().getName();
            if(type == "TutorialWorld"){
                World part2 = new TutorialPart2();
                Greenfoot.setWorld(part2);
            }
            else if( type == "LevelOneB"){
                World topDown = new Stage(score, score.returnValue(), lives);
                Greenfoot.setWorld(topDown);
            }
            else if(type == "TutorialPart2"){
                World finalTut = new LastTut();
                Greenfoot.setWorld(finalTut);
            }
            else if(type == "LastTut"){
                World startGame = new LevelOne();
                Greenfoot.setWorld(startGame);
            }

            //bkgMusic.stop();

        }

    }

}

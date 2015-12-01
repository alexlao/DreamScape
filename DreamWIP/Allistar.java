import greenfoot.*;
import java.util.List;
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
    private GreenfootImage standing = new GreenfootImage("Allistar.png");
    private GreenfootImage hurt = new GreenfootImage("AllistarHurt.png");
    
    private Counter score;
    private boolean stand = true;
    private Lives lives;
    private int l = 0;
    private int check = 0;
    
    private String type;
    public void act() 
    {
        type = getWorld().getClass().getName();
        if(type != "FinalCutscene" &&
            type != "FinalCutsceneTwo" &&
            type != "FinalCutsceneThree")
        {
            keyPress();
        }
        else
        {
            moveForward();
        }
        checkFall();
        eatCoin();
        checkDeath();
        checkPortal();
        enemyDeath();
        killEnemy();
    }    

    public Allistar(Counter s, Lives l)
    {
        score = s;
        lives = l;
        getImage().mirrorHorizontally();
        check = 0;
    }
    
    public Allistar(Counter s, Lives l, int save)
    {
        score = s;
        lives = l;
        getImage().mirrorHorizontally();
        check = save;
    }

    public void keyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            getWorld().moveCamera(5);
            //getImage().mirrorHorizontally();
            animate();
        }
        else if(inAir != true)
        {
            setImage(standing);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            getWorld().moveCamera(-5);
            //getImage().mirrorHorizontally();
           animate();
        }
        if(Greenfoot.isKeyDown("w"))
        {
            jump();
        }
    }
    
    //Copies keyboard behavior for moving Allistar during the last cutscene
    public void moveForward()
    {
        move(5);
        getWorld().moveCamera(5);
        animate();
    }
    
    private void animate()
    {
        if (walk == 5)
        {
            setImage(run1);
        }
        else if (walk == 10)
        {
            setImage(run2);
            walk = 0;
        }
        walk++;
    }
    
    public Counter getScore()
    {
        return score;
    }
    
    public Lives getLives()
    {
        return lives;
    }

    public void checkFall()
    {
        if((checkGround() == true) || (checkmGround() == true))
        {
            vSpeed = 0;
            //setLocation(getX(),getY()- 1);
            
            
            //setImage(new GreenfootImage("Allistar.png"));
            //getImage().mirrorHorizontally();
        }
        else if(((checkGround() == false) && (checkmGround() == false)))
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
            setLocation(getX(), getY() - 1);
            return true;
        }
    }
    
    public boolean checkmGround()
    {
        int pHeight = getImage().getHeight();
        int onGround = (int)(pHeight/2);

        Actor ground = getOneObjectAtOffset(0, onGround, MovingPlatform.class);

        //if pjlayer is on nothing, return false, else return true
        if(ground == null)
        {
            inAir = true;
            return false;
        }
        else
        {
            inAir = false;
            setLocation(getX(), getY() - 1);
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
            Greenfoot.playSound("jump.mp3");
            //sound downloaded from http://www.kyutwo.com/downloads/sfx/videogames/vgsounds.da/Maple%20Story/Menu.mp3
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
            Greenfoot.playSound("moneysound.mp3");
            //sound downloaded from http://www.kyutwo.com/downloads/sfx/videogames/vgsounds.da/Maple%20Story/Menu.mp3
            //LevelOne w = (LevelOne)getWorld();
            // w.getCounter().bumpCounter();
            score.bumpCounter();
        }
    }

    public void checkDeath()
    {
        if (getY() >= getWorld().getHeight()*49/50)
        {
            //World Game = new GameOver();
            //Greenfoot.setWorld(Game);
            health();
            respawn();
            Greenfoot.playSound("aah.mp3");
        }
    }
    public void enemyDeath()
    {
       
        if ((getOneObjectAtOffset(0,0,Enemy.class)!=null) && (l ==0))
        {
            health();
            Greenfoot.playSound("aah.mp3");
            setImage(hurt);
            l = 50;
            
        }
        if (l > 0)
        {
         l--;
        
        }
        if(l ==1)
        {
            setImage(getImage());
        }
        if(getOneObjectAtOffset(0,0, Enemy.class) != null)
        {
            setImage(hurt);
        }
        
    }
    public void killEnemy(){
        Actor enemy;
        enemy = getOneObjectAtOffset(0,40,Enemy.class);
        if(enemy !=null && vSpeed>=0)
        {
            World world;
            world = getWorld();
            world.removeObject(enemy);
            score.bumpCounter();
            Greenfoot.playSound("killsound.mp3");
            //sound downloaded from http://soundbible.com/1079-Bir-Poop-Splat.html
            inAir = false;
            jump();
        }
        
    }

    public void health()
    {
         lives.life--;
         lives.removeLife();
         if(lives.returnLives() == 0)
         {
             GameOver w = new GameOver(this);
             Greenfoot.setWorld(w);
            }
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
        /*
        if(isTouching(Portal.class))
        {
            type = getWorld().getClass().getName();
            if(type == "TutorialWorld"){
                World part2 = new TutorialPart2();
                Greenfoot.setWorld(part2);
            }
            else if( type == "LevelOneB"){
                World topDown = new Stage(score, score.returnValue(), lives, timer);
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
            */
           
        if(isTouching(Portal.class))
        {
            getWorld().nextWorld();
        }
            //bkgMusic.stop();
    }
    
    public int getSave()
    {
        return check;
    }
}

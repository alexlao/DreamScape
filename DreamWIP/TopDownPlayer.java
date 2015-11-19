import greenfoot.*;
import java.lang.Math;

/**
 * The player when the game is in top-down view.
 *
 * The player is controlled by the keyboard's arrow keys.
 */
public class TopDownPlayer extends Actor
{
    public int playerStepSize = 4;
    public int stepTimer = 0;
    public int stepDelay = 1;
    public int playerSpeed = 5;
    public int playerTurnSpeed = 3;
    public int shotTimer = 0;
    public boolean inTopDown = false;
    private GreenfootImage shot= new GreenfootImage("Topdownshot.png");
    private GreenfootImage noShot= new GreenfootImage("topdown.png");
    Lives lives;

    
    private int perkTimer = 0;
    private int shotType = 0;
    String type;
    int hitDelay;
    // private Playerhitbox phb;
    //  int stationaryX;

    public void act()
        {
        type = getWorld().getClass().getName();
            if (type == "Stage")
            {
        if(getY() >= 450)
        {
            moveAndTurn();
            shoot();
        }
        else
        {
            setLocation(getX(),getY() + 1);
        }
       }
      else if (type == "TopDownWorld")
      {
        moveAndTurn();
        topDownShoot();
        checkCollisions();
        showPerkTime();
        getWorld().addObject(lives, 720, 25);
        if(perkTimer >= 1)
        {
            perkTimer--;
        }
        if(perkTimer == 0)
        {
            shotType = 0;
        }
    }
        //kill();
    }
    public TopDownPlayer (Lives l)
    {
        lives = l;
    }
    public TopDownPlayer(Lives l, boolean td)
    {
        inTopDown = td;
        lives = l;
    }
    // 
    //     protected void addedToWorld (World w)
    //     {
    //         stationaryX = getX();
    //         phb = new Playerhitbox(this, 10 ,25 ,10 ,5 , true);
    //         getWorld().addObject(phb,getX(), getY());
    //     }

    /**
     * Reads the keyboard's arrow keys to determine how to move and turn the
     * player
     */
    public void moveAndTurn()
    {
        /*
        if(Greenfoot.isKeyDown("j"))
        {
        turn(-playerTurnSpeed);
        }
        if(Greenfoot.isKeyDown("l"))
        {
        turn(playerTurnSpeed);
        }
         */
        if(stepTimer >  0)
        {
            stepTimer--;
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            move(playerStepSize);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            move((int)Math.round(-playerStepSize * .75));
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            double radians = Math.toRadians(getRotation());
            int dx = (int) Math.round(Math.cos(radians - 1.5708)
                    * playerStepSize * 0.75);
            int dy = (int) Math.round(Math.sin(radians - 1.5708) 
                    * playerStepSize * 0.75);
            setLocation(getX() + dx, getY()+ dy);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            double radians = Math.toRadians(getRotation());
            int dx = (int) Math.round(Math.cos(radians + 1.5708)
                    * playerStepSize * 0.75);
            int dy = (int) Math.round(Math.sin(radians + 1.5708) 
                    * playerStepSize * 0.75);
            setLocation(getX() + dx, getY() + dy);
        }

        if(Greenfoot.getMouseInfo() != null)
        {
            int mouseX = Greenfoot.getMouseInfo().getX();
            int mouseY = Greenfoot.getMouseInfo().getY();

            turnTowards(mouseX,mouseY);

            //Uncomment to enable turn by mouse
        }
    }

    public void shoot()
    { 

        if(shotTimer < 10)
        {
            setImage(noShot);
        }
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else if((Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("space")))
        {
            getWorld().addObject(new Shot(this), getX(), getY());
            shotTimer = 50;
            setImage(shot);

        }
        if(isTouching(BossShot.class))
        {
            removeTouching(BossShot.class);
            lives.life--;
            lives.removeLife();

            //health(1);
        }

        if(isTouching(BossShot2.class))
        {
            removeTouching(BossShot2.class);
            lives.life--;
            lives.removeLife();

            //health(1);
        }
 
}

public void topDownShoot()
{
              if(shotType == 1)
        {
        if(shotTimer < 10)
        {
            setImage(noShot);
        }
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else if((Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("space")))
        {
            getWorld().addObject(new QuickShot(this), getX(), getY());
            shotTimer = 50;
            setImage(shot);
        }
    }
    
    if (shotType == 0)
    {
                if(shotTimer < 10)
        {
            setImage(noShot);
        }
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else if((Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("space")))
        {
            getWorld().addObject(new Shot(this), getX(), getY());
            shotTimer = 50;
            setImage(shot);
        }
    }
}
    
    public void checkCollisions()
    {
        Actor enemy = getOneIntersectingObject(TDEnemy.class);
        if((enemy != null) && (hitDelay == 0))
        {
            if(lives.returnLives() < 2)
            {
                //music.stop();
                //getWorld().removeObject(this);
                //Gg endText = new Gg(c);
                int score = ((TopDownWorld)getWorld()).getScore().returnValue();
                TopDownGameOver game = new TopDownGameOver(score);
               Greenfoot.setWorld(game);
            }
            else
            {
                //health --;
               //GreenfootSound hurt = new GreenfootSound("Hurt.wav");
                //hurt.play();
                //setImage(injured);
                lives.life--;
                lives.removeLife();
                
                hitDelay = 50;
            }
            
            
        }
        if(hitDelay > 0)
            {
                hitDelay--;
            }
        if(hitDelay == 1)
            {
                //setImage(stand);
            }
          
            
            
        Actor quick = getOneIntersectingObject(QuickShotBox.class); 
        if(quick != null)
        {
            perkTimer = 1000;
            shotType = 1;
        }
        
    }
    
    public void showPerkTime()
    {
        if(perkTimer > 1)
        {
            getWorld().showText("Perk: " + perkTimer, 50, 32);
        }
        if(perkTimer == 0)
        {
            getWorld().showText("Perk: None", 50, 32);
        }
        
    }
    }



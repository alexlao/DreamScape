import greenfoot.*;

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Boss extends Actor
{
    private int damageAmount = 0;
    private int turnAmount = 0;
    private int turnAmount2 = 0;
    private int turnAmount3 = 0;
    private int pause = 100;
    private int shotTimer = 0;
    private int shotAmount = 0;
    private int shotAmount2 = 0;
    private int imageSwitchDelay = 0;
    GreenfootSound m;

    Counter counter;
    GreenfootImage boss;
    GreenfootImage hitBoss;
    BossHealth bHealth;

    public Boss(Counter counter, BossHealth h, GreenfootSound music)
    {
        bHealth = h;
        this.counter = counter;
        boss = new GreenfootImage("SpiderBoss.png");
        hitBoss = new GreenfootImage("HitSpiderBoss.png");
        m = music;
    }

    public void act() 
    {
        intro();
        hitImage();
        health();
        pattern1();
        pattern2();
        pattern3();
        endGame();
       
        //death();
    }      

    public void endGame()
    {
        if(damageAmount > 21)
        {
            counter.gainPoints(10);
            Stage stage = (Stage)getWorld();
            stage.goToShop();
            counter.gainPoints(10);
            m.stop();
        }
    }

   private void hitImage()
    {
        if(isTouching(Shot.class))
        {
            imageSwitchDelay = 10;
        }
        if(imageSwitchDelay <= 0)
        {
            setImage(boss);
        }
        else
        {
            setImage(hitBoss);
        }
        imageSwitchDelay--;
    }


    public void health()
    {
        if(isTouching(Shot.class))
        {
            removeTouching(Shot.class);
            healthCount(1);
            bHealth.damage++;
            bHealth.damageHit();
            Greenfoot.playSound("killsound.mp3");
        }
    }

    public void shotCount(int amount)
    {
        this.shotAmount += amount;
    }

    public void shotCount2(int amount)
    {
        this.shotAmount2 += amount;
    }

    public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }

    public void turnCount2 (int amount)
    {
        this.turnAmount2 += amount;
    }

    public void turnCount3 (int amount)
    {
        this.turnAmount3 += amount;
    }

    public void healthCount(int amount)
    {
        this.damageAmount += amount;
    }

    public void intro()
    {
        if(getY() < 149 && damageAmount < 1)
        {
            setLocation(getX(), getY() + 1);
        }
    }

    public void shoot()
    { 
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else 
        {
            getWorld().addObject(new BossShot(this), getX(), getY());
            shotTimer = 150;
        }

    }

    //shot type for pattern 2, shoots fast and is set to the spiders rotation
    public void shoot2()
    { 
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else 
        {
            getWorld().addObject(new BossShot2(this), getX(), getY());
            shotTimer = 20;
        }
    }

    public void shoot3()
    { 
        if(shotTimer >  0)
        {
            shotTimer--;
        }
        else 
        {
            getWorld().addObject(new BossShot2(this), getX() + 150, getY());
            getWorld().addObject(new BossShot2(this), getX() + 75, getY());
            getWorld().addObject(new BossShot2(this), getX() - 75, getY());
            getWorld().addObject(new BossShot2(this), getX() - 150, getY());
            shotTimer = 20;
        }
    }

    //not so bad yet 
    //Goes side to side and shoots intermittently
    public void pattern1()
    {   
        if(getY() >= 150 && damageAmount < 7 )
        {
            shoot();
            if(getY() >= 150 && getY() <= 160)
            {
                setLocation(getX() + 1,getY());
                if(getX() >= 970)
                {
                    setLocation(getX() + 1,getY() + 1);
                }
            }
            if(getY() >= 161 )
            {
                setLocation(getX() - 1,getY());
                if(getX() <= 30 && getY() >= 161)
                {
                    setLocation(getX(),getY() - 1);
                }
            }
        }
    }

    //Oh god help us all 
    //He moves across the ceiling and drops down 4 times, on each edge, and twice in the middle all at the samee length and at ech peak he spins and shoots
    public void pattern2()
    {
        if(damageAmount >= 7 && damageAmount <14 )
        {
            if(turnAmount == 0)
            {
                if(getX() <=300)
                {
                    setLocation(getX(), getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()+1, getY());
                    }
                }
                if(getX() ==301 && getY() < 175)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() ==301 && getY() == 175)
                {
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        setLocation(getX() + 2, getY());
                    }
                }

                if(getX() > 302 && getX() <601)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()+1, getY());
                    }
                }
                if(getX() ==601 && getY() < 175)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() ==601 && getY() == 175)
                {
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        setLocation(getX() + 2, getY());
                    }
                }
                if(getX() > 602 && getX() <=970)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()+1, getY());
                    }
                }
                if(getX() == 971 && getY() < 175)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() == 971 && getY() == 175)
                {
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        //setLocation(getX() + 1, getY());
                        turnCount(1);
                    }

                }
            }

            if(turnAmount == 1)
            {

                if(getX() <=972 && getX() >= 601)
                {
                    setLocation(getX(), getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()-1, getY());
                    }
                }
                if(getX() ==600 &&  getY() < 175)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() ==600 && getY() == 175)
                {
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        setLocation(getX() - 1, getY());
                    }
                }
                if(getX() > 301 && getX() <=599)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()-1, getY());
                    }
                }
                if(getX() ==301 && getY() < 175)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() ==301 && getY() == 175)
                {
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        setLocation(getX() - 1, getY());
                    }

                }
                if(getX() > 20 && getX() <=300)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()-1, getY());
                    }
                }
                if(getX() == 20 && getY() <175)
                {
                    setLocation(getX(), getY() + 1);
                }

                if(getX() == 20 && getY() == 175)
                {
                    //shoot stuff method here
                    if(getY() == 175 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        turnCount(-1);
                    }
                }
            }
        }
    }

    //Forgive me for i have sinned
    //Pattern 3 will make him move across the ceiling of the sreen, and drop down at the sides and once in the middle
    //when he comes down on the sides he falls down farther than in the middle. he also spins and shoots at his peak when he drops down
    public void pattern3()
    {
        if (damageAmount == 14)
        {
            setRotation(0);
            damageAmount++;
        }
        if(damageAmount >= 14 && damageAmount <= 21)
        {
            //             for(int i = 0; i < 1; i++)
            //             {
            //                  setRotation(0);
            //             }
            /*
            if(damageAmount == 2)
            {
            setRotation(0);  
            }
             */
            if(turnAmount2 == 0)
            {

                if(getX() <= 499)
                {
                    setLocation(getX()  , getY() - 1);    
                    if(getY() == 0)
                    {
                        setLocation(getX() + 1, getY()); 
                    }
                }
                if(getX() == 500 && getY() < 200)
                {
                    setLocation(getX(), getY() + 1);

                }
                //                 if(getY() == 199 && pauseAmount < 400)
                //                 {
                //                     pauseCount(1);
                //                 }
                //                 else
                //                 {
                //                     pauseAmount = 0;
                //                     setLocation(getX(), getY() + 1);
                //                     
                //                 }
                if(getX() == 500 && getY() == 200)
                {
                    //shoot stuff method here
                    if (getY() == 200 && shotAmount2 < 100)
                    {
                        shoot3();
                        shotCount2(1);
                    }
                    if(shotAmount2 == 100)
                    {
                        //shoot stuff method here
                        shotAmount2 = 0;
                        setLocation(getX() + 1, getY());
                        turnCount3(1);
                    }
                }
                if(getX() >= 501 && getX() < 972)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()+1, getY());
                    }
                }
                if(getX() == 972 && getY() < 300)
                {
                    setLocation(getX(), getY() + 1);
                    shotAmount = 0;
                }
                if(getX() == 972 && getY() == 300)
                {
                    //shoot stuff method here

                    if(getY() == 300 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        shotAmount = 0;
                        setLocation(getX() - 1, getY());
                        setRotation(0);
                        turnCount2(1);
                    }
                }
            }

            if(turnAmount2 == 1)
            {
                if(getX() <= 971 && getX() >= 501)
                {
                    setLocation(getX()  , getY() - 1);    
                    if(getY() == 0)
                    {
                        setLocation(getX() - 1, getY()); 
                    }
                }
                if(getX() == 500 && getY() < 200)
                {
                    setLocation(getX(), getY() + 1);

                }
                //                 if(getY() == 199 && pauseAmount < 400)
                //                 {
                //                     pauseCount(1);
                //                 }
                //                 else
                //                 {
                //                     pauseAmount = 0;
                //                     setLocation(getX(), getY() + 1);
                // 
                //                 }

                if(getX() == 500 && getY() == 200)
                {
                    //shoot stuff method here
                    if (getY() == 200 && shotAmount2 < 100)
                    {
                        shoot3();
                        shotCount2(1);
                        //flashing
                    }
                    if(shotAmount2 == 100)
                    {
                        //shoot stuff method here
                        shotAmount2 = 0;
                        setLocation(getX() - 1, getY());
                        turnCount3(1);
                    }
                }
                if(getX() <= 499 && getX() > 30)
                {
                    setLocation(getX(),getY()-1);
                    if(getY() == 0)
                    {
                        setLocation(getX()-1, getY());
                    }
                }
                if(getX() == 30 && getY() < 300)
                {
                    setLocation(getX(), getY() + 1);

                }
                if(getX() == 30 && getY() == 300)
                {
                    //shoot stuff method here
                    if(getY() == 300 && shotAmount < 200)
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(2);
                        shotCount(1);
                    }
                    if(shotAmount >= 200 && shotAmount < 400 )
                    {
                        //shoot stuff method here
                        shoot2();
                        turn(-2);
                        shotCount(1);
                    }
                    if(shotAmount == 400)
                    {
                        //shoot stuff method here
                        //asetLocation(getX() + 1, getY());
                        setRotation(0);;
                        turnCount2(-1);
                    }
                }
            }
        }
    } 
}

import greenfoot.*;

/**
 * Write a description of class Ghostboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghostboss extends Actor
{
    private int damageAmount = 0;
    private int turnAmount = 0;
    private int turnAmount2 = 0;
    private int turnAmount3 = 0;
    private int shotTimer = 0;
    private int shotAmount = 0;
    private int transAmount = 255;
    private int patAmount = 0;
    private int patAmount2 = 0;
    private int a = 12;
    private int b = 12;
    private int imageSwitchDelay = 0;
    GreenfootSound m;

    Counter counter;
    GreenfootImage boss;
    GreenfootImage hitBoss;
    BossHealth bHealth;

    public Ghostboss(BossHealth h,Counter s)
    {
        bHealth = h;
        this.counter = s;
        boss = new GreenfootImage("Ghostboss.PNG");
        hitBoss = new GreenfootImage("ghosthurt.png");
       // m = music;
    }

    public void turnCount(int amount)
    {
        this.turnAmount += amount;
    }

    public void patStep(int amount)
    {
        this.patAmount += amount;
    }

    public void patStep2(int amount)
    {
        this.patAmount2 += amount;
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

    public void shotCount(int amount)
    {
        this.shotAmount += amount;
    }

    public void act() 
    {
        intro();
        hitImage();

        pattern1();
        pattern2();
        pattern3();

        takeDamage();
        endGame();

        //death();
    }      

    public void takeDamage()
    {
        if(isTouching(Shot.class) && transAmount >= 255)
        {
            removeTouching(Shot.class);
            healthCount(1);
            bHealth.damage++;     
            bHealth.damageHit();
        }
    }

    public void endGame()
    {
        if(damageAmount > 21)
        {
            this.counter.gainPoints(10);
            BossTwoStage stage = (BossTwoStage)getWorld();
            stage.goToShop();
            counter.gainPoints(10);
            //m.stop();
        }
    }

    private void hitImage()
    {
        if(isTouching(Shot.class) &&  transAmount >= 253)
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

    public void intro()
    {
        if(getY() < 150)
        {
            setLocation(getX(), getY() + 1);
        }
    }

    public void shoot()
    { 
        if(shotTimer >= 100 && shotTimer < 140)
        {
            getWorld().addObject(new Ghostshot(this), getX(), getY());
            shotTimer += 1;
        }
        else 
        {

            shotTimer += 1;
        }
        if(shotTimer == 141)
        {
            shotTimer = 0;
        }
    }

    public void shoot2()
    {
        //90 degrees on shots
        shotCount(1);
        if (shotTimer>= 100 && shotTimer < 130)
        {
            //int k = a * b;
            getWorld().addObject(new Ghostshot2(this), getX(), getY());
            shotTimer += 1;
            turn(Greenfoot.getRandomNumber(15));

        }
        else
        {
            shotTimer += 1;
        }
        if(shotTimer == 131)
        {
            shotTimer = 0;
            setRotation(0);
        }
    }

    public void shoot3()
    {
        //90 degrees on shots
        shotCount(1);
        if (shotTimer>= 50 && shotTimer < 150)
        {
            //int k = a * b;
            getWorld().addObject(new Ghostshot2(this), getX(), getY());
            shotTimer += 1;
            turn(Greenfoot.getRandomNumber(15));

        }
        else
        {
            shotTimer += 1;
        }
        if(shotTimer == 131)
        {
            shotTimer = 0;
            setRotation(0);
        }
    }

    public void jump1()
    {
        setLocation(100, 200);
    }

    public void jump2()
    {
        setLocation(900, 200);
    }

    public void jump3()
    {
        setLocation(200, 200);
    }

    public void jump4()
    {
        setLocation(800, 200);
    }

    public void jump5()
    {
        setLocation(500, 400);
    }

    public void pattern1()
    {   
        if(getY() >= 150 && damageAmount < 7 )
        {
            shoot();
            if(getY() >= 150 && getY() <= 160)
            {
                setLocation(getX() + 4,getY());
                if(getX() >= 930)
                {
                    setLocation(getX() + 4,getY() + 1);
                }
            }
            if(getY() >= 161 )
            {
                setLocation(getX() - 4,getY());
                if(getX() <= 70 && getY() >= 161)
                {
                    setLocation(getX(),getY() - 1);
                }
            }
        }
    }

    public void pattern2()
    {
        if(damageAmount >= 7 && damageAmount <14 )
        {
            //set transparency to 0

            if(patAmount < 2 )
            {
                if(transAmount >= 1 && patAmount == 0)
                {
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 0)
                    {
                        jump1();
                        patStep(1);
                    }
                }
                if(transAmount <= 254 && patAmount == 1)
                {
                    getImage().setTransparency(transAmount);
                    transAmount += 1;
                }
                if(transAmount == 255 && patAmount == 1)
                {
                    shoot2();

                    if(shotAmount == 1000)
                    {
                        patStep(1);
                        setRotation(0);
                    }
                }
            }

            if(patAmount >= 2)
            {
                if(transAmount >= 1 && patAmount == 2)
                {
                    shotAmount = 0;
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 0)
                    {
                        patStep(1);
                    }
                }
                if(transAmount <= 254 && patAmount == 3)
                {
                    jump2();
                    getImage().setTransparency(transAmount);
                    transAmount += 1;
                }
                if(transAmount == 255 && patAmount == 3)
                {
                    shoot2();

                    if(shotAmount == 1000)
                    {
                        patStep(1);
                        setRotation(0);
                    }
                }
                if(transAmount >= 1 && patAmount == 4)
                {
                    shotAmount = 0;
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 1)
                    {
                        patAmount = 0;
                    }
                }
            }

            //start becoming opaque
            //blink angry
            //crazy af shoot pattern 
            //start becoming invisible
            //jump2();
        }
    }

    public void pattern3()
    {
        if(damageAmount >= 14 && damageAmount <= 21)
        {

            if(patAmount2 < 2 )
            {
                if(transAmount >= 1 && patAmount2 == 0)
                {
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 0)
                    {

                        jump3();
                        patStep2(1);
                    }
                }
                if(transAmount <= 254 && patAmount2 == 1)
                {
                    getImage().setTransparency(transAmount);
                    transAmount += 1;
                }
                if(transAmount == 255 && patAmount2 == 1)
                {
                    shoot3();

                    if(shotAmount == 1000)
                    {
                        patStep2(1);
                        setRotation(0);
                    }
                }
            }

            if(patAmount2 >= 2)
            {
                if(transAmount >= 1 && patAmount2 == 2)
                {
                    shotAmount = 0;
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 0)
                    {
                        patStep2(1);
                    }
                }
                if(transAmount <= 254 && patAmount2 == 3)
                {
                    jump4();
                    getImage().setTransparency(transAmount);
                    transAmount += 1;
                }
                if(transAmount == 255 && patAmount2 == 3)
                {
                    shoot3();

                    if(shotAmount == 1000)
                    {
                        patStep2(1);
                        setRotation(0);
                    }
                }
                if(transAmount >= 1 && patAmount2 == 4)
                {
                    shotAmount = 0;
                    getImage().setTransparency(transAmount);
                    transAmount -= 1;
                    if(transAmount == 0)
                    {
                        patAmount2 = 6;

                    }
                }

                if(patAmount2 >= 5)
                {
                    if(transAmount >= 1 && patAmount2 == 5)
                    {
                        shotAmount = 0;
                        getImage().setTransparency(transAmount);
                        transAmount -= 1;
                        if(transAmount == 0)
                        {

                            patStep2(1);
                        }
                    }
                    if(transAmount <= 254 && patAmount2 == 6)
                    {
                        jump5();

                        getImage().setTransparency(transAmount);
                        transAmount += 1;
                    }
                    if(transAmount == 255 && patAmount2 == 6)
                    {
                        shoot3();

                        if(shotAmount == 1000)
                        {
                            patStep2(1);
                            setRotation(0);
                        }
                    }
                    if(transAmount >= 1 && patAmount2 == 7)
                    {
                        shotAmount = 0;
                        getImage().setTransparency(transAmount);
                        transAmount -= 1;
                        if(transAmount == 1)
                        {
                            patAmount2 = 0;

                        }
                    }

                }

            }
        }

    }

}
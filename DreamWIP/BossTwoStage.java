import greenfoot.*;

/**
 * Write a description of class BossTwoStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossTwoStage extends World
{
    Timer time;
    Counter score;
    Lives life;
    BossHealth bossHealth;
    Ghostboss boss;
    int x;
    int shottype;
    int totalCount;
    GreenfootSound music;
    int shieldValue;    
    HealthyShield shield;
    TopDownPlayer topdownplayer;
    public BossTwoStage(int totalCount, Lives lives, Timer t, int y, int q)
    {    
        //shieldValue = q;
        super(1000, 600, 1);  
        time = t;
       // score = s;
        shieldValue = q;
        shield = new HealthyShield();
        shottype = y;
        score = new Counter(totalCount);
        prepare();
        x = totalCount;
        life = lives;
        bossHealth = new BossHealth();
        addObject(life, 925, 25);
        addObject(t, 40, 30);
        addObject(bossHealth, 930, 80);
        topdownplayer = new TopDownPlayer(life, 0);
           topdownplayer.setLocation(305, 555);
        addObject(topdownplayer, 301, 353);
        
        boss = new Ghostboss(bossHealth, score);
        addObject(boss, 500, 0);
        
        music = new GreenfootSound("SoloDolo.mp3");
        https://soundcloud.com/8bitsongs/kid-cudi-solo-dolo
        music.playLoop();
        if(shieldValue == 3){
            addObject(shield,301,353);
            
        }
    }
    public void act(){
        if(Greenfoot.isKeyDown("o")){
            goToShop();
        }
        if(shieldValue >0){
        shield();
    }
    }
    public void shield(){
        shield.setLocation(topdownplayer.getX(), topdownplayer.getY());
            if(shield.isItTouching(Ghostshot.class) || shield.isItTouching(Ghostshot2.class)){
                shieldValue--;
                shield.removeTouchingObj();
                if(shieldValue == 2){
                    shield.setImage("bubblehealth2.png");
                }
                if(shieldValue==1){
                    shield.setImage("redbubble.png");
                }
                if(shieldValue==0){
                    removeObject(shield);
                }
        }
        
    
    }
    private void prepare()
    {
        addObject(score, 36, 12);
        //addObject(new TopDownPlayer(new Lives(), shottype), 500, 800);
        //System.out.println("Start of boss two shot number: " + shottype);
    }

    public void goToShop()
    {
        totalCount = score.returnValue();
        Shop shop = new Shop(totalCount, life, time, shottype, 2);
        music.stop();
        Greenfoot.setWorld(shop);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dolphin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dolphin extends Actor
{
    /**
     * Act - do whatever the Dolphin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Dolphin()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/dolphin_idle/idle" + i + ".png.png");
            idleRight[i].scale(150,150);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/dolphin_idle/idle" + i + ".png.png");
            idleLeft[i].mirrorHorizontally(); 
            idleLeft[i].scale(150,150); 
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateDolphin()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-5);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(5);
            facing = "right";
        }
        
        eat();
        
        animateDolphin();
    }
    
    public void eat()
    {
        if(isTouching(Fish.class))
        {
            Greenfoot.playSound("S_coeruleoalba_whistles_short.mp3");
            removeTouching(Fish.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnFish();
        }
    }
}

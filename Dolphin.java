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
    GreenfootImage[] idle = new GreenfootImage[6];
    
    public Dolphin()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/dolphin_idle/idle" + i + ".png.png");
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animateDolphin()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
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

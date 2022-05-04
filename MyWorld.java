<<<<<<< HEAD
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Dolphin d = new Dolphin();
        addObject(d, 300, 350);
        
        spawnFish();

    }
    
    public void spawnFish()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Fish fish = new Fish();
        addObject(fish,x, y);
    }
}
=======
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Dolphin d = new Dolphin();
        addObject(d, 300, 350);
        
        
        Fish fish = new Fish();
        addObject(fish,300, 0);
    }
}
>>>>>>> 4b201fe2bc2781793bb9f64f19b298344f42b789

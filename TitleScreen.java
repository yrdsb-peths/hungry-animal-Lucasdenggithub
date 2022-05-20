import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Dolphin",60);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dolphin dolphin = new Dolphin();
        addObject(dolphin,463,110);
        dolphin.setLocation(464,83);
        dolphin.setLocation(480,75);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,160,251);
        label.setLocation(284,311);
        label.setLocation(297,330);
        Label label2 = new Label("Hold <A> and <D> to Move", 40);
        addObject(label2,231,220);
        label2.setLocation(309,252);
        dolphin.setLocation(480,106);
    }
}

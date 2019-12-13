import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    Counter counter = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public int getInt() {
        return 1;
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        for (int loop=0; loop<20; loop=loop+1)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        
        addObject(counter, 100, 10);
        addObject(new baby1(), 150, 100);
        addObject(new baby3(), 150, 300);
        addObject(new baby2(), 450, 100);
        addObject(new baby4(), 450, 300);
        //End of code that must be included in your solution
        
        addObject(new ball1(), 450, 100);
        
    }
}

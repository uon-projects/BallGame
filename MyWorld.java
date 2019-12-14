import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @authors (Teodor Grigor & Scott Turner) 
 * @version (v1.0)
 */
public class MyWorld extends World
{
    //declaring a new variable so we can pass it to other classes and to draw it
    Counter counter = new Counter();
    
    GoalEvent goalEvent = new GoalEvent();
    
    //declaring the baby speed of move and the ball speed
    int babyMoveSpeed = 2, ballSpeed = 6;
    
    //public method that helps us to access the same counter from other classes (actors)
    public Counter getCounter()
    {
        return counter;
    }
    
    //public method that helps the babies to move
    public int getBabySpeed() {
        return babyMoveSpeed;
    }
    
    //public method that helps the ball to move
    public int getBallSpeed() {
        return ballSpeed;
    }
    
    public void goalScored(int team)
    {
        goalEvent.resetTimer(50, team);
    }
    
    //public method to initialise the class - MyWorld()
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //this chunck of code should not be changes and MUST be included
        //in your solution
        super(600, 400, 1);
        
        //creating the line (barrier) from the middle of the screen
        for (int loop=0; loop<20; loop++)
        {
            addObject(new barrier(), 300, 20*loop);
        }
        
        //adding the counter to the screen
        addObject(counter, 300, 25);
        
        //adding the goal event
        addObject(goalEvent, 300, 60);
        
        //adding the babies
        //adding team A (Baby 1 and Baby 3)
        addObject(new baby1(), 150, 100);
        addObject(new baby3(), 150, 300);
        //adding team B (Baby 2 and Baby 4)
        addObject(new baby2(), 450, 100);
        addObject(new baby4(), 450, 300);

        //adding the ball to the screen
        addObject(new ball1(), 450, 100);
        
        //End of code that must be included in your solution
    }
}

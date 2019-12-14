import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoalEvent here.
 * 
 * @author (Teodor Grigor) 
 * @version (v1.0)
 */
public class GoalEvent extends Actor
{
    //declare the variables that keeps the score for both teams (team A and team B)
    //we initialise them to 0
    private int timer;
    
    //method that its called in order to draw the counter
    public void act()
    {
        //creating the counter
        setImage(new GreenfootImage(" GOAL! ", 24, Color.WHITE, Color.BLACK));
        timer--;
        System.out.println("timer " + timer);
    }
    
    //public method that can be accessed outside of this classes
    //this method increase the Team A score by 1
    public void resetTimer()
    {
        timer = 3000;
    }
    
    public int getElapsedTime()
    {
        return timer;
    }
}

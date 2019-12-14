import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoalEvent here.
 * 
 * @author (Teodor Grigor) 
 * @version (v1.0)
 */
public class GoalEvent extends Actor
{
    //declare the variables
    public int timer = 0; //the timer
    private int teamScored; //stores the team that have scored
    
    //method that its called in order to draw the counter
    public void act()
    {
        //declaring the string so we can show the goal for the relevant team
        String gameEventText = "                     ";
        if(teamScored == 1) {
            gameEventText = " GOAL!" + gameEventText;
        } else if(teamScored == 2) {
            gameEventText = gameEventText + "GOAL! "; 
        }
        
        if(timer>0) {
            setImage(new GreenfootImage(gameEventText, 24, new Color(21, 21, 21), new Color(0,0,0,0)));
        } else {
            setImage(new GreenfootImage("", 24, Color.WHITE, new Color(0,0,0,0)));
        }
        timer--;
    }
    
    //public method that can be accessed outside of this classes
    //this method resets the timer and set stores the team that has scored
    public void resetTimer(int newTime, int team)
    {
        timer = newTime;
        teamScored = team;
    }
}

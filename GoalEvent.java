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
    public int timer = 0;
    private int teamScored;
    
    //method that its called in order to draw the counter
    public void act()
    {
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
    //this method increase the Team A score by 1
    public void resetTimer(int newTime, int team)
    {
        timer = newTime;
        teamScored = team;
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (Teodor Grigor) 
 * @version (v1.0)
 */
public class Counter extends Actor
{
    //declare the variables that keeps the score for both teams (team A and team B)
    //we initialise them to 0
    int scoreTeamA = 0, scoreTeamB = 0;
    
    //method that its called in order to draw the counter
    public void act()
    {
        //creating the counter
        setImage(new GreenfootImage(" Team A vs Team B \n" + scoreTeamA + "        :        " + scoreTeamB, 24, Color.WHITE, Color.BLACK));
    }
    
    //public method that can be accessed outside of this classes
    //this method increase the Team A score by 1
    public void addScoreToA()
    {
        scoreTeamA++;
    }
    
    //public method that can be accessed outside of this classes
    //this method increase the Team B score by 1
    public void addScoreToB()
    {
        scoreTeamB++;
    }
}

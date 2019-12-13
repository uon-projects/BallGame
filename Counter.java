import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int scoreTeamA = 0, scoreTeamB = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage(" Team A vs Team B \n" + scoreTeamA + "/" + scoreTeamB, 24, Color.GREEN, Color.BLACK));
    }
    
    public void addScoreToA()
    {
        scoreTeamA++;
    }
    
    public void addScoreToB()
    {
        scoreTeamB++;
    }
}

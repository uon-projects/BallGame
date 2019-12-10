import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby4 extends Actor
{
    /**
     * Act - do whatever the baby4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        Actor ball = (Actor)getWorld().getObjects(ball1.class).get(0);
        
        if(ball.getY() > getY()) {
            setLocation(getX(), getY() + 4);
        } else {
            setLocation(getX(), getY() - 4);
        }
        
    }    
}

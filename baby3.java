import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class baby3 extends Actor
{
    /**
     * Act - do whatever the baby3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        int babySpeed = myWorld.getBabySpeed();
        
        Actor ball = (Actor)getWorld().getObjects(ball1.class).get(0);
        
        if(ball.getY() > getY()) {
            setLocation(getX(), getY() + babySpeed);
        } else {
            if(getY() > 200) {
                setLocation(getX(), getY() - babySpeed);
            }
        }
        
    }    
}

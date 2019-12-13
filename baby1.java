import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class baby1 here.
 * 
 * @authors (Teodor Grigor & Scott Turner) 
 * @version (v1.0)
 */
public class baby1 extends Actor
{
    //method that is called when the run or act button is pressed
    //method that draw the actor
    public void act() 
    {
        //getting the class of the holder world - MyWorld        
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        //getting the speed of the babies from the myWorld
        int babySpeed = myWorld.getBabySpeed();
        
        //getting the ball class and storing into a variable
        Actor ball = (Actor)getWorld().getObjects(ball1.class).get(0);
        
        //moving the baby towards the ball
        if(ball.getY() > getY()) {
            if(getY() < 200) {
                //move the baby only to the half of the screen
                setLocation(getX(), getY() + babySpeed);
            }
        } else {
            setLocation(getX(), getY() - babySpeed);
        }
        
    }    
}

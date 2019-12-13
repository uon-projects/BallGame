import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @authors (Teodor Grigor & Scott Turner) 
 * @version (v1.0)
 */
public class ball1 extends Actor
{
    //method that is called when the run or act button is pressed
    //method that draw the actor
    public void act() 
    {        
        //getting the class of the holder world - MyWorld        
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        //getting the speed of the ball from the myWorld
        int ballSpeed = myWorld.getBallSpeed();
        //move the ball by ballSpeed value
        move(ballSpeed);     
        //getting the counter from the myWorld so we can interact with the public methods
        Counter counter = myWorld.getCounter();
        
        //getting the babies that are in the Team A
        //getting the baby1 class and store it into a variable
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            turn(generateTurnDegree() + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby1.class) != null);
        }
        
        //getting the baby3 class and store it into a variable
        Actor baby_3 = getOneIntersectingObject(baby3.class);
        if (baby_3!=null)
        {
            turn(generateTurnDegree() + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby3.class) != null);
        }
        
        //getting the babies that are in the Team B
        //getting the baby2 class and store it into a variable
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            turn(generateTurnDegree() + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby2.class) != null);
        }
        
        //getting the baby4 class and store it into a variable
        Actor baby_4 = getOneIntersectingObject(baby4.class);
        if (baby_4!=null)
        {
            turn(generateTurnDegree() + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby4.class) != null);
        }

        if(checkBoundaries())
        {
            bounceoffwall();
        }
        
        if(checkLost())
        {
            if(getX() <= 100) {
                counter.addScoreToB();
            } else if(getX() >=500) {
                counter.addScoreToA();
            }
            setLocation(300, 200);
            Actor baby1 = (Actor)getWorld().getObjects(baby1.class).get(0);
            baby1.setLocation(150, 100);
            Actor baby2 = (Actor)getWorld().getObjects(baby2.class).get(0);
            baby2.setLocation(450, 100);
            Actor baby3 = (Actor)getWorld().getObjects(baby3.class).get(0);
            baby3.setLocation(150, 300);
            Actor baby4 = (Actor)getWorld().getObjects(baby4.class).get(0);
            baby4.setLocation(450, 300);
        }
        
    }
    
    //method that retrives a number
    //this number represents the turn degree
    //the number returned is in a range from 30 to 150
    public int generateTurnDegree()
    {
        return Greenfoot.getRandomNumber(120) + 30;
    }
    
    public void bounceoffwall()
    {
        
        if (getY() == 0 || getY() == getWorld().getHeight()-1) /** top or bottom */
        {
            setRotation(360-getRotation());
        }
        
        if (getX()==0 || getX() == getWorld().getWidth()-1) /** left or right */
        {
            setRotation(180-getRotation());
        }
        
    }
    
    public boolean checkBoundaries()
    {
         if(getY() > 10 && getY() < 390) {
               return false;
         }
         return true;
    }
    
    public boolean checkLost()
    {
        if(getX() > 100 && getX() < 500) {
            return false;
        }
        return true;
    }
    
}

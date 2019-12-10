import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball1 extends Actor
{
    /**
     * Act - do whatever the ball1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(3);
        int noRandom;
        
        Actor baby_1 = getOneIntersectingObject(baby1.class);
        if (baby_1!=null)
        {
            do {
                noRandom = Greenfoot.getRandomNumber(180);
            } while(noRandom < 30 || noRandom > 150);
            turn(noRandom + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby1.class) != null);
        }
        
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        if (baby_2!=null)
        {
            do {
                noRandom = Greenfoot.getRandomNumber(180);
            } while(noRandom < 30 || noRandom > 150);
            turn(noRandom + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby2.class) != null);
        }

        if(checkBoundaries())
        {
            turn(-90);
        }
        
        if(checkLost())
        {
            setLocation(300, 200);
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
        if(getX() > 10 && getX() < 590) {
            return false;
        }
        return true;
    }
    
}

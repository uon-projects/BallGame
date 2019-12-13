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
        int noRandom;
        
        World world = getWorld();
        MyWorld myWorld = (MyWorld)world;
        Counter counter = myWorld.getCounter();
        int ballSpeed = myWorld.getBallSpeed();
        
        move(ballSpeed);
        
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
        
        Actor baby_3 = getOneIntersectingObject(baby3.class);
        if (baby_3!=null)
        {
            do {
                noRandom = Greenfoot.getRandomNumber(180);
            } while(noRandom < 30 || noRandom > 150);
            turn(noRandom + 90);
            do {
                move(10);
            } while(getOneIntersectingObject(baby3.class) != null);
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
        
        Actor baby_4 = getOneIntersectingObject(baby4.class);
        if (baby_4!=null)
        {
            do {
                noRandom = Greenfoot.getRandomNumber(180);
            } while(noRandom < 30 || noRandom > 150);
            turn(noRandom + 90);
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

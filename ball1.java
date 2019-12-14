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
        //getting the baby3 class and store it into a variable
        Actor baby_3 = getOneIntersectingObject(baby3.class);
        
        //getting the babies that are in the Team B
        //getting the baby2 class and store it into a variable
        Actor baby_2 = getOneIntersectingObject(baby2.class);
        //getting the baby4 class and store it into a variable
        Actor baby_4 = getOneIntersectingObject(baby4.class);
        
        //check for collision for the babies from the Team A
        //cehck for baby 1
        if (baby_1!=null)
        {
            //on collision:
            // -turn the ball to a random direction
            turn(generateTurnDegree() + 90);
            // -move the baby until the two sprites don't collide anymore
            moveOnCollision(baby1.class);
        }
        //cehck for baby 3
        if (baby_3!=null)
        {
            //on collision:
            // -turn the ball to a random direction
            turn(generateTurnDegree() + 90);
            // -move the baby until the two sprites don't collide anymore
            moveOnCollision(baby3.class);
        }
        
        //check for collision for the babies from the Team B
        //cehck for baby 2
        if (baby_2!=null)
        {
            //on collision:
            // -turn the ball to a random direction
            turn(generateTurnDegree() + 90);
            // -move the baby until the two sprites don't collide anymore
            moveOnCollision(baby2.class);
        }
        //check for baby 4
        if (baby_4!=null)
        {
            //on collision:
            // -turn the ball to a random direction
            turn(generateTurnDegree() + 90);
            // -move the baby until the two sprites don't collide anymore
            moveOnCollision(baby4.class);
        }

        //check if the ball hits the bottom or the top boundary
        if(checkHitsBoundaries())
        {
            //in case it hits the boundaries then we bounce the ball of the wall
            bounceBallOffWall();
        }
        
        //check if the ball go beyound the babies from each team
        if(checkLost())
        {
            //in case it does:
            // -we add a point to team team that scored
            if(getX() <= 100) {
                counter.addScoreToB();
            } else if(getX() >=500) {
                counter.addScoreToA();
            }
            myWorld.goalScored();
            // -we initialise the team members and the ball to the default positions
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
    private int generateTurnDegree()
    {
        return Greenfoot.getRandomNumber(120) + 30;
    }
    
    //method that moves the ball until it doesn't collide with the baby
    private void moveOnCollision(Class baby)
    {
        do {
            //move by 10
            move(10);
        } while(getOneIntersectingObject(baby) != null);
    }
    
    //method that check if the ball hits the boundaries
    private boolean checkHitsBoundaries()
    {
         if(getY() > 10 && getY() < 390) {
             //it doesn't
             return false;
         }
         //it does
         return true;
    }
    
    //method that makes the ball to rotate in a realistic way
    private void bounceBallOffWall()
    {
        if (getY() == 0 || getY() == getWorld().getHeight() - 1)
        {
            setRotation(360-getRotation());
        }
    }
    
    //method that checks if the ball passed beyond the babies
    public boolean checkLost()
    {
        if(getX() > 100 && getX() < 500) {
            //it didn't
            return false;
        }
        //it did
        return true;
    }
    
}

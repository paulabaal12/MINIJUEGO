import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buho extends Actor
{
    /**
     * Act - do whatever the buho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    public buho ()
    {
      GreenfootImage myImage = getImage(); 
      int nueva_altura= (int)myImage.getHeight()/2;
      int nuevo_ancho= (int)myImage.getWidth()/2; 
      myImage.scale(nuevo_ancho, nueva_altura);
    }
       
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100)<10)
        {
          turn(Greenfoot.getRandomNumber(90) - 45);  
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth()-5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight()-5)
        {
            turn(180);
        }
        }
    
    public void eat()
    {
        Actor raton;
        raton = getOneObjectAtOffset(0,0, raton.class);
        if (raton!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(raton);
        }
        }
    }


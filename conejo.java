import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class conejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class conejo extends Actor
{
    /**
     * Act - do whatever the conejo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
    }
    public conejo ()
    {
      GreenfootImage myImage = getImage(); 
      int nueva_altura= (int)myImage.getHeight()/6;
      int nuevo_ancho= (int)myImage.getWidth()/6; 
      myImage.scale(nuevo_ancho, nueva_altura);
    }
    public void moveAndTurn()
    {
        move(4);
        
        if (Greenfoot.isKeyDown("left"))
        
        {
           turn(-3);
        }  
       
        if (Greenfoot.isKeyDown("right"))
        
        {
           turn(3);
        }  
    }
    
    public void eat()
    {
        Actor zanahoria;
        zanahoria = getOneObjectAtOffset(0, 0, zanahoria.class);
        if (zanahoria != null)
        {
            World world;
            world = getWorld();
            world.removeObject(zanahoria);
        
        }
        }
}

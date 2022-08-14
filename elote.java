import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elote extends Actor
{
    /**
     * Act - do whatever the elote wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }
    public elote ()
    {
      GreenfootImage myImage = getImage(); 
      int nueva_altura= (int)myImage.getHeight()/6;
      int nuevo_ancho= (int)myImage.getWidth()/6; 
      myImage.scale(nuevo_ancho, nueva_altura);
    }
    public void mover()
    {
        
        World w = getWorld();
        move(-5);
        if(isAtEdge())
        {
            setLocation(590,getY());
        }
    }
}


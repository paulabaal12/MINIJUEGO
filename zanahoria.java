import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zanahoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zanahoria extends Actor
{
    /**
     * Act - do whatever the zanahoria wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }
    public zanahoria ()
    {
      GreenfootImage myImage = getImage(); 
      int nueva_altura= (int)myImage.getHeight()/10;
      int nuevo_ancho= (int)myImage.getWidth()/10; 
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

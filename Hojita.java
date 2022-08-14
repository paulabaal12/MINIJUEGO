import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hojita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hojita extends Actor
{
    /**
     * Act - do whatever the Hojita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Hojita ()
    {
      GreenfootImage myImage = getImage(); 
      int nueva_altura= (int)myImage.getHeight()/6;
      int nuevo_ancho= (int)myImage.getWidth()/6; 
      myImage.scale(nuevo_ancho, nueva_altura);
    }
}

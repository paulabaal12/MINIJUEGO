import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escena1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explicacion extends World
{
    /**
     * Constructor for objects of class Escena1.
     * 
     */
    public Explicacion()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }

    public void act(){//permite que el jugador pueda seleccionar las opciones del menu
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10);       
            Greenfoot.setWorld(new Fondo1());

            }
        }
    
}


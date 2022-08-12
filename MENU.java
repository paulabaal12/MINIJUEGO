import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MENU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MENU extends World
{

    /**
     * Constructor for objects of class MENU.
     * 
     */
    public MENU()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Salida salida = new Salida();
        addObject(salida,293,267);
        Inicio inicio = new Inicio();
        addObject(inicio,292,200);
        inicio.setLocation(239,238);
        salida.setLocation(372,246);
        inicio.setLocation(300,208);
        salida.setLocation(319,279);
        salida.setLocation(304,274);
        salida.setLocation(333,287);
        salida.setLocation(316,274);
        inicio.setLocation(332,204);
        inicio.setLocation(287,209);
        inicio.setLocation(296,209);
        inicio.setLocation(284,200);
        inicio.setLocation(329,220);
        inicio.setLocation(304,220);
        inicio.setLocation(330,204);
        salida.setLocation(329,280);
        Hojita hojita = new Hojita();
        addObject(hojita,228,199);
    }
}

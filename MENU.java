import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MENU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MENU extends World
{
    Hojita hojita = new Hojita();
    private int opcion = 0;
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
        //Salida salida = new Salida();
        addObject(new Salida(),329,280);
        //Inicio inicio = new Inicio();
        addObject(new Inicio(),330,204);
        //Hojita hojita = new Hojita();
        addObject(new Hojita(),228,199);

    }

    public void act(){
        if((Greenfoot.isKeyDown("UP")) && opcion!=0){opcion++;}
        if(Greenfoot.isKeyDown("DOWN") && opcion!=1){opcion--;}
        
        if(opcion >= 2) opcion=0;
        if(opcion<0)opcion=1;
        
        hojita.setLocation(228, 199 + (opcion*500));
        //mover la hoja
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
            case 0:
                Greenfoot.setWorld(new Explicacion());
            case 1:
                Greenfoot.stop();
                break;
            }
        }
    }
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo2 extends World
{

    /**
     * Constructor for objects of class Fondo2.
     * 
     */
    public Fondo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10);       
            Greenfoot.setWorld(new Final());

        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        zorro zorro = new zorro();
        addObject(zorro,58,173);
        zorro.setLocation(51,264);
        conejo conejo = new conejo();
        addObject(conejo,462,244);
        conejo conejo2 = new conejo();
        addObject(conejo2,468,336);
        conejo2.setLocation(420,358);
        conejo.setLocation(508,316);
        conejo conejo3 = new conejo();
        addObject(conejo3,362,244);
        conejo3.setLocation(344,336);
        conejo conejo4 = new conejo();
        addObject(conejo4,368,275);
        conejo4.setLocation(368,277);
        conejo conejo5 = new conejo();
        addObject(conejo5,264,291);
        conejo5.setLocation(253,362);
        conejo conejo6 = new conejo();
        addObject(conejo6,284,248);
        conejo6.setLocation(260,295);
        conejo conejo7 = new conejo();
        addObject(conejo7,136,311);
        conejo7.setLocation(172,353);
        conejo conejo8 = new conejo();
        addObject(conejo8,171,265);
        conejo8.setLocation(116,310);
        conejo conejo9 = new conejo();
        addObject(conejo9,211,247);
        conejo9.setLocation(546,268);
        zanahoria zanahoria = new zanahoria();
        addObject(zanahoria,554,19);
        zanahoria zanahoria2 = new zanahoria();
        addObject(zanahoria2,521,112);
        zanahoria zanahoria3 = new zanahoria();
        addObject(zanahoria3,420,46);
        zanahoria zanahoria4 = new zanahoria();
        addObject(zanahoria4,383,142);
        zanahoria zanahoria5 = new zanahoria();
        addObject(zanahoria5,268,84);
        zanahoria zanahoria6 = new zanahoria();
        addObject(zanahoria6,180,33);
        zanahoria2.setLocation(542,112);
        removeObject(zanahoria2);
        removeObject(zanahoria);
        removeObject(zanahoria4);
        removeObject(zanahoria5);
        removeObject(zanahoria6);
        removeObject(zanahoria3);
        zanahoria zanahoria7 = new zanahoria();
        addObject(zanahoria7,465,242);
        zanahoria zanahoria8 = new zanahoria();
        addObject(zanahoria8,455,169);
        zanahoria zanahoria9 = new zanahoria();
        addObject(zanahoria9,391,121);
        zanahoria zanahoria10 = new zanahoria();
        addObject(zanahoria10,287,68);
        zanahoria8.setLocation(276,149);
        zanahoria9.setLocation(376,102);
        zanahoria7.setLocation(462,135);
        zanahoria zanahoria11 = new zanahoria();
        addObject(zanahoria11,405,163);
        zanahoria11.setLocation(377,174);
        zanahoria zanahoria12 = new zanahoria();
        addObject(zanahoria12,200,111);
        zanahoria12.setLocation(230,130);
        zanahoria zanahoria13 = new zanahoria();
        addObject(zanahoria13,180,49);
        zanahoria13.setLocation(185,76);
        zanahoria zanahoria14 = new zanahoria();
        addObject(zanahoria14,115,60);
        zanahoria zanahoria15 = new zanahoria();
        addObject(zanahoria15,123,140);
        zanahoria zanahoria16 = new zanahoria();
        addObject(zanahoria16,174,196);
        zanahoria zanahoria17 = new zanahoria();
        addObject(zanahoria17,359,214);
        conejo9.setLocation(528,252);
        zanahoria zanahoria18 = new zanahoria();
        addObject(zanahoria18,528,252);
        zanahoria zanahoria19 = new zanahoria();
        addObject(zanahoria19,526,120);
        zanahoria zanahoria20 = new zanahoria();
        addObject(zanahoria20,481,55);
        zanahoria zanahoria21 = new zanahoria();
        addObject(zanahoria21,404,7);
        zanahoria zanahoria22 = new zanahoria();
        addObject(zanahoria22,272,0);
        zanahoria zanahoria23 = new zanahoria();
        addObject(zanahoria23,80,23);
        zanahoria zanahoria24 = new zanahoria();
        addObject(zanahoria24,5,151);
        zanahoria8.setLocation(305,120);
        zanahoria17.setLocation(282,191);
        conejo9.setLocation(500,196);
    }
}

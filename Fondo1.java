import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo1 extends World
{
    /**
     * Constructor for objects of class Fondo1.
     * 
     */
    public Fondo1()
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
        raton raton = new raton();
        addObject(raton,120,278);
        raton raton2 = new raton();
        addObject(raton2,207,336);
        raton raton3 = new raton();
        addObject(raton3,108,354);
        raton raton4 = new raton();
        addObject(raton4,54,320);
        raton raton5 = new raton();
        addObject(raton5,39,386);
        raton raton6 = new raton();
        addObject(raton6,244,366);
        raton raton7 = new raton();
        addObject(raton7,156,332);
        raton raton8 = new raton();
        addObject(raton8,326,311);
        raton raton9 = new raton();
        addObject(raton9,204,290);
        raton raton10 = new raton();
        addObject(raton10,255,328);
        raton raton11 = new raton();
        addObject(raton11,304,375);
        raton raton12 = new raton();
        addObject(raton12,155,373);
        raton raton13 = new raton();
        addObject(raton13,394,376);
        raton raton14 = new raton();
        addObject(raton14,334,343);
        raton raton15 = new raton();
        addObject(raton15,244,284);
        raton raton16 = new raton();
        addObject(raton16,380,323);
        raton raton17 = new raton();
        addObject(raton17,436,355);
        raton raton18 = new raton();
        addObject(raton18,470,369);
        raton raton19 = new raton();
        addObject(raton19,429,312);
        raton raton20 = new raton();
        addObject(raton20,283,343);
        raton6.setLocation(229,378);
        raton raton21 = new raton();
        addObject(raton21,229,378);
        raton raton22 = new raton();
        addObject(raton22,110,379);
        raton raton23 = new raton();
        addObject(raton23,19,348);
        elote elote = new elote();
        addObject(elote,552,356);
        elote elote2 = new elote();
        addObject(elote2,470,313);
        elote elote3 = new elote();
        addObject(elote3,554,311);
        elote elote4 = new elote();
        addObject(elote4,538,260);
        elote elote5 = new elote();
        addObject(elote5,543,193);
        elote elote6 = new elote();
        addObject(elote6,549,133);
        elote elote7 = new elote();
        addObject(elote7,491,107);
        elote elote8 = new elote();
        addObject(elote8,512,227);
        elote8.setLocation(495,227);
        elote elote9 = new elote();
        addObject(elote9,495,227);
        elote elote10 = new elote();
        addObject(elote10,496,150);
        elote elote11 = new elote();
        addObject(elote11,561,35);
        elote elote12 = new elote();
        addObject(elote12,577,212);
        elote elote13 = new elote();
        addObject(elote13,492,40);
        elote elote14 = new elote();
        addObject(elote14,396,172);
        elote elote15 = new elote();
        addObject(elote15,457,275);
        elote elote16 = new elote();
        addObject(elote16,476,177);
        elote elote17 = new elote();
        addObject(elote17,426,75);
        elote8.setLocation(494,272);
        elote4.setLocation(576,260);
        elote9.setLocation(484,237);
        elote15.setLocation(447,262);
        elote2.setLocation(506,324);
        elote3.setLocation(536,300);
        elote8.setLocation(512,242);
        elote5.setLocation(571,176);
        elote6.setLocation(579,95);
        elote10.setLocation(551,134);
        elote16.setLocation(508,185);
        elote14.setLocation(450,152);
        elote15.setLocation(452,257);
        buho buho = new buho();
        addObject(buho,73,122);
        
    }
    public void act(){
        if(Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.delay(10);       
            Greenfoot.setWorld(new Fondo2());

            }
        }

}


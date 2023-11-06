import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{
    public int atraso = 5;
    /**
     * Constructor for objects of class inicio.
     * 
     */
    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act() {
        if(atraso > 0) {
            atraso--;
        }
            if (Greenfoot.isKeyDown("enter") && (atraso < 1)){
            setBackground(new GreenfootImage("fala1.png"));
        }
            if (Greenfoot.isKeyDown("enter") && (atraso < 1)){
            setBackground(new GreenfootImage("fala2.png"));
        }
        if (Greenfoot.isKeyDown("enter") && (atraso < 1)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
        }
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}

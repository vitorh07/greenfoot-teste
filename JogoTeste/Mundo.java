import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("music.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
        bgMusic.setVolume(10);
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Pikachu pikachu = new Pikachu();
        addObject(pikachu,692,489);
        charmanderFLIP charmanderFLIP = new charmanderFLIP();
        addObject(charmanderFLIP,160,477);
        vidaPikachu vidaPikachu = new vidaPikachu("HP: ");
        addObject(vidaPikachu,680,44);
        vidaCharmander vidaCharmander = new vidaCharmander("HP: ");
        addObject(vidaCharmander,184,47);
    }
}

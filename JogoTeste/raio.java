import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class raio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class raio extends Pikachu
{
    /**
     * Act - do whatever the fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() - Math.sin(angle));
        
        setLocation(x, y);
    }
    public void acertarAlvo() {
        
        Actor b = getOneIntersectingObject(charmanderFLIP.class);
        
        if (b != null){
            
        vidaCharmander.add(-1);
        getWorld().removeObject(this);
        }
    }
}


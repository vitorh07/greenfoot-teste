import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class charmanderFLIP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class charmanderFLIP extends Actor
{   public int speed = 2;
    private int sTimer = 0;
    GreenfootSound fireball = new GreenfootSound("fireball.mp3");
    /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            movimento();
            if(isTouching(raio.class)){
            vidaCharmander.add(-1);
        }
        if(vidaCharmander.value==0){
            Greenfoot.delay(1);
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }
    public void movimento(){
            if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed); 
        }
        else if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f") && (sTimer ==0)){
            
            sTimer ++;
            fireball.play();
            getWorld().addObject(new fogo(), getX() + 20, getY() + 20);    
            }
            else {
                if (!Greenfoot.isKeyDown("f")){
                    sTimer = 0;
                }
            }
    }
}

import java.time.LocalDate;

public class  enemy {

    private String name;
    private int health;
    private int damage;
    private double speed;


    public enemy(String name, int health, int damage, double speed){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.speed = speed;

    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getDamage(){
        return this.damage;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void displayInfo(){
        System.out.println("Enemy: "+ this.name + "\nHealth: " +this.health + "\nDamage: " +this.damage+ "\nSpeed: " +this.speed);

    }
    
  public int attack(){
    System.out.println("The "+this.name + " was attacked!");
    return this.damage;
  }


  public int takeDamage(int amount){
    health-= amount;
    return health;
  }

  public boolean isDefeated(){
    if (health <= 0 ){
        System.out.println("The enemy has been slained!");
        return true;
    }
    else return false;
  }




}




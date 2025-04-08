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

    public void setName(String name){
      this.name = name;
    }

    public int getHealth(){
        return this.health;
    }
    
    public void setHealth(int health){
      this.health = health;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
      this.damage = damage;
    }

    public double getSpeed(){
        return this.speed;
    }

    public void displayInfo(){
        System.out.println("Enemy: "+ this.name + "\nHealth: " +this.health + "\nDamage: " +this.damage+ "\nSpeed: " +this.speed);

    }
    
  public int attack(){
    System.out.println("The "+this.name + " attacked for " + this.damage + " damage!");
    return this.damage;
  }


  public int takeDamage(int amount){
    this.health-= amount;
    
    System.out.println("The " + this.name + " took " + amount + " damage" + "\n" + this.name +" has " + this.health + " health remaining");
    return this.health;
  }

  public boolean isDefeated(){
    if (health <= 0 ){
        System.out.println("The"+ this.name + " has been slained!");
        return true;
    }
    else return false;
  }




}




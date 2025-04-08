import java.util.Scanner;
public class Assignment {
   
   public static void main(String[] args) {
    giant();
    System.out.println();
    knight();
    
   }


   public static void giant(){
   enemy giant = new enemy("Giant", 30, 5, 1.5);
   
   giant.displayInfo();
   System.out.println();
   giant.attack();
   System.out.println();
   giant.takeDamage(8);
   System.out.println();
   giant.displayInfo();
   
   }

   public static void knight(){
   enemy2 knight = new enemy2("Knight", 20, 8, 2.5);
      
   knight.displayInfo();
   
   System.out.println();
   knight.attack();
   System.out.println();
   knight.takeDamage(5);
   System.out.println();
   knight.displayInfo();
   }

   
   
}

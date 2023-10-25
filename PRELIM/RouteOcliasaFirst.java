import java.util.Scanner; 

public class RouteOcliasaFirst
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      boolean isObstructed = true;
      
      System.out.println("=== Welcome to RouteOcliasa ===");
      System.out.println("Default Routes:");
      System.out.println("Cebu City(start)");
      System.out.println("Minglanilla (Route 1)");
      System.out.println("San Fernando (Route 2)");
      System.out.println("Carcar (Route 3)");
      System.out.println("Barili (Route 4.1)");
      System.out.println("Dumanjug (Route 4.1.1)");
      System.out.println("Alcantara (Route 4.1.2)");
      System.out.println("Moalboal (End)");
      System.out.println("Do you want a recommended route(1) or exit(0)");
      int choice = s.nextInt();
      
      if(choice == 0)
      {
      System.out.println("Goodbye!!");
      }
      
      if(choice == 1){
      System.out.println("Is Barili obstructed?(1 for Yes/2 for No)" );
      int o1 = s.nextInt();
      if(o1 == 1)
      {
        
          System.out.println("Is Dumanjug obstructed?(1 for Yes/2 for No)");
          int o2 = s.nextInt();
            if(o2 == 1)
            {
          System.out.println("Recommended Route:");
          System.out.println("Cebu City(start)");
          System.out.println("Minglanilla (Route 1)");
          System.out.println("San Fernando (Route 2)");
          System.out.println("Carcar (Route 3)");
          System.out.println("Sibonga (Route 4.2)");
          System.out.println("Argao (Route 5)");
          System.out.println("Ronda (Route 5.1)");
          System.out.println("Alcantara (Route 5.2)");
          System.out.println("Moalboal (End)"); 
            }
           else if(o2 == 2)
           {
          System.out.println("Recommended Route:");
          System.out.println("Cebu City(start)");
          System.out.println("Minglanilla (Route 1)");
          System.out.println("San Fernando (Route 2)");
          System.out.println("Carcar (Route 3)");
          System.out.println("Sibonga (Route 4.2)");
          System.out.println("Dumanjug (Route 4.2.1)");
          System.out.println("Alcantara (Route 4.2.2)");
          System.out.println("Moalboal (End)");
           }
      }
      else if(o1 == 2)
      {
          System.out.println("Recommended Route:");
          System.out.println("Cebu City(start)");
          System.out.println("Minglanilla (Route 1)");
          System.out.println("San Fernando (Route 2)");
          System.out.println("Carcar (Route 3)");
          System.out.println("Barili (Route 4.1)");
          System.out.println("Dumanjug (Route 4.1.1)");
          System.out.println("Alcantara (Route 4.1.2)");
          System.out.println("Moalboal (End)");
          
      }
      }
   }
}
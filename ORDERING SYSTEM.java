import java.util.Scanner;
public class Main {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("+===================================+");
    System.out.println("           TAPSIHAN MENU          ");
    System.out.println("1. Tapsilog          Php. 60.00");
    System.out.println("2. Tocilog           Php. 50.00");
    System.out.println("3. Longsilog         Php. 70.00");
    System.out.println("4. CANCEL                         ");
    System.out.println("+====================================+");
    }
    
    public static void order(){
    System.out.println("Press 1 to Tapsilog , Press 2 to Tocilog , Press 3 to Longsilog and Press 4 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
    
    if(choose==1){
        System.out.println("You choose Tapsilog");
        System.out.print("How many Tapsilog you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*60);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order(); 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose Tocilog");
        System.out.print("How many Tocilog you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*50);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose Longsilog");
        System.out.print("How many Longsilog you want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*70);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==4){
        System.exit(0);//close program
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
    public static void main(String[] args) {
       menu();
       order();
    } 
}
import java.util.Scanner;
public class Main {
    
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("+===================================+");
    System.out.println("           TAPSIHAN MENU          ");
    System.out.println("1. Tapsilog          Php. 60.00");
    System.out.println("2. Tocilog           Php. 50.00");
    System.out.println("3. Longsilog         Php. 70.00");
    System.out.println("4. CANCEL                         ");
    System.out.println("+====================================+");
    }
    
    public static void order(){
    System.out.println("1-Tapsilog , 2-Tocilog , 3-Longsilog and 4-Cancel");
    System.out.println("Press you want to buy :");
    choose = input.nextInt();
    
    if(choose==1){
        System.out.println("You choose Tapsilog");
        System.out.print("How many order want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*60);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order(); 
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose Tocilog");
        System.out.print("How many order want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*50);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose Longsilog");
        System.out.print("How many order want to Buy? :");
        quantity =input.nextInt();
        total = total +(quantity*70);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==4){
        System.exit(0)
    }else{
        System.out.println("Choose 1 to 4 only!");
        order();
    }
    }
    public static void main(String[] args) {
       menu();
       order();
    } 
}

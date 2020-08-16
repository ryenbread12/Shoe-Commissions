import java.util.Scanner;
public class myCommission {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the number of shoes sold: ");
        int shoeSold = s.nextInt();
        
        System.out.println("Enter the price of the shoe: ");
        int priceOfShoe = s.nextInt();
        s.close();
        
        double sales = shoeSold*priceOfShoe;
        double commission = 0;
            
            
        if (shoeSold > 0) {
            commission = sales * 0.10;
        }
        
        else if (shoeSold > 1 && shoeSold <= 3) {
            commission = sales * 0.15;
        }
    
        else if (shoeSold > 3)
            commission = sales * 0.20;
            
    
        System.out.println("This is your Commission:" + commission);
    }
 }
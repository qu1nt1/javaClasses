import java.util.Scanner;

public class Product {
    public String name;
    public float price;
    public int quantity;

    public Product(String name, float price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void buyProduct(){
        if (this.quantity >= 1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Confirm purchase?(Y/N) ");
            String acceptPurchase = sc.nextLine().toUpperCase();
            if (acceptPurchase.equals("Y")){
                System.out.println("Purchase completed.");
            }
            else{
                System.out.println("Purchase canceled.");
            }
            this.quantity--;
        }
    }

    public void updateQuantity(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the new quantity: ");
        int newQuantity = sc.nextInt();
        this.quantity = newQuantity;
        System.out.println(this.name + " quantity updated to: " + this.quantity);
    }
}



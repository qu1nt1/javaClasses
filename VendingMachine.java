import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Boolean machineOn = true;
        String ADM_PASSWORD = "3921";
        Product product1 = new Product("Water Bottle", 3.5f, 5);
        Product product2 = new Product("Cereal Bar", 4f, 10);
        Product product3 = new Product("Protein Bar", 5.5f, 5);

        while(machineOn=true){
            System.out.println("=-=-=PRODUCTS=-=-=");
            String option = showOptions();
            System.out.println(option);
            if (option.equals(ADM_PASSWORD)){
                System.out.println("Which product you would like to change.");
                String adm_option = showOptions();
                switch (adm_option){
                    case "1":
                        product1.updateQuantity();
                        break;
                    case "2":
                        product2.updateQuantity();
                        break;
                    case "3":
                        product3.updateQuantity();
                        break;
                    default:
                        System.out.println("Invalid product.");
                }
            }
            else{
                switch (option){
                    case "1":
                        System.out.println("Buying Water Bottle...");
                        product1.buyProduct();
                        break;
                    case "2":
                        System.out.println("Buying Cereal Bar...");
                        product2.buyProduct();
                        break;
                    case "3":
                        System.out.println("Buying Protein Bar...");
                        product3.buyProduct();
                        break;
                    default:
                        System.out.println("Invalid product.");
                }
            }
        }
    }

    public static String showOptions(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Water Bottle\n2.Cereal Bar\n3.Protein Bar\nType your option: ");
        String option = scanner.nextLine();
        return option;
    }
}
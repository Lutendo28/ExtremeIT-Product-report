import java.util.Scanner;

public class ExtremeITProductsApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        

        String[] codes = {"T12", "T43", "T44", "T01"};

        String[] names = {"IPHONE", "AIRPODS", "MACKBOOK", "IPAD"};

        String[] categories = {"PHONE", "EARPHONE", "LAPTOB", "TABLET"};

        String[] warranties = {"2 years", "4 years", "2 years", "3 YEARS"};

        double[] prices = {17500.0, 13500.0, 10500.0, 8000.0};

        int[] levels = {4, 4, 4, 4};

        String[] suppliers = {"TEE.STORE", "TEE.STORE", "TEE.STORE", "TEE.STORE"};

        products[] productsArr = new products[4];

        for (int i = 0; i < 4; i++) {

            productsArr[i] = new products(codes[i], names[i], categories[i], warranties[i], prices[i], levels[i], suppliers[i]);

        }

      

        System.out.println("PRODUCT REPORT");

        double totalValue = 0;

        for (int i = 0; i < productsArr.length; i++) {

            ReportData rd = new ReportData();

            rd.setProductCode(productsArr[i].productCode);

            rd.setProductName(productsArr[i].productName);

            rd.setProductCategory(productsArr[i].productCategory);

            rd.setProductWarranty(productsArr[i].productWarranty);

            rd.setProductPrice(productsArr[i].productPrice);

            rd.setProductLevel(productsArr[i].productLevel);

            rd.setProductSupplier(productsArr[i].productSupplier);

            System.out.println("PRODUCT " + (i+1));

            System.out.println("PRODUCT CODE >> " + rd.getProductCode());

            System.out.println("PRODUCT NAME >> " + rd.getProductName());

            System.out.println("PRODUCT CATEGORY >> " + rd.getProductCategory());

            System.out.println("PRODUCT WARRANTY >> " + rd.getProductWarranty());

            System.out.println("PRODUCT PRICE >> " + rd.getProductPrice());

            System.out.println("PRODUCT LEVEL >> " + rd.getProductLevel());

            System.out.println("PRODUCT SUPPLIER >> " + rd.getProductSupplier());

            System.out.println("");

            totalValue += rd.getProductPrice();

        }

        System.out.println("TOTAL PRODUCT COUNT: " + productsArr.length);

        System.out.println("TOTAL PRODUCT VALUE: R " + totalValue);

        System.out.println("AVERAGE PRODUCT VALUE: R " + (int)(totalValue / productsArr.length));

        // --- WORKING MENU ---

        System.out.print("Enter (1) to launch menu: Enter (0) to exit menu: ");

        String choice = input.nextLine();

        while(choice.equals("1")){

            System.out.println("\n--- EXTREME IT MENU ---");

            System.out.println("1. Display All Products");

            System.out.println("2. Search by Product Code");

            System.out.println("3. Display Total Value");

            System.out.println("0. Exit Menu");

            System.out.print("Choose option: ");

            int menu = Integer.parseInt(input.nextLine());

            if(menu == 1){

                for (int i = 0; i < productsArr.length; i++) {

                    System.out.println((i+1)+ ". " + productsArr[i].productCode + " | " + productsArr[i].productName + " | " + productsArr[i].productCategory + " - R" + productsArr[i].productPrice);

                }

            }

            else if(menu == 2){

                System.out.print("Enter product code (T12,T43,T44,T01): ");

                String search = input.nextLine();

                boolean found = false;

                for (int i = 0; i < productsArr.length; i++) {

                    if(productsArr[i].productCode.equalsIgnoreCase(search.trim())){

                        System.out.println("FOUND >> " + productsArr[i].productName + " | " + productsArr[i].productCategory + " | " + productsArr[i].productWarranty + " | R" + productsArr[i].productPrice + " | Supplier: " + productsArr[i].productSupplier);

                        found = true;

                    }

                }

                if(!found) System.out.println("Product not found");

            }

            else if(menu == 3){

                System.out.println("TOTAL VALUE: R " + totalValue);

            }

            else if(menu == 0){

                break;

            }

            System.out.print("\nEnter (1) to launch menu: Enter (0) to exit menu: ");

            choice = input.nextLine();

        }

        System.out.println("Goodbye!");

    }

}
 
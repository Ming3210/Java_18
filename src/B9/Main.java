package B9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, Product> products = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.println("================MENU================");
            System.out.println("1. Them san pham");
            System.out.println("2. Cap nhat so luong san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Tinh tong gia san pham");
            System.out.println("5. Thoat");
            System.out.println("Lua chon cua ban : ");
            int choice;
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    totalPrice();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (true);

    }
    public static void addProduct(){
        System.out.println("Nhap id sp");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten sp");
        String name = scanner.nextLine();
        System.out.println("Nhap gia sp");
        float price = scanner.nextFloat();
        System.out.println("Nhap so luong");
        int quantity = scanner.nextInt();
        Product product = new Product(id, name, price, quantity);
        products.put(id, product);
    }

    public static void updateQuantity(){
        System.out.println("Nhap id");
        int id = scanner.nextInt();
        if(products.containsKey(id)){
            System.out.println("Nhap so luong moi");
            int newQuantity = scanner.nextInt();
            products.get(id).setQuantity(newQuantity);
        }
        else {
            System.out.println("San pham khong ton tai");
        }
    }

    public static void deleteProduct(){
        System.out.println("Nhap id");
        int id = scanner.nextInt();
        if(products.containsKey(id)){
            products.remove(id);
        }
        else {
            System.out.println("San pham khong ton tai");
        }
    }

    public static void totalPrice(){
        float total = 0;
        for(Product product : products.values()){
            total += product.getPrice() * product.getQuantity();
        }
        System.out.println("Tong gia tri cac san pham: " + total);
    }
}

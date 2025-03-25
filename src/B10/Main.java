package B10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<Integer, Employee> emp = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.println("=============MENU============");
            System.out.println("1. Them nv");
            System.out.println("2. Hien thi nv");
            System.out.println("3. Tinh tong luong");
            System.out.println("4. Tinh trung binh luong");
            System.out.println("5. Nv luong cao nhat");
            System.out.println("6. Nv luong thap nhat");
            System.out.println("7. Thoat");
            System.out.println("Chon : ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    totalSalary();
                    break;
                case 4:
                    sumAvg();
                    break;
                case 5:
                    highestSalary();
                    break;
                case 6:
                    lowestSalary();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }while (true);
    }
    public static void addEmployee(){
        System.out.println("Them id nv :");
        int id = scanner.nextInt();
        System.out.println("Them ten : ");
        String name = scanner.nextLine();
        System.out.println("Them luong : ");
        float salary = scanner.nextFloat();
        emp.put(id, new Employee(id ,name, salary));
    }

    public static void displayEmployees(){
        for(Employee e : emp.values()){
            System.out.println("ID : " + e.getId() + ", Ten : " + e.getName() + ", Luong : " + e.getSalary());
        }
    }



    public static void totalSalary(){
        float totalSalary = 0;
        for(Employee e : emp.values()){
            totalSalary += e.getSalary();
        }
        System.out.println("Tong luong : " + totalSalary);
    }

    public static void sumAvg(){
        float sumSalary = 0;
        int count = 0;
        for(Employee e : emp.values()){
            sumSalary += e.getSalary();
            count++;
        }
        if(count == 0){
            System.out.println("Khong co nhan vien nao trong danh sach");
            return;
        };
        float avgSalary = sumSalary / count;
        System.out.println("Trung binh luong : " + avgSalary);
    }

    public static void highestSalary(){
        Employee highest = emp.values().iterator().next();
        for(Employee e : emp.values()){
            if(e.getSalary() > highest.getSalary()){
                highest = e;
            }
        }
        System.out.println("Nhan vien co luong cao nhat : " + highest.getId() + ", Ten : " + highest.getName() + ", Luong : " + highest.getSalary());
    }

    public static void lowestSalary(){
        Employee lowest = emp.values().iterator().next();
        for(Employee e : emp.values()){
            if(e.getSalary() < lowest.getSalary()){
                lowest = e;
            }
        }
        System.out.println("Nhan vien co luong thap nhat : " + lowest.getId() + ", Ten : " + lowest.getName() + ", Luong : " + lowest.getSalary());
    }


}

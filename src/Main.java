import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Isim giriniz : ");
        String name = input.nextLine();

        System.out.print("Maas giriniz : ");
        int salary = input.nextInt();

        System.out.print("Calisma saati giriniz : ");
        int workHours = input.nextInt();

        System.out.print("Ise baslangic yilini giriniz : ");
        int hireYear = input.nextInt();

        Employee s1 = new Employee(name,salary,workHours,hireYear);
        s1.printInfo();
    }
}

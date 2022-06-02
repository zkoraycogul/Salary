public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = (salary<1000 ? 0.0 : salary*3.0/100.0);
        return tax;
    }

    int bonus() {
        int bonus = (workHours <40 ? 0 : (workHours-40)*30);
        return bonus;
    }

    double raiseSalary() {
        double raise = 2021-hireYear<10 ? salary*5.0/100 : (2021-hireYear>9 && 2021-hireYear <20) ? salary*10.0/100 : salary*15.0/100;
        return raise;
    }

    void printInfo() {
        System.out.println("Adı Soyadı: "+this.name);
        System.out.println("Maası : "+this.salary);
        System.out.println("Calisma saati: "+this.workHours);
        System.out.println("Ise baslangic yili: "+this.hireYear);
        System.out.println("Vergi = " +tax());
        System.out.println("Bonus = " + bonus());
        System.out.println("Maaş artışı = " + raiseSalary());
        System.out.println("Toplam maaş = " + (salary-tax()+bonus()+raiseSalary()));
    }

}

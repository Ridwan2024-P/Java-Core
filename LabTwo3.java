

enum Position{
    MANAGER, 
    DEVELOPER,
    HR
}
class Company{
   private   String CompanyName;
    Company(String CompanyName){
        this.CompanyName = CompanyName;
    }
    static class Development {

        public static void showDepartment() {
            System.out.println("Department: Development");
        }
    }
    
    class Employee{
           int id;
          String name;
        Position position;
        Employee(int id, String name, Position position){
            this.id = id;
            this.name = name;
            this.position = position;
        }
        void displayEmployeeInfo(){
           System.out.println("Company Name: " + CompanyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Position: " + position);
        }
    }
}

public class LabTwo3 {
    public static void main(String[] args) {

        Company company = new Company("BSS");
   
    
      
        Company.Development.showDepartment();
        System.out.println();

       
        var emp1 = company.new Employee(1, "Rid", Position.MANAGER);
        var emp2 = company.new Employee(2, "Bin", Position.DEVELOPER);
        var emp3 = company.new Employee(3, "Ahsan", Position.HR);

       
        Company.Employee[] employees = {emp1, emp2, emp3};

      
        for (Company.Employee emp : employees) {
            emp.displayEmployeeInfo();
        }

       
      
    
}
}

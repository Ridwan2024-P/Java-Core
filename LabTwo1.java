enum Department{
    CSE,
    DS,
    CNCS
}
    interface Person{
     void displayInfo();
        
    }

    class Student implements Person{
        int id;
        String name;
        Department dept;
        Student(int id, String name, Department dept){
            this.id = id;
            this.name = name;
            this.dept = dept;
        }
        public void displayInfo(){
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Department: " + dept);
        }
    }



public class LabTwo1 {
public static void main(String[] args) {
    Student s1 = new Student(1, "Rid", Department.CSE);
    Student s2 = new Student(2, "Ridwan", Department.DS);
    Student s3 = new Student(3, "Ahsan", Department.CNCS);

            Person[] Students = {s1, s2, s3};

    for (Person person : Students) {
        person.displayInfo();
        System.out.println();
    }

   
    
}
}

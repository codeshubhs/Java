class Employee{
    int employee_id;
    String name;
    String company="Hp";
    Employee(int empid ,String name ){
        this.employee_id=empid;
        this.name=name;
       
    }
    void display(){
        System.out.println(employee_id+" "+name+" "+company);
    }

}
class Demo{
    public static void main(String[] args) {
        Employee e1=new Employee(101 ,"shubham");
        e1.display();
        Employee e2=new Employee(103, "ashutosh");
        e2.display();
    }
}
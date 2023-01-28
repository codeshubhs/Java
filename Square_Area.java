class C1{
    void area (int x){
        System.out.println("Area of square " +x*x+ " sq. units ");
    }


}
class result {
    public static void main(String[] args) {
        C1 a=new C1();
        a.area(12);
    }
}
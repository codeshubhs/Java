class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }


    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Blue";
        pen1.type="gel";

        System.out.println(pen1.color    );
        System.out.println(pen1.type);
    }
}
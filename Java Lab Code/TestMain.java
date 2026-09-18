class A{
    int data;
    void change(A a2){
        data= data +100;
    }
}
class TestMain{
    public static void main(String[] args) {
        A a1= new A();
        a1.data= 700;
        System.out.println("Befor call: "+ a1.data);
        a1.change(a1);
        System.out.println("After call: "+ a1.data);
    }
}

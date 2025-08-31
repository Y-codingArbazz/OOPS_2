public class Child extends Parent{
    public void Dog(){
        System.out.println("This is Dog !!");
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Child cc=new Child();
        cc.Dog();
       System.out.println(cc.add(3, 6)); 
        cc.cat();
    }
// Prepare Some Functions in Child Class and Extend it to Parent Class
}

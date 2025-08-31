public class OverLoading{
    public String Name(String a, String b){
        String s=a+" Hates "+b;
return s;
    }
    public String Name(String a){
        return a;
    }
    public static void main(String[] args) {
        OverLoading o=new OverLoading();
        System.out.println(o.Name("Rahul", "Riya"));
        System.out.println(o.Name("Rehan"));
    }
// Prepare an Example to show OverLoading Concept
}

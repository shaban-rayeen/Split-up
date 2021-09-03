public class splitUp{

    public double split(double totalbill,int n){
        return (totalbill/n);
    }
    public static void main(String[] args) {
        System.out.println(new splitUp().split(10,3));
    }
}
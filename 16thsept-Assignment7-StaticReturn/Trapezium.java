public class Trapezium {
    public static double area()
    {
        int a=5;
        int b=4;
        int h=3;
        double res=1/2.0*(a+b)*h;
        return res;
    }
    public static void main(String[] args) {
       double x=Trapezium.area();
       System.out.println(x);
    }
}

public class Triangle {
    public static double area()
    {
        int b=4;
        int h=4;
        double res=1/2.0*b*h;
        return res;
    }
    public static void main(String[] args) {
        double x=Triangle.area();
        System.out.println(x);
    }    
}

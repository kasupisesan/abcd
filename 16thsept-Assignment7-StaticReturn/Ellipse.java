public class Ellipse {
    public static double area()
    {
        int a=5;
        int b=4;
       final double pi =3.14;
        double res=pi*a*b;
        return res;
    }
    public static void main(String[] args) {
        double x=Ellipse.area();
        System.out.println(x);
    } 
}

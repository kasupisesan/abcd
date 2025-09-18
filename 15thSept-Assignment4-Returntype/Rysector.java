public class Rysector {
    public static double area1()
    {
        int r=5;
        double theta=Math.PI/3;//angle in radians
        double res=1/2.0*r*r*theta;
        return res;
    }
    public static double area2()
    {
        int r=5;
        final double pi=3.14;
        int theta=60;//angle in degree
        double res=theta/360.0*pi*r*r;
        return res;
    }
    public static void main(String[] args) {
        double x1=area1();
        double x2=area2();
    System.out.println(x1);
    System.out.println(x2);
    
    } 
}

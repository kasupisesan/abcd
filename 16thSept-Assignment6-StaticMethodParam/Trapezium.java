class Sample4 {
    static void area(int a,int b,int h){
        double res=0.5*(a+b)*h;
        System.out.println(res);
    }
}
class Trapezium{
    public static void main(String [] args){
        Sample4.area(20,11,12);
    }
}

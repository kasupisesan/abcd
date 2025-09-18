class Sample4 {
    static void area(int b,int h){
        double res=0.5*b*h;
        System.out.println(res);
    }
}
class Triangle{
    public static void main(String [] args){
        Sample4.area(20,30);
    }
}

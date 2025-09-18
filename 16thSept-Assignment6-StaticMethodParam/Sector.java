class Sample3 {
    static void area(int r){
        double res=0.5*(r*r)*240;
        System.out.println(res);
    }
}
class Sector{
    public static void main(String [] args){
        Sample3.area(20);
    }
}

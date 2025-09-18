class Sample6 {
    static void area(int r){
        double res=3.142*r*r;
        System.out.println(res);
    }
}
class Circle{
    public static void main(String [] args){
        Sample6.area(20);
    }
}

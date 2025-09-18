class Sample3 {
    static void area(int a){
        int res=a*a;
        System.out.println(res);
    }
}
class Square{
    public static void main(String [] args){
        Sample3.area(20);
    }
}

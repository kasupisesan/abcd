class Trapezoid{
    void area(){
        int a=20;
        int b=12;
        int h=34;
        double res=0.5*(a+b)*h;
        System.out.println(res);
    }
    public static void main(String [] args){
        new Trapezoid().area();
    }
}
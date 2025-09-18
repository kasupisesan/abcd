class Ellipse {
    void area(){
        double pi=3.142;
        int a=20;
        int b=15;
        double res=pi*a*b;
        System.out.println(res);
    }
    public static void main(String [] args){
        new Ellipse().area();
    }
}
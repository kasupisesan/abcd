class Circle{
    void area(){
        double pi=3.142;
        int r=20;
        double res=pi*r*r;
        System.out.println(res);
    }
    public static void main(String [] args){
        new Circle().area();
    }
}
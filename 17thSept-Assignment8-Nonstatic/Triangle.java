class Triangle {
    void area() {
        int h=20;
        int b=12;
        double res=0.5*h*b;
        System.out.println(res);
    }
    public static void main(String [] args){
        new Triangle().area();
    }
}
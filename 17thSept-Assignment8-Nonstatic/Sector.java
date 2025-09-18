class Sector{
    void area(){
        int theta=230;
        int r=20;
        double res=0.5*theta*r*r;
        System.out.println(res);
    }
    public static void main(String [] args){
        new Sector().area();
    }
}
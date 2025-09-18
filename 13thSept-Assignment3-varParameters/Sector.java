class Sector {
    public static void area(int theta,int r){
        double area=0.5*(r*r)*theta;
        System.out.println(area);
    }
    public static void main(String [] args){
        area(250,12);
    }
}
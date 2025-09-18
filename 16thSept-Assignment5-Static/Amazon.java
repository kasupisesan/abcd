class Amazon{
    static void Signup(){
        System.out.println("Signup");
    }
    static void Login(){
        System.out.println("Login");
    }
    public static void main(String [] args){
        Signup();
        Login();
        Homepage();
        Cart();
        Logout();
    }
    static void Homepage(){
        System.out.println("homepage");
    }
    static void Cart(){
        System.out.println("Cart");
    }
    static void Logout(){
        System.out.println("Logout");
    }
}
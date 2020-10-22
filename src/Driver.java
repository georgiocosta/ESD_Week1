public class Driver {
    
    public static void main(String[] args) {
        
        if(args.length > 3 || args.length < 3) {
            System.out.println("Invalid number of arguments.");
        }
        
        else {
            Triangle triangle = new Triangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            
            System.out.println(triangle.calculateType());
        }
        
    }
}

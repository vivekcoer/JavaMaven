package classes.staticinnerclass;

public class Hello {
    class Thing {
        public int size;

        public Thing(int size) {
            this.size = size;
        }
    }
    
    public static void main(String[] args) {
       // Thing thing1 = new Thing(8); //throws error
        System.out.println("Hello, World!");
    }
}
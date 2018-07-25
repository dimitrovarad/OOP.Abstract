package abstraction;

public class AbstractDemo {
    //public static void main (String a[]){}
    public static void main (String[] args){
        RadinaPhone obj = new MonikaPhone();
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();
    }

    abstract static class RadinaPhone {
        public void call() {
            System.out.println("Calling");
        }
        public abstract void move();
        public abstract void dance();
        public abstract void cook();
    }
    abstract static class VeselinaPhone extends RadinaPhone{
        public void move() {
            System.out.println("Moving");
        }
    }
    static class MonikaPhone extends VeselinaPhone { //concrete class/particular
        public void dance(){
            System.out.println("Dancing");
        }
        public void cook(){
            System.out.println("Cooking");
        }
    }
}

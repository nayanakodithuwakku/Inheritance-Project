public class Human1 {
    void run (){
        System.out.println("can Run");
    }
}
class Human2 extends Human1{
    void jump (){
        System.out.println("can Jump");
    }
}
class Human3 extends Human2 {
    void climb (){
        System.out.println("can't Climb");
    }
}
class TestProgram{
    public static void main(String[] args) {
        Human3 h3 = new Human3();
        h3.run();
        h3.jump();
        h3.climb();
    }
}





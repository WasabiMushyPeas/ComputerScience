public class Main{

    public static void main(String[] args) {

        Bug bugsy = new Bug();

        for(int i=0; i<=10; i++){
            bugsy.move();
        }
        
        bugsy.turn();

        for(int i=0; i<=5; i++){
            bugsy.move();
        }
        
        System.out.println(bugsy.getPos());

        
    }

}
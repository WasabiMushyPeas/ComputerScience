public class Main{
    public static void main(String[] args) {
        
        Lock myLock = new Lock(5, 10, 15);
        Lock defaultLock = new Lock();


        // try to get in with wrong password
        myLock.turnRight(4);
        myLock.rest();
        myLock.turnRight(10);
        myLock.rest();
        myLock.turnRight(36);
        myLock.rest();

        myLock.check();

        // try to get in with right password
        myLock.turnRight(5);
        myLock.rest();
        myLock.turnRight(10);
        myLock.rest();
        myLock.turnRight(15);
        myLock.rest();

        myLock.check();

        // get into the default lock with the default password then set it to a different password
        defaultLock.turnRight(0);
        defaultLock.rest();
        defaultLock.turnRight(0);
        defaultLock.rest();
        defaultLock.turnRight(0);
        defaultLock.rest();

        defaultLock.checkSet(4, 2, 9);

        // try to get in with right password but with more steps
        myLock.turnRight(44);
        myLock.rest();
        myLock.turnLeft(29);
        myLock.rest();
        myLock.turnRight(15);
        myLock.rest();

        myLock.check();

        // get into the default lock again 
        
        defaultLock.turnRight(4);
        defaultLock.rest();
        defaultLock.turnRight(2);
        defaultLock.rest();
        defaultLock.turnRight(9);
        defaultLock.rest();

        defaultLock.check();






    }

}
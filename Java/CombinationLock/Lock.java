import java.util.ArrayList;

public class Lock{

    //make the variables for the class
    private int currentNumber = 0;
    // Using ArrayList to be more neat however three int variables could be used (actualy settable password)
    private ArrayList<Integer> code = new ArrayList<Integer>();
    // Using ArrayList to be more neat however three int variables could be used (user's guess of the password they set)
    private ArrayList<Integer> guess = new ArrayList<Integer>();


    public Lock(){
        // default is 000
        setCode(0, 0, 0);
    }

    public Lock(int num1, int num2, int num3){

        setCode(num1, num2, num3);

    }

    public void rest(){

        // check to see which number you are on (1, 2, or 3) and then add it to guess
        if(guess.isEmpty()){
            guess.add(0, currentNumber);

        }else if(guess.size() == 1){
            guess.add(1, currentNumber);

        }else if(guess.size() == 2){
            guess.add(2, currentNumber);
        }else if(guess.size() >= 3){

            System.out.println("Too many inputs check your password (guess cleared)");

            guess = new ArrayList<Integer>();

        }

        // go back to 0
        currentNumber = 0;

    }

    public void turnLeft(int amount){


        // check to see if your turn would go out of bounds and adjust it be in boundes

        if(currentNumber - amount < 0){
          

            currentNumber = 39 + (currentNumber - amount);

        }else{


            currentNumber -= amount;
        }


        
    }

    public void turnRight(int amount){


        // check to see if your turn would go out of bounds and adjust it be in boundes
        if(currentNumber + amount > 39){


            currentNumber = 0 + ((currentNumber + amount) - 39);

        }else{
            currentNumber += amount;

        }

        
    }

    public void check(){

        // Check to see if the guess and actual code match up
        if(guess.equals(code)){

            System.out.println("You got in");
            System.out.println("Your code is: " +  code.get(0) + code.get(1) + code.get(2));

        }else{

            System.out.println("Incorrect password try again");
            System.out.println("Your code was: " + guess.get(0) + guess.get(1) + guess.get(2));
        }

        // reset everything
        guess = new ArrayList<Integer>();
        currentNumber = 0;
    }

    public void checkSet(int newNum1, int newNum2, int newNum3){

        // Check to see if the guess and actual code match up
        if(guess.equals(code)){

            System.out.println("You got in");
            System.out.println("Your code was: " +  code.get(0) + code.get(1) + code.get(2));
            setCode(newNum1, newNum2, newNum3);
            System.out.println("Your new code is: " +  code.get(0) + code.get(1) + code.get(2));

        }else{

            System.out.println("Incorrect password try again password not changed");
        }

        // reset everything
        guess = new ArrayList<Integer>();
        currentNumber = 0;
    }

    private void setCode(int num1, int num2, int num3){
        
        // Check to see all the inputs are between 0 and 39 and if they aren't than set them equal to the closest in boundes number
        if(num1 > 39){
            num1 = 39;
        }
        if(num2 > 39){
            num2 = 39;
        }
        if(num3 > 39){
            num3 = 39;
        }
        
        if(num1 < 0){
            num1 = 0;
        }
        if(num2 < 0){
            num2 = 0;
        }
        if(num3 < 0){
            num3 = 0;
        }
        
        // set the code equal to the inputs
        if(code.isEmpty()){
            code.add(0, num1);
            code.add(1, num2);
            code.add(2, num3);
        }else{
            code.set(0, num1);
            code.set(1, num2);
            code.set(2, num3);   
        }


    }

    

    

}
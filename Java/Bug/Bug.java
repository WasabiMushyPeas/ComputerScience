public class Bug{

    private int pos;
    private boolean facingLeft = false;

    public Bug(int intPos){
        pos = intPos;
    }

    public Bug(){
        pos = 0;
    }

    public void move(){

        if(facingLeft){
            pos -= 1;
        }
        if(!facingLeft){
            pos += 1;
        }
    }

    public int getPos(){
        return pos;
    }

    public void turn(){
        facingLeft = !facingLeft;
    }



}
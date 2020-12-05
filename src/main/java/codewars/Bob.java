package codewars;

public class Bob {
    public static int enough(int cap, int on, int wait){
        if(cap>(on+wait)){
            return 0;}
        else{
            return (on + wait)-cap;
        }
    }
}

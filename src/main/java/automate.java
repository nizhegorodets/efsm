import java.util.ArrayList;

public class automate {
    private static ArrayList<state> states = new ArrayList<state>();
    private static state start;
    private  static  state curState;

    public static void addState(state input){
        states.add(input);
    }

    public static void setStartState(state input){
        start = input;
        curState = input;
        addState(input);
    }

    public  static  void switchState(String input){

    }

    public static void splitAndStart(String line){

    }
}

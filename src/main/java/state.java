import java.util.ArrayList;
import java.util.HashMap;

public class state {
    private String title = "";
    private ArrayList<transition> transitions = new ArrayList<transition>();
    private static int z  = 0;

    public state(String t){
        title = t;
    }

    public void addTransition(transition t){
        transitions.add(t);
    }
}

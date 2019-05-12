public class transition {
    public transition(String s, String d, String i, String o, Predicate p){
        source = s;
        destination = d;
        output = o;
        input = i;
        pred = p;
    }

    private String source = "";
    private String destination = "";
    private String output = "";
    private String input = "";
    private Predicate pred;

    public  int doCondition(){return 0;}
}

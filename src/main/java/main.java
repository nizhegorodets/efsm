public class main {

    public static void main (String args[]){
        //create transitions
        transition PPb = new transition("P", "P", "b", "0", new Predicate("z > 1//-1"));
        transition PQa = new transition("P", "Q", "a", "0", new Predicate(""));
        transition QQa = new transition("Q", "Q", "a", "1", new Predicate(""));
        transition QRb = new transition("Q", "R", "b", "0", new Predicate("//+1"));
        transition RRb = new transition("R", "R", "b", "1", new Predicate("z = 0//+1"));
        transition PRb = new transition("P", "R", "b", "1", new Predicate("z <= 1//+1"));
        transition RPa = new transition("R", "P", "a", "0", new Predicate(""));
        transition RPb = new transition("R", "P", "b", "0", new Predicate("z >= 1//-1"));

        //create states
        state P = new state("P");
        P.addTransition(PPb);
        P.addTransition(PQa);
        P.addTransition(PRb);

        state Q = new state("Q");
        Q.addTransition(QQa);
        Q.addTransition(QRb);

        state R = new state("R");
        R.addTransition(RRb);
        R.addTransition(RPa);
        R.addTransition(RPb);

        //create automate
        automate a = new automate();

    }


}

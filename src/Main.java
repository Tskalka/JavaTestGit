import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Every line of code must be inside a "class"!
           Name of java file must match class name */

        // creating a new object to access methods within the class
        Output o = new Output();
        String output = o.returnOutput();
        String outputQuestion = o.addQuestionMark(output);
        System.out.println(output);

        o.addExclamationPoint(output);
        System.out.println(outputQuestion);

        List a = new List();

        a.add(1);
        a.add(2);
        a.add(3);

       ArrayList<Integer> main;
       main = a.getArray();
       System.out.println(main);

    }
}
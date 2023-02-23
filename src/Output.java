public class Output {

    // Variable types, red means native to java,
    // non-colored is an object, access object methods with a .
    public String hello = "hi";

    public String returnOutput()
    {
        return "output";
    }

    public void addExclamationPoint(String s)
    {
        System.out.println(s + "!");
    }

    public String addQuestionMark(String s)
    {
        return s + "?";
    }

}

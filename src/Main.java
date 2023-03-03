public class Main
{
    public static void main(String[] args)
    {
        Person bert = new Person("Bert", "Coates");
        Person gemma = new Person("Gemma", "Coates");
        Person rosa = new Person("Rosamund", "Coates");
        Person iris = new Person("Iris", "Coates");

        System.out.println(bert.getFullName());
    }
}

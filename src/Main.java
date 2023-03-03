public class Main
{
    public static void main(String[] args)
    {
        Person bert = new Person("Bert", "Coates", "Blue", "Brown");
        Person gemma = new Person("Gemma", "Coates", "Brown", "Brown");
        Person rosa = new Person("Rosamund", "Coates", "Blue", "Blonde");
        Person iris = new Person("Iris", "Coates", "Brown", "Brown");


        System.out.println(bert.getFullName());
        System.out.println("Rosa has " + rosa.getEyeColour().toLowerCase() + " eyes");
    }
}

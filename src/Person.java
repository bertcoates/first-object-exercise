public class Person
{
    // attributes
    private String firstName;
    private String surname;

    // constructor
    public Person (String fName, String sName)
    {
        this.firstName = fName;
        this.surname = sName;
    }

    // methods
        // getters
    public String getFirstName()
    {
        return this.firstName;
    }

    public String getSurname()
    {
        return this.surname;
    }

    public String getFullName()
    {
        return this.firstName + " " + this.surname;
    }

        // setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}

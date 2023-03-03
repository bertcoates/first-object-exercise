public class Person
{
    // attributes
    private String firstName;
    private String surname;
    private String eyeColour;
    private String hairColour;


    // constructor
    public Person (String fName, String sName, String eColour, String hColour)
    {
        this.firstName = fName;
        this.surname = sName;
        this.eyeColour = eColour;
        this.hairColour = hColour;
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

    public String getEyeColour()
    {
        return this.eyeColour;
    }

    public String getHairColour()
    {
        return this.hairColour;
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

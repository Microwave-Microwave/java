package cafe;

public class Bartender
{
    private int legalAge;

    public Bartender(int age)
    {
        legalAge = age;
    }

    public int GetLegalAge()
    {
        return legalAge;
    }

    public void SetLegalAge(int legalAge)
    {
        this.legalAge = legalAge;
    }

    public boolean order(Guest g)
    {
        if (g.getAge() < legalAge)
            return false;
        else
            return true;
    }

}
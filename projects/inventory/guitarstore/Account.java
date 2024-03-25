package projects.inventory.guitarstore;

public class Account {
    private String firstName;
    private int accountNumber;
    private String lastName;
    private double balance;

    public Account(int accountNumber, String firstName, String lastName, double balance)
    {
        if (firstName == null || firstName.isEmpty())
        {
            throw new IllegalArgumentException("firstName cannot be null");
        }

        if (lastName == null || lastName.isEmpty())
        {
            throw new IllegalArgumentException("lastName cannot be null");
        }

        if (accountNumber <= 0)
        {
            throw new IllegalArgumentException("accountNumber cannot be less than or equal zero");
        }

        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

}

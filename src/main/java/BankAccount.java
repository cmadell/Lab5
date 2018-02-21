

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /**
     *
     */
    public enum BankAccountType {
        /**
         * checkings account.
         */
        CHECKINGS,
        /**
         * savings account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * workplace account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;

    /**
     * Type of account.
     */
    private BankAccountType accountType;

    /**
     * Amount of money in the account.
     */
    private double accountBalance;

    /**
     * Name of owner of account.
     */
    private String ownerName;

    /**
     * Interest rate of the account.
     */
    private double interestRate;

    /**
     * Total amount of interest earned in the account.
     */
    private double interestEarned;


    /**
     * Creates instance of BankAccount with instance variables of name and account category.
     * @param name represents name of the account.
     * @param accountCategory represents type of account.
     */

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * Sets account number.
     * @param a value to set account number to.
     */
    public void setAccountNumber(final int a) {
        accountNumber = a;
    }

    /**
     * Return account number.
     * @return account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account balance.
     * @param b value to set account balance to.
     */
    public void setAccountBalance(final double b) {
        accountBalance = b;
    }

    /**
     *
     * @return account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the owner name of the account.
     * @param c name of account owner.
     */
    public void setOwnerName(final String c) {
        ownerName = c;
    }

    /**
     *
     * @return owner name
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the interest earned.
     * @param d value to set interest earned to.
     */
    public void setInterestEarned(final double d) {
        interestEarned = d;
    }

    /**
     *
     * @return interest earned.
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}

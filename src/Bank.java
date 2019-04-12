public class Bank {

    public int accountNumber;
    public int balance=0;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int deposite(int deposite){
        balance=this.balance+deposite;
        return balance;
    }

    public int withdraw(int withdraw){
        if (this.balance>withdraw){
            this.balance=this.balance-withdraw;
        }
        return balance;
    }

    public String customerName;
    public String email;
    public String phoneNumber;

    public static void main(String[] args) {
        Bank chase=new Bank();
        chase.deposite(5000);
        chase.deposite(6000);
        System.out.println(chase.balance);
        chase.withdraw(3000);
        System.out.println(chase.balance);
    }
}

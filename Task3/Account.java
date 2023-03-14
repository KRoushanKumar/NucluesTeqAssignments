public class Account {
    int accountNo; 
    String name, address, phoneNo, dob; 
    int balance;
    
    
    public Account(){}
    public Account(int accountNo, String name, String address, String phoneNo, String dob, int balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void closeAccount(){

    }
    
    public int getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}

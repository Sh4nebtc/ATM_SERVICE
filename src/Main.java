import java.util.Scanner;

class User
{
     String User_id;
     String User_Pin;

    public User(String User_Id,String User_Pin)
    {
        this.User_id= User_Id;
        this.User_Pin=User_Pin;
    }

    public String getUser_id() {
        return User_id;
    }

    public String getUser_Pin() {
        return User_Pin;
    }
}
class Account
{
    int balance;
    String Account_number;
    public Account(String Account_number)
    {
        this.Account_number=Account_number;
        this.balance=0;
    }
    public int Get_Balance()
    {
        return balance;
    }
    
}
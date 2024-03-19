import java.util.*;

class ATM{

float balance=0.0f;
int pin=2003;// Considering the pin is already stored in our database
int a;

Scanner sc= new Scanner(System.in);

public void menu(){
System.out.println("Enter 1 to Check Balance");
System.out.println("Enter 2 to Withdraw Amount");
System.out.println("Enter 3 to Deposit Amount");
System.out.println("Enter 4 to Exit");
System.out.println("Enter your choice: ");

int ch;
ch=sc.nextInt();
switch(ch)
{
case 1:
CheckBalance();
break;

case 2:
WithdrawAmount();
break;

case 3:
DepositAmount();
break;

case 4:
return;

default:
{
System.out.println("Wrong choice !!! Enter between 1 and 4");
menu();
}
}
}
public void checkpin(){

System.out.println("Welcome!!!");
System.out.println("Enter your pin: ");
a=sc.nextInt();
if(a==pin)
{
menu();
}
else
{
System.out.println("Invalid pin!!! Enter correct pin to access further");
checkpin();
}
}


public void CheckBalance()
{
System.out.println("Balance:" + balance);
menu();
}

public void WithdrawAmount()
{
float amount;
System.out.println("Enter amount to be withdrawn:");
amount=sc.nextFloat();
if(amount>balance)
{
System.out.println("Insufficient balance");
}
else 
{
balance=balance-amount;
System.out.println(" Money Withdrawn successfully");
}
menu();
}

public void DepositAmount()
{
float amount;
System.out.println("Enter amount to be deposited:");
amount=sc.nextFloat();
balance=balance+amount;
System.out.println(" Money deposited successfully");
menu();
}
}


class ATMMachine{

public static void main( String args[])
{
ATM ob = new ATM();
ob.checkpin();
}
}












 


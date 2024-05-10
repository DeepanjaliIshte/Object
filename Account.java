// Write a program to create a class Account having data members as acc_no, name  and balance, accept and display data for one object.

public class Account
{
int acc_no;
String name;
double balance;
void getdata(int d,String s,double h)
{
	acc_no=d;
	name =s;
	balance =h;
}
void putdata()
{
	System.out.println("account no : "+acc_no);
	System.out.println(" Name : "+name);
	System.out.println("Balance : "+balance);
}
}

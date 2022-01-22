package week1.day1;

public class Mobile 
{
	
	public static void main(String[] args)
	{	
		Mobile obj=new Mobile();
		obj.saveContact();
		System.out.println("\ncalling to.... "+obj.makeCall());
		obj.sendMsg();
	}
	private void saveContact()
	{
		int number = 1234567890;
		String name = "Rajesh";
		System.out.println("\nSaved successfully   \n"+name+"   "+number);
	}
	public int makeCall()
	{
		int num=1234567890;		
		return num;
	}
	void sendMsg()
	{
		String msg="hi hello vanakkam";
		System.out.println("\nMessage successfully sent...\n"+msg);
	}
	
}

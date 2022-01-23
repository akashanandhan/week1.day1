package week1.day1;

public class Mobile {
	/*Create  class
	- Mobile (methods: sendMsg, makeCall, saveContact)
	- Create Object for Mobile and call all the methods*/

	public void sendMsg(String msg){
		System.out.println("Your Message: \n\t"+msg);
	}
	public void makeCall(long mobNo){
		System.out.println("Calling Number: \n\t"+mobNo);
	}
    public void saveContact(String name){
		System.out.println("Saved Contact: \n\t"+name);
	}
    public static void main(String[] args) {
    	Mobile mob = new Mobile();
    	mob.sendMsg("Hi ilaya bharathi");
    	mob.makeCall(9876546654L);
    	mob.saveContact("akash");
	}

}


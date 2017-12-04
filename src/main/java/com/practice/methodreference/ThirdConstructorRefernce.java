package com.practice.methodreference;

public class ThirdConstructorRefernce {

	public static void main(String[] args) {
		
		Messageable messageable = Message::new;
		messageable.getMessage("this is the new message");
		
	}
}



interface Messageable{  
    Message getMessage(String msg);  
}  
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
package org.kevin;

public class EmailServiceImpl implements MessageService{
    public void sendMessage(String message){
        System.out.println("Sending email : " + message);
    }
}

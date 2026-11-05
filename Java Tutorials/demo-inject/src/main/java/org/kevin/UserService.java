package org.kevin;

public class UserService {
    private final MessageService messageService;

    public UserService(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(String message){
        messageService.sendMessage(message);
    }
}
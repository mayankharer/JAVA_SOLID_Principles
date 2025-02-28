package solid_principles.dependancyInversionPrinciple;

public class Notification {
    private MessageService messageService;

    public Notification(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(String message){
        messageService.sendMessage(message);
    }
}

package DecoratorPattern;

class SMSNotifierDecorator extends NotifierDecorator {
    private String smsMessage;

    public SMSNotifierDecorator(Notifier notifier, String smsMessage) {
        super(notifier);
        this.smsMessage = smsMessage;
    }

    public void send() {
        super.send();
        System.out.println("SMS sent: " + smsMessage);
    }
}

package DecoratorPattern;



class EmailNotifier implements Notifier {
    private String emailMessage;

    public EmailNotifier(String emailMessage) {
        this.emailMessage = emailMessage;
    }

    public void send() {
        System.out.println("Email sent: " + emailMessage);
    }
}
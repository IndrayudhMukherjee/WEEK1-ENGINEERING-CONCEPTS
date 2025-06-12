package DecoratorPattern;
class SlackNotifierDecorator extends NotifierDecorator {
    private String slackMessage;

    public SlackNotifierDecorator(Notifier notifier, String slackMessage) {
        super(notifier);
        this.slackMessage = slackMessage;
    }

    public void send() {
        super.send();
        System.out.println("Slack message sent: " + slackMessage);
    }
}

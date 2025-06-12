package DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier("Adios...welcome to our newsletter!");
        Notifier withSMS = new SMSNotifierDecorator(baseNotifier, "You've got a new notification:))");
        Notifier withSlack = new SlackNotifierDecorator(withSMS, "Team update: Meeting at 3 PM. Do not be Late...");

        withSlack.send();
    }
}


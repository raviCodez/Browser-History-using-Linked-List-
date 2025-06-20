//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        // Simulate visiting pages
        browserHistory.homePage("google.com");
        browserHistory.vist("stackoverflow.com");
        browserHistory.vist("github.com");

        // Go back two steps
        Node current = browserHistory.back(2);
        System.out.println("Current page after going back: " + current.data);

        // Go forward one step
        current = browserHistory.forward(1);
        System.out.println("Current page after going forward: " + current.data);

        // Visit a new page
        current = browserHistory.vist("reddit.com");
        System.out.println("Current page after visiting new page: " + current.data);
    }
}
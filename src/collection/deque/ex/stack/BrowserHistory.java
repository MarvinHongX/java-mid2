package collection.deque.ex.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();

    public void visitPage(String url) {
        history.push(url);
    }
    public String goBack() {
        history.pop();
        return history.peek();
    }

}

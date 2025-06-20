public class BrowserHistory {
    public Node head;
    public Node tail;
    public Node current;

    public Node homePage(String url){
        Node newNode= new Node(url);
        current=newNode;
        if(head==null) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next=newNode;
            newNode.back = tail;
            tail = newNode;
        }
        return current;
    }

    public Node vist(String url){
        Node newNode= new Node(url);
        current.next=newNode;
        newNode.back = current;
        current=current.next;

        return current;
    }

    public Node back(int steps){
        while(steps>0){
            if(current.back!=null){
                current=current.back;
                steps--;
            }
            else{
                break;
            }
        }

        return current;

    }

    public Node forward(int steps){
        while(steps>0){
            if(current.next!=null) {
                current = current.next;
                steps--;
            }
            else{
                break;
            }
        }
        return current;
    }
}
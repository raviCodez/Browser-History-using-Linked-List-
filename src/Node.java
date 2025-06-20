import  java.utlil.ArrayList;
import java.util.List;
public class Node {
    String data;
    Node next;
    Node back;

    Node (){
        data="0";
        next=null;
        back=null;
    }
    Node(String val) {
        data = val;
        next = null;
        back=null;
    }

}

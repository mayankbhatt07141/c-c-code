//fucntion to detect loop in java

public class Dectctloop {
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        if(head==null){
            return false;
        }
        if(head.next==null){
            return false;
        }
        do{
         slow=slow.next;
         fast=fast.next.next;
        }
        while(slow!=fast&&fast!=null&&fast.next!=null);
        if(slow==fast){
            return true;
        }
        
        return false;
    }
}

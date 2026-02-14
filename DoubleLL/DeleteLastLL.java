import java.util.*;
class Node{
    int val;
    Node next;
    Node prev;
    public Node(int val){
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
public class DeleteLastLL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        Node head=createLL(l);
        System.out.print("The linked list has been created: ");
        printLL(head);
        System.out.println();
        System.out.print("Linked List after deleting last node: ");
        head=deleteHead(head);
        printLL(head);
        sc.close();
    }
    public static Node deleteHead(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
        return head;
    }
    public static Node createLL(List<Integer> l){
        int n=l.size();
        if(n==0) return null;
        Node head=new Node(l.get(0));
        Node curr=head;
        for(int i=1;i<n;i++){
            Node nextNode=new Node(l.get(i));
            curr.next=nextNode;
            nextNode.prev=curr;
            curr=nextNode;
        }
        return head;
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.next==null) System.out.println(temp.val);
            else System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    
}

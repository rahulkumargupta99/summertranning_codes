import java.util.LinkedList;

public class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
    public static class Linked {
        Node head;
        Node tail;

        Linked() {
            this.head = null;
            this.tail = null;
        }

        public void add(int data) {
            Node curr = new Node(data);
            if (head == null) {
                head = curr;
                tail = curr;
            } else {
                tail.next = curr;
                tail = curr;
            }
        }
            public int sum(){
                int s= 0;
                Node curr = head;
                while(curr!=null){
                    s+=curr.data;
                    curr = curr.next;
                }
                return s;
            }
            public int findL(int d){
                Node curr = head;
                while(curr!=null){
                    if(curr.data==d)return 0;
                    curr = curr.next;
                }
                return -1;
            }
        }
       public static void main(String[] args) {
       LinkedList<Integer> ll =new LinkedList<>();
       ll.add(5);
       ll.add(6);
       ll.add(7);
       System.out.println(ll.sum());
    //    System.out.println();
       
    }
}

import java.util.LinkedList;

public class PeakPop {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.push(70);
        list.push(30);
        list.push(56);
        System.out.println(list);
        System.out.println(list.peek());// top element of list
        System.out.println(list.pop());// to remove an element
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list);
    }
}

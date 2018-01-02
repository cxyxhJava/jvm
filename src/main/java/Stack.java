/**
 * Created by yangxb on 2018/1/2.
 */

/**
 * 栈  先入后出
 */
public class Stack {
    public Node head;
    public Node current;


    /**
     * 入栈
     * @param data
     */
    public void push(String data){
        if (head==null){
            head = new Node(data);
            current = head;
        }else {
            //替换操作,原current上的node变成新node的前置节点   新node变成当前current
            Node node = new Node(data);
            node.pre = current;
            current = node;
        }
    }

    /**
     * 出栈
     * @return
     */
    public Node pop(){
        if (current==null){
            return null;
        }
        //返回当前节点,将上一节点设置为当前节点
        Node node = current;
        current = current.pre;
        return node;

    }

    
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);
        System.out.println(stack.pop().data);

    }

}


/**
 * 节点对象
 */
class Node{
     String data;
     Node pre;

    public Node(String data) {
        this.data = data;
    }
}



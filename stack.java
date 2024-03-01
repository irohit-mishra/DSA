import java.util.Stack;

public class stack{
public static void main(String[] args) {
    Stack<String> myStack = new Stack<String>();

    myStack.push("JAVA");
    myStack.push("Python");
    myStack.push("Ruby");
    myStack.push("Scala");

    //myStack.pop(); //will remove scala because of LIFO

    //String myFavlang = myStack.pop();

    //System.out.println(myStack.peek()); //used to see the top item
    //System.out.println(myFavlang);
    System.out.println(myStack.search("JAVA"));

}
}
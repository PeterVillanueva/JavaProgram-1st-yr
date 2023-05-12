import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");

		// stack.pop();

		// System.out.println(stack.empty());
		// String myFavGame = stack.pop();
		// System.out.println(stack.peek());
		// System.out.println(myFavGame);

		// System.out.println(stack.search("ML"));

		System.out.println(stack);

	}

}

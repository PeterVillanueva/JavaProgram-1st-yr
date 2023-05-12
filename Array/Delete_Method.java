package Array;

public class Delete_Method {

	public static void main(String[] args) {
		
		  StringBuffer buff = new StringBuffer("Java lang package");//index
	      System.out.println("buffer = " + buff);
	 
	      // deleting characters from index 4 to index 9
	      buff.delete(4, 9);
	      System.out.println("After deletion = " + buff);
	}
}

//Output: 
//buffer = Java lang package
//After deletion = Java Package
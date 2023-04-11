import java.util.ArrayList;

public class Main {

	public Main() {
	
	}

	public static void main(String[] args) {	
		
		ArrayList<ArrayList<String>> data = Loader.loadData();
		
		TreeNode solution = new TreeNode(data, Loader.loadHeader(), null);
		solution.id3();
		solution.print();
		
		
		
		
		
		
	}
	
	

}

import java.util.ArrayList;

public class Main {

	public Main() {
	
	}

	public static void main(String[] args) {	
		
		ArrayList<ArrayList<String>> data = Loader.loadData();
		
		TreeNode solution = new TreeNode(data, Loader.loadHeader(), null);
		solution.id3();
		
		System.out.println("--------------------");
		System.out.println(" Arbol de decision ");
		System.out.println("--------------------\n");
		
		solution.print();
		
		System.out.println("\n--------------------");
		System.out.println("  Salida esperada ");
		System.out.println("--------------------\n");
		
		solution.calculate(data.get(0), Loader.loadHeader());
		solution.calculate(data.get(1), Loader.loadHeader());
		solution.calculate(data.get(2), Loader.loadHeader());
		solution.calculate(data.get(3), Loader.loadHeader());
		solution.calculate(data.get(4), Loader.loadHeader());
		solution.calculate(data.get(5), Loader.loadHeader());
		solution.calculate(data.get(6), Loader.loadHeader());
		solution.calculate(data.get(7), Loader.loadHeader());
		solution.calculate(data.get(8), Loader.loadHeader());
		solution.calculate(data.get(9), Loader.loadHeader());
		solution.calculate(data.get(10), Loader.loadHeader());
		solution.calculate(data.get(11), Loader.loadHeader());
		solution.calculate(data.get(12), Loader.loadHeader());
		solution.calculate(data.get(13), Loader.loadHeader());


		
		
		
		
	}
	
	

}

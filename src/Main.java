
public class Main {

	public Main() {
	
	}

	public static void main(String[] args) {	
		
		TreeNode padre = new TreeNode("Padre");
		
		TreeNode hijo1 = new TreeNode("Hijo 1");
		TreeNode hijo2 = new TreeNode("Hijo 2");
		
		hijo1.appendChild(new TreeNode("Hijo 11"));
		
		TreeNode hijo12 = new TreeNode("Hijo 12");
		hijo12.appendChild(new TreeNode("Hijo 121"));
		
		hijo1.appendChild(hijo12);
		hijo1.prependChild(new TreeNode("Hijo 13"));
		
		hijo2.appendChild(new TreeNode("Hijo 21"));
		
		padre.appendChild(hijo1);
		padre.appendChild(hijo2);
		
		padre.dfs();

	}

}

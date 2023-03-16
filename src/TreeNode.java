import java.util.LinkedList;

public class TreeNode {
	
	private TreeNode parent;
	private LinkedList<TreeNode> children;
	private String value;

	public TreeNode(String valor) {
		this.children = new LinkedList<TreeNode>();
		this.value = valor;
	}
	
	public void appendChild(TreeNode child) {
		child.parent = this;
		this.children.add(child);
	}
	
	public void prependChild(TreeNode child) {
		child.parent = this;
		this.children.addFirst(child);
	}
	
	public String getValue() {
		return this.value;
	}
	
	public void dfs() {
		dfs(this, 0);
	}
	
	private void dfs(TreeNode node, int level) {
		
		String space = "";
		for (int i = 0 ; i < level; i++) {
			space += "      ";
		}
		
		String lines = "-";
		for (int i = 0; i < node.getValue().length(); i++)
			lines += "-";
	
		System.out.println(space + node.value);

		for (TreeNode t : node.children)
			dfs(t, level + 1);
		
	}
	

}

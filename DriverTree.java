
public class DriverTree {

	public static void main(String[] args) {
		Node rootnode = new Node("Outlook",NodeType.ROOTNODE);
		Tree tree = new Tree();
		tree.setRoot(rootnode);
		
		Node BranchNode = new Node("Sunny",NodeType.BRANCH);
		rootnode.addChild(BranchNode);
		
		
		Node attributeNode = new Node("Humidity",NodeType.LEAFNODE);
		BranchNode.addChild(attributeNode);
		
		BranchNode = new Node("High",NodeType.BRANCH);
		attributeNode.addChild(BranchNode);
		
		
		Node newattributeNode = new Node("Normal",NodeType.BRANCH);
		attributeNode.addChild(newattributeNode);
		
		
		Node leafnode = new Node("No",NodeType.LEAFNODE);
		BranchNode.addChild(leafnode);
		
		leafnode = new Node("Yes",NodeType.LEAFNODE);
		newattributeNode.addChild(leafnode);
		
		
		
		
		attributeNode = new Node("Overcast",NodeType.BRANCH);
		rootnode.addChild(attributeNode);
		leafnode = new Node("Yes",NodeType.LEAFNODE);
		attributeNode.addChild(leafnode);
		
		
		BranchNode = new Node("Rain",NodeType.BRANCH);
		rootnode.addChild(BranchNode);
		
		
		attributeNode = new Node("Wind",NodeType.LEAFNODE);
		BranchNode.addChild(attributeNode);
		
		BranchNode = new Node("Strong",NodeType.BRANCH);
		attributeNode.addChild(BranchNode);
		
		
		newattributeNode = new Node("Weak",NodeType.BRANCH);
		attributeNode.addChild(newattributeNode);
		
		
		leafnode = new Node("No",NodeType.LEAFNODE);
		BranchNode.addChild(leafnode);
		
		leafnode = new Node("Yes",NodeType.LEAFNODE);
		newattributeNode.addChild(leafnode);
		
		//node = new Node("Outlook");
		//tree.printTree(tree.getRoot(), 0);
		//System.out.println("----------------------------");
		//tree.printTree2(tree.getRoot(), "-");
		
		rootnode.print("",true);

	}

}

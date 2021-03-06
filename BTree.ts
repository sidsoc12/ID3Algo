public class BTree
{
    // instance variables - replace the example below with your own
    private Node root;
    private Node currentNode;
    /**
     * Constructor for objects of class BTree
     */
    public BTree()
    {
        root = null;
    }
    public boolean search(int data){
        return search(root,data);
    }
    private boolean search(Node node, int data){
        if(node.getData() == data)
            return true;
        if(node.getLeft() != null)
        {
            if(search(node.getLeft(),data))
                return true;
            if(node.getRight() != null)
                if(search(node.getRight(),data))
                    return true;
            return false; 
        }
        return false;
    }
    public void printInOrder(){
        root.printInorder(root);
    }
    public void printPreOrder(){
        root.printPreorder(root);
    }
    public void printPostOrder(){
        root.printPostorder(root);
    }
    public Node getRoot(){
        return root;
    }
    public void setRoot(Node root){
        this.root = root;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public int countNodes()
    {
        return countNodes(root);
        
    }
    public int countNodes(Node node){
        int count = 1;
        if(node == null){
            return 0;
        }
        else{
            count += countNodes(node.getLeft());
            count += countNodes(node.getRight());
            return count;
        }
    }
    public void print(){
        root.print();
    }
    public Node getCurrent(){
        return currentNode;
    }
    public void setCurrent(Node node){
        this.currentNode = node;
    }
    
   
}

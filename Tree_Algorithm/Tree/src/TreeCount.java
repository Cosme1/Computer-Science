import java.util.*;

public class TreeCount {

    private TreeNode root;

    public TreeCount(){
        root = null;
    }

    public int numNodes() {
        return numNodes(root);
    }

    public int numNodes(TreeNode node) {
        if(node == null) {
            return 0;
        }

        else {
            return 1 + numNodes(node.getLeft()) + numNodes(node.getRight());
        }
    }

    public int numLeaves(){
        return numLeaves(root);
    }

    public int numLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.getLeft() == null || node.getRight() == null){
            return 1;
        }

        else {
            return numLeaves(node.getLeft()) + numLeaves(node.getRight());
        }
    }

    public int numParents(){
        return numParents(root);
    }

    public int numParents(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.getLeft() != null || node.getRight() != null){
            return 1;
        }

        else {
            return numParents(node.getLeft()) + numParents(node.getRight());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializeandDeserializeTree;

/**
 *
 * @author Anand
 */
public class Test {
    public static void main(String[] args) {
        Codec tree = new Codec();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(22);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(12);
        tree.root.left.right.left = new TreeNode(10);
        tree.root.left.right.right = new TreeNode(14);
         String serialized = tree.serialize(tree.root);
        System.out.println("Serialized view of the tree:");
        System.out.println(serialized);
        System.out.println();
 
        // Let us deserialize the stored tree into root1
        TreeNode t = tree.deserialize(serialized);
 
        System.out.println(t.val);
           }
    }



package binarytreeview;

import javax.swing.JApplet;

public class DisplayBinaryTree extends JApplet {
    public DisplayBinaryTree()
    {
        add(new BinaryTreeView(new BinaryTree<Integer>()));
    }
}

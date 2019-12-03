
 /**
 * Write a description of class Main here.
 *
 *@author (your name)
 * @version (a version number or a date)
 */
public class BST<E extends Comparable<E>> extends AbstractTree<E>
{
    private int size = 0;
    
    public BST(){}

    
    public static void main(String[] args)
    {
        BST bst = new BST();
    }
    @Override /** Inorder traversal from the root*/
    public void inorder() {
    }

    @Override /** Postorder traversal from the root */
    public void postorder() {
    }

    @Override /** Preorder traversal from the root */
    public void preorder() {
    }

    @Override /** Return true if the tree is empty */
    public boolean isEmpty() {
        return false;
    }
    @Override
    public int getSize(){}
    @Override
    public boolean delete(E e){}
    @Override
    public boolean search(E e){}
    @Override
    public boolean insert(E e){}
}
abstract class AbstractTree<E> implements Tree<E> {
    @Override /** Inorder traversal from the root*/
    public void inorder() {
    }

    @Override /** Postorder traversal from the root */
    public void postorder() {
    }

    @Override /** Preorder traversal from the root */
    public void preorder() {
    }

    @Override /** Return true if the tree is empty */
    public boolean isEmpty() {
    }
    @Override
    public int getSize(){}
    @Override
    public boolean delete(E e){}
    @Override
    public boolean search(E e){}
    @Override
    public boolean insert(E e){}
}
interface Tree<E> extends Iterable<E> {
    /** Return true if the element is in the tree */
    public boolean search(E e);

    /** Insert element o into the binary tree
     * Return true if the element is inserted successfully */
    public boolean insert(E e);

    /** Delete the specified element from the tree
     * Return true if the element is deleted successfully */
    public boolean delete(E e);

    /** Inorder traversal from the root*/
    public void inorder();

    /** Postorder traversal from the root */
    public void postorder();

    /** Preorder traversal from the root */
    public void preorder();

    /** Get the number of nodes in the tree */
    public int getSize();

    /** Return true if the tree is empty */
    public boolean isEmpty();
}


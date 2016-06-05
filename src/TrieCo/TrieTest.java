package TrieCo;

/**
 * Created by voidhug on 16/6/4.
 */
public class TrieTest {

    public static void main(String[] args) {
        TrieTree tree = new TrieTree("test");
        tree.insert("word");
        tree.insert("word");
        tree.insert("hello");
        tree.insert("hi");
        System.out.println("word " + tree.searchFre("word"));
        System.out.println("hello " + tree.searchFre("hello"));
        System.out.println("hi " + tree.searchFre("hi"));
        System.out.println("hell " + tree.searchFre("hell"));
        System.out.println("hellt " + tree.searchFre("hellt")); // qinshimingyuezhijunlintianxia
    }
}

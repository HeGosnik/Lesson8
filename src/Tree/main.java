package Tree;

import Tree.Tree;

public class main {
    static {
        System.out.println("very first time");
    }

    public static void main(String[] args) {
        addTree();
        System.out.println(Tree.TREE_COUNT);
        addTree2();
        System.out.println(Tree.TREE_CUNT);
        Garden garden = new Garden();
        System.out.println(garden.getTreeCount());

        {
            int i = 0;
        }
        {
            int i = 1;
        }
    }


    private static void addTree() {
        Tree tree = Tree.TreeHolder.getInstance();
        Tree.TREE_COUNT++;
    }

    private static void addTree2() {
        Tree tree2 = Tree.TreeHolder.getInstance();
        Tree.TREE_COUNT++;
    }
}

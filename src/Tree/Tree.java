package Tree;

public class Tree {
    public static int TREE_CUNT;
    public static int TREE_COUNT = 0;
    private String treeName = "tree";

    public static void printTreeCount() {
        System.out.println(TREE_COUNT);
        //  System.out.println(treeName);
    }
    private Tree(){

    }

    static class TreeHolder {
        private static final Tree INSTANCE = new Tree();

        public static Tree getInstance() {
            return INSTANCE;
        }
    }


    static {
        System.out.println("we start doing it" + TREE_CUNT);
    }


    public String getTreeName() {
        return treeName + TREE_COUNT;
    }
}

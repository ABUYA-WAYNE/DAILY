
public class Main {

    public static void main(String[] args) {
        GameLevel level1 = new GameLevel("Forest Temple", Difficulty.EASY);
        GameLevel level2 = new GameLevel("Dragon’s Den", Difficulty.HARD);

        level1.printLevelInfo();
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");
        level2.printLevelInfo();

        if (level2.getDifficulty() == Difficulty.HARD) {
            System.out.println("brace your self this one is tough");
        }
    }
}

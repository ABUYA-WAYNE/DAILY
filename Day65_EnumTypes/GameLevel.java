public class GameLevel {
    private String levelName;
    private Difficulty difficulty;

    public GameLevel(String levelName, Difficulty difficulty) {
        this.levelName = levelName;
        this.difficulty = difficulty;
    }

    public void printLevelInfo() {
        System.out.println("Level: " + levelName);
        System.out.println("Difficulty: " + difficulty);
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}

public class video implements playable {
    public boolean isPlaying = false;

    @Override
    public void play() {
        if (isPlaying) {
            isPlaying = true;
            System.out.println("video started playing");
        } else {
            System.out.println("video is already playing");
        }
    }

    @Override
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("video paused");
        } else {
            System.out.println("video is already paused");
        }
    }
}

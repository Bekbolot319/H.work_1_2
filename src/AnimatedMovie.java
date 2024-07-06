public class AnimatedMovie extends Movie {
    private String animationStudio;


    public AnimatedMovie(String title, GenreEnum genre, Director director,
                         int duration, String animationStudio) {
        super(title, genre, director, duration);
        this.animationStudio = animationStudio;
    }

    public String getAnimationStudio() {
        return animationStudio;
    }

    @Override
    public String toString() {
        return
                "AnimationStudio=" + animationStudio;
    }

    public void play(String language) {
        System.out.println("Playing the animated movie: " +
                getTitle() + " in " + language + " from " + animationStudio);
    }

    public void play(String language, int subtitles) {
        System.out.println("Playing the animated movie: " +
                "" + getTitle() + " in " + language + " with " + subtitles + " subtitles from " + animationStudio);
    }

}

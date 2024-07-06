public final class Documentary extends AnimatedMovie{
    private boolean isBaseOnTrueStory;

    public Documentary(String title, GenreEnum genre, Director director, int duration, String animationStudio,boolean isBaseOnTrueStory) {
        super(title, genre, director, duration, animationStudio);
        this.isBaseOnTrueStory = isBaseOnTrueStory;
    }

    public boolean isBaseOnTrueStory() {
        return isBaseOnTrueStory;
    }


    @Override
    public String toString() {
        return
                "IsBaseOnTrueStory=" + isBaseOnTrueStory ;
    }

    @Override
    public void play(String language) {
        System.out.println("Playing the documentary: " +
                getTitle() + " in " + language );

    }
}


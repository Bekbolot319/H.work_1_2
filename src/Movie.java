public class Movie {
   private String title;
   private GenreEnum genre;
   private Director director;
   private int duration;// in minutes

    public Movie( String title,GenreEnum genre,Director director, int duration) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public GenreEnum getGenre() {
        return genre;
    }
    public Director getDirector() {
        return director;

    }
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return
                "Director=" + director +
                ", Ttle='" + title + '\'' +
                ", Genre=" + genre +
                ", Duration=" + duration ;
    }
}



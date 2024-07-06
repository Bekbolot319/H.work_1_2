//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Director director1 = new Director("Ridley Scott", 45);
        Director director2 = new Director("James Cameron", 58);


        Movie movie = new Movie("Kingdom of Heaven", GenreEnum.ACTION, director1, 153);

        AnimatedMovie animatedMovie = new AnimatedMovie("Avatar", GenreEnum.ANIMATION, director2, 142,
                "Studio Universal");
        AnimatedMovie animatedMovie2 = new AnimatedMovie("Titanik", GenreEnum.ANIMATION, director2, 142,
                "Studio Universal");

        Documentary documentary = new Documentary("Kurmanjan Datka", GenreEnum.DOCUMENTARY,
                new Director("Sadik Sher-Niyaz", 25), 90, "Kyzyl",true);

        animatedMovie.play("English");
        animatedMovie2.play("Kyrgyz", 21);
        documentary.play("Russian");

        System.out.println(movie);
        System.out.println(animatedMovie);
        System.out.println(documentary);


    }
}
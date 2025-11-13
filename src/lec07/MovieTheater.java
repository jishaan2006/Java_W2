package lec07;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String n, double r, int y) {
        name = n;
        rating = r;
        releaseYear = y;
    }

    void display() {
        System.out.println("Name: "+name+", Rating: "+rating+", Year: "+releaseYear);
    }
}
public class MovieTheater {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers: Endgame", 8.4, 2019);
        Movie m2 = new Movie("Tenet", 7.3, 2020);
        Movie m3 = new Movie("Dune", 8.1, 2021);
        Movie m4 = new Movie("Spider-Man: No Way Home", 8.3, 2021);
        Movie m5 = new Movie("Oppenheimer", 8.8, 2023);

        System.out.println("Movie after 2020:");
        Movie[] movies={m1,m2,m3,m4,m5};

        for(Movie a:movies){
            if(a.releaseYear>2020){
                a.display();
            }
        }
    }
}

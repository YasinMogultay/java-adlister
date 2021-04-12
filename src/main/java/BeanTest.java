import java.time.LocalTime;
import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album(1,"Michael Jackson","example",2010,"genreee",45);
        Quotes q1 = new Quotes(1,"CONTENT asdasdadasdasd 1","author1");
        Quotes q2 = new Quotes(2,"CONTENT asdasdasdas 2","author2");
        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(q1);
        quotes.add(q2);

        for (Quotes quote : quotes){
            System.out.printf("ID:%s Content:%s Author Name:%s %n",quote.getId(),quote.getAuthor(),quote.getContent());
        }
    }
}

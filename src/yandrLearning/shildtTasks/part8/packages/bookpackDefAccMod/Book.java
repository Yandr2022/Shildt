package yandrLearning.shildtTasks.part8.packages.bookpackDefAccMod;

public class Book {
    private String title;
    private String author;
    private int pubDate;

     Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}

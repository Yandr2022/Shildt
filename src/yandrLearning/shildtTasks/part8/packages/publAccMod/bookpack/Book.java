package yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    public Book(String title, String author, int pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
    }
}

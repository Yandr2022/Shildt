package yandrLearning.shildtTasks.part8.packages.protectAccMod.bookPackText;

public class ExtBook extends yandrLearning.shildtTasks.part8.packages.protectAccMod.BookPack.Book{
    private String publisher;

    public ExtBook(String title, String author, int pubDate, String publisher) {
        super(title, author, pubDate);
        this.publisher = publisher;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(publisher);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }

}

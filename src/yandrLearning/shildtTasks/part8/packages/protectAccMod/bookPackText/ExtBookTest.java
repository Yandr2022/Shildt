package yandrLearning.shildtTasks.part8.packages.protectAccMod.bookPackText;


public class ExtBookTest {
    public static void main(String[] args) {
        ExtBook[] books = {new ExtBook("Java: A Beginner's Guide 7th edition", "Herbert Schildt", 2018,"Williams")
                , new ExtBook("Java: A Beginner's Guide 10th edition", "Herbert Schildt", 2018,"Williams")
                , new ExtBook("The Art of Java Programming", "Herbert Schildt", 2005,"Dialectics")
                , new ExtBook("Red Storm Rises", "Tom Clancy", 2006, "Exmo")
                , new ExtBook("On the Road", "Jack Kerouac", 2012, "Alphabet")};
        System.out.println("Books by Herbert Schildt:");
        for (ExtBook book : books) {
            System.out.print(book.getAuthor().equals("Herbert Schildt")?book.getTitle()+", "+book.getPubDate()+"\n":"");
            //    book.title = "";error - protected
        }

    }
}

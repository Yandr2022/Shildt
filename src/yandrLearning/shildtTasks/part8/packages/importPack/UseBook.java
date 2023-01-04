package yandrLearning.shildtTasks.part8.packages.importPack;

import yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book;

public class UseBook {
    public static void main(String[] args) {
        Book[] books = {new Book("Java: A Beginner's Guide 7th edition", "Herbert Schildt", 2018)
                , new Book("Java: A Beginner's Guide 10th edition", "Herbert Schildt", 2018)
                , new Book("The Art of Java Programming", "Herbert Schildt", 2005)
                , new Book("Red Storm Rises", "Tom Clancy", 2006)
                , new Book("On the Road", "Jack Kerouac", 2012)};
        for (Book book : books) {
            book.show();
        }
    }
}

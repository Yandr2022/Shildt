package yandrLearning.shildtTasks.part8.packages.publAccMod.bookpackText;


public class bookPackText {
    public static void main(String[] args) {
        yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book[] books
                = {new yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book("Java: A Beginner's Guide 7th edition", "Herbert Schildt", 2018)
                , new yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book("Java: A Beginner's Guide 10th edition", "Herbert Schildt", 2018)
                , new yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book("The Art of Java Programming", "Herbert Schildt", 2005)
                , new yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book("Red Storm Rises", "Tom Clancy", 2006)
                , new yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book("On the Road", "Jack Kerouac", 2012)};
        for (yandrLearning.shildtTasks.part8.packages.publAccMod.bookpack.Book book : books) {
            book.show();
        }
    }
}


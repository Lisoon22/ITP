public class Book extends Media{
    String author;
    String title;
    String publisher;
    public Book(String author, String title, String publisher) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String toString(){
        return "The " + this.getClass().getSimpleName() + "`s title is " + this.title + ", the author is " + this.author + ", the publisher is " + this.publisher;
    }
}

public class Video extends Media{
    String author;
    String title;
    public Video(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return "The " + this.getClass().getSimpleName() + "`s title is " + this.title + ", the author is " + this.author;
    }
}

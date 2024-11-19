public class Newspaper extends Media {
    String title;
    String date;
    public Newspaper(String title, String date) {
        this.title = title;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String toString() {
        return "The " + this.getClass().getSimpleName() + "`s title is " + this.title + ", the date is " + this.date;
    }
}

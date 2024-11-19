//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Media[] a = new Media[10];
        a[0] = new Book("ggg", "rerer", "sdsfdsf");
        a[1] = new Video("12313", " 23123");
        for(int i = 0; i < 2; i++){
            System.out.println(a[i].toString());
        }
    }
}
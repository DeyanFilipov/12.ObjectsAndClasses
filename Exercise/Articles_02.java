package ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class Articles_02 {
    private String title;
    private String content;
    private String author;

    public Articles_02(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit(String newContent) {
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void rename(String newTitle) {
        this.title = newTitle;
    }
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    public String getAuthor() {
        return this.author;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articleArr = articleData.split(", ");
        Articles_02 article = new Articles_02(articleArr[0], articleArr[1], articleArr[2]);


        int rotation = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rotation; i++) {
            String command = scanner.nextLine();
            if (command.contains("Rename")) {
                article.rename(command.split(": ")[1]);
            } else if (command.contains("Edit")) {
                article.edit(command.split(": ")[1]);
            } else if (command.contains("ChangeAuthor")) {
                article.changeAuthor(command.split(": ")[1]);
            }
        }
        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
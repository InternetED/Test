package ui;

public class TextView implements View {
    private String title;

    public TextView() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void show() {
        System.out.println("I am TextView, text =" + title);
    }
}

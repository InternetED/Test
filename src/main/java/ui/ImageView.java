package ui;

public class ImageView  implements  View{
    private String thumbnail;

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public void show() {
        System.out.println("I am ImageView, thumbnail =" + thumbnail);
    }
}

import ui.Container;
import ui.ImageView;
import ui.TextView;

public class DisplayUI {
    private Container container = new Container();
    private TextView textView;
    private ImageView imageView;

    public void launchUI() {

        textView = new TextView();
        imageView = new ImageView();
        textView.setTitle("標題");
        imageView.setThumbnail("縮圖");
        container.addView(textView);
        container.addView(imageView);
    }
    // 點擊觸發獲取資料
    public void touchView(){
        System.out.println("點擊觸發獲取資料");
        RemoteFetcher remoteFetcher = new RemoteFetcher();

        remoteFetcher.fetchData(new RemoteFetcher.HttpCallback<Data>() {
            @Override
            public void onSuccess(Data data) {
                System.out.println("成功返回資料");
                textView.setTitle(data.getTitle());
                imageView.setThumbnail(data.getThumbnail());
                showUI();
            }

            @Override
            public void onFailure(Exception exception) {
                System.out.println(exception);
            }
        });
    }
    public void showUI(){
        container.display();
    }

}

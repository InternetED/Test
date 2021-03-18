import java.util.ArrayList;
import java.util.List;

public class RemoteFetcher {
    private Thread thread;

    public void fetchData(HttpCallback<Data> httpCallback) {
        thread = new Thread(() -> {
            // 耗時任務
            try {
                System.out.println("正在加載中．．．");
                Thread.sleep(3000);

                Data data = new Data("新標題","新縮圖");
                httpCallback.onSuccess(data);

            } catch (InterruptedException e) {
                e.printStackTrace();
                httpCallback.onFailure(e);
            }
        });
        thread.start();
    }


    public interface HttpCallback<T> {

        void onSuccess(T data);


        void onFailure(Exception throwable);

    }
}

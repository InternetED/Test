package ui;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<View> canvas = new ArrayList<>();

    public void addView(View view) {
        canvas.add(view);
    }

    public void display() {
        for (View canva : canvas) {
            canva.show();
        }
    }
}

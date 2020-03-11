package tw.org.iii.brad;
//test push again
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R是一個類別, R is a class, resource->layout->activity_main
        tv = findViewById(R.id.textView);
        //找到在xml中設置的標籤,指派給變數tv,tv需事先宣告如上方private TextView
    }

    public void click(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 6){
            set.add((int)(Math.random()*49+1));
        }
        Log.v("brad",set.toString());
        //Log是常用除錯方式,配合Logcat視窗選擇範圍,右方下拉式選edit,命名並在Log tag輸入此處設的字串
        tv.setText(set.toString());
    }
}

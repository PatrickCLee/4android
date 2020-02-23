package tw.org.iii.brad;

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

        tv = findViewById(R.id.textView);
    }

    public void click(View view) {
        HashSet<Integer> set = new HashSet<>();
        while (set.size() < 6){
            set.add((int)(Math.random()*49+1));
        }
        //Log.v("brad",set.toString());
        tv.setText(set.toString());
    }
}

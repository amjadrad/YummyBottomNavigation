package ir.ffaa00.yummybottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ir.ffaa00.yummy_bottomnav.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmoothBottomBar smoothBottomBar = findViewById(R.id.bottomBar);
//        ((TextView)smoothBottomBar.getItemAt(0).getView()).setText("sf");
    }
}

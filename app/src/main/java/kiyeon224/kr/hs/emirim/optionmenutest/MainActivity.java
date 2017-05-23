package kiyeon224.kr.hs.emirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout)findViewById(R.id.linear);
        but = (Button)findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.item_blue:
                linear.setBackgroundColor(Color.rgb(220, 220, 255));
                return true;
            case R.id.item_pink:
                linear.setBackgroundColor(Color.rgb(255, 220, 220));
                return true;
            case R.id.item_yellow:
                linear.setBackgroundColor(Color.rgb(255, 255, 80));
                return true;
            case R.id.item_but_rotate:
                //but.setRotation(45);
                but.setRotation(but.getRotation() + 45);
                return true;
            case R.id.item_but_size:
                //but.setScaleX(10);
                //but.setScaleY(10);
                but.setScaleX(but.getScaleX() * 2);
                return true;
        }
        return false;
    }
}

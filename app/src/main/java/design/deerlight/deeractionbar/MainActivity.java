package design.deerlight.deeractionbar;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import design.deerlight.example.DeerActionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();

        DeerActionBar.with(this)
                .setTitle(R.string.app_name)
                .setTitleColor(android.R.color.white, null)
                .setBackgroundDrawable(getDrawable(R.color.colorAccent))
                .into(actionBar);

        findViewById(R.id.change_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeerActionBar.with(MainActivity.this)
                        .setTitle("標題已改變")
                        .setTitleColor(R.color.colorAccent, null)
                        .setBackgroundDrawable(android.R.color.white)
                        .into(actionBar);
            }
        });

    }
}

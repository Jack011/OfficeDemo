package com.jackson.officedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button clickBtn;
    ImageView imageOne,imageTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickBtn= (Button) findViewById(R.id.click_btn);
        imageOne=(ImageView) findViewById(R.id.imageOne);
        imageTwo=(ImageView) findViewById(R.id.imageTwo);
        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageOne.setImageResource(R.drawable.d);
                Toast.makeText(MainActivity.this, "我被点击了，啊，哈哈哈哈哈啊哈哈", Toast.LENGTH_SHORT).show();
            }
        });

        imageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageTwo.setImageResource(R.drawable.c);
            }
        });
    }


}

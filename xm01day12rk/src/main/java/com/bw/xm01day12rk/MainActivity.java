package com.bw.xm01day12rk;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_dian;
    private TextView text_dian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_dian=findViewById(R.id.btn_dian);

        //给textView设置点击事件
        text_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "点击了textView", Toast.LENGTH_SHORT).show();
            }
        });
        btn_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator translationX = ObjectAnimator.ofFloat(btn_dian, "translationX", 300);
                ObjectAnimator translationY = ObjectAnimator.ofFloat(btn_dian, "translationY", 900);

                AnimatorSet set=new AnimatorSet();
                set.playTogether(translationX,translationY);
                set.setDuration(3000);
                set.start();
            }
        });
    }
}

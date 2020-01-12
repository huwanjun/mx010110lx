package com.bw.movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tencent.mm.opensdk.constants.Build;

import static com.bw.movie.MyWXAppdID.api;

public class MainActivity extends AppCompatActivity {
    private TextView text_dian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       text_dian=findViewById(R.id.text_dian);
       text_dian.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              //// MyWXAppdID.shareText("aaaa");

               if (api.getWXAppSupportAPI() >= Build.TIMELINE_SUPPORTED_SDK_INT) {
                   MyWXAppdID.setPen("真机测试");
               }
           }
       });


    }
}

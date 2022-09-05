package com.cms.dw202app_all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ex5WebViewActivity extends AppCompatActivity {

    TextView tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5_webview);
        tvMsg = (TextView)findViewById(R.id.tvMsg);

        findViewById(R.id.btnGoogle).setOnClickListener(mClick);
        findViewById(R.id.btnYoutube).setOnClickListener(mClick);
        findViewById(R.id.btnNaver).setOnClickListener(mClick);
    }

    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.btnGoogle:
                    tvMsg.setText("구글 접속!");
                    Intent act1 = new Intent(Ex5WebViewActivity.this,Ex5WebViewExGoogle.class);
                    startActivity(act1);
                    break;
                case R.id.btnYoutube:
                    tvMsg.setText("유튜브접속!");
                    Intent act2 = new Intent(Ex5WebViewActivity.this, Ex5WebViewExYoutube.class);
                    startActivity(act2);
                    break;
                case R.id.btnNaver:
                    tvMsg.setText("네이버접속함");
                    Intent act3 = new Intent(Ex5WebViewActivity.this, Ex5WebViewExNaver.class);
                    startActivity(act3);
                    break;

            }

        }
    };
}
package com.cms.dw202app_all;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex3VideoActivity extends AppCompatActivity {
    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_video);
        findViewById(R.id.btnPause).setOnClickListener(bClickListener);
        findViewById(R.id.btnPlay).setOnClickListener(bClickListener);
        findViewById(R.id.btnStop).setOnClickListener(bClickListener);

        Uri url= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.habit);
        vv= (VideoView) findViewById(R.id.vv);

        MediaController mediaController = new MediaController(this);
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(url);
    }

    View.OnClickListener bClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnPlay:
                    vv.start();
                    break;
                case R.id.btnPause:
                    vv.pause();
                    break;
                case R.id.btnStop:
                    vv.stopPlayback();
                    break;
            }
        }
    };


}

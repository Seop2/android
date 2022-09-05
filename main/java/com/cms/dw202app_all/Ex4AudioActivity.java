package com.cms.dw202app_all;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Ex4AudioActivity extends AppCompatActivity {
    TextView tvMsg;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4_audio);
        tvMsg=(TextView)findViewById(R.id.tvMsg);
        findViewById(R.id.btnPause).setOnClickListener(bClickListener);
        findViewById(R.id.btnPlay).setOnClickListener(bClickListener);
        findViewById(R.id.btnStop).setOnClickListener(bClickListener);
        player = MediaPlayer.create(Ex4AudioActivity.this, R.raw.dragonnight);
    }
    View.OnClickListener bClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnPlay:
                    player.start();
                    tvMsg.setText("음악이 재생중..");
                    break;
                case R.id.btnPause:
                    player.pause();
                    tvMsg.setText("음악이 일시정지 중..");
                    break;
                case R.id.btnStop:
                    player.stop();
                    tvMsg.setText("음악이 중지!..");
                    break;
            }
        }
    };

}
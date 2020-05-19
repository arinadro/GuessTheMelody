package com.example.guessthemelody;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Level3 extends AppCompatActivity {
        Button play;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            play = (Button) findViewById(R.id.play);
            final MediaPlayer mediaPlayer = MediaPlayer.create(Level3.this, R.music.Senorita.mp3);

            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.start();
                }
            });
        }
    }
}

package com.example.mymainapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import android.widget.MediaController;

public class MainActivityLab5_2 extends AppCompatActivity{

    VideoView videoPlayer;
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab5_2_layout);
        videoPlayer = findViewById(R.id.videoPlayer);
        Uri myVideoUri= Uri.parse( "android.resource://" +
                getPackageName() + "/" + R.raw.catsv);
        videoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        videoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoPlayer);
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab5_2_layout);
        videoPlayer = findViewById(R.id.videoPlayer);
        videoPlayer.setVideoPath
                ("http://techslides.com/demos/sample-videos/small.mp4");
    }


    public void play(View view){
        videoPlayer.start();
    }
    public void pause(View view){

        videoPlayer.pause();
    }
    public void stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }

}

package org.richit.musicplayeronline.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.richit.musicplayeronline.R;

import dm.audiostreamer.AudioStreamingManager;
import dm.audiostreamer.MediaMetaData;
import dm.audiostreamer.StreamingManager;

public class MainActivity extends AppCompatActivity {

    EditText mEditTextUrl;
    Button mEnterButton, mPlayButton, mPauseButton, mStopButton;
    AudioStreamingManager streamingManager;
    Context mContext;

    public void uiInitialization(){

        mEditTextUrl = findViewById( R.id.editTextUrlid );
        mEnterButton = findViewById( R.id.enterbuttonid );
        mPlayButton = findViewById( R.id.playbuttonid );
        mPauseButton = findViewById( R.id.pausebuttonid );
        mStopButton = findViewById( R.id.stopbuttonid );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        streamingManager = AudioStreamingManager.getInstance( this );
    }

    @Override
    public void onStart() {
        super.onStart();
        if (streamingManager != null) {
            streamingManager.subscribesCallBack(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (streamingManager != null) {
            streamingManager.unSubscribeCallBack();
        }
    }

    @Override
    public void updatePlaybackState(int state) {
        switch (state) {
            case PlaybackStateCompat.STATE_PLAYING:
                break;
            case PlaybackStateCompat.STATE_PAUSED:
                break;
            case PlaybackStateCompat.STATE_NONE:
                break;
            case PlaybackStateCompat.STATE_STOPPED:
                break;
            case PlaybackStateCompat.STATE_BUFFERING:
                break;
        }
    }

    @Override
    public void playSongComplete() {
    }

    @Override
    public void currentSeekBarPosition(int progress) {
    }

    @Override
    public void playCurrent(int indexP, MediaMetaData currentAudio) {
    }

    @Override
    public void playNext(int indexP, MediaMetaData CurrentAudio) {
    }

    @Override
    public void playPrevious(int indexP, MediaMetaData currentAudio) {
    }

}

    public void enterUrl(View view) {
        mEditTextUrl.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );
    }
    public void enter(View view) {
    }

    public void play(View view) {
    }

    public void pause(View view) {
    }

    public void stop(View view) {
    }

}

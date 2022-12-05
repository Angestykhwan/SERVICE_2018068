package com.example.service_2018068;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceMusic extends Service {
    static MediaPlayer mp;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mp=MediaPlayer.create(this, R.raw.music);
        mp.setLooping(true);
        mp.start();
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        mp.stop();
        super.onDestroy();
    }
}

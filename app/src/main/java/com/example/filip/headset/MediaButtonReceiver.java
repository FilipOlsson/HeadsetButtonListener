package com.example.filip.headset;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by Filip on 2015-07-26.
 */
public class MediaButtonReceiver extends BroadcastReceiver {

    private KeyEvent event;

    public MediaButtonReceiver() {
        super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast toast = Toast.makeText(context, "test", Toast.LENGTH_SHORT);

        Log.d("TEST","OK1");
        if (Intent.ACTION_MEDIA_BUTTON.equals(intent.getAction())) {

            KeyEvent event = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);



            if (KeyEvent.KEYCODE_HEADSETHOOK == event.getKeyCode()) {

                toast.show();
            }
        }

    }
}
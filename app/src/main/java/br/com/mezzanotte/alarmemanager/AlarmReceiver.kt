package br.com.mezzanotte.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmReceiver : BroadcastReceiver() {

    lateinit var mp: MediaPlayer

    override fun onReceive(context: Context?, intent: Intent?) {
        mp = MediaPlayer.create(context, R.raw.wololo)
        mp.start()
        Toast.makeText(context, "Alarm ...", Toast.LENGTH_LONG).show()
    }
}
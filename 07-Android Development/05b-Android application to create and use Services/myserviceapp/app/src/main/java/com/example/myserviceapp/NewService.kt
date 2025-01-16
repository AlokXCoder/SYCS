package com.example.myserviceapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.media.MediaPlayer
import android.provider.Settings
class NewService :Service() {
    private lateinit var player:MediaPlayer
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int{
        player=MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        player.isLooping=true
        player.start()
        return START_STICKY
    }
    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
        return null
    }
}
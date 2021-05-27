package com.almoullim.background_location

import android.app.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.location.Location
import android.os.*
import androidx.core.app.NotificationCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.almoullim.background_location.LocationUpdatesService

import android.widget.Toast
import android.util.Log
import com.google.android.gms.location.*

import kotlin.system.exitProcess

public class NotificationBroadcastReceiver : BroadcastReceiver() {
    
    private val STOP_SERVICE = "stop_service"

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("TEST", "NotificationBroadcastReceiver: test_action")

        if (intent?.action == "stop_exit") {
            Toast.makeText(context,"DJGolf has been closed",Toast.LENGTH_SHORT).show()
            exitProcess(40)
        }
    }
}
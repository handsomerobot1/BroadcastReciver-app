package com.example.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_AIRPLANE_MODE_CHANGED
import android.widget.Toast

class AirplanModeChangeReciver:BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            Toast.makeText(context, "Airplan is changed", Toast.LENGTH_SHORT).show()
        }

    }
}
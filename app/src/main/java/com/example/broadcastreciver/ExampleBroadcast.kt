package com.example.broadcastreciver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleBroadcast:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_TIME_TICK == (intent?.action)) {
            Toast.makeText(context, "Time Upadated", Toast.LENGTH_SHORT).show()
        } else if (ConnectivityManager.CONNECTIVITY_ACTION == (intent?.action)) {
        }
        val booleanExtra = intent?.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY, false)
        if (booleanExtra == true) {
            Toast.makeText(context, "Network Disconnected", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context, "Network Connected", Toast.LENGTH_SHORT).show()
    }
}
}
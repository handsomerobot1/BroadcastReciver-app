package com.example.broadcastreciver

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val airplanModeChangeReciver = AirplanModeChangeReciver()
    private val exampleBroadcast = ExampleBroadcast()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerReceiver(exampleBroadcast, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
        registerReceiver(airplanModeChangeReciver, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))

    }

    override fun onDestroy() {
            super.onDestroy()
        unregisterReceiver(airplanModeChangeReciver)
        unregisterReceiver(exampleBroadcast)


    }
}
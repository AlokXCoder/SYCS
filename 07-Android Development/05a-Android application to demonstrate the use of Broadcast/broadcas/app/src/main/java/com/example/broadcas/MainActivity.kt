package com.example.broadcas


import android.os.Bundle
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.what)
        checkNetworkStatus()
    }

    private fun checkNetworkStatus() {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val network = connectivityManager.activeNetwork
        val networkCapabilities = connectivityManager.getNetworkCapabilities(network)

        if (networkCapabilities != null) {
            when {
                networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                    Toast.makeText(
                        applicationContext,
                        "Device connected to Wi-Fi",
                        Toast.LENGTH_LONG
                    ).show()
                }
                networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                    Toast.makeText(
                        applicationContext,
                        "Device connected to Mobile Data",
                        Toast.LENGTH_LONG
                    ).show()
                }
                else -> {
                    Toast.makeText(applicationContext, "Unknown network connection", Toast.LENGTH_LONG).show()
                }
            }
        } else {
            Toast.makeText(applicationContext, "You are Offline", Toast.LENGTH_LONG).show()
        }
    }
}

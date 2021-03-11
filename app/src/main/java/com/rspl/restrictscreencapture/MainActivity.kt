package com.rspl.restrictscreencapture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    //TODO: Uncomment below lines if you want to prevent screenshots and screen recording for this single activity/screen
    // and go to MyApp class to comment whole app prevent comment and do the needful
    /*window.setFlags(WindowManager.LayoutParams.FLAG_SECURE,
      WindowManager.LayoutParams.FLAG_SECURE)*/
    setContentView(R.layout.activity_main)
  }
}
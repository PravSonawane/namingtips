package ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.merryapps.namingtips.R.layout

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
  }
}

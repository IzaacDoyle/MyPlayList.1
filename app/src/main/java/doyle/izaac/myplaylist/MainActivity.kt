package doyle.izaac.myplaylist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    getString(R.String.Deleoper_Key)
//api="AIzaSyAnLIrK02bCb0JyQS2qQYDRKFmgdu6Xa1E"
    //Intent intent = YouTubeStandalonePlayer.createVideoIntent(context, getStringDeveloper_key, VIDEO_ID)
   // startActivity(intent)
}

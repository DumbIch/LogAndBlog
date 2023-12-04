package ru.dumdumbich.logandblog.ui.screen.splash

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import ru.dumdumbich.logandblog.databinding.ActivitySplashBinding
import ru.dumdumbich.logandblog.ui.base.BaseActivity
import ru.dumdumbich.logandblog.ui.screen.login.LoginActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    private lateinit var ui: ActivitySplashBinding
    private val handler: Handler by lazy { Handler(mainLooper) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ObjectAnimator.ofFloat(ui.startPictureImageView, View.SCALE_Y, -1f).apply {
            duration = 1_000
            repeatCount = 1
            repeatMode = ObjectAnimator.REVERSE
        }.start()

        handler.postDelayed({
            Intent(this@SplashActivity, LoginActivity::class.java).also { intent ->
                startActivity(intent)
            }
            finish()
        }, 3_000)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

}
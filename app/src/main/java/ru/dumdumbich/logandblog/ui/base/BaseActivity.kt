package ru.dumdumbich.logandblog.ui.base

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * <h3>LogAndBlog</h3>
 * @File : BaseActivity
 * @description
 * <p>Base activity</p>
 * @author DumbIch
 * @date 2023-10-14 14:50
 **/

open class BaseActivity : AppCompatActivity() {

    private val TAG = "@@@  ${this::class.java.simpleName} : ${this.hashCode()}"


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate() called with: savedInstanceState = $savedInstanceState")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy() called")
        super.onDestroy()
    }

}
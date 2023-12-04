package ru.dumdumbich.logandblog.ui.screen.login

import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import ru.dumdumbich.logandblog.databinding.ActivityLoginBinding
import ru.dumdumbich.logandblog.ui.base.BaseActivity


class LoginActivity : BaseActivity() {

    private lateinit var ui: ActivityLoginBinding
    private val vm: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(ui.root)

        ui.loginButton.setOnClickListener {
            lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.RESUMED) {
//                    vm.uiState.collect { state ->

//                    }
                }
            }

        }

    }

}
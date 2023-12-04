package ru.dumdumbich.logandblog.ui.screen.login

import android.app.Activity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.dumdumbich.logandblog.R
import ru.dumdumbich.logandblog.databinding.ActivityLoginBinding
import ru.dumdumbich.logandblog.ui.base.BaseActivity


class LoginActivity : BaseActivity() {

    private lateinit var ui: ActivityLoginBinding
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(ui.root)

        loginViewModel =
            ViewModelProvider(this, LoginViewModelFactory())[LoginViewModel::class.java]

        loginViewModel.loginViewState.observe(this@LoginActivity, Observer {
            val loginState = it ?: return@Observer

            // disable login button unless both username / password is valid
            ui.loginButton.isEnabled = loginState.isDataValid

            if (loginState.usernameError != null) {
                ui.usernameEditText.error = getString(loginState.usernameError)
            }
            if (loginState.passwordError != null) {
                ui.passwordEditText.error = getString(loginState.passwordError)
            }
        })

        loginViewModel.loginResult.observe(this@LoginActivity, Observer {
            val loginResult = it ?: return@Observer

            ui.loadingProgressIndicator.visibility = View.GONE
            if (loginResult.error != null) {
                showLoginFailed(loginResult.error)
            }
            if (loginResult.success != null) {
                updateUiWithUser(loginResult.success)
            }
            setResult(Activity.RESULT_OK)

            //Complete and destroy login activity once successful
            finish()
        })

        ui.usernameEditText.afterTextChanged {
            loginViewModel.loginDataChanged(
                ui.usernameEditText.text.toString(),
                ui.passwordEditText.text.toString()
            )
        }

        ui.passwordEditText.apply {
            afterTextChanged {
                loginViewModel.loginDataChanged(
                    ui.usernameEditText.text.toString(),
                    ui.passwordEditText.text.toString()
                )
            }

            setOnEditorActionListener { _, actionId, _ ->
                when (actionId) {
                    EditorInfo.IME_ACTION_DONE ->
                        loginViewModel.login(
                            ui.usernameEditText.text.toString(),
                            ui.passwordEditText.text.toString()
                        )
                }
                false
            }

            ui.loginButton.setOnClickListener {
                ui.loginButton.visibility = View.VISIBLE
                loginViewModel.login(
                    ui.usernameEditText.text.toString(),
                    ui.passwordEditText.text.toString()
                )
            }
        }
    }

    private fun updateUiWithUser(model: LoggedInUserView) {
        val welcome = getString(R.string.welcome)
        val displayName = model.displayName
        // TODO : initiate successful logged in experience
        Toast.makeText(
            applicationContext,
            "$welcome $displayName",
            Toast.LENGTH_LONG
        ).show()
    }

    private fun showLoginFailed(@StringRes errorString: Int) {
        Toast.makeText(applicationContext, errorString, Toast.LENGTH_SHORT).show()
    }
}

fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}
package ru.dumdumbich.logandblog.branch.database.ui

import android.os.Bundle
import ru.dumdumbich.logandblog.branch.database.ui.base.BaseActivity
import ru.dumdumbich.logandblog.databinding.DatabaseActivityMainBinding

/**
 * <h3>LogAndBlog</h3>
 * @File : MainActivityDatabase
 * @description
 * <p>Main activity in database develop branch</p>
 * @author DumbIch
 * @date 2023-11-17 15:30
 **/
class MainActivityDatabase : BaseActivity() {

    private lateinit var ui: DatabaseActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = DatabaseActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)

    }

}
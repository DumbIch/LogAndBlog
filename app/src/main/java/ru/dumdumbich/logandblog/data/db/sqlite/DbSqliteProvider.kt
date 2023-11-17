package ru.dumdumbich.logandblog.data.db.sqlite

import java.sql.Connection
import java.sql.DriverManager

/**
 * <h3>LogAndBlog</h3>
 * @File : DbSqliteProvider
 * @description
 * <p>Provides access to SQLite database</p>
 * @author DumbIch
 * @date 2023-11-14 13:48
 **/
object DbSqliteProvider {
    var connection: Connection = DriverManager.getConnection("jdbc:sqlite::")

}
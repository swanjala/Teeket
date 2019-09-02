package repository

import com.mysql.cj.MysqlConnection
import java.sql.Connection
import java.sql.SQLException
import repository.DbInit as DbInit1

class Database {

    fun initializeDatabase():Boolean{

        var dbInit = DbInit1()
        try {
            dbInit.getConnection()
            dbInit.executeMySQLQuery()
            return true

        }catch (sqlException: SQLException){
            println(sqlException)
            return  false
        }
    }
    fun syncDatabase(): Boolean{
        return false
    }

    fun dropDatatbase(): Boolean {
        return false
    }
}
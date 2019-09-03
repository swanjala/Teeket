package repository

import com.mysql.cj.x.protobuf.MysqlxExpr
import models.Passenger
import java.sql.*
import java.util.*
import kotlin.collections.HashMap

class DbInit{
    internal var connection: Connection? = null
    internal var userName = "userName"
    internal var password = "password"

    fun getConnection():Connection? {
        val connectionProps = Properties()
        connectionProps.put("user",userName)
        connectionProps.put("password", password)
        try {
            Class.forName("com.mysql.Driver").newInstance()
            connection = DriverManager.getConnection("jdbc:" +
                    "mysql" +
                    "://" +
                    "127.0.0.1" +
                    ":" +
                    "3306" +
                    "/" +
                    "",connectionProps)
        }catch (sqlException : SQLException){
            sqlException.printStackTrace()
        }catch(exception:Exception){
            exception.printStackTrace()
        }
        return connection
    }

    fun executeMySQLQuery() {
        var statement: Statement? = null
        var resultSet: ResultSet? = null

        try {
            statement = connection!!.createStatement()
            resultSet = statement!!.executeQuery(("SHOW DATABASES;"))
            if(statement.execute("SHOW DATABASES;")){
                resultSet = statement.resultSet
            }
            while(resultSet!!.next()){
                println(resultSet.getString("Databases"))
            }
        }catch (exception: SQLException){
            exception.printStackTrace()
        }finally {
            if(resultSet != null){
                try {
                    resultSet.close()
                }catch (sqlException: SQLException){

                }
                resultSet = null
            }
            if(statement != null){
                try{
                    statement.close()
                }catch (sqlException: SQLException){

                }
                statement = null
            }

            if(connection != null){
                try {
                    connection!!.close()
                }catch (sqlException: SQLException){

                }
                connection = null
            }
        }
    }

    fun addData(params:HashMap<String, String>, data:Objects):Boolean{


        "INSERT INTO "+params.get("table")+ ""
        return false
    }

}
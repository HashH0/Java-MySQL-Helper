package me.bluenitrox;

import me.bluenitrox.mysql.MySQLStorage;

public class MySQL {

    /**
     * Main function
     * @param args
     */
    public static void main(String args){
        // Test connection
        MySQLStorage mySQLStorage = new MySQLStorage();
        mySQLStorage.connect();

    }

}

package me.bluenitrox;

import me.bluenitrox.mysql.MySQLStorage;
import me.bluenitrox.mysql.MySQL_File;

public class MySQL {

    public static void main(String args){
        MySQL_File file = new MySQL_File();
        file.setdefault();
        file.readData();

        MySQLStorage.connect();

    }

}

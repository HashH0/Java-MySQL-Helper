package me.bluenitrox.mysql;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class MySQL_File {

    public void setdefault() {
        FileConfiguration cfg = getFileConfiguration();

        cfg.options().copyDefaults(true);
        cfg.addDefault("host", "localhost");
        cfg.addDefault("port", "3306");
        cfg.addDefault("database", "school");
        cfg.addDefault("username", "username");
        cfg.addDefault("password", "password");


        try {
            cfg.save(getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getFile() {
        return new File("plugins//MySQL", "mysql.yml");
    }

    private FileConfiguration getFileConfiguration() {
        return YamlConfiguration.loadConfiguration(getFile());
    }

    public void readData() {
        FileConfiguration cfg = getFileConfiguration();
        MySQLStorage.host = cfg.getString("host");
        MySQLStorage.port = cfg.getString("port");
        MySQLStorage.database = cfg.getString("database");
        MySQLStorage.username = cfg.getString("username");
        MySQLStorage.password = cfg.getString("password");
    }
}
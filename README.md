# Java-MySQL-Helper
version: **1.0.0**
***

This database helper helps you with projects where you need to store any information in a external database. More databases will be supported soon.

Currently, the following databases are integrated:
- MySQL

<br>

# Useful Code
To open a new storage table use the code below and change 'spielerdaten' and 'spieleruuid' to your values.
```` java
try(Connection connection = MySQL.getHikariDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement("CREATE TABLE IF NOT EXISTS `spielerdaten` ( `spieleruuid` CHAR(36) NOT NULL)");) {
    ps.executeUpdate();
}
````
<br>

To add a user to the database use the following code. Change where 'table', 'id' and 'startvalue'
```` java
public static void insertdatabase(id, startvalue){
    try (Connection connection = MySQL.getHikariDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement("INSERT INTO table (id, startvalue) VALUES (?, ?)")) {
        ps.setString(1, id);
        ps.setInt(2, startvalue);
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
````
<br>

To update a user in the database use the following code. Update where 'id','table','value' and 'amount'
````java
public static void updateDatabase(id , amount) {
        
    try (Connection connection = MySQL.getHikariDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement("UPDATE table SET value = ? WHERE id = ?")) {
        ps.setFloat(1, amount);
        ps.setString(2, id);
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
````

<br>

To get a user from the database use the following code. Edit where 'table', 'id' and 'value'
````java
public static int getDatabase(id) {
    int amount = 0;

    try (Connection connection = MySQL.getHikariDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement("SELECT value FROM table WHERE id = ?")) {
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            amount = rs.getInt(value);
        }
     } catch (SQLException e) {
           e.printStackTrace();
     }
  return amount;
}
````

<br>

To delete a user of the databse use the following code. Change the setting at 'id' and 'table'
````java
private static void deleteUser(id){
    try(Connection connection = MySQL.getHikariDataSource().getConnection(); PreparedStatement ps = connection.prepareStatement("DELETE FROM table WHERE id = ?")){
        ps.setString(1, id);
        ps.execute();
    }catch (SQLException e){
         e.printStackTrace();
    }
}
````

# Dependencies
Those dependencies are needed for the plugin to work. Choose between Maven and Gradle.
<br>
## Gradle (kotlin)
````
repositories {
  maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
  compileOnly("org.spigotmc:spigot-api:1.19.3-R0.1-SNAPSHOT")
  compileOnly("org.spigotmc:spigot:1.19.3-R0.1-SNAPSHOT")
  compile group: 'com.zaxxer', name: 'HikariCP', version: '3.1.0"
}

````


## Maven
````
<repository>
            <id>spigot-repo</id>
            <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
</repository>
<dependency>
            <groupId>org.bukkit</groupId>
            <artifactId>bukkit</artifactId>
            <version>1.8.8-R0.1-SNAPSHOT</version>
            <scope>provided</scope>
</dependency>
<dependency>
	<groupId>com.zaxxer</groupId>
	<artifactId>HikariCP</artifactId>
	<version>3.1.0</version>
</dependency>
````

# Issues / Fixes

If something doesn't work, feel free to open an issue and I'll try to find a fix for it as soon as possible. if you have any other suggestions or requests, please let me know. Otherwise I hope that this page helped you out.

<h3 align="left">Contact</h3>
<p align="left">
<a href="https://discord.gg/Qb6BzpAt8V" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="Qb6BzpAt8V" height="30" width="40" /></a>
 <a href="https://twitter.com/HennerichFelix" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="HennerichFelix" height="30" width="40" /></a>
 <a href="https://www.youtube.com/channel/UCKNT0NCikpds9nWKhIQcS3w" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="1BlueNitrox" height="30" width="40" /></a>
  <a href="https://www.instagram.com/felixderkeinennamenkennt/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="felixderkeinennamenkennt" height="30" width="40" /></a>
</p>


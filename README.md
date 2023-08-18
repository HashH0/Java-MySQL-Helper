# Java-MySQL-Helper
version: **1.1.0**
***

This database helper helps you with projects where you need to store any information in a external database. More databases will be supported soon.

Currently, the following databases are integrated:
- MySQL

<br>

# Useful Code
To open a new storage table use the code below and change 'spielerdaten' and 'spieleruuid' to your values.
```` java
MySQLStorage mysqlStorage = new MySQLStorage();
String sql = "CREATE TABLE IF NOT EXISTS `spielerdaten` ( `spieleruuid` CHAR(36) NOT NULL)";
try{
    PreparedStatement statement = mysqlStorage.connect().prepareStatement(sql);
    statement.execureQuery();
} catch (SQLException e){
    e.printStackTrace();
} finally {
    mysqlStorage.disconnect();
}
````
<br>

To add a user to the database use the following code. Change where 'table', 'id' and 'startvalue'
```` java
MySQLStorage mysqlStorage = new MySQLStorage();
String sql = "INSERT INTO table (id, startvalue) VALUES (?, ?)";
try{
    PreparedStatement statement = mysqlStorage.connect().prepareStatement(sql);
    statement.setString(1, id);
    statement.setInt(2, startvalue);
    statement.executeUpdate();
} catch (SQLException e){
    e.printStackTrace();
} finally {
    mysqlStorage.disconnect();
}
````
<br>

To update a user in the database use the following code. Update where 'id','table','value' and 'amount'
```` java
MySQLStorage mysqlStorage = new MySQLStorage();
String sql = "UPDATE table SET value = ? WHERE id = ?";
try{
    PreparedStatement statement = mysqlStorage.connect().prepareStatement(sql);
    statement.setFloat(1, amount);
    statement.setString(2, id);
    statement.executeUpdate();
} catch (SQLException e){
    e.printStackTrace();
} finally {
    mysqlStorage.disconnect();
}
````

<br>

To get a user from the database use the following code. Edit where 'table', 'id' and 'value'
```` java
MySQLStorage mysqlStorage = new MySQLStorage();
String sql = "SELECT value FROM table WHERE id = ?";
int amount = 0;
try{
    PreparedStatement statement = mysqlStorage.connect().prepareStatement(sql);
    statement.setString(1, id);
    ResultSet rs = statement.executeQuery();
    while (rs.next()) {
        amount = rs.getInt(value);
    }
} catch (SQLException e){
    e.printStackTrace();
} finally {
    mysqlStorage.disconnect();
}
````

<br>

To delete a user of the databse use the following code. Change the setting at 'id' and 'table'
```` java
MySQLStorage mysqlStorage = new MySQLStorage();
String sql = "DELETE FROM table WHERE id = ?";
try{
    PreparedStatement statement = mysqlStorage.connect().prepareStatement(sql);
    statement.setString(1, id);
    statement.execute();
} catch (SQLException e){
    e.printStackTrace();
} finally {
    mysqlStorage.disconnect();
}
````

# Dependencies
Currently there is no dependency for this project. If u want to use it, copy the MySQLStorage class from the mysql folder and use it as stated above.
A dependency will follow soon.

# Issues / Fixes

If something doesn't work, feel free to open an issue and I'll try to find a fix for it as soon as possible. if you have any other suggestions or requests, please let me know. Otherwise I hope that this page helped you out.

<h3 align="left">Contact</h3>
<p align="left">
<a href="https://discord.gg/Qb6BzpAt8V" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="Qb6BzpAt8V" height="30" width="40" /></a>
 <a href="https://twitter.com/HennerichFelix" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="HennerichFelix" height="30" width="40" /></a>
 <a href="https://www.youtube.com/channel/UCKNT0NCikpds9nWKhIQcS3w" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="1BlueNitrox" height="30" width="40" /></a>
  <a href="https://www.instagram.com/felixderkeinennamenkennt/" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="felixderkeinennamenkennt" height="30" width="40" /></a>
</p>


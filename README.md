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


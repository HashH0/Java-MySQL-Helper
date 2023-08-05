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


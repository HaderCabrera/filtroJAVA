package com.sgpzf.persons.out;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sgpzf.connectionDB;
import com.sgpzf.persons.domain.entity.Persons;
import com.sgpzf.persons.domain.service.PersonsService;

public class PersonsRepository implements PersonsService {

    @Override
    public Boolean createPersons(Persons persons) {
    String sql = "INSERT INTO persons (name,lastname,idcity,address,age,email,idgender)\n" + //
                "VALUES (?,?,?,?,?,?,?);";

        try (Connection connection = connectionDB.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

                statement.setString(1, persons.getName());
                statement.setString(2, persons.getLastname());
                statement.setLong(3, persons.getIdcity());
                statement.setString(4, persons.getAddress());
                statement.setLong(5, persons.getAge());
                statement.setString(6, persons.getEmail());
                statement.setLong(7, persons.getIdgender());
 
            statement.executeUpdate();


        } catch (SQLException e) { 
            e.printStackTrace();
            return null;
        }
        
        return true;
    }

    @Override
    public Boolean modifiedPersons(Persons persons) {
        String sql = "UPDATE INTO persons (name,lastname,idcity,address,age,email,idgender)\n" + //
        "VALUES (?,?,?,?,?,?,?);";

        try (Connection connection = connectionDB.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

                statement.setString(1, persons.getName());
                statement.setString(2, persons.getLastname());
                statement.setLong(3, persons.getIdcity());
                statement.setString(4, persons.getAddress());
                statement.setLong(5, persons.getAge());
                statement.setString(6, persons.getEmail());
                statement.setLong(7, persons.getIdgender());

            statement.executeUpdate();


        } catch (SQLException e) { 
            e.printStackTrace();
            return null;
        }

        return true;
    }

    @Override
    public Persons getPersonsById(Long id) {
        String sql = "SELECT * FROM persons WHERE id = ?;";
        Persons persons = null;

        try (Connection connection = connectionDB.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    persons = new Persons();
                    persons.setName(resultSet.getString("name"));
                    persons.setLastname(resultSet.getString("lastname"));
                    persons.setIdcity(resultSet.getLong("idcity"));
                    persons.setAddress(resultSet.getString("address"));
                    persons.setAge(resultSet.getLong("age"));
                    persons.setEmail(resultSet.getString("email"));
                    persons.setIdgender(resultSet.getLong("idgender"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return persons;
    }

}

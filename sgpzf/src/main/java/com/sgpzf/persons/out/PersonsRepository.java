package com.sgpzf.persons.out;


import java.sql.Connection;
import java.sql.PreparedStatement;
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

            // try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            //     if (generatedKeys.next()) {
            //         Long  id= generatedKeys.getLong(1);  
            //         return id;
            //     } 
            // }

        } catch (SQLException e) { 
            e.printStackTrace();
            return null;
        }
        
        return true;
    }

}

package com.sgpzf.personSkill.infraestructure.out;

import com.sgpzf.connectionDB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sgpzf.personSkill.domain.entity.PersonSkill;
import com.sgpzf.personSkill.domain.service.PersonSkillService;

public class PersonSkillRepository implements PersonSkillService{

    @Override
    public Boolean addSkillToPerson(PersonSkill personSkill) {
        String sql = "INSERT INTO persons_skill (registration_date, iperson, idskill)\n" + //
                        "VALUES (?,?,?);";

        try (Connection connection = connectionDB.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setDate(1, (Date) personSkill.getRegistration_date());
            statement.setLong(2, personSkill.getIperson());
            statement.setLong(3, personSkill.getIdskill());
 
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

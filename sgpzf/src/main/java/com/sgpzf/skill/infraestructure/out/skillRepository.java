package com.sgpzf.skill.infraestructure.out;

import com.sgpzf.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sgpzf.skill.domain.entity.Skill;
import com.sgpzf.skill.domain.service.SkillService;

public class skillRepository implements SkillService{

    @Override
    public Boolean createSkill(Skill newSkill) {
        String sql = "INSERT INTO skill(name) VALUES (?);";

        try (Connection connection = connectionDB.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS)) {

            statement.setString(1, newSkill.getName());
 
            statement.executeUpdate();

        } catch (SQLException e) { 
            e.printStackTrace();
            return null;
        }
        
        return true;
    }

}

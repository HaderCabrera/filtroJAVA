package com.sgpzf.skill.infraestructure.in;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sgpzf.skill.application.SkillUseCase;
import com.sgpzf.skill.domain.entity.Skill;

public class SkillController {
    private final SkillUseCase skillUseCase;

    public SkillController(SkillUseCase skillUseCase) {
        this.skillUseCase = skillUseCase;
    }
    
    public void createSkill(){
        //llamar a vista de crear SKill
        Skill newSkill = viewCreateSkill();
        if (newSkill != null) {
            Boolean confirmacion = skillUseCase.createSkill(newSkill);
            if (confirmacion) {
                JOptionPane.showMessageDialog(null, "Skill create succesfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            } else JOptionPane.showMessageDialog(null, "Skill create Error!","Denied",JOptionPane.WARNING_MESSAGE);
        }
    }

    public Skill viewCreateSkill(){
        Skill skillNew = null;

        JPanel box1 = new JPanel(new GridLayout(1, 2, 5, 1));

        JLabel lblname = new JLabel("Name skill:");
        JTextField txtname = new JTextField();
        txtname.setPreferredSize(new Dimension(280 , 30));

        box1.add(lblname);
        box1.add(txtname);


        int option = JOptionPane.showConfirmDialog(
            null, 
            box1, 
            "Crear Skill!", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            skillNew = new Skill();
            skillNew.setName(txtname.getText());
        }
        return skillNew;
    }
}

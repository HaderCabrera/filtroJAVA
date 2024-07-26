package com.sgpzf.personSkill.infraestructure.in;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sgpzf.personSkill.application.PersonSkillUseCase;
import com.sgpzf.personSkill.domain.entity.PersonSkill;


public class PersonSkillController {
    private final PersonSkillUseCase personSkillUseCase;


    
    public PersonSkillController(PersonSkillUseCase personSkillUseCase) {
        this.personSkillUseCase = personSkillUseCase;
    }
    public void addSkillToPerson(){
        //llamar a la vista de agregar skill
        PersonSkill skillToPersonNew = viewPersonSkill();
        if (skillToPersonNew != null) {
            Boolean confirmacion = personSkillUseCase.addSkillToPerson(skillToPersonNew);
            if (confirmacion) {
                JOptionPane.showMessageDialog(null, "Persons create succesfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
            } else JOptionPane.showMessageDialog(null, "Persons create Error!","Denied",JOptionPane.WARNING_MESSAGE);
        }

    }
    public PersonSkill viewPersonSkill(){
        PersonSkill newSkillToPerson = null;

        JPanel box1 = new JPanel(new GridLayout(3, 2, 5, 1));

        JLabel lblperson = new JLabel("Id person:");
        JTextField txtperson = new JTextField();
        txtperson.setPreferredSize(new Dimension(280 , 30));

        JLabel lblskill = new JLabel("Id skill:");
        JTextField txtskill = new JTextField();
        txtskill.setPreferredSize(new Dimension(280 , 30));

        JLabel lbldate = new JLabel("Date registration [AAAA-MM-DD]:");
        JTextField txtdate = new JTextField();
        txtdate.setPreferredSize(new Dimension(280 , 30));

        box1.add(lblperson);
        box1.add(txtperson);
        box1.add(lblskill);
        box1.add(txtskill);
        box1.add(lbldate);
        box1.add(txtdate);

        int option = JOptionPane.showConfirmDialog(
            null, 
            box1, 
            "Agregar Skill A Persona!", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            newSkillToPerson = new PersonSkill();
            newSkillToPerson.setIdskill(Long.valueOf(txtskill.getText()));
            newSkillToPerson.setIperson(Long.valueOf(txtperson.getText()));
            newSkillToPerson.setRegistration_date(Date.valueOf( txtdate.getText()));
        }
        return newSkillToPerson;
    }

}

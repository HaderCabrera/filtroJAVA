package com.sgpzf.personSkill.infraestructure.in;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sgpzf.personSkill.domain.entity.PersonSkill;
import com.sgpzf.persons.domain.entity.Persons;

public class PersonSkillController {
    private final PersonSkillController personSkillController;

    public PersonSkillController(PersonSkillController personSkillController) {
        this.personSkillController = personSkillController;
    }
    
    public void addSkillToPerson(){
        //llamar a la vista de agregar skill

    }
    public PersonSkill viewPersonSkill(){
        PersonSkill newSkillToPerson = null;

        JPanel box1 = new JPanel(new GridLayout(7, 2, 5, 1));

        JLabel lblname = new JLabel("Name:");
        JTextField txtname = new JTextField();
        txtname.setPreferredSize(new Dimension(280 , 30));

        JLabel lblapellido = new JLabel("Last Name:");
        JTextField txtapellido = new JTextField();
        txtapellido.setPreferredSize(new Dimension(280 , 30));

        box1.add(lblname);
        box1.add(txtname);
        box1.add(lblapellido);
        box1.add(txtapellido);
        box1.add(lblciudad);
        box1.add(txtciudad);
        box1.add(lbladdress);
        box1.add(txtaddress);




        int option = JOptionPane.showConfirmDialog(
            null, 
            box1, 
            "Agregar Persona!", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            personsNew = new Persons();
            personsNew.setName(txtname.getText());
            personsNew.setLastname(txtapellido.getText());
            personsNew.setAddress(txtaddress.getText());

        }
        return newSkillToPerson;
    }
}

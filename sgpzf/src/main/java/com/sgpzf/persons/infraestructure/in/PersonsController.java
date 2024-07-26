package com.sgpzf.persons.infraestructure.in;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.rmi.server.RemoteStub;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sgpzf.persons.application.PersonsUseCase;
import com.sgpzf.persons.domain.entity.Persons;

public class PersonsController {
    private final PersonsUseCase personsUseCase;

    public PersonsController(PersonsUseCase personsUseCase) {
        this.personsUseCase = personsUseCase;
    }
    
    public void createPersons(){
        //llamar a la vista de ingresar datos
        Persons persons = viewCreatePersons();

        Boolean confirmacion = personsUseCase.createPersons(persons);
        if (confirmacion) {
            JOptionPane.showMessageDialog(null, "Persons create succesfully","Confirmation",JOptionPane.INFORMATION_MESSAGE);
        } else JOptionPane.showMessageDialog(null, "Persons create Error!","Denied",JOptionPane.WARNING_MESSAGE);
    }

    public Persons viewCreatePersons(){
        Persons personsNew = null;

        JPanel box1 = new JPanel(new GridLayout(7, 2, 5, 1));

        JLabel lblname = new JLabel("Name:");
        JTextField txtname = new JTextField();
        txtname.setPreferredSize(new Dimension(280 , 30));

        JLabel lblapellido = new JLabel("Last Name:");
        JTextField txtapellido = new JTextField();
        txtapellido.setPreferredSize(new Dimension(280 , 30));

        JLabel lblciudad = new JLabel("City");
        JTextField txtciudad = new JTextField();
        txtname.setPreferredSize(new Dimension(280 , 30));

        JLabel lbladdress = new JLabel("Address");
        JTextField txtaddress = new JTextField();
        txtaddress.setPreferredSize(new Dimension(280 , 30));

        JLabel lblgender = new JLabel("Id Gender:");
        JTextField txtgender = new JTextField();
        txtgender.setPreferredSize(new Dimension(280 , 30));

        JLabel lblemail = new JLabel("Email:");
        JTextField txtemail = new JTextField();
        txtemail.setPreferredSize(new Dimension(280 , 30));

        JLabel lblage = new JLabel("Age:");
        JTextField txtage = new JTextField();
        txtemail.setPreferredSize(new Dimension(280 , 30));

        box1.add(lblname);
        box1.add(txtname);
        box1.add(lblapellido);
        box1.add(txtapellido);
        box1.add(lblciudad);
        box1.add(txtciudad);
        box1.add(lbladdress);
        box1.add(txtaddress);
        box1.add(lblage);
        box1.add(txtage);
        box1.add(lblemail);
        box1.add(txtemail);
        box1.add(lblgender);
        box1.add(txtgender);



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
            personsNew.setEmail(txtemail.getText());
            personsNew.setAge(Long.valueOf(txtage.getText()));
            personsNew.setIdgender(Long.valueOf(txtgender.getText()));
            personsNew.setIdcity(Long.valueOf(txtciudad.getText()));
        }
        return personsNew;
    }
}

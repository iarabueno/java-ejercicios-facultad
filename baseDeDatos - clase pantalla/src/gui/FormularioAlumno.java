package gui;

import entidades.Alumno;
import service.ServiceAlumno;
import service.ServiceException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAlumno extends JPanel {
    ServiceAlumno serviceAlumno;
    PanelManager panel;
    JPanel formularioAlumno;
    JLabel jLabelnombre;
    JLabel jLabelApellido;
    JTextField jTextFieldNombre;
    JTextField jTextFieldApellido;
    JButton jButtonGrabar;

    public FormularioAlumno(PanelManager panel)
    {
        this.panel=panel;
        armarFormulario();
    }
    public void armarFormulario()
    {
        serviceAlumno=new ServiceAlumno();
        formularioAlumno=new JPanel();
        formularioAlumno.setLayout(new GridLayout(2,4));
        jLabelnombre=new JLabel("Nombre");
        jTextFieldNombre=new JTextField(20);

        jButtonGrabar=new JButton("Grabar");
        formularioAlumno.add(jLabelnombre);
        jButtonGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno alumno=new Alumno();
                alumno.setNombre(jTextFieldNombre.getText());
                try {
                    serviceAlumno.guardar(alumno);
                }
                catch (ServiceException s)
                {
                    JOptionPane.showMessageDialog(null,"No se pudo guardar");
                }
            }
        });

        setLayout(new BorderLayout());
        add(formularioAlumno,BorderLayout.CENTER);
    }
}

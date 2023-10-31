package gui;

import javax.swing.*;
import java.awt.*;

public class PanelManager {
    private FormularioAlumno formularioAlumno;
    JFrame jFrame;

    public PanelManager(int tipo)
    {
        jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if (tipo==1)
            formularioAlumno=new FormularioAlumno(this);
        mostrar(formularioAlumno);
    }
    public void mostrar(JPanel panel)
    {
        jFrame.getContentPane().removeAll();
        jFrame.getContentPane().add(BorderLayout.SOUTH,panel);
        jFrame.getContentPane().validate();
        jFrame.getContentPane().repaint();
        jFrame.show();
        jFrame.pack();
    }
}

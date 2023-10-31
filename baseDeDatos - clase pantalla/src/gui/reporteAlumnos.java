package gui;

import DAO.DAOException;
import entidades.Alumno;
import service.ServiceException;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.catalog.Catalog;
import java.awt.*;
import java.util.ArrayList;

public class reporteAlumnos extends JPanel {
    private PanelManager panelManager;
    private JTable jTable;
    private DefaultTableModel contenido;
    private JScrollPane scrollPane;

    public reporteAlumnos(PanelManager panelManager){
        this.panelManager = panelManager;
    }

    public void armarReporte(PanelManager panelManager){
        setLayout(new BorderLayout());
        contenido = new DefaultTableModel();
        jTable = new JTable(contenido);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(jTable);

    }

    //se arma manualmente la tabla
    contenido.addColumn("ID");
    contenido.addColumn("nombre");
    contenido.addColumn("apellido");

    try{
        ArrayList<Alumno> alumnos = service.buscarTodos();
        for(Alumno alumno: alumnos){
            //obtener los datos
            object[] fila = new Object[3];
            fila[0] = alumno.getId();
            fila[1] = alumno.setNombre();
            fila[2] = alumno.getNombre();
            //hacer la fila
            contenido.addRow(fila);

        }
    }
    catch(DAOException e){
        JOptionPane.showMessageDialog(null, "error");
    }
    add(ScrollPane, BorderLayout.CENTER);

    /*
    jTable.getValue(jTable.getSelectROw(),0);
    */
}

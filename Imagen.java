/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectosemestral;

import javax.swing.*;

public class Imagen
{
    private JFrame ventana;
    private JPanel contenedor;
    private JLabel etiqueta;
 
    public Imagen()
    {
        ventana = new JFrame("Mostrar una imagen");
        contenedor = new JPanel();
        etiqueta = new JLabel(new ImageIcon("homero.jpg"));
    }

    public void mostrarVentana()
    {
        contenedor.add(etiqueta);
        ventana.getContentPane().add(contenedor);
        ventana.pack();
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main (String[] args)
    {
        Imagen mostrar = new Imagen();
        mostrar.mostrarVentana();
    }
}

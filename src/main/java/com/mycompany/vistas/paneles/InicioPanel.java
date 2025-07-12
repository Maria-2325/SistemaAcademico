package com.mycompany.vistas.paneles;

import javax.swing.*;
import java.awt.*;

public class InicioPanel extends javax.swing.JPanel {

    public InicioPanel() {
        initComponents();
        setBackground(new java.awt.Color(255, 255, 255));
    }

    private void initComponents() {
        // Crear componentes
        JLabel tituloLabel = new JLabel();
        JLabel subtituloLabel = new JLabel();
        JLabel descripcionLabel = new JLabel();
        JLabel logoLabel = new JLabel();
        JPanel contenidoPanel = new JPanel();
        JPanel logoPanel = new JPanel();
        
        // Configurar panel principal
        setLayout(new BorderLayout());
        
        // Configurar panel de logo
        logoPanel.setBackground(new Color(255, 255, 255));
        logoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        
        // Configurar logo (si existe la imagen)
        try {
            ImageIcon logoIcon = new ImageIcon(getClass().getResource("/img/png/imagesU.jpeg"));
            if (logoIcon.getIconWidth() > 0) {
                // Redimensionar imagen si es necesario
                Image img = logoIcon.getImage();
                Image newImg = img.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                logoIcon = new ImageIcon(newImg);
            }
            logoLabel.setIcon(logoIcon);
        } catch (Exception e) {
            logoLabel.setFont(new Font("Arial", Font.PLAIN, 80));
        }
        
        logoPanel.add(logoLabel);
        
        // Configurar panel de contenido
        contenidoPanel.setBackground(new Color(255, 255, 255));
        contenidoPanel.setLayout(new BoxLayout(contenidoPanel, BoxLayout.Y_AXIS));
        contenidoPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 50, 50));
        
        // Configurar título
        tituloLabel.setText("BIENVENIDO AL SISTEMA ACADÉMICO");
        tituloLabel.setFont(new Font("Roboto", Font.BOLD, 28));
        tituloLabel.setForeground(new Color(29, 107, 140));
        tituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Configurar subtítulo
        subtituloLabel.setText("Universidad San William");
        subtituloLabel.setFont(new Font("Roboto", Font.PLAIN, 18));
        subtituloLabel.setForeground(new Color(102, 102, 102));
        subtituloLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Agregar componentes al panel de contenido
        contenidoPanel.add(Box.createVerticalStrut(30));
        contenidoPanel.add(tituloLabel);
        contenidoPanel.add(Box.createVerticalStrut(10));
        contenidoPanel.add(subtituloLabel);
        contenidoPanel.add(Box.createVerticalStrut(30));
        contenidoPanel.add(descripcionLabel);
        contenidoPanel.add(Box.createVerticalGlue());
        
        // Agregar paneles al panel principal
        add(logoPanel, BorderLayout.NORTH);
        add(contenidoPanel, BorderLayout.CENTER);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.licef.lompad;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/**
 *
 * @author I7 MAX
 */
public class MultipleCheckAPIComponent extends FormComponent{
    
    JPanel jPanelGrid;


    JRadioButton jRadioButtonZ;
    
    JRadioButton jRadioButtonplus;
    JRadioButton jRadioButtonplus2;
    JRadioButton jRadioButtonplus3;
    JRadioButton jRadioButtonplus4;
    JRadioButton jRadioButtonplus5;
    JRadioButton jRadioButtonplus6;
    JRadioButton jRadioButtonplus7;
    JRadioButton jRadioButtonplus8;
    JRadioButton jRadioButtonplus9;
    JRadioButton jRadioButtonplus10;
    
    JToggleButton boton;
    JLabel label1;
    
    
    LocalizeJLabel JLabela1;
    LocalizeJLabel JLabela2;
    LocalizeJLabel JLabela3;
    LocalizeJLabel JLabela4;
    LocalizeJLabel JLabela5;
    LocalizeJLabel JLabela6;
    LocalizeJLabel JLabela7;
    LocalizeJLabel JLabela8;
    LocalizeJLabel JLabela9;
    LocalizeJLabel JLabela10;
    LocalizeJLabel JLabela11;
    public MultipleCheckAPIComponent() {
        super(null);
        //JScrollPane jScrollPane = new JScrollPane();
        //jScrollPane.setBorder(new javax.swing.border.EmptyBorder(jScrollPane.getInsets()));
        //jScrollPane.setOpaque(false);
        //jScrollPane.getViewport().setOpaque(false);
        jPanelGrid = new JPanel();
        jPanelGrid.setOpaque(false);
        jPanelGrid.setLayout(new GridLayout(0, 1));
        jPanelGrid.setAlignmentY(0.0F);
        Box box1 = Box.createVerticalBox();
        Box box2 = Box.createVerticalBox();
        Box box3 = Box.createVerticalBox();
        Box boxlabel1 = Box.createVerticalBox();
        Box boxlabel2 = Box.createVerticalBox();
        Box boxlabel3 = Box.createVerticalBox();
        Box general = Box.createHorizontalBox();
        //jScrollPane.getViewport().add(box1);
        jPanelGauche.add(general,boton);
   
        Font fontLabel = new Font("Dialog", Font.PLAIN, 11);
        JLabela1= new LocalizeJLabel("10.5.1.1");
        jRadioButtonZ = new JRadioButton(" ");
        jRadioButtonZ.setFont(fontLabel);
        
        JLabela2= new LocalizeJLabel("10.5.1.2");
        jRadioButtonplus = new JRadioButton(" ");
        jRadioButtonplus.setFont(fontLabel);
        
        JLabela3= new LocalizeJLabel("10.5.1.3");
        jRadioButtonplus2 = new JRadioButton(" ");
        jRadioButtonplus2.setFont(fontLabel);
        
        JLabela4= new LocalizeJLabel("10.5.1.4");
        jRadioButtonplus3 = new JRadioButton(" ");
        jRadioButtonplus3.setFont(fontLabel);
        
        JLabela5= new LocalizeJLabel("10.5.1.5");
        jRadioButtonplus4 = new JRadioButton(" ");
        jRadioButtonplus4.setFont(fontLabel);
        
        JLabela6= new LocalizeJLabel("10.5.1.6");
        jRadioButtonplus5 = new JRadioButton(" ");
        jRadioButtonplus5.setFont(fontLabel);
        
        JLabela7= new LocalizeJLabel("10.5.1.7");
        jRadioButtonplus6 = new JRadioButton(" ");
        jRadioButtonplus6.setFont(fontLabel);
        
        JLabela8= new LocalizeJLabel("10.5.1.8");
        jRadioButtonplus7 = new JRadioButton(" ");
        jRadioButtonplus7.setFont(fontLabel);
        
        JLabela9= new LocalizeJLabel("10.5.1.9");
        jRadioButtonplus8 = new JRadioButton(" ");
        jRadioButtonplus8.setFont(fontLabel);
        
        JLabela10= new LocalizeJLabel("10.5.1.10");
        jRadioButtonplus9 = new JRadioButton(" ");
        jRadioButtonplus9.setFont(fontLabel);
        
        JLabela11= new LocalizeJLabel("10.5.1.11");
        jRadioButtonplus10 = new JRadioButton(" ");
        jRadioButtonplus10.setFont(fontLabel);
        
        general.add(box1);
        general.add(boxlabel1);
        general.add(box2);
        general.add(boxlabel2);
        general.add(box3);
        general.add(boxlabel3);
        
        label1=new JLabel("    ");
        label1.setPreferredSize(new Dimension(25, 25));
        label1.setMaximumSize(new Dimension(25, 25));
            
        boton=new JToggleButton(Util.plusIcon);
        boton.setMargin(new Insets(1, 1, 1, 2));
        boton.setPreferredSize(new Dimension(24, 24));
        boton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    jRadioButtonplus.setVisible(true);
                    jRadioButtonplus2.setVisible(true);
                    jRadioButtonplus3.setVisible(true);
                    jRadioButtonplus4.setVisible(true);
                    jRadioButtonplus5.setVisible(true);
                    jRadioButtonplus6.setVisible(true);
                    jRadioButtonplus7.setVisible(true);
                    jRadioButtonplus8.setVisible(true);
                    jRadioButtonplus9.setVisible(true);
                    jRadioButtonplus10.setVisible(true);
                    JLabela2.setVisible(true);
                    JLabela3.setVisible(true);
                    JLabela4.setVisible(true);
                    JLabela5.setVisible(true);
                    JLabela6.setVisible(true);
                    JLabela7.setVisible(true);
                    JLabela8.setVisible(true);
                    JLabela9.setVisible(true);
                    JLabela10.setVisible(true);
                    JLabela11.setVisible(true);
                    
                } else {
                    jRadioButtonplus.setVisible(false);
                    jRadioButtonplus2.setVisible(false);
                    jRadioButtonplus3.setVisible(false);
                    jRadioButtonplus4.setVisible(false);
                    jRadioButtonplus5.setVisible(false);
                    jRadioButtonplus6.setVisible(false);
                    jRadioButtonplus7.setVisible(false);
                    jRadioButtonplus8.setVisible(false);
                    jRadioButtonplus9.setVisible(false);
                    jRadioButtonplus10.setVisible(false);
                    JLabela2.setVisible(false);
                    JLabela3.setVisible(false);
                    JLabela4.setVisible(false);
                    JLabela5.setVisible(false);
                    JLabela6.setVisible(false);
                    JLabela7.setVisible(false);
                    JLabela8.setVisible(false);
                    JLabela9.setVisible(false);
                    JLabela10.setVisible(false);
                    JLabela11.setVisible(false);
                    
                }
            }

        });
        jRadioButtonplus.setVisible(false);
        jRadioButtonplus2.setVisible(false);
        jRadioButtonplus3.setVisible(false);
        jRadioButtonplus4.setVisible(false);
        jRadioButtonplus5.setVisible(false);
        jRadioButtonplus6.setVisible(false);
        jRadioButtonplus7.setVisible(false);
        jRadioButtonplus8.setVisible(false);
        jRadioButtonplus9.setVisible(false);
        jRadioButtonplus10.setVisible(false);
        JLabela2.setVisible(false);
        JLabela3.setVisible(false);
        JLabela4.setVisible(false);
        JLabela5.setVisible(false);
        JLabela6.setVisible(false);
        JLabela7.setVisible(false);
        JLabela8.setVisible(false);
        JLabela9.setVisible(false);
        JLabela10.setVisible(false);
        JLabela11.setVisible(false);
        
    
        box1.add(label1);
        box1.add(jRadioButtonZ);
        box1.add(boton);
        
        box2.add(jRadioButtonplus);
        box2.add(jRadioButtonplus2);
        box2.add(jRadioButtonplus3);
        box2.add(jRadioButtonplus4);
        box2.add(jRadioButtonplus5);
        
        box3.add(jRadioButtonplus6);
        box3.add(jRadioButtonplus7);
        box3.add(jRadioButtonplus8);
        box3.add(jRadioButtonplus9);
        box3.add(jRadioButtonplus10);
        
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabela1);
        boxlabel1.add(Box.createVerticalStrut(7));
        
        boxlabel2.add(JLabela2);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabela3);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabela4);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabela5);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabela6);
        boxlabel2.add(Box.createVerticalStrut(3));
        
        boxlabel3.add(JLabela7);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabela8);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabela9);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabela10);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabela11);
        boxlabel3.add(Box.createVerticalStrut(3));
  
        
    }
    boolean isFilled() {
        return true;
    }
    class SymMouse extends java.awt.event.MouseAdapter {
        public void mouseEntered(java.awt.event.MouseEvent event) {
            Object object = event.getSource();
            if (object instanceof JButton)
                jButton_mouseInOut((JButton) object, true);
        }

        public void mouseExited(java.awt.event.MouseEvent event) {
            Object object = event.getSource();
            if (object instanceof JButton)
                jButton_mouseInOut((JButton) object, false);
        }
    }

    void jButton_mouseInOut(JButton jButton, boolean in) {
        jButton.setBorderPainted(in);
    }

    //XML
    String toXML(String key) {
        String xml = "";
        String xmlok = "";
                    String xmlTime = "";
                    String xmlsep1 = "<br>";
                    String xmlsep2 = "</br>";
                    if (jRadioButtonZ.isSelected()) {
                       xmlTime +=xmlsep1+"ARIA"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus = "";
                    if (jRadioButtonplus.isSelected()) {
                       xmlplus +=xmlsep1+"androidAccessibility"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus2 = "";
                    if (jRadioButtonplus2.isSelected()) {
                       xmlplus2 +=xmlsep1+"ATK"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus3 = "";
                    if (jRadioButtonplus3.isSelected()) {
                       xmlplus3 +=xmlsep1+"AT-SPI"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus4= "";
                    if (jRadioButtonplus4.isSelected()) {
                       xmlplus4 +=xmlsep1+"blackberryAccessibility"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus5 = "";
                    if (jRadioButtonplus5.isSelected()) {
                       xmlplus5 +=xmlsep1+"iAccessible2"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus6 = "";
                    if (jRadioButtonplus6.isSelected()) {
                       xmlplus6 +=xmlsep1+"iOSAccessibility"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus7 = "";
                    if (jRadioButtonplus7.isSelected()) {
                       xmlplus7 +=xmlsep1+"javaAccessibility"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus8 = "";
                    if (jRadioButtonplus8.isSelected()) {
                       xmlplus8 +=xmlsep1+"macOSXAccessibility"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus9 = "";
                    if (jRadioButtonplus9.isSelected()) {
                       xmlplus9 +=xmlsep1+"MSAA"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus10 = "";
                    if (jRadioButtonplus10.isSelected()) {
                       xmlplus10 +=xmlsep1+"UIAutomation"+xmlsep2;
                       xmlok += "ok";
                    }

                    if (!"".equals(xmlok))
                        xml +=xmlTime +
                                xmlplus+
                                xmlplus2+
                                xmlplus3+
                                xmlplus4+
                                xmlplus5+
                                xmlplus6+
                                xmlplus7+
                                xmlplus8+
                                xmlplus9+
                                xmlplus10;
        if (!xml.equals(""))
            xml = "<" + Util.getTag(key) + ">" + xml +
                    "</" + Util.getTag(key) + ">\n";
        else
            xml = null;

        return xml;
    }


    //HTML
    String toHTML(String key) {
        String html = "";
                    String htmlTime = "";
                    if (jRadioButtonZ.isSelected()) {
                        htmlTime += "Z";
                    }
                    if (!"".equals(htmlTime))
                        html += " " + htmlTime;
  
        if (html.equals(""))
            html = null;
        else
            html += "<br>";

        return html;
    }
    
}

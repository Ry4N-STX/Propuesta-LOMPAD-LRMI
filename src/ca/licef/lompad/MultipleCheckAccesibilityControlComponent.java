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
public class MultipleCheckAccesibilityControlComponent extends FormComponent{
    
    JPanel jPanelGrid;


    JRadioButton jRadioButtonZ;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButtonplus4;
    JRadioButton jRadioButtonplus5;
    JRadioButton jRadioButtonplus6;
    
    JToggleButton boton;
    
    JLabel label1;
    
    LocalizeJLabel JLabelc1;
    LocalizeJLabel JLabelc2;
    LocalizeJLabel JLabelc3;
    LocalizeJLabel JLabelc4;
    LocalizeJLabel JLabelc5;
    LocalizeJLabel JLabelc6;

    
    public MultipleCheckAccesibilityControlComponent() {
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
        Box boxlabel1 = Box.createVerticalBox();
        Box boxlabel2 = Box.createVerticalBox();
        Box general = Box.createHorizontalBox();
        //jScrollPane.getViewport().add(box1);
        jPanelGauche.add(general,boton);
   
        Font fontLabel = new Font("Dialog", Font.PLAIN, 11);
        
        JLabelc1= new LocalizeJLabel("10.4.1.1");
        jRadioButtonZ = new JRadioButton(" ");
        jRadioButtonZ.setFont(fontLabel);
        
        JLabelc2= new LocalizeJLabel("10.4.1.2");
        jRadioButton2 = new JRadioButton(" ");
        jRadioButton2.setFont(fontLabel);
        
        JLabelc3= new LocalizeJLabel("10.4.1.3");
        jRadioButton3 = new JRadioButton(" ");
        jRadioButton3.setFont(fontLabel);
        
        JLabelc4= new LocalizeJLabel("10.4.1.4");
        jRadioButtonplus4 = new JRadioButton(" ");
        jRadioButtonplus4.setFont(fontLabel);
        
        JLabelc5= new LocalizeJLabel("10.4.1.5");
        jRadioButtonplus5 = new JRadioButton(" ");
        jRadioButtonplus5.setFont(fontLabel);
        
        JLabelc6= new LocalizeJLabel("10.4.1.6");
        jRadioButtonplus6 = new JRadioButton(" ");
        jRadioButtonplus6.setFont(fontLabel);
        
        general.add(box1);
        general.add(boxlabel1);
        general.add(box2);
        general.add(boxlabel2);
        
        label1=new JLabel("    ");
        label1.setPreferredSize(new Dimension(24, 24));
        label1.setMaximumSize(new Dimension(24, 30));
        boton=new JToggleButton(Util.plusIcon);
        boton.setMargin(new Insets(1, 1, 1, 2));
        boton.setPreferredSize(new Dimension(24, 24));
        boton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    jRadioButtonplus4.setVisible(true);
                    jRadioButtonplus5.setVisible(true);
                    jRadioButtonplus6.setVisible(true);
                    label1.setVisible(true);  
                    JLabelc4.setVisible(true);
                    JLabelc5.setVisible(true);
                    JLabelc6.setVisible(true);
    
                } else {
                    jRadioButtonplus4.setVisible(false);
                    jRadioButtonplus5.setVisible(false);
                    jRadioButtonplus6.setVisible(false);
                    label1.setVisible(false);
                    JLabelc4.setVisible(false);
                    JLabelc5.setVisible(false);
                    JLabelc6.setVisible(false);
                }
            }

        });
        jRadioButtonplus4.setVisible(false);
        jRadioButtonplus5.setVisible(false);
        jRadioButtonplus6.setVisible(false);
        label1.setVisible(false);
        JLabelc4.setVisible(false);
        JLabelc5.setVisible(false);
        JLabelc6.setVisible(false);
        
        box1.add(jRadioButtonZ);
        box1.add(jRadioButton2);
        box1.add(jRadioButton3);
        box1.add(boton);
        box2.add(jRadioButtonplus4);
        box2.add(jRadioButtonplus5);
        box2.add(jRadioButtonplus6);
        box2.add(label1);
        
        boxlabel1.add(JLabelc1);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabelc2);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabelc3);
        boxlabel1.add(Box.createVerticalStrut(26));
        
        boxlabel2.add(JLabelc4);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabelc5);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabelc6);
        boxlabel2.add(Box.createVerticalStrut(26));
   
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
                       xmlTime +=xmlsep1+"fullKeyboardControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml2 = "";
                    if (jRadioButton2.isSelected()) {
                       xml2 +=xmlsep1+"fullMouseControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml3 = "";
                    if (jRadioButton3.isSelected()) {
                       xml3 +=xmlsep1+"fullVoiceControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml4 = "";
                    if (jRadioButtonplus4.isSelected()) {
                       xml4 +=xmlsep1+"fullSwitchControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml5 = "";
                    if (jRadioButtonplus5.isSelected()) {
                       xml5 +=xmlsep1+"fullTouchControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml6 = "";
                    if (jRadioButtonplus6.isSelected()) {
                       xml6 +=xmlsep1+"fullVideoControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    if (!"".equals(xmlok))
                        xml +=xmlTime + xml2 + xml3+ xml4+ xml5+ xml6 ;
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

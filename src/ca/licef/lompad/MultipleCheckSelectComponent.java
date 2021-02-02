/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.licef.lompad;

/**
 *
 * @author I7 MAX
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MultipleCheckSelectComponent extends FormComponent{
    JPanel jPanelGrid;


    JRadioButton jRadioButtonZ;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JRadioButton jRadioButton5;
    JRadioButton jRadioButton6;
    JRadioButton jRadioButton7;
    JRadioButton jRadioButton8;
    JRadioButton jRadioButton9;
    JRadioButton jRadioButton10;
    
    JRadioButton jRadioButtonplus;
    JRadioButton jRadioButtonplus_2;
    JRadioButton jRadioButtonplus_3;
    JRadioButton jRadioButtonplus_4;
    JRadioButton jRadioButtonplus_5;
    JRadioButton jRadioButtonplus_6;
    JRadioButton jRadioButtonplus_7;
    JRadioButton jRadioButtonplus_8;
    JRadioButton jRadioButtonplus_9;
    JRadioButton jRadioButtonplus_10;
    
    JRadioButton jRadioButtonplus_11;
    JRadioButton jRadioButtonplus_12;
    JRadioButton jRadioButtonplus_13;
    JRadioButton jRadioButtonplus_14;
    JRadioButton jRadioButtonplus_15;
    JRadioButton jRadioButtonplus_16;
    JRadioButton jRadioButtonplus_17;
    JRadioButton jRadioButtonplus_18;
    JRadioButton jRadioButtonplus_19;
    
    JToggleButton boton;
    LocalizeJLabel JLabel_n1;
    LocalizeJLabel JLabel_n2;
    LocalizeJLabel JLabel_n3;
    LocalizeJLabel JLabel_n4;
    LocalizeJLabel JLabel_n5;
    LocalizeJLabel JLabel_n6;
    LocalizeJLabel JLabel_n7;
    LocalizeJLabel JLabel_n8;
    LocalizeJLabel JLabel_n9;
    LocalizeJLabel JLabel_n10;
    
    LocalizeJLabel JLabel_m1;
    LocalizeJLabel JLabel_m2;
    LocalizeJLabel JLabel_m3;
    LocalizeJLabel JLabel_m4;
    LocalizeJLabel JLabel_m5;
    LocalizeJLabel JLabel_m6;
    LocalizeJLabel JLabel_m7;
    LocalizeJLabel JLabel_m8;
    LocalizeJLabel JLabel_m9;
    LocalizeJLabel JLabel_m10;
    
    LocalizeJLabel JLabel_o1;
    LocalizeJLabel JLabel_o2;
    LocalizeJLabel JLabel_o3;
    LocalizeJLabel JLabel_o4;
    LocalizeJLabel JLabel_o5;
    LocalizeJLabel JLabel_o6;
    LocalizeJLabel JLabel_o7;
    LocalizeJLabel JLabel_o8;
    LocalizeJLabel JLabel_o9;
    

    public MultipleCheckSelectComponent() {
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
        Box General = Box.createHorizontalBox();
        //jScrollPane.getViewport().add(jPanelGrid);        
 
        jPanelGauche.add(General,boton);
        Font fontLabel = new Font("Dialog", Font.PLAIN, 11);
        
        JLabel_n1= new LocalizeJLabel("10.2.1.1");
        jRadioButtonZ = new JRadioButton(" ");
        jRadioButtonZ.setFont(fontLabel);
        
        JLabel_n2= new LocalizeJLabel("10.2.1.2");
        jRadioButton2 = new JRadioButton(" ");
        jRadioButton2.setFont(fontLabel);
        
        JLabel_n3= new LocalizeJLabel("10.2.1.3");
        jRadioButton3 = new JRadioButton(" ");
        jRadioButton3.setFont(fontLabel);
        
        JLabel_n4= new LocalizeJLabel("10.2.1.4");
        jRadioButton4 = new JRadioButton(" ");
        jRadioButton4.setFont(fontLabel);
        
        JLabel_n5= new LocalizeJLabel("10.2.1.5");
        jRadioButton5 = new JRadioButton(" ");
        jRadioButton5.setFont(fontLabel);
        
        JLabel_n6= new LocalizeJLabel("10.2.1.6");
        jRadioButton6 = new JRadioButton(" ");
        jRadioButton6.setFont(fontLabel);
        
        JLabel_n7= new LocalizeJLabel("10.2.1.7");
        jRadioButton7 = new JRadioButton(" ");
        jRadioButton7.setFont(fontLabel);
        
        JLabel_n8= new LocalizeJLabel("10.2.1.8");
        jRadioButton8 = new JRadioButton(" ");
        jRadioButton8.setFont(fontLabel);
        
        JLabel_n9= new LocalizeJLabel("10.2.1.9");
        jRadioButton9 = new JRadioButton(" ");
        jRadioButton9.setFont(fontLabel);
        
        JLabel_n10= new LocalizeJLabel("10.2.1.10");
        jRadioButton10 = new JRadioButton(" ");
        jRadioButton10.setFont(fontLabel);
        
        JLabel_m1= new LocalizeJLabel("10.2.1.11");
        jRadioButtonplus = new JRadioButton(" ");
        jRadioButtonplus.setFont(fontLabel);
        
        JLabel_m2= new LocalizeJLabel("10.2.1.12");
        jRadioButtonplus_2 = new JRadioButton(" ");
        jRadioButtonplus_2.setFont(fontLabel);
        
        JLabel_m3= new LocalizeJLabel("10.2.1.13");
        jRadioButtonplus_3 = new JRadioButton(" ");
        jRadioButtonplus_3.setFont(fontLabel);
        
        JLabel_m4= new LocalizeJLabel("10.2.1.14");
        jRadioButtonplus_4 = new JRadioButton(" ");
        jRadioButtonplus_4.setFont(fontLabel);
        
        JLabel_m5= new LocalizeJLabel("10.2.1.15");
        jRadioButtonplus_5 = new JRadioButton(" ");
        jRadioButtonplus_5.setFont(fontLabel);
        
        JLabel_m6= new LocalizeJLabel("10.2.1.16");
        jRadioButtonplus_6 = new JRadioButton(" ");
        jRadioButtonplus_6.setFont(fontLabel);
        
        JLabel_m7= new LocalizeJLabel("10.2.1.17");
        jRadioButtonplus_7 = new JRadioButton(" ");
        jRadioButtonplus_7.setFont(fontLabel);
        
        JLabel_m8= new LocalizeJLabel("10.2.1.18");
        jRadioButtonplus_8 = new JRadioButton(" ");
        jRadioButtonplus_8.setFont(fontLabel);
        
        JLabel_m9= new LocalizeJLabel("10.2.1.19");
        jRadioButtonplus_9 = new JRadioButton(" ");
        jRadioButtonplus_9.setFont(fontLabel);
        
        JLabel_m10= new LocalizeJLabel("10.2.1.20");
        jRadioButtonplus_10 = new JRadioButton(" ");
        jRadioButtonplus_10.setFont(fontLabel);
        
        JLabel_o1= new LocalizeJLabel("10.2.1.21");
        jRadioButtonplus_11 = new JRadioButton(" ");
        jRadioButtonplus_11.setFont(fontLabel);
        
        JLabel_o2= new LocalizeJLabel("10.2.1.22");
        jRadioButtonplus_12 = new JRadioButton(" ");
        jRadioButtonplus_12.setFont(fontLabel);
        
        JLabel_o3= new LocalizeJLabel("10.2.1.23");
        jRadioButtonplus_13 = new JRadioButton(" ");
        jRadioButtonplus_13.setFont(fontLabel);
        
        JLabel_o4= new LocalizeJLabel("10.2.1.24");
        jRadioButtonplus_14 = new JRadioButton(" ");
        jRadioButtonplus_14.setFont(fontLabel);
        
        JLabel_o5= new LocalizeJLabel("10.2.1.25");
        jRadioButtonplus_15 = new JRadioButton();
        jRadioButtonplus_15.setFont(fontLabel);
        
        JLabel_o6= new LocalizeJLabel("10.2.1.26");
        jRadioButtonplus_16 = new JRadioButton(" ");
        jRadioButtonplus_16.setFont(fontLabel);
        
        JLabel_o7= new LocalizeJLabel("10.2.1.27");
        jRadioButtonplus_17 = new JRadioButton(" ");
        jRadioButtonplus_17.setFont(fontLabel);
        
        JLabel_o8= new LocalizeJLabel("10.2.1.28");
        jRadioButtonplus_18 = new JRadioButton(" ");
        jRadioButtonplus_18.setFont(fontLabel);
        
        JLabel_o9= new LocalizeJLabel("10.2.1.29");
        jRadioButtonplus_19 = new JRadioButton(" ");
        jRadioButtonplus_19.setFont(fontLabel);
         
        General.add(box1);
        //General.add(Box.createHorizontalStrut(50));
        General.add(boxlabel1);
        //General.add(Box.createHorizontalStrut(50));
        General.add(box2);
        //General.add(Box.createHorizontalStrut(50));
        General.add(boxlabel2);
        //General.add(Box.createHorizontalStrut(50));
        General.add(box3);
        //General.add(Box.createHorizontalStrut(50));
        General.add(boxlabel3);
        
        boton=new JToggleButton(Util.plusIcon);
        boton.setMargin(new Insets(1, 1, 1, 2));
        boton.setPreferredSize(new Dimension(24, 24));
        boton.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                int estado = itemEvent.getStateChange();
                if(estado == ItemEvent.SELECTED){
                    jRadioButtonplus.setVisible(true);
                    jRadioButtonplus_2.setVisible(true);
                    jRadioButtonplus_3.setVisible(true);
                    jRadioButtonplus_4.setVisible(true);
                    jRadioButtonplus_5.setVisible(true);
                    jRadioButtonplus_6.setVisible(true);
                    jRadioButtonplus_7.setVisible(true);
                    jRadioButtonplus_8.setVisible(true);
                    jRadioButtonplus_9.setVisible(true);
                    jRadioButtonplus_10.setVisible(true);
                    jRadioButtonplus_11.setVisible(true);
                    jRadioButtonplus_12.setVisible(true);
                    jRadioButtonplus_13.setVisible(true);
                    jRadioButtonplus_14.setVisible(true);
                    jRadioButtonplus_15.setVisible(true);
                    jRadioButtonplus_16.setVisible(true);
                    jRadioButtonplus_17.setVisible(true);
                    jRadioButtonplus_18.setVisible(true);
                    jRadioButtonplus_19.setVisible(true);
                    JLabel_m1.setVisible(true);
                    JLabel_m2.setVisible(true);
                    JLabel_m3.setVisible(true);
                    JLabel_m4.setVisible(true);
                    JLabel_m5.setVisible(true);
                    JLabel_m6.setVisible(true);
                    JLabel_m7.setVisible(true);
                    JLabel_m8.setVisible(true);
                    JLabel_m9.setVisible(true);
                    JLabel_m10.setVisible(true);
                    JLabel_o1.setVisible(true);
                    JLabel_o2.setVisible(true);
                    JLabel_o3.setVisible(true);
                    JLabel_o4.setVisible(true);
                    JLabel_o5.setVisible(true);
                    JLabel_o6.setVisible(true);
                    JLabel_o7.setVisible(true);
                    JLabel_o8.setVisible(true);
                    JLabel_o9.setVisible(true);              
                } else {
                    jRadioButtonplus.setVisible(false);
                    jRadioButtonplus_2.setVisible(false);
                    jRadioButtonplus_3.setVisible(false);
                    jRadioButtonplus_4.setVisible(false);
                    jRadioButtonplus_5.setVisible(false);
                    jRadioButtonplus_6.setVisible(false);
                    jRadioButtonplus_7.setVisible(false);
                    jRadioButtonplus_8.setVisible(false);
                    jRadioButtonplus_9.setVisible(false);
                    jRadioButtonplus_10.setVisible(false);
                    jRadioButtonplus_11.setVisible(false);
                    jRadioButtonplus_12.setVisible(false);
                    jRadioButtonplus_13.setVisible(false);
                    jRadioButtonplus_14.setVisible(false);
                    jRadioButtonplus_15.setVisible(false);
                    jRadioButtonplus_16.setVisible(false);
                    jRadioButtonplus_17.setVisible(false);
                    jRadioButtonplus_18.setVisible(false);
                    jRadioButtonplus_19.setVisible(false);
                    JLabel_m1.setVisible(false);
                    JLabel_m2.setVisible(false);
                    JLabel_m3.setVisible(false);
                    JLabel_m4.setVisible(false);
                    JLabel_m5.setVisible(false);
                    JLabel_m6.setVisible(false);
                    JLabel_m7.setVisible(false);
                    JLabel_m8.setVisible(false);
                    JLabel_m9.setVisible(false);
                    JLabel_m10.setVisible(false);
                    JLabel_o1.setVisible(false);
                    JLabel_o2.setVisible(false);
                    JLabel_o3.setVisible(false);
                    JLabel_o4.setVisible(false);
                    JLabel_o5.setVisible(false);
                    JLabel_o6.setVisible(false);
                    JLabel_o7.setVisible(false);
                    JLabel_o8.setVisible(false);
                    JLabel_o9.setVisible(false);
                    
                }
            }

        });
        
        jRadioButtonplus.setVisible(false);
        jRadioButtonplus_2.setVisible(false);
        jRadioButtonplus_3.setVisible(false);
        jRadioButtonplus_4.setVisible(false);
        jRadioButtonplus_5.setVisible(false);
        jRadioButtonplus_6.setVisible(false);
        jRadioButtonplus_7.setVisible(false);
        jRadioButtonplus_8.setVisible(false);
        jRadioButtonplus_9.setVisible(false);
        jRadioButtonplus_10.setVisible(false);
        jRadioButtonplus_11.setVisible(false);
        jRadioButtonplus_12.setVisible(false);
        jRadioButtonplus_13.setVisible(false);
        jRadioButtonplus_14.setVisible(false);
        jRadioButtonplus_15.setVisible(false);
        jRadioButtonplus_16.setVisible(false);
        jRadioButtonplus_17.setVisible(false);
        jRadioButtonplus_18.setVisible(false);
        jRadioButtonplus_19.setVisible(false);
        JLabel_m1.setVisible(false);
        JLabel_m2.setVisible(false);
        JLabel_m3.setVisible(false);
        JLabel_m4.setVisible(false);
        JLabel_m5.setVisible(false);
        JLabel_m6.setVisible(false);
        JLabel_m7.setVisible(false);
        JLabel_m8.setVisible(false);
        JLabel_m9.setVisible(false);
        JLabel_m10.setVisible(false);
        JLabel_o1.setVisible(false);
        JLabel_o2.setVisible(false);
        JLabel_o3.setVisible(false);
        JLabel_o4.setVisible(false);
        JLabel_o5.setVisible(false);
        JLabel_o6.setVisible(false);
        JLabel_o7.setVisible(false);
        JLabel_o8.setVisible(false);
        JLabel_o9.setVisible(false);
       
        box1.add(jRadioButtonZ);
        box1.add(jRadioButton2);
        box1.add(jRadioButton3);
        box1.add(jRadioButton4);
        box1.add(jRadioButton5);
        box1.add(jRadioButton6);
        box1.add(jRadioButton7);
        box1.add(jRadioButton8);
        box1.add(jRadioButton9);
        box1.add(jRadioButton10);
        box1.add(boton);
       
        box2.add(jRadioButtonplus);
        box2.add(jRadioButtonplus_2);
        box2.add(jRadioButtonplus_3);
        box2.add(jRadioButtonplus_4);
        box2.add(jRadioButtonplus_5);
        box2.add(jRadioButtonplus_6);
        box2.add(jRadioButtonplus_7);
        box2.add(jRadioButtonplus_8);
        box2.add(jRadioButtonplus_9);
        box2.add(jRadioButtonplus_10);
        
        
        box3.add(jRadioButtonplus_11);
        box3.add(jRadioButtonplus_12);
        box3.add(jRadioButtonplus_13);
        box3.add(jRadioButtonplus_14);
        box3.add(jRadioButtonplus_15);
        box3.add(jRadioButtonplus_16);
        box3.add(jRadioButtonplus_17);
        box3.add(jRadioButtonplus_18);
        box3.add(jRadioButtonplus_19);
        
      
        boxlabel1.add(JLabel_n1);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n2);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n3);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n4);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n5);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n6);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n7);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n8);
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n9); 
        boxlabel1.add(Box.createVerticalStrut(7));
        boxlabel1.add(JLabel_n10);
        boxlabel1.add(Box.createVerticalStrut(21));
        
        boxlabel2.add(JLabel_m1);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m2);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m3);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m4);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m5);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m6);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m7);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m8);
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m9); 
        boxlabel2.add(Box.createVerticalStrut(7));
        boxlabel2.add(JLabel_m10);
        boxlabel2.add(Box.createVerticalStrut(3));
        
        boxlabel3.add(JLabel_o1);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o2);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o3);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o4);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o5);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o6);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o7);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o8);
        boxlabel3.add(Box.createVerticalStrut(7));
        boxlabel3.add(JLabel_o9); 
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
        
        //<br / >
                    String xmlTime = "";
                    String xmlsep1 = "<br>";
                    String xmlsep2 = "</br>";
                 
                    if (jRadioButtonZ.isSelected()) {
                       xmlTime +=xmlsep1+"alternativeText"+xmlsep2;
                       xmlok += "ok";
                       
                    }
                    String xml2 = "";
                    if (jRadioButton2.isSelected()) {
                       xml2 +=xmlsep1+"audioDescription"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml3 = "";
                    if (jRadioButton3.isSelected()) {
                       xml3 +=xmlsep1+"captions"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml4 = "";
                    if (jRadioButton4.isSelected()) {
                       xml4 += xmlsep1+"highContrastDisplay"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml5 = "";
                    if (jRadioButton5.isSelected()) {
                       xml5 +=xmlsep1+ "longDescription"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml6 = "";
                    if (jRadioButton6.isSelected()) {
                       xml6 +=xmlsep1+"signLanguage"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml7 = "";
                    if (jRadioButton7.isSelected()) {
                       xml7 += xmlsep1+"structuralNavigation"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml8 = "";
                    if (jRadioButton8.isSelected()) {
                       xml8 +=xmlsep1+"synchronizedAudioText"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml9 = "";
                    if (jRadioButton9.isSelected()) {
                       xml9 +=xmlsep1+"timingControl"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml10 = "";
                    if (jRadioButton10.isSelected()) {
                       xml10 +=xmlsep1+"transcript"+xmlsep2;
                       xmlok += "ok";
                    }
///////////////////////////////////////////////////////////////////////////////////////////////////
                    String xmlplus = "";
                    if (jRadioButtonplus.isSelected()) {
                       xmlplus +=xmlsep1+"annotations"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus2 = "";
                    if (jRadioButtonplus_2.isSelected()) {
                       xmlplus2 +=xmlsep1+"bookmarks"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus3 = "";
                    if (jRadioButtonplus_3.isSelected()) {
                       xmlplus3 +=xmlsep1+"braille"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus4 = "";
                    if (jRadioButtonplus_4.isSelected()) {
                       xmlplus4 +=xmlsep1+"ChemML"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus5 = "";
                    if (jRadioButtonplus_5.isSelected()) {
                       xmlplus5 +=xmlsep1+"describedMath"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus6 = "";
                    if (jRadioButtonplus_6.isSelected()) {
                       xmlplus6 +=xmlsep1+"index"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus7 = "";
                    if (jRadioButtonplus_7.isSelected()) {
                       xmlplus7 +=xmlsep1+"largePrint"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus8 = "";
                    if (jRadioButtonplus_8.isSelected()) {
                       xmlplus8 +=xmlsep1+"latex"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus9 = "";
                    if (jRadioButtonplus_9.isSelected()) {
                       xmlplus9 +=xmlsep1+"MathML"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus10 = "";
                    if (jRadioButtonplus_10.isSelected()) {
                       xmlplus10 +=xmlsep1+"none"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus11 = "";
                    if (jRadioButtonplus_11.isSelected()) {
                       xmlplus11 +=xmlsep1+"printPageNumbers"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus12 = "";
                    if (jRadioButtonplus_12.isSelected()) {
                       xmlplus12 +=xmlsep1+"eadingOrder"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus13 = "";
                    if (jRadioButtonplus_13.isSelected()) {
                       xmlplus13 +=xmlsep1+"rubyAnnotations"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus14 = "";
                    if (jRadioButtonplus_14.isSelected()) {
                       xmlplus14 +=xmlsep1+"tableOfContents"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus15 = "";
                    if (jRadioButtonplus_15.isSelected()) {
                       xmlplus15 +=xmlsep1+"taggedPDF"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus16 = "";
                    if (jRadioButtonplus_16.isSelected()) {
                       xmlplus16 +=xmlsep1+"tactileGraphic"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus17 = "";
                    if (jRadioButtonplus_17.isSelected()) {
                       xmlplus17 +=xmlsep1+"tactileObject"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus18 = "";
                    if (jRadioButtonplus_18.isSelected()) {
                       xmlplus18 +=xmlsep1+"ttsMarkup"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlplus19 = "";
                    if (jRadioButtonplus_19.isSelected()) {
                       xmlplus19 +=xmlsep1+"unlocked"+xmlsep2;
                       xmlok += "ok";
                    }
                    
///////////////////////////////////////////////////////////////////////////////////////////////////
                    if (!"".equals(xmlok))
                        xml +=xmlTime+xml2+xml3+xml4+xml5+xml6+xml7+xml8+xml9+xml10+
                                xmlplus+
                                xmlplus2+
                                xmlplus3+
                                xmlplus4+
                                xmlplus5+
                                xmlplus6+
                                xmlplus7+
                                xmlplus8+
                                xmlplus9+
                                xmlplus10+
                                xmlplus11+
                                xmlplus12+
                                xmlplus13+
                                xmlplus14+
                                xmlplus15+
                                xmlplus16+
                                xmlplus17+
                                xmlplus18+
                                xmlplus19;
        if (!xml.equals(""))
            xml = "<" + Util.getTag(key) + ">"+ xml +
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

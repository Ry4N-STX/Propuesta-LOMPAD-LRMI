/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.licef.lompad;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.List;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import org.w3c.dom.Element;

/**
 *
 * @author I7 MAX
 */
public class MultipleCheckHazardComponent extends FormComponent{
    
    JPanel jPanelGrid;
    
    JRadioButton jRadioButtonZ;
    JRadioButton jRadioButtonDecal;
    
    JRadioButton jRadioButtonHazard2;
    JRadioButton jRadioButtonHazard2_1;
    
    JRadioButton jRadioButtonHazard3;
    JRadioButton jRadioButtonHazard3_1;
    
    LocalizeJLabel JLabel1;
    LocalizeJLabel JLabel2;
    LocalizeJLabel JLabel3;
    LocalizeJLabel JLabel4;
    LocalizeJLabel JLabel5;
    LocalizeJLabel JLabel6;
    
    public MultipleCheckHazardComponent() {
        super(null);
        //JScrollPane jScrollPane = new JScrollPane();
        //jScrollPane.setBorder(new javax.swing.border.EmptyBorder(jScrollPane.getInsets()));
        //jScrollPane.setOpaque(false);
        //jScrollPane.getViewport().setOpaque(false);
        jPanelGrid = new JPanel();
        jPanelGrid.setOpaque(false);
        jPanelGrid.setLayout(new GridLayout(1, 0));
        jPanelGrid.setAlignmentY(0.0F);
        Box box4 = Box.createVerticalBox();

        jPanelGauche.add(box4);
 
        Font fontLabel = new Font("Dialog", Font.PLAIN, 11);
        
        
        JLabel1= new LocalizeJLabel("10.3.1.1");
        jRadioButtonZ = new JRadioButton(" ");
        jRadioButtonZ.setFont(fontLabel);
        
        JLabel2= new LocalizeJLabel("10.3.1.2");
        jRadioButtonDecal = new JRadioButton(" ");
        jRadioButtonDecal.setFont(fontLabel);
        
        JLabel3= new LocalizeJLabel("10.3.1.3");
        jRadioButtonHazard2 = new JRadioButton(" ");
        jRadioButtonHazard2.setFont(fontLabel);
        
        JLabel4= new LocalizeJLabel("10.3.1.4");
        jRadioButtonHazard2_1 = new JRadioButton(" ");
        jRadioButtonHazard2_1.setFont(fontLabel);
        
        JLabel5= new LocalizeJLabel("10.3.1.5");
        jRadioButtonHazard3 = new JRadioButton(" ");
        jRadioButtonHazard3.setFont(fontLabel);
        
        JLabel6= new LocalizeJLabel("10.3.1.6");
        jRadioButtonHazard3_1 = new JRadioButton(" ");
        jRadioButtonHazard3_1.setFont(fontLabel);   
   
        Box box1 = Box.createHorizontalBox();
        Box box2 = Box.createHorizontalBox();
        Box box3 = Box.createHorizontalBox();

        box1.add(jRadioButtonZ);
        box1.add(JLabel1);
        box1.add(Box.createHorizontalStrut(100));
        box1.add(jRadioButtonDecal);
        box1.add(JLabel2);
        box1.add(Box.createHorizontalStrut(100));
        
        
        box2.add(jRadioButtonHazard2);
        box2.add(JLabel3);
        box2.add(Box.createHorizontalStrut(100));
        box2.add(jRadioButtonHazard2_1);
        box2.add(JLabel4);
        box2.add(Box.createHorizontalStrut(100));
        
        
        box3.add(jRadioButtonHazard3);
        box3.add(JLabel5);
        box3.add(Box.createHorizontalStrut(100));
        box3.add(jRadioButtonHazard3_1);
        box3.add(JLabel6);
        box3.add(Box.createHorizontalStrut(100));
  
        box4.add(box1);
        box4.add(box2);
        box4.add(box3);

        MultipleCheckHazardComponent.SymAction lSymAction = new MultipleCheckHazardComponent.SymAction();
        jRadioButtonZ.addActionListener(lSymAction);
        jRadioButtonDecal.addActionListener(lSymAction);
        jRadioButtonHazard2.addActionListener(lSymAction);
        jRadioButtonHazard2_1.addActionListener(lSymAction);
        jRadioButtonHazard3.addActionListener(lSymAction);
        jRadioButtonHazard3_1.addActionListener(lSymAction);

        setEnabledTZ(false);
        
    }
    boolean isFilled() {
        return true;
    }

    public void setEnabled(boolean b) {
       // jTextFieldYear.setEditable(b);
       // jTextFieldYear.setBackground(Color.white);
      //  jTextFieldMonth.setEditable(b);
       // jTextFieldMonth.setBackground(Color.white);
       // jTextFieldDay.setEditable(b);
      //  jTextFieldDay.setBackground(Color.white);
       // jTextFieldHour.setEditable(b);
       // jTextFieldHour.setBackground(Color.white);
      //  jTextFieldMin.setEditable(b);
       // jTextFieldMin.setBackground(Color.white);
       // jTextFieldSec.setEditable(b);
       // jTextFieldSec.setBackground(Color.white);
       // jTextFieldFracSec.setEditable(b);
       // jTextFieldFracSec.setBackground(Color.white);
        jRadioButtonZ.setEnabled(b);
        jRadioButtonDecal.setEnabled(b);
        jRadioButtonHazard2.setEnabled(b);
        jRadioButtonHazard2_1.setEnabled(b);
        jRadioButtonHazard3.setEnabled(b);
        jRadioButtonHazard3_1.setEnabled(b);
        setEnabledTZ(b);
        //jButtonWizard.setVisible(b);
    }

    class SymAction implements java.awt.event.ActionListener {

        public void actionPerformed(java.awt.event.ActionEvent event) {
            Object object = event.getSource();
            
            if (object == jRadioButtonZ) {
                jRadioButtonDecal.setSelected(false);
                setEnabledTZ(false);
                //if (bDecal)
                //    changeDecal(true);
            } else if (object == jRadioButtonDecal) {
                jRadioButtonZ.setSelected(false);
                setEnabledTZ(jRadioButtonDecal.isSelected());
                //changeDecal(!jRadioButtonDecal.isSelected());
            }else if (object == jRadioButtonHazard2) {
                jRadioButtonHazard2_1.setSelected(false);
                setEnabledTZ(false);
            }else if (object == jRadioButtonHazard2_1) {
                jRadioButtonHazard2.setSelected(false);
                setEnabledTZ(jRadioButtonHazard2_1.isSelected());
            }else if (object == jRadioButtonHazard3) {
                jRadioButtonHazard3_1.setSelected(false);
                setEnabledTZ(false);
            }else if (object == jRadioButtonHazard3_1) {
                jRadioButtonHazard3.setSelected(false);
                setEnabledTZ(jRadioButtonHazard3_1.isSelected());
            }
            
        }
    }


    void jButtonWizard_actionPerformed(java.awt.event.ActionEvent event) {
        JDialogDateSelector jDialog =
                new JDialogDateSelector(Util.getTopJFrame(this));
        jDialog.setVisible(true);
        if (jDialog.bOk) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(jDialog.currentDate);
            //jTextFieldYear.setText(cal.get(Calendar.YEAR) + "");
           ///jTextFieldMonth.setText(Util.completeDigit(cal.get(Calendar.MONTH) + 1 + "", 2));
           // jTextFieldDay.setText(Util.completeDigit(cal.get(Calendar.DATE) + "", 2));
        }

        jDialog.dispose();
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

    void setEnabledTZ(boolean b) {
       // jComboBoxSign.setEnabled(b && jRadioButtonDecal.isSelected());
        //jTextFieldTZHour.setEditable(b && jRadioButtonDecal.isSelected());
        //jTextFieldTZMin.setEditable(b && jRadioButtonDecal.isSelected());
    }
    
    void graphicalUpdate() {
        //jPanelTime.remove(2);
        //jPanelTime.add(Box.createVerticalStrut(calcOffset()), 2);
    }

    //XML
    String toXML(String key) {
        String xml = "";
                    String xmlok = "";
                    String xmlTime = "";
                    String xmlsep1 = "<br>";
                    String xmlsep2 = "</br>";
                    if (jRadioButtonZ.isSelected()) {
                       xmlTime +=xmlsep1+"flashingHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xml2 = "";
                    if (jRadioButtonDecal.isSelected()) {
                       xml2 += xmlsep1+"noFlashingHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlhazard2 = "";
                    if (jRadioButtonHazard2.isSelected()) {
                       xmlhazard2 +=xmlsep1+"motionSimulationHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlhazard2_1 = "";
                    if (jRadioButtonHazard2_1.isSelected()) {
                       xmlhazard2_1 +=xmlsep1+"noMotionSimulationHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlhazard3 = "";
                    if (jRadioButtonHazard3.isSelected()) {
                       xmlhazard3 +=xmlsep1+"soundHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    String xmlhazard3_1 = "";
                    if (jRadioButtonHazard3_1.isSelected()) {
                       xmlhazard3_1 +=xmlsep1+"noSoundHazard"+xmlsep2;
                       xmlok += "ok";
                    }
                    if (!"".equals(xmlok))
                        xml +=xmlTime + xml2 + xmlhazard2 + xmlhazard2_1 + xmlhazard3 + xmlhazard3_1;
               
                    
    
        if (!xml.equals(""))
            xml = "<" + Util.getTag(key) + ">" + xml +
                    "</" + Util.getTag(key) + ">\n";
        else
            xml = null;

        return xml;
    }

    void fromXML(String path, Element e, List<String> observations) {
        if (e.getFirstChild() == null) return;
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

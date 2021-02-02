/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.licef.lompad;

import java.util.Enumeration;

/**
 *
 * @author I7 MAX
 */
public class MultipleCheckHazard extends FormContainer{
    boolean isOneLine;
    String titleLocal;
    boolean isLineLocal;
    
    public MultipleCheckHazard(String title, boolean isLine, boolean isMultiple, boolean isOneLine, String titleLocal, boolean isLineLocal) {
        super(title, isLine, isMultiple);
        this.isOneLine = isOneLine;
        this.titleLocal = titleLocal;
        this.isLineLocal = isLineLocal;
    }
    void addFormContent() {
        FormWrapper wrapper = new FormWrapper(titleLocal, isLineLocal);
        
        MultipleCheckHazardContainer c2 = new MultipleCheckHazardContainer("10.3.1", false, false, isOneLine);
        c2.addFormContent();
        wrapper.addComponent(c2);
        addComponent(wrapper);
    }
    
    //XML
    String toXML(String key) {
        String xml = "";
        for (Enumeration e = vComponents.elements(); e.hasMoreElements();) {
            FormComponent c = (FormComponent) e.nextElement();
            String res = ((FormWrapper) c).toXML(key, false);
            if (res != null) xml += res;
        }

        if (xml.equals(""))
            xml = null;

        return xml;
    }
    
    //HTML
    String toHTML(String key) {
        String html = "";
        for (Enumeration e = vComponents.elements(); e.hasMoreElements();) {
            FormComponent c = (FormComponent) e.nextElement();
            String res =(c instanceof FormContainer)?
                    c.toHTMLData(key):c.toHTML(key);
            if (res != null) html += res;
        }

        if (!html.equals(""))
            html = "<TR><TD WIDTH=\"160\" VALIGN=\"TOP\"><B>" + Util.getLabel(key)+ "</B></TD>" +
                    "<TD VALIGN=\"TOP\">" + html + "</TD></TR>";
        else
            html = null;

        return html;
    } 
    
}

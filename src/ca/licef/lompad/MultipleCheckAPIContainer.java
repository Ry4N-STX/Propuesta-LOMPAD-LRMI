/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.licef.lompad;

import java.awt.Dimension;
import java.util.List;
import licef.CommonNamespaceContext;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 *
 * @author I7 MAX
 */
public class MultipleCheckAPIContainer extends TextForm{
    public static Object[] values = new Object[]{null, "none", "fra", "fra-CA", "fra-FR", "eng", "eng-AU", "eng-CA", "eng-GB", "eng-US", "deu", "esl", "ita", "por", null, "fr", "fr-CA", "fr-FR", "en", "en-AU", "en-CA", "en-GB", "en-US", "de", "es", "it", "pt" };
    
    public MultipleCheckAPIContainer(String title, boolean isLine, boolean isMultipleContainer, boolean isOneLine) {
        super(title, isLine, isMultipleContainer, isOneLine);
        mediator = new LangstringMediator(this, values);
    }
    
     void addFormContent() {
        MultipleCheckAPIComponent date = new MultipleCheckAPIComponent();
        date.setMinimumSize(new Dimension(10, 120));
        date.setPreferredSize(new Dimension(10, 120));
        date.setMaximumSize(new Dimension(1000, 120));
        addComponent(date);
    }
    
    public void setValues(String[] values) {
        for (int i = 0; i < values.length;) {
            setValues(values[i], values[i + 1]);
            i += 2;
        }
    }

    public void setValues(String value, String language) {
        LangstringComponent c = null;
        if (isFilled()) {
            addFormContent();
            c = (LangstringComponent) vComponents.lastElement();
        } else
            c = (LangstringComponent) vComponents.firstElement();
        c.setValues(value, language);
    }

    //XML
    String toXML(String key) {
        return defaultToXML(key);
    }

    void fromXML(String path, Element e, List<String> observations) {
        NodeList list = e.getElementsByTagNameNS(CommonNamespaceContext.lomNSURI,"string");
        for (int i = 0; i < list.getLength(); i++) {
            Element child = (Element) list.item(i);
            LangstringComponent c = null;
            if (isFilled()) {
                if (!isMultipleContainer) return; //pas d'import multiple possible
                addFormContent();
                c = (LangstringComponent) vComponents.lastElement();
            } else
                c = (LangstringComponent) vComponents.firstElement();

            c.fromXML(path, child, observations);
        }
    }
    
}

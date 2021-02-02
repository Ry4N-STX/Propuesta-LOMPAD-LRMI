/*
 * Copyright (C) 2005  Alexis Miara (alexis.miara@licef.ca)
 *
 * This file is part of LomPad.
 *
 * LomPad is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * LomPad is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with LomPad; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package ca.licef.lompad;

import static ca.licef.lompad.MultipleCheckGroup.values;
import java.awt.Dimension;

class AccesibilityForm extends FormContainer {
    public AccesibilityForm(String title, boolean isLine) {
        super(title, isLine);
        
    }

    void addFormContent() {
        MultiLangstringForm description = new MultiLangstringForm("10.1", true, true, false, "", true);
        description.addToggle();
        description.addFormContent();
        addComponent(description);
        
        MultipleCheckAccesibility check = new MultipleCheckAccesibility("10.2", true, false, false, "", true);
        check.addToggle();
        check.addFormContent();
        addComponent(check);
        
        MultipleCheckHazard check2 = new MultipleCheckHazard("10.3", true, false, false, "", true);
        check2.addToggle();
        check2.addFormContent();
        addComponent(check2); 
        
        MultipleCheckAccesibilityControl check3 = new MultipleCheckAccesibilityControl("10.4", true, false, false, "", true);
        check3.addToggle();
        check3.addFormContent();
        addComponent(check3); 
        
        MultipleCheckAPI check4 = new MultipleCheckAPI("10.5", true, false, false, "", true);
        check4.addToggle();
        check4.addFormContent();
        addComponent(check4); 

    }

    //HTML
    String toHTML(String key) {
        return toHTMLCategory(key);
    }
}

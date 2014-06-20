/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.gcsc.vrl.silentnumbers;

import eu.mihosoft.vrl.annotation.TypeInfo;
import eu.mihosoft.vrl.reflection.TypeTemplate;

/**
 *
 * @author Michael Hoffer &lt;info@michaelhoffer.de&gt;
 */
@TypeInfo(type=Long.class, input = true, output = true, style="silent")
public class SilentLongType extends TypeTemplate{

    public SilentLongType() {
        setValueName(" ");
    }
}
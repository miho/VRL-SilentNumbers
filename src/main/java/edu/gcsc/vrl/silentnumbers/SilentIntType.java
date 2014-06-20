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
@TypeInfo(type=Integer.class, input = true, output = true, style="silent")
public class SilentIntType extends TypeTemplate{

    public SilentIntType() {
        setValueName(" ");
    }
}
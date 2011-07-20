package org.translator.java.api.util;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 *
 * @author Joshua
 */
public abstract class APIUtil
{
    public static String getField( NamedNodeMap fields, String fieldName )
    {
        Node field = fields.getNamedItem( fieldName );

        if( field != null )
            return field.getNodeName();
        else
            return new String();
    }
}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerItemAdjustEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerItemAdjustEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cost"/&gt;
 *     &lt;enumeration value="CurrentCustomPrice"/&gt;
 *     &lt;enumeration value="StandardPrice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerItemAdjustEnum")
@XmlEnum
public enum PerItemAdjustEnum {

    @XmlEnumValue("Cost")
    COST("Cost"),
    @XmlEnumValue("CurrentCustomPrice")
    CURRENT_CUSTOM_PRICE("CurrentCustomPrice"),
    @XmlEnumValue("StandardPrice")
    STANDARD_PRICE("StandardPrice");
    private final String value;

    PerItemAdjustEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerItemAdjustEnum fromValue(String v) {
        for (PerItemAdjustEnum c: PerItemAdjustEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.02.07 at 12:34:12 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UOMBaseTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UOMBaseTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Area"/&gt;
 *     &lt;enumeration value="Count"/&gt;
 *     &lt;enumeration value="Length"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="Volume"/&gt;
 *     &lt;enumeration value="Weight"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UOMBaseTypeEnum")
@XmlEnum
public enum UOMBaseTypeEnum {

    @XmlEnumValue("Area")
    AREA("Area"),
    @XmlEnumValue("Count")
    COUNT("Count"),
    @XmlEnumValue("Length")
    LENGTH("Length"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Volume")
    VOLUME("Volume"),
    @XmlEnumValue("Weight")
    WEIGHT("Weight");
    private final String value;

    UOMBaseTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UOMBaseTypeEnum fromValue(String v) {
        for (UOMBaseTypeEnum c: UOMBaseTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Java class for ETransactionEnabledStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ETransactionEnabledStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enabled"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ETransactionEnabledStatusEnum")
@XmlEnum
public enum ETransactionEnabledStatusEnum {

    @XmlEnumValue("Enabled")
    ENABLED("Enabled"),
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable");
    private final String value;

    ETransactionEnabledStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ETransactionEnabledStatusEnum fromValue(String v) {
        for (ETransactionEnabledStatusEnum c: ETransactionEnabledStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

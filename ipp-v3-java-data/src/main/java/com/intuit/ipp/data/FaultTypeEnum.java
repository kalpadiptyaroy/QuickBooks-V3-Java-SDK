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
 * <p>Java class for FaultTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AuthenticationFault"/&gt;
 *     &lt;enumeration value="AuthorizatonFault"/&gt;
 *     &lt;enumeration value="ValidationFault"/&gt;
 *     &lt;enumeration value="SystemFault"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FaultTypeEnum")
@XmlEnum
public enum FaultTypeEnum {

    @XmlEnumValue("AuthenticationFault")
    AUTHENTICATION_FAULT("AuthenticationFault"),
    @XmlEnumValue("AuthorizatonFault")
    AUTHORIZATON_FAULT("AuthorizatonFault"),
    @XmlEnumValue("ValidationFault")
    VALIDATION_FAULT("ValidationFault"),
    @XmlEnumValue("SystemFault")
    SYSTEM_FAULT("SystemFault");
    private final String value;

    FaultTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultTypeEnum fromValue(String v) {
        for (FaultTypeEnum c: FaultTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Custom field that can be added to an entity. This type is not extended from IntuitEntity as CustomField can not be manipulated as independent entity and will always be considered in association with another top level Intuit entity.
 * 			
 * 
 * <p>Java class for CustomField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefinitionId" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://schema.intuit.com/finance/v3}CustomFieldTypeEnum"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="StringValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="BooleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="NumberValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomField", propOrder = {
    "definitionId",
    "name",
    "type",
    "stringValue",
    "booleanValue",
    "dateValue",
    "numberValue"
})
public class CustomField implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefinitionId")
    protected String definitionId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected CustomFieldTypeEnum type;
    @XmlElement(name = "StringValue")
    protected String stringValue;
    @XmlElement(name = "BooleanValue")
    protected Boolean booleanValue;
    @XmlElement(name = "DateValue", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date dateValue;
    @XmlElement(name = "NumberValue")
    protected BigDecimal numberValue;

    /**
     * Gets the value of the definitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionId() {
        return definitionId;
    }

    /**
     * Sets the value of the definitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionId(String value) {
        this.definitionId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldTypeEnum }
     *     
     */
    public CustomFieldTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldTypeEnum }
     *     
     */
    public void setType(CustomFieldTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValue(Date value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberValue(BigDecimal value) {
        this.numberValue = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CustomField that = ((CustomField) object);
        {
            String lhsDefinitionId;
            lhsDefinitionId = this.getDefinitionId();
            String rhsDefinitionId;
            rhsDefinitionId = that.getDefinitionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "definitionId", lhsDefinitionId), LocatorUtils.property(thatLocator, "definitionId", rhsDefinitionId), lhsDefinitionId, rhsDefinitionId, (this.definitionId!= null), (that.definitionId!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            CustomFieldTypeEnum lhsType;
            lhsType = this.getType();
            CustomFieldTypeEnum rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType, (this.type!= null), (that.type!= null))) {
                return false;
            }
        }
        {
            String lhsStringValue;
            lhsStringValue = this.getStringValue();
            String rhsStringValue;
            rhsStringValue = that.getStringValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stringValue", lhsStringValue), LocatorUtils.property(thatLocator, "stringValue", rhsStringValue), lhsStringValue, rhsStringValue, (this.stringValue!= null), (that.stringValue!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBooleanValue;
            lhsBooleanValue = this.isBooleanValue();
            Boolean rhsBooleanValue;
            rhsBooleanValue = that.isBooleanValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "booleanValue", lhsBooleanValue), LocatorUtils.property(thatLocator, "booleanValue", rhsBooleanValue), lhsBooleanValue, rhsBooleanValue, (this.booleanValue!= null), (that.booleanValue!= null))) {
                return false;
            }
        }
        {
            Date lhsDateValue;
            lhsDateValue = this.getDateValue();
            Date rhsDateValue;
            rhsDateValue = that.getDateValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateValue", lhsDateValue), LocatorUtils.property(thatLocator, "dateValue", rhsDateValue), lhsDateValue, rhsDateValue, (this.dateValue!= null), (that.dateValue!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberValue;
            lhsNumberValue = this.getNumberValue();
            BigDecimal rhsNumberValue;
            rhsNumberValue = that.getNumberValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberValue", lhsNumberValue), LocatorUtils.property(thatLocator, "numberValue", rhsNumberValue), lhsNumberValue, rhsNumberValue, (this.numberValue!= null), (that.numberValue!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theDefinitionId;
            theDefinitionId = this.getDefinitionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "definitionId", theDefinitionId), currentHashCode, theDefinitionId, (this.definitionId!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            CustomFieldTypeEnum theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType, (this.type!= null));
        }
        {
            String theStringValue;
            theStringValue = this.getStringValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stringValue", theStringValue), currentHashCode, theStringValue, (this.stringValue!= null));
        }
        {
            Boolean theBooleanValue;
            theBooleanValue = this.isBooleanValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "booleanValue", theBooleanValue), currentHashCode, theBooleanValue, (this.booleanValue!= null));
        }
        {
            Date theDateValue;
            theDateValue = this.getDateValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateValue", theDateValue), currentHashCode, theDateValue, (this.dateValue!= null));
        }
        {
            BigDecimal theNumberValue;
            theNumberValue = this.getNumberValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberValue", theNumberValue), currentHashCode, theNumberValue, (this.numberValue!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

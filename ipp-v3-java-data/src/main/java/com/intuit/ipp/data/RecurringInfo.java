//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * 				Description: Describes the Recurring Schedules for Transactions
 * 			
 * 
 * <p>Java class for RecurringInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecurType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScheduleInfo" type="{http://schema.intuit.com/finance/v3}RecurringScheduleInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringInfo", propOrder = {
    "name",
    "recurType",
    "active",
    "scheduleInfo"
})
public class RecurringInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "RecurType")
    protected String recurType;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "ScheduleInfo")
    protected RecurringScheduleInfo scheduleInfo;

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
     * Gets the value of the recurType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurType() {
        return recurType;
    }

    /**
     * Sets the value of the recurType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurType(String value) {
        this.recurType = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the scheduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringScheduleInfo }
     *     
     */
    public RecurringScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * Sets the value of the scheduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringScheduleInfo }
     *     
     */
    public void setScheduleInfo(RecurringScheduleInfo value) {
        this.scheduleInfo = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecurringInfo that = ((RecurringInfo) object);
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
            String lhsRecurType;
            lhsRecurType = this.getRecurType();
            String rhsRecurType;
            rhsRecurType = that.getRecurType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurType", lhsRecurType), LocatorUtils.property(thatLocator, "recurType", rhsRecurType), lhsRecurType, rhsRecurType, (this.recurType!= null), (that.recurType!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            RecurringScheduleInfo lhsScheduleInfo;
            lhsScheduleInfo = this.getScheduleInfo();
            RecurringScheduleInfo rhsScheduleInfo;
            rhsScheduleInfo = that.getScheduleInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduleInfo", lhsScheduleInfo), LocatorUtils.property(thatLocator, "scheduleInfo", rhsScheduleInfo), lhsScheduleInfo, rhsScheduleInfo, (this.scheduleInfo!= null), (that.scheduleInfo!= null))) {
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
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theRecurType;
            theRecurType = this.getRecurType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "recurType", theRecurType), currentHashCode, theRecurType, (this.recurType!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            RecurringScheduleInfo theScheduleInfo;
            theScheduleInfo = this.getScheduleInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduleInfo", theScheduleInfo), currentHashCode, theScheduleInfo, (this.scheduleInfo!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Specifies the Header of a Report, Time report was generated, parameters corresponding to the request
 * 
 * <p>Java class for ReportHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateMacro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportBasis" type="{http://schema.intuit.com/finance/v3}ReportBasisEnum" minOccurs="0"/&gt;
 *         &lt;element name="StartPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SummarizeColumnsBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vendor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Employee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Option" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportHeader", propOrder = {
    "time",
    "reportName",
    "dateMacro",
    "reportBasis",
    "startPeriod",
    "endPeriod",
    "summarizeColumnsBy",
    "currency",
    "customer",
    "vendor",
    "employee",
    "item",
    "clazz",
    "department",
    "option"
})
public class ReportHeader implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Time", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date time;
    @XmlElement(name = "ReportName")
    protected String reportName;
    @XmlElement(name = "DateMacro")
    protected String dateMacro;
    @XmlElement(name = "ReportBasis")
    @XmlSchemaType(name = "string")
    protected ReportBasisEnum reportBasis;
    @XmlElement(name = "StartPeriod")
    protected String startPeriod;
    @XmlElement(name = "EndPeriod")
    protected String endPeriod;
    @XmlElement(name = "SummarizeColumnsBy")
    protected String summarizeColumnsBy;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Customer")
    protected String customer;
    @XmlElement(name = "Vendor")
    protected String vendor;
    @XmlElement(name = "Employee")
    protected String employee;
    @XmlElement(name = "Item")
    protected String item;
    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Option")
    protected List<NameValue> option;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(Date value) {
        this.time = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Gets the value of the dateMacro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateMacro() {
        return dateMacro;
    }

    /**
     * Sets the value of the dateMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateMacro(String value) {
        this.dateMacro = value;
    }

    /**
     * Gets the value of the reportBasis property.
     * 
     * @return
     *     possible object is
     *     {@link ReportBasisEnum }
     *     
     */
    public ReportBasisEnum getReportBasis() {
        return reportBasis;
    }

    /**
     * Sets the value of the reportBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportBasisEnum }
     *     
     */
    public void setReportBasis(ReportBasisEnum value) {
        this.reportBasis = value;
    }

    /**
     * Gets the value of the startPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPeriod() {
        return startPeriod;
    }

    /**
     * Sets the value of the startPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPeriod(String value) {
        this.startPeriod = value;
    }

    /**
     * Gets the value of the endPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPeriod() {
        return endPeriod;
    }

    /**
     * Sets the value of the endPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPeriod(String value) {
        this.endPeriod = value;
    }

    /**
     * Gets the value of the summarizeColumnsBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummarizeColumnsBy() {
        return summarizeColumnsBy;
    }

    /**
     * Sets the value of the summarizeColumnsBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummarizeColumnsBy(String value) {
        this.summarizeColumnsBy = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployee(String value) {
        this.employee = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItem(String value) {
        this.item = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getOption() {
        if (option == null) {
            option = new ArrayList<NameValue>();
        }
        return this.option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param option
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setOption(List<NameValue> option) {
        this.option = option;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReportHeader that = ((ReportHeader) object);
        {
            Date lhsTime;
            lhsTime = this.getTime();
            Date rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime, (this.time!= null), (that.time!= null))) {
                return false;
            }
        }
        {
            String lhsReportName;
            lhsReportName = this.getReportName();
            String rhsReportName;
            rhsReportName = that.getReportName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportName", lhsReportName), LocatorUtils.property(thatLocator, "reportName", rhsReportName), lhsReportName, rhsReportName, (this.reportName!= null), (that.reportName!= null))) {
                return false;
            }
        }
        {
            String lhsDateMacro;
            lhsDateMacro = this.getDateMacro();
            String rhsDateMacro;
            rhsDateMacro = that.getDateMacro();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateMacro", lhsDateMacro), LocatorUtils.property(thatLocator, "dateMacro", rhsDateMacro), lhsDateMacro, rhsDateMacro, (this.dateMacro!= null), (that.dateMacro!= null))) {
                return false;
            }
        }
        {
            ReportBasisEnum lhsReportBasis;
            lhsReportBasis = this.getReportBasis();
            ReportBasisEnum rhsReportBasis;
            rhsReportBasis = that.getReportBasis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportBasis", lhsReportBasis), LocatorUtils.property(thatLocator, "reportBasis", rhsReportBasis), lhsReportBasis, rhsReportBasis, (this.reportBasis!= null), (that.reportBasis!= null))) {
                return false;
            }
        }
        {
            String lhsStartPeriod;
            lhsStartPeriod = this.getStartPeriod();
            String rhsStartPeriod;
            rhsStartPeriod = that.getStartPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startPeriod", lhsStartPeriod), LocatorUtils.property(thatLocator, "startPeriod", rhsStartPeriod), lhsStartPeriod, rhsStartPeriod, (this.startPeriod!= null), (that.startPeriod!= null))) {
                return false;
            }
        }
        {
            String lhsEndPeriod;
            lhsEndPeriod = this.getEndPeriod();
            String rhsEndPeriod;
            rhsEndPeriod = that.getEndPeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endPeriod", lhsEndPeriod), LocatorUtils.property(thatLocator, "endPeriod", rhsEndPeriod), lhsEndPeriod, rhsEndPeriod, (this.endPeriod!= null), (that.endPeriod!= null))) {
                return false;
            }
        }
        {
            String lhsSummarizeColumnsBy;
            lhsSummarizeColumnsBy = this.getSummarizeColumnsBy();
            String rhsSummarizeColumnsBy;
            rhsSummarizeColumnsBy = that.getSummarizeColumnsBy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summarizeColumnsBy", lhsSummarizeColumnsBy), LocatorUtils.property(thatLocator, "summarizeColumnsBy", rhsSummarizeColumnsBy), lhsSummarizeColumnsBy, rhsSummarizeColumnsBy, (this.summarizeColumnsBy!= null), (that.summarizeColumnsBy!= null))) {
                return false;
            }
        }
        {
            String lhsCurrency;
            lhsCurrency = this.getCurrency();
            String rhsCurrency;
            rhsCurrency = that.getCurrency();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
                return false;
            }
        }
        {
            String lhsCustomer;
            lhsCustomer = this.getCustomer();
            String rhsCustomer;
            rhsCustomer = that.getCustomer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customer", lhsCustomer), LocatorUtils.property(thatLocator, "customer", rhsCustomer), lhsCustomer, rhsCustomer, (this.customer!= null), (that.customer!= null))) {
                return false;
            }
        }
        {
            String lhsVendor;
            lhsVendor = this.getVendor();
            String rhsVendor;
            rhsVendor = that.getVendor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendor", lhsVendor), LocatorUtils.property(thatLocator, "vendor", rhsVendor), lhsVendor, rhsVendor, (this.vendor!= null), (that.vendor!= null))) {
                return false;
            }
        }
        {
            String lhsEmployee;
            lhsEmployee = this.getEmployee();
            String rhsEmployee;
            rhsEmployee = that.getEmployee();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employee", lhsEmployee), LocatorUtils.property(thatLocator, "employee", rhsEmployee), lhsEmployee, rhsEmployee, (this.employee!= null), (that.employee!= null))) {
                return false;
            }
        }
        {
            String lhsItem;
            lhsItem = this.getItem();
            String rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem, (this.item!= null), (that.item!= null))) {
                return false;
            }
        }
        {
            String lhsClazz;
            lhsClazz = this.getClazz();
            String rhsClazz;
            rhsClazz = that.getClazz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clazz", lhsClazz), LocatorUtils.property(thatLocator, "clazz", rhsClazz), lhsClazz, rhsClazz, (this.clazz!= null), (that.clazz!= null))) {
                return false;
            }
        }
        {
            String lhsDepartment;
            lhsDepartment = this.getDepartment();
            String rhsDepartment;
            rhsDepartment = that.getDepartment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "department", lhsDepartment), LocatorUtils.property(thatLocator, "department", rhsDepartment), lhsDepartment, rhsDepartment, (this.department!= null), (that.department!= null))) {
                return false;
            }
        }
        {
            List<NameValue> lhsOption;
            lhsOption = (((this.option!= null)&&(!this.option.isEmpty()))?this.getOption():null);
            List<NameValue> rhsOption;
            rhsOption = (((that.option!= null)&&(!that.option.isEmpty()))?that.getOption():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "option", lhsOption), LocatorUtils.property(thatLocator, "option", rhsOption), lhsOption, rhsOption, ((this.option!= null)&&(!this.option.isEmpty())), ((that.option!= null)&&(!that.option.isEmpty())))) {
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
            Date theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime, (this.time!= null));
        }
        {
            String theReportName;
            theReportName = this.getReportName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportName", theReportName), currentHashCode, theReportName, (this.reportName!= null));
        }
        {
            String theDateMacro;
            theDateMacro = this.getDateMacro();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateMacro", theDateMacro), currentHashCode, theDateMacro, (this.dateMacro!= null));
        }
        {
            ReportBasisEnum theReportBasis;
            theReportBasis = this.getReportBasis();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportBasis", theReportBasis), currentHashCode, theReportBasis, (this.reportBasis!= null));
        }
        {
            String theStartPeriod;
            theStartPeriod = this.getStartPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startPeriod", theStartPeriod), currentHashCode, theStartPeriod, (this.startPeriod!= null));
        }
        {
            String theEndPeriod;
            theEndPeriod = this.getEndPeriod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endPeriod", theEndPeriod), currentHashCode, theEndPeriod, (this.endPeriod!= null));
        }
        {
            String theSummarizeColumnsBy;
            theSummarizeColumnsBy = this.getSummarizeColumnsBy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "summarizeColumnsBy", theSummarizeColumnsBy), currentHashCode, theSummarizeColumnsBy, (this.summarizeColumnsBy!= null));
        }
        {
            String theCurrency;
            theCurrency = this.getCurrency();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currency", theCurrency), currentHashCode, theCurrency, (this.currency!= null));
        }
        {
            String theCustomer;
            theCustomer = this.getCustomer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customer", theCustomer), currentHashCode, theCustomer, (this.customer!= null));
        }
        {
            String theVendor;
            theVendor = this.getVendor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendor", theVendor), currentHashCode, theVendor, (this.vendor!= null));
        }
        {
            String theEmployee;
            theEmployee = this.getEmployee();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employee", theEmployee), currentHashCode, theEmployee, (this.employee!= null));
        }
        {
            String theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem, (this.item!= null));
        }
        {
            String theClazz;
            theClazz = this.getClazz();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clazz", theClazz), currentHashCode, theClazz, (this.clazz!= null));
        }
        {
            String theDepartment;
            theDepartment = this.getDepartment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "department", theDepartment), currentHashCode, theDepartment, (this.department!= null));
        }
        {
            List<NameValue> theOption;
            theOption = (((this.option!= null)&&(!this.option.isEmpty()))?this.getOption():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "option", theOption), currentHashCode, theOption, ((this.option!= null)&&(!this.option.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

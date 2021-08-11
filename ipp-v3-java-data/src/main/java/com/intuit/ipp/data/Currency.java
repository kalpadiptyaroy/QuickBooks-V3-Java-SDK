//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * Describes the properties of currencies defined in
 * 				QuickBooks. QuickBooks supports the world's common currencies.
 * 			
 * 
 * <p>Java class for Currency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Currency"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://schema.intuit.com/finance/v3}currencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Separator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DecimalPlaces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="DecimalSeparator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Symbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolPosition" type="{http://schema.intuit.com/finance/v3}SymbolPositionEnum" minOccurs="0"/&gt;
 *         &lt;element name="UserDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AsOfDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Currency", propOrder = {
    "name",
    "active",
    "code",
    "separator",
    "format",
    "decimalPlaces",
    "decimalSeparator",
    "symbol",
    "symbolPosition",
    "userDefined",
    "exchangeRate",
    "asOfDate",
    "currencyEx"
})
public class Currency
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "Code")
    @XmlSchemaType(name = "string")
    protected CurrencyCode code;
    @XmlElement(name = "Separator")
    protected String separator;
    @XmlElement(name = "Format")
    protected String format;
    @XmlElement(name = "DecimalPlaces")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger decimalPlaces;
    @XmlElement(name = "DecimalSeparator")
    protected String decimalSeparator;
    @XmlElement(name = "Symbol")
    protected String symbol;
    @XmlElement(name = "SymbolPosition")
    @XmlSchemaType(name = "string")
    protected SymbolPositionEnum symbolPosition;
    @XmlElement(name = "UserDefined")
    protected Boolean userDefined;
    @XmlElement(name = "ExchangeRate")
    protected BigDecimal exchangeRate;
    @XmlElement(name = "AsOfDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date asOfDate;
    @XmlElement(name = "CurrencyEx")
    protected IntuitAnyType currencyEx;

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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCode(CurrencyCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the separator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * Sets the value of the separator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparator(String value) {
        this.separator = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the decimalPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Sets the value of the decimalPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * Gets the value of the decimalSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Sets the value of the decimalSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalSeparator(String value) {
        this.decimalSeparator = value;
    }

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the symbolPosition property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolPositionEnum }
     *     
     */
    public SymbolPositionEnum getSymbolPosition() {
        return symbolPosition;
    }

    /**
     * Sets the value of the symbolPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolPositionEnum }
     *     
     */
    public void setSymbolPosition(SymbolPositionEnum value) {
        this.symbolPosition = value;
    }

    /**
     * Gets the value of the userDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDefined() {
        return userDefined;
    }

    /**
     * Sets the value of the userDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDefined(Boolean value) {
        this.userDefined = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchangeRate(BigDecimal value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsOfDate(Date value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the currencyEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getCurrencyEx() {
        return currencyEx;
    }

    /**
     * Sets the value of the currencyEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setCurrencyEx(IntuitAnyType value) {
        this.currencyEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Currency that = ((Currency) object);
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
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            CurrencyCode lhsCode;
            lhsCode = this.getCode();
            CurrencyCode rhsCode;
            rhsCode = that.getCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "code", lhsCode), LocatorUtils.property(thatLocator, "code", rhsCode), lhsCode, rhsCode, (this.code!= null), (that.code!= null))) {
                return false;
            }
        }
        {
            String lhsSeparator;
            lhsSeparator = this.getSeparator();
            String rhsSeparator;
            rhsSeparator = that.getSeparator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "separator", lhsSeparator), LocatorUtils.property(thatLocator, "separator", rhsSeparator), lhsSeparator, rhsSeparator, (this.separator!= null), (that.separator!= null))) {
                return false;
            }
        }
        {
            String lhsFormat;
            lhsFormat = this.getFormat();
            String rhsFormat;
            rhsFormat = that.getFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "format", lhsFormat), LocatorUtils.property(thatLocator, "format", rhsFormat), lhsFormat, rhsFormat, (this.format!= null), (that.format!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsDecimalPlaces;
            lhsDecimalPlaces = this.getDecimalPlaces();
            BigInteger rhsDecimalPlaces;
            rhsDecimalPlaces = that.getDecimalPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimalPlaces", lhsDecimalPlaces), LocatorUtils.property(thatLocator, "decimalPlaces", rhsDecimalPlaces), lhsDecimalPlaces, rhsDecimalPlaces, (this.decimalPlaces!= null), (that.decimalPlaces!= null))) {
                return false;
            }
        }
        {
            String lhsDecimalSeparator;
            lhsDecimalSeparator = this.getDecimalSeparator();
            String rhsDecimalSeparator;
            rhsDecimalSeparator = that.getDecimalSeparator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decimalSeparator", lhsDecimalSeparator), LocatorUtils.property(thatLocator, "decimalSeparator", rhsDecimalSeparator), lhsDecimalSeparator, rhsDecimalSeparator, (this.decimalSeparator!= null), (that.decimalSeparator!= null))) {
                return false;
            }
        }
        {
            String lhsSymbol;
            lhsSymbol = this.getSymbol();
            String rhsSymbol;
            rhsSymbol = that.getSymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "symbol", lhsSymbol), LocatorUtils.property(thatLocator, "symbol", rhsSymbol), lhsSymbol, rhsSymbol, (this.symbol!= null), (that.symbol!= null))) {
                return false;
            }
        }
        {
            SymbolPositionEnum lhsSymbolPosition;
            lhsSymbolPosition = this.getSymbolPosition();
            SymbolPositionEnum rhsSymbolPosition;
            rhsSymbolPosition = that.getSymbolPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "symbolPosition", lhsSymbolPosition), LocatorUtils.property(thatLocator, "symbolPosition", rhsSymbolPosition), lhsSymbolPosition, rhsSymbolPosition, (this.symbolPosition!= null), (that.symbolPosition!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUserDefined;
            lhsUserDefined = this.isUserDefined();
            Boolean rhsUserDefined;
            rhsUserDefined = that.isUserDefined();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDefined", lhsUserDefined), LocatorUtils.property(thatLocator, "userDefined", rhsUserDefined), lhsUserDefined, rhsUserDefined, (this.userDefined!= null), (that.userDefined!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsExchangeRate;
            lhsExchangeRate = this.getExchangeRate();
            BigDecimal rhsExchangeRate;
            rhsExchangeRate = that.getExchangeRate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeRate", lhsExchangeRate), LocatorUtils.property(thatLocator, "exchangeRate", rhsExchangeRate), lhsExchangeRate, rhsExchangeRate, (this.exchangeRate!= null), (that.exchangeRate!= null))) {
                return false;
            }
        }
        {
            Date lhsAsOfDate;
            lhsAsOfDate = this.getAsOfDate();
            Date rhsAsOfDate;
            rhsAsOfDate = that.getAsOfDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asOfDate", lhsAsOfDate), LocatorUtils.property(thatLocator, "asOfDate", rhsAsOfDate), lhsAsOfDate, rhsAsOfDate, (this.asOfDate!= null), (that.asOfDate!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsCurrencyEx;
            lhsCurrencyEx = this.getCurrencyEx();
            IntuitAnyType rhsCurrencyEx;
            rhsCurrencyEx = that.getCurrencyEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyEx", lhsCurrencyEx), LocatorUtils.property(thatLocator, "currencyEx", rhsCurrencyEx), lhsCurrencyEx, rhsCurrencyEx, (this.currencyEx!= null), (that.currencyEx!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            CurrencyCode theCode;
            theCode = this.getCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "code", theCode), currentHashCode, theCode, (this.code!= null));
        }
        {
            String theSeparator;
            theSeparator = this.getSeparator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "separator", theSeparator), currentHashCode, theSeparator, (this.separator!= null));
        }
        {
            String theFormat;
            theFormat = this.getFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "format", theFormat), currentHashCode, theFormat, (this.format!= null));
        }
        {
            BigInteger theDecimalPlaces;
            theDecimalPlaces = this.getDecimalPlaces();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimalPlaces", theDecimalPlaces), currentHashCode, theDecimalPlaces, (this.decimalPlaces!= null));
        }
        {
            String theDecimalSeparator;
            theDecimalSeparator = this.getDecimalSeparator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decimalSeparator", theDecimalSeparator), currentHashCode, theDecimalSeparator, (this.decimalSeparator!= null));
        }
        {
            String theSymbol;
            theSymbol = this.getSymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "symbol", theSymbol), currentHashCode, theSymbol, (this.symbol!= null));
        }
        {
            SymbolPositionEnum theSymbolPosition;
            theSymbolPosition = this.getSymbolPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "symbolPosition", theSymbolPosition), currentHashCode, theSymbolPosition, (this.symbolPosition!= null));
        }
        {
            Boolean theUserDefined;
            theUserDefined = this.isUserDefined();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDefined", theUserDefined), currentHashCode, theUserDefined, (this.userDefined!= null));
        }
        {
            BigDecimal theExchangeRate;
            theExchangeRate = this.getExchangeRate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeRate", theExchangeRate), currentHashCode, theExchangeRate, (this.exchangeRate!= null));
        }
        {
            Date theAsOfDate;
            theAsOfDate = this.getAsOfDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asOfDate", theAsOfDate), currentHashCode, theAsOfDate, (this.asOfDate!= null));
        }
        {
            IntuitAnyType theCurrencyEx;
            theCurrencyEx = this.getCurrencyEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyEx", theCurrencyEx), currentHashCode, theCurrencyEx, (this.currencyEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

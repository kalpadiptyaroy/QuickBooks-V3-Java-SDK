//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.08.09 at 10:13:10 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 * 				Product: ALL
 * 				Description: Item based expense detail
 * 				for a transaction line.
 * 			
 * 
 * <p>Java class for ItemBasedExpenseLineDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemBasedExpenseLineDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}ItemLineDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="BillableStatus" type="{http://schema.intuit.com/finance/v3}BillableStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="TaxInclusiveAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ItemBasedExpenseLineDetailEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemBasedExpenseLineDetail", propOrder = {
    "customerRef",
    "billableStatus",
    "taxInclusiveAmt",
    "itemBasedExpenseLineDetailEx"
})
public class ItemBasedExpenseLineDetail
    extends ItemLineDetail
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CustomerRef")
    protected ReferenceType customerRef;
    @XmlElement(name = "BillableStatus")
    @XmlSchemaType(name = "string")
    protected BillableStatusEnum billableStatus;
    @XmlElement(name = "TaxInclusiveAmt")
    protected BigDecimal taxInclusiveAmt;
    @XmlElement(name = "ItemBasedExpenseLineDetailEx")
    protected IntuitAnyType itemBasedExpenseLineDetailEx;

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCustomerRef(ReferenceType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the billableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillableStatusEnum }
     *     
     */
    public BillableStatusEnum getBillableStatus() {
        return billableStatus;
    }

    /**
     * Sets the value of the billableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableStatusEnum }
     *     
     */
    public void setBillableStatus(BillableStatusEnum value) {
        this.billableStatus = value;
    }

    /**
     * Gets the value of the taxInclusiveAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxInclusiveAmt() {
        return taxInclusiveAmt;
    }

    /**
     * Sets the value of the taxInclusiveAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxInclusiveAmt(BigDecimal value) {
        this.taxInclusiveAmt = value;
    }

    /**
     * Gets the value of the itemBasedExpenseLineDetailEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getItemBasedExpenseLineDetailEx() {
        return itemBasedExpenseLineDetailEx;
    }

    /**
     * Sets the value of the itemBasedExpenseLineDetailEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setItemBasedExpenseLineDetailEx(IntuitAnyType value) {
        this.itemBasedExpenseLineDetailEx = value;
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
        final ItemBasedExpenseLineDetail that = ((ItemBasedExpenseLineDetail) object);
        {
            ReferenceType lhsCustomerRef;
            lhsCustomerRef = this.getCustomerRef();
            ReferenceType rhsCustomerRef;
            rhsCustomerRef = that.getCustomerRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerRef", lhsCustomerRef), LocatorUtils.property(thatLocator, "customerRef", rhsCustomerRef), lhsCustomerRef, rhsCustomerRef, (this.customerRef!= null), (that.customerRef!= null))) {
                return false;
            }
        }
        {
            BillableStatusEnum lhsBillableStatus;
            lhsBillableStatus = this.getBillableStatus();
            BillableStatusEnum rhsBillableStatus;
            rhsBillableStatus = that.getBillableStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableStatus", lhsBillableStatus), LocatorUtils.property(thatLocator, "billableStatus", rhsBillableStatus), lhsBillableStatus, rhsBillableStatus, (this.billableStatus!= null), (that.billableStatus!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTaxInclusiveAmt;
            lhsTaxInclusiveAmt = this.getTaxInclusiveAmt();
            BigDecimal rhsTaxInclusiveAmt;
            rhsTaxInclusiveAmt = that.getTaxInclusiveAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxInclusiveAmt", lhsTaxInclusiveAmt), LocatorUtils.property(thatLocator, "taxInclusiveAmt", rhsTaxInclusiveAmt), lhsTaxInclusiveAmt, rhsTaxInclusiveAmt, (this.taxInclusiveAmt!= null), (that.taxInclusiveAmt!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsItemBasedExpenseLineDetailEx;
            lhsItemBasedExpenseLineDetailEx = this.getItemBasedExpenseLineDetailEx();
            IntuitAnyType rhsItemBasedExpenseLineDetailEx;
            rhsItemBasedExpenseLineDetailEx = that.getItemBasedExpenseLineDetailEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemBasedExpenseLineDetailEx", lhsItemBasedExpenseLineDetailEx), LocatorUtils.property(thatLocator, "itemBasedExpenseLineDetailEx", rhsItemBasedExpenseLineDetailEx), lhsItemBasedExpenseLineDetailEx, rhsItemBasedExpenseLineDetailEx, (this.itemBasedExpenseLineDetailEx!= null), (that.itemBasedExpenseLineDetailEx!= null))) {
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
            ReferenceType theCustomerRef;
            theCustomerRef = this.getCustomerRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerRef", theCustomerRef), currentHashCode, theCustomerRef, (this.customerRef!= null));
        }
        {
            BillableStatusEnum theBillableStatus;
            theBillableStatus = this.getBillableStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableStatus", theBillableStatus), currentHashCode, theBillableStatus, (this.billableStatus!= null));
        }
        {
            BigDecimal theTaxInclusiveAmt;
            theTaxInclusiveAmt = this.getTaxInclusiveAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxInclusiveAmt", theTaxInclusiveAmt), currentHashCode, theTaxInclusiveAmt, (this.taxInclusiveAmt!= null));
        }
        {
            IntuitAnyType theItemBasedExpenseLineDetailEx;
            theItemBasedExpenseLineDetailEx = this.getItemBasedExpenseLineDetailEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemBasedExpenseLineDetailEx", theItemBasedExpenseLineDetailEx), currentHashCode, theItemBasedExpenseLineDetailEx, (this.itemBasedExpenseLineDetailEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}

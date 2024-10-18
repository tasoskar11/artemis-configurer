//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.07 at 10:08:36 PM CEST 
//


package org.artemis.configuration.jaxb2;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for queueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{urn:activemq:core}filter" minOccurs="0"/&gt;
 *         &lt;element name="durable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://www.w3.org/XML/1998/namespace}specialAttrs"/&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="max-consumers" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="purge-on-no-consumers" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="group-rebalance" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="group-rebalance-pause-dispatch" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="group-buckets" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="group-first-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="last-value" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="last-value-key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="non-destructive" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="consumers-before-dispatch" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="delay-before-dispatch" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ring-size" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queueType", propOrder = {

})
public class QueueType {

    protected Filter filter;
    @XmlElement(defaultValue = "true")
    protected Boolean durable;
    protected String user;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "max-consumers")
    protected BigInteger maxConsumers;
    @XmlAttribute(name = "purge-on-no-consumers")
    protected Boolean purgeOnNoConsumers;
    @XmlAttribute(name = "exclusive")
    protected Boolean exclusive;
    @XmlAttribute(name = "group-rebalance")
    protected Boolean groupRebalance;
    @XmlAttribute(name = "group-rebalance-pause-dispatch")
    protected Boolean groupRebalancePauseDispatch;
    @XmlAttribute(name = "group-buckets")
    protected Integer groupBuckets;
    @XmlAttribute(name = "group-first-key")
    protected String groupFirstKey;
    @XmlAttribute(name = "last-value")
    protected Boolean lastValue;
    @XmlAttribute(name = "last-value-key")
    protected String lastValueKey;
    @XmlAttribute(name = "non-destructive")
    protected Boolean nonDestructive;
    @XmlAttribute(name = "consumers-before-dispatch")
    protected Integer consumersBeforeDispatch;
    @XmlAttribute(name = "delay-before-dispatch")
    protected Long delayBeforeDispatch;
    @XmlAttribute(name = "ring-size")
    protected Long ringSize;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link Filter }
     *     
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filter }
     *     
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the durable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDurable() {
        return durable;
    }

    /**
     * Sets the value of the durable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDurable(Boolean value) {
        this.durable = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
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
     * Gets the value of the maxConsumers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConsumers() {
        return maxConsumers;
    }

    /**
     * Sets the value of the maxConsumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConsumers(BigInteger value) {
        this.maxConsumers = value;
    }

    /**
     * Gets the value of the purgeOnNoConsumers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurgeOnNoConsumers() {
        return purgeOnNoConsumers;
    }

    /**
     * Sets the value of the purgeOnNoConsumers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurgeOnNoConsumers(Boolean value) {
        this.purgeOnNoConsumers = value;
    }

    /**
     * Gets the value of the exclusive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclusive() {
        return exclusive;
    }

    /**
     * Sets the value of the exclusive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExclusive(Boolean value) {
        this.exclusive = value;
    }

    /**
     * Gets the value of the groupRebalance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupRebalance() {
        return groupRebalance;
    }

    /**
     * Sets the value of the groupRebalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupRebalance(Boolean value) {
        this.groupRebalance = value;
    }

    /**
     * Gets the value of the groupRebalancePauseDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGroupRebalancePauseDispatch() {
        return groupRebalancePauseDispatch;
    }

    /**
     * Sets the value of the groupRebalancePauseDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGroupRebalancePauseDispatch(Boolean value) {
        this.groupRebalancePauseDispatch = value;
    }

    /**
     * Gets the value of the groupBuckets property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupBuckets() {
        return groupBuckets;
    }

    /**
     * Sets the value of the groupBuckets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupBuckets(Integer value) {
        this.groupBuckets = value;
    }

    /**
     * Gets the value of the groupFirstKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupFirstKey() {
        return groupFirstKey;
    }

    /**
     * Sets the value of the groupFirstKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupFirstKey(String value) {
        this.groupFirstKey = value;
    }

    /**
     * Gets the value of the lastValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastValue() {
        return lastValue;
    }

    /**
     * Sets the value of the lastValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastValue(Boolean value) {
        this.lastValue = value;
    }

    /**
     * Gets the value of the lastValueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastValueKey() {
        return lastValueKey;
    }

    /**
     * Sets the value of the lastValueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastValueKey(String value) {
        this.lastValueKey = value;
    }

    /**
     * Gets the value of the nonDestructive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonDestructive() {
        return nonDestructive;
    }

    /**
     * Sets the value of the nonDestructive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonDestructive(Boolean value) {
        this.nonDestructive = value;
    }

    /**
     * Gets the value of the consumersBeforeDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumersBeforeDispatch() {
        return consumersBeforeDispatch;
    }

    /**
     * Sets the value of the consumersBeforeDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumersBeforeDispatch(Integer value) {
        this.consumersBeforeDispatch = value;
    }

    /**
     * Gets the value of the delayBeforeDispatch property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDelayBeforeDispatch() {
        return delayBeforeDispatch;
    }

    /**
     * Sets the value of the delayBeforeDispatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDelayBeforeDispatch(Long value) {
        this.delayBeforeDispatch = value;
    }

    /**
     * Gets the value of the ringSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRingSize() {
        return ringSize;
    }

    /**
     * Sets the value of the ringSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRingSize(Long value) {
        this.ringSize = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

}
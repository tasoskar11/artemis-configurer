//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.07 at 10:08:36 PM CEST 
//


package org.artemis.configuration.jaxb2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="live-only" type="{urn:activemq:core}haLiveOnlyPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="primary-only" type="{urn:activemq:core}haPrimaryOnlyPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="replication" type="{urn:activemq:core}haReplicationType" minOccurs="0"/&gt;
 *         &lt;element name="shared-store" type="{urn:activemq:core}haSharedStoreType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.w3.org/XML/1998/namespace}specialAttrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "liveOnly",
    "primaryOnly",
    "replication",
    "sharedStore"
})
@XmlRootElement(name = "ha-policy")
public class HaPolicy {

    @XmlElement(name = "live-only")
    protected HaLiveOnlyPolicyType liveOnly;
    @XmlElement(name = "primary-only")
    protected HaPrimaryOnlyPolicyType primaryOnly;
    protected HaReplicationType replication;
    @XmlElement(name = "shared-store")
    protected HaSharedStoreType sharedStore;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the liveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link HaLiveOnlyPolicyType }
     *     
     */
    public HaLiveOnlyPolicyType getLiveOnly() {
        return liveOnly;
    }

    /**
     * Sets the value of the liveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaLiveOnlyPolicyType }
     *     
     */
    public void setLiveOnly(HaLiveOnlyPolicyType value) {
        this.liveOnly = value;
    }

    /**
     * Gets the value of the primaryOnly property.
     * 
     * @return
     *     possible object is
     *     {@link HaPrimaryOnlyPolicyType }
     *     
     */
    public HaPrimaryOnlyPolicyType getPrimaryOnly() {
        return primaryOnly;
    }

    /**
     * Sets the value of the primaryOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaPrimaryOnlyPolicyType }
     *     
     */
    public void setPrimaryOnly(HaPrimaryOnlyPolicyType value) {
        this.primaryOnly = value;
    }

    /**
     * Gets the value of the replication property.
     * 
     * @return
     *     possible object is
     *     {@link HaReplicationType }
     *     
     */
    public HaReplicationType getReplication() {
        return replication;
    }

    /**
     * Sets the value of the replication property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaReplicationType }
     *     
     */
    public void setReplication(HaReplicationType value) {
        this.replication = value;
    }

    /**
     * Gets the value of the sharedStore property.
     * 
     * @return
     *     possible object is
     *     {@link HaSharedStoreType }
     *     
     */
    public HaSharedStoreType getSharedStore() {
        return sharedStore;
    }

    /**
     * Sets the value of the sharedStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaSharedStoreType }
     *     
     */
    public void setSharedStore(HaSharedStoreType value) {
        this.sharedStore = value;
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

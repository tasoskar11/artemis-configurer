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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for haReplicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="haReplicationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="primary" type="{urn:activemq:core}replicationPrimaryPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="master" type="{urn:activemq:core}replicationPrimaryPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="backup" type="{urn:activemq:core}replicationBackupPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="slave" type="{urn:activemq:core}replicationBackupPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="colocated" type="{urn:activemq:core}haColocationReplicationType" minOccurs="0"/&gt;
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
@XmlType(name = "haReplicationType", propOrder = {
    "primary",
    "master",
    "backup",
    "slave",
    "colocated"
})
public class HaReplicationType {

    protected ReplicationPrimaryPolicyType primary;
    protected ReplicationPrimaryPolicyType master;
    protected ReplicationBackupPolicyType backup;
    protected ReplicationBackupPolicyType slave;
    protected HaColocationReplicationType colocated;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationPrimaryPolicyType }
     *     
     */
    public ReplicationPrimaryPolicyType getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationPrimaryPolicyType }
     *     
     */
    public void setPrimary(ReplicationPrimaryPolicyType value) {
        this.primary = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationPrimaryPolicyType }
     *     
     */
    public ReplicationPrimaryPolicyType getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationPrimaryPolicyType }
     *     
     */
    public void setMaster(ReplicationPrimaryPolicyType value) {
        this.master = value;
    }

    /**
     * Gets the value of the backup property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationBackupPolicyType }
     *     
     */
    public ReplicationBackupPolicyType getBackup() {
        return backup;
    }

    /**
     * Sets the value of the backup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationBackupPolicyType }
     *     
     */
    public void setBackup(ReplicationBackupPolicyType value) {
        this.backup = value;
    }

    /**
     * Gets the value of the slave property.
     * 
     * @return
     *     possible object is
     *     {@link ReplicationBackupPolicyType }
     *     
     */
    public ReplicationBackupPolicyType getSlave() {
        return slave;
    }

    /**
     * Sets the value of the slave property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplicationBackupPolicyType }
     *     
     */
    public void setSlave(ReplicationBackupPolicyType value) {
        this.slave = value;
    }

    /**
     * Gets the value of the colocated property.
     * 
     * @return
     *     possible object is
     *     {@link HaColocationReplicationType }
     *     
     */
    public HaColocationReplicationType getColocated() {
        return colocated;
    }

    /**
     * Sets the value of the colocated property.
     * 
     * @param value
     *     allowed object is
     *     {@link HaColocationReplicationType }
     *     
     */
    public void setColocated(HaColocationReplicationType value) {
        this.colocated = value;
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

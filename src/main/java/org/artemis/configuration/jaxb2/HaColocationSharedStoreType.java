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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for haColocationSharedStoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="haColocationSharedStoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="request-backup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="backup-request-retries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="backup-request-retry-interval" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="max-backups" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="backup-port-offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="master" type="{urn:activemq:core}sharedStorePrimaryPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="primary" type="{urn:activemq:core}sharedStorePrimaryPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="slave" type="{urn:activemq:core}sharedStoreBackupPolicyType" minOccurs="0"/&gt;
 *         &lt;element name="backup" type="{urn:activemq:core}sharedStoreBackupPolicyType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attGroup ref="{http://www.w3.org/XML/1998/namespace}specialAttrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "haColocationSharedStoreType", propOrder = {

})
public class HaColocationSharedStoreType {

    @XmlElement(name = "request-backup", defaultValue = "false")
    protected Boolean requestBackup;
    @XmlElement(name = "backup-request-retries", defaultValue = "-1")
    protected Integer backupRequestRetries;
    @XmlElement(name = "backup-request-retry-interval", defaultValue = "5000")
    protected Long backupRequestRetryInterval;
    @XmlElement(name = "max-backups", defaultValue = "1")
    protected Integer maxBackups;
    @XmlElement(name = "backup-port-offset", defaultValue = "100")
    protected Integer backupPortOffset;
    protected SharedStorePrimaryPolicyType master;
    protected SharedStorePrimaryPolicyType primary;
    protected SharedStoreBackupPolicyType slave;
    protected SharedStoreBackupPolicyType backup;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the requestBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestBackup() {
        return requestBackup;
    }

    /**
     * Sets the value of the requestBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestBackup(Boolean value) {
        this.requestBackup = value;
    }

    /**
     * Gets the value of the backupRequestRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackupRequestRetries() {
        return backupRequestRetries;
    }

    /**
     * Sets the value of the backupRequestRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackupRequestRetries(Integer value) {
        this.backupRequestRetries = value;
    }

    /**
     * Gets the value of the backupRequestRetryInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBackupRequestRetryInterval() {
        return backupRequestRetryInterval;
    }

    /**
     * Sets the value of the backupRequestRetryInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBackupRequestRetryInterval(Long value) {
        this.backupRequestRetryInterval = value;
    }

    /**
     * Gets the value of the maxBackups property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBackups() {
        return maxBackups;
    }

    /**
     * Sets the value of the maxBackups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBackups(Integer value) {
        this.maxBackups = value;
    }

    /**
     * Gets the value of the backupPortOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackupPortOffset() {
        return backupPortOffset;
    }

    /**
     * Sets the value of the backupPortOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackupPortOffset(Integer value) {
        this.backupPortOffset = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link SharedStorePrimaryPolicyType }
     *     
     */
    public SharedStorePrimaryPolicyType getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedStorePrimaryPolicyType }
     *     
     */
    public void setMaster(SharedStorePrimaryPolicyType value) {
        this.master = value;
    }

    /**
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link SharedStorePrimaryPolicyType }
     *     
     */
    public SharedStorePrimaryPolicyType getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedStorePrimaryPolicyType }
     *     
     */
    public void setPrimary(SharedStorePrimaryPolicyType value) {
        this.primary = value;
    }

    /**
     * Gets the value of the slave property.
     * 
     * @return
     *     possible object is
     *     {@link SharedStoreBackupPolicyType }
     *     
     */
    public SharedStoreBackupPolicyType getSlave() {
        return slave;
    }

    /**
     * Sets the value of the slave property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedStoreBackupPolicyType }
     *     
     */
    public void setSlave(SharedStoreBackupPolicyType value) {
        this.slave = value;
    }

    /**
     * Gets the value of the backup property.
     * 
     * @return
     *     possible object is
     *     {@link SharedStoreBackupPolicyType }
     *     
     */
    public SharedStoreBackupPolicyType getBackup() {
        return backup;
    }

    /**
     * Sets the value of the backup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedStoreBackupPolicyType }
     *     
     */
    public void setBackup(SharedStoreBackupPolicyType value) {
        this.backup = value;
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
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
 * <p>Java class for colocatedReplicaPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="colocatedReplicaPolicyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="group-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cluster-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="max-saved-replicated-journals-size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="scale-down" type="{urn:activemq:core}scaleDownType" minOccurs="0"/&gt;
 *         &lt;element name="restart-backup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "colocatedReplicaPolicyType", propOrder = {

})
public class ColocatedReplicaPolicyType {

    @XmlElement(name = "group-name")
    protected String groupName;
    @XmlElement(name = "cluster-name")
    protected String clusterName;
    @XmlElement(name = "max-saved-replicated-journals-size", defaultValue = "2")
    protected Integer maxSavedReplicatedJournalsSize;
    @XmlElement(name = "scale-down")
    protected ScaleDownType scaleDown;
    @XmlElement(name = "restart-backup", defaultValue = "false")
    protected Boolean restartBackup;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the clusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Sets the value of the clusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClusterName(String value) {
        this.clusterName = value;
    }

    /**
     * Gets the value of the maxSavedReplicatedJournalsSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSavedReplicatedJournalsSize() {
        return maxSavedReplicatedJournalsSize;
    }

    /**
     * Sets the value of the maxSavedReplicatedJournalsSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSavedReplicatedJournalsSize(Integer value) {
        this.maxSavedReplicatedJournalsSize = value;
    }

    /**
     * Gets the value of the scaleDown property.
     * 
     * @return
     *     possible object is
     *     {@link ScaleDownType }
     *     
     */
    public ScaleDownType getScaleDown() {
        return scaleDown;
    }

    /**
     * Sets the value of the scaleDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScaleDownType }
     *     
     */
    public void setScaleDown(ScaleDownType value) {
        this.scaleDown = value;
    }

    /**
     * Gets the value of the restartBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestartBackup() {
        return restartBackup;
    }

    /**
     * Sets the value of the restartBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestartBackup(Boolean value) {
        this.restartBackup = value;
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
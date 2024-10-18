//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.10.07 at 10:08:36 PM CEST 
//


package org.artemis.configuration.jaxb2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for broadcastGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="broadcastGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:activemq:core}local-bind-address" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:activemq:core}local-bind-port" minOccurs="0"/&gt;
 *         &lt;element name="group-address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="group-port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="broadcast-period" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="jgroups-file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jgroups-channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="connector-ref" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.w3.org/XML/1998/namespace}specialAttrs"/&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "broadcastGroupType", propOrder = {
    "localBindAddress",
    "localBindPort",
    "groupAddress",
    "groupPort",
    "broadcastPeriod",
    "jgroupsFile",
    "jgroupsChannel",
    "connectorRef"
})
public class BroadcastGroupType {

    @XmlElement(name = "local-bind-address")
    protected String localBindAddress;
    @XmlElement(name = "local-bind-port", defaultValue = "-1")
    protected Integer localBindPort;
    @XmlElement(name = "group-address")
    protected String groupAddress;
    @XmlElement(name = "group-port")
    protected Integer groupPort;
    @XmlElement(name = "broadcast-period", defaultValue = "2000")
    protected Long broadcastPeriod;
    @XmlElement(name = "jgroups-file")
    protected String jgroupsFile;
    @XmlElement(name = "jgroups-channel")
    protected String jgroupsChannel;
    @XmlElement(name = "connector-ref")
    protected List<String> connectorRef;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * 
     *                   a local address to which the datagram socket is bound
     *                
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalBindAddress() {
        return localBindAddress;
    }

    /**
     * Sets the value of the localBindAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalBindAddress(String value) {
        this.localBindAddress = value;
    }

    /**
     * 
     *                   a local port to which the datagram socket is bound
     *                
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalBindPort() {
        return localBindPort;
    }

    /**
     * Sets the value of the localBindPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalBindPort(Integer value) {
        this.localBindPort = value;
    }

    /**
     * Gets the value of the groupAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupAddress() {
        return groupAddress;
    }

    /**
     * Sets the value of the groupAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupAddress(String value) {
        this.groupAddress = value;
    }

    /**
     * Gets the value of the groupPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupPort() {
        return groupPort;
    }

    /**
     * Sets the value of the groupPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupPort(Integer value) {
        this.groupPort = value;
    }

    /**
     * Gets the value of the broadcastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBroadcastPeriod() {
        return broadcastPeriod;
    }

    /**
     * Sets the value of the broadcastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBroadcastPeriod(Long value) {
        this.broadcastPeriod = value;
    }

    /**
     * Gets the value of the jgroupsFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJgroupsFile() {
        return jgroupsFile;
    }

    /**
     * Sets the value of the jgroupsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJgroupsFile(String value) {
        this.jgroupsFile = value;
    }

    /**
     * Gets the value of the jgroupsChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJgroupsChannel() {
        return jgroupsChannel;
    }

    /**
     * Sets the value of the jgroupsChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJgroupsChannel(String value) {
        this.jgroupsChannel = value;
    }

    /**
     * Gets the value of the connectorRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the connectorRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectorRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConnectorRef() {
        if (connectorRef == null) {
            connectorRef = new ArrayList<String>();
        }
        return this.connectorRef;
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
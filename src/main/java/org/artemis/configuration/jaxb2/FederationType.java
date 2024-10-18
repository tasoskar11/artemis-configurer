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
 * <p>Java class for federationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="federationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="upstream" type="{urn:activemq:core}upstreamType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="downstream" type="{urn:activemq:core}downstreamType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="policy-set" type="{urn:activemq:core}policySetType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="queue-policy" type="{urn:activemq:core}queuePolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address-policy" type="{urn:activemq:core}addressPolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transformer" type="{urn:activemq:core}federationTransformerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.w3.org/XML/1998/namespace}specialAttrs"/&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "federationType", propOrder = {
    "upstream",
    "downstream",
    "policySet",
    "queuePolicy",
    "addressPolicy",
    "transformer"
})
public class FederationType {

    protected List<UpstreamType> upstream;
    protected List<DownstreamType> downstream;
    @XmlElement(name = "policy-set")
    protected List<PolicySetType> policySet;
    @XmlElement(name = "queue-policy")
    protected List<QueuePolicyType> queuePolicy;
    @XmlElement(name = "address-policy")
    protected List<AddressPolicyType> addressPolicy;
    protected List<FederationTransformerType> transformer;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlAttribute(name = "user")
    protected String user;
    @XmlAttribute(name = "password")
    protected String password;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the upstream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the upstream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpstream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpstreamType }
     * 
     * 
     */
    public List<UpstreamType> getUpstream() {
        if (upstream == null) {
            upstream = new ArrayList<UpstreamType>();
        }
        return this.upstream;
    }

    /**
     * Gets the value of the downstream property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the downstream property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDownstream().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownstreamType }
     * 
     * 
     */
    public List<DownstreamType> getDownstream() {
        if (downstream == null) {
            downstream = new ArrayList<DownstreamType>();
        }
        return this.downstream;
    }

    /**
     * Gets the value of the policySet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the policySet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicySet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicySetType }
     * 
     * 
     */
    public List<PolicySetType> getPolicySet() {
        if (policySet == null) {
            policySet = new ArrayList<PolicySetType>();
        }
        return this.policySet;
    }

    /**
     * Gets the value of the queuePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the queuePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueuePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuePolicyType }
     * 
     * 
     */
    public List<QueuePolicyType> getQueuePolicy() {
        if (queuePolicy == null) {
            queuePolicy = new ArrayList<QueuePolicyType>();
        }
        return this.queuePolicy;
    }

    /**
     * Gets the value of the addressPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressPolicyType }
     * 
     * 
     */
    public List<AddressPolicyType> getAddressPolicy() {
        if (addressPolicy == null) {
            addressPolicy = new ArrayList<AddressPolicyType>();
        }
        return this.addressPolicy;
    }

    /**
     * Gets the value of the transformer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transformer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FederationTransformerType }
     * 
     * 
     */
    public List<FederationTransformerType> getTransformer() {
        if (transformer == null) {
            transformer = new ArrayList<FederationTransformerType>();
        }
        return this.transformer;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
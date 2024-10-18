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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             This will determine that queues are mirrored towards this next broker.
 *             All events will be send towards this AMQP connection acting like a replica.
 *          
 * 
 * <p>Java class for amqp-mirror-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="amqp-mirror-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element ref="{urn:activemq:core}property" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="message-acknowledgements" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="queue-creation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="queue-removal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="durable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="sync" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="address-filter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amqp-mirror-type", propOrder = {
    "property"
})
public class AmqpMirrorType {

    protected List<Property> property;
    @XmlAttribute(name = "message-acknowledgements")
    protected Boolean messageAcknowledgements;
    @XmlAttribute(name = "queue-creation")
    protected Boolean queueCreation;
    @XmlAttribute(name = "queue-removal")
    protected Boolean queueRemoval;
    @XmlAttribute(name = "durable")
    protected Boolean durable;
    @XmlAttribute(name = "sync")
    protected Boolean sync;
    @XmlAttribute(name = "address-filter")
    protected String addressFilter;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the messageAcknowledgements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMessageAcknowledgements() {
        if (messageAcknowledgements == null) {
            return true;
        } else {
            return messageAcknowledgements;
        }
    }

    /**
     * Sets the value of the messageAcknowledgements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMessageAcknowledgements(Boolean value) {
        this.messageAcknowledgements = value;
    }

    /**
     * Gets the value of the queueCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueueCreation() {
        if (queueCreation == null) {
            return true;
        } else {
            return queueCreation;
        }
    }

    /**
     * Sets the value of the queueCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueueCreation(Boolean value) {
        this.queueCreation = value;
    }

    /**
     * Gets the value of the queueRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isQueueRemoval() {
        if (queueRemoval == null) {
            return true;
        } else {
            return queueRemoval;
        }
    }

    /**
     * Sets the value of the queueRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueueRemoval(Boolean value) {
        this.queueRemoval = value;
    }

    /**
     * Gets the value of the durable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDurable() {
        if (durable == null) {
            return true;
        } else {
            return durable;
        }
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
     * Gets the value of the sync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSync() {
        if (sync == null) {
            return false;
        } else {
            return sync;
        }
    }

    /**
     * Sets the value of the sync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSync(Boolean value) {
        this.sync = value;
    }

    /**
     * Gets the value of the addressFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFilter() {
        return addressFilter;
    }

    /**
     * Sets the value of the addressFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFilter(String value) {
        this.addressFilter = value;
    }

}

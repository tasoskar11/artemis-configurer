package org.artemis.configurer.service;


import org.artemis.configuration.jaxb2.AddressType;
import org.artemis.configuration.jaxb2.AddressType.Anycast;
import org.artemis.configuration.jaxb2.AddressType.Multicast;
import org.artemis.configuration.jaxb2.Addresses;
import org.artemis.configuration.jaxb2.ConfigurationType;
import org.artemis.configuration.jaxb2.QueueType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArtemisConfigAddressService {

    @Autowired
    ConfigurationType  artemisConfiguration;

    public Addresses getAddresses() {
        return artemisConfiguration.getAddresses();
    }
    
    public boolean addAnycast(String mainAddress) {
        var anyCastAddressType = new AddressType();
        var anycast = new Anycast();
        var queueType = new QueueType();
        anyCastAddressType.setName(mainAddress);
        queueType.setName(mainAddress);
        anycast.getQueue().add(queueType);
        
        return artemisConfiguration.getAddresses().getAddress().add(anyCastAddressType);
    }

    public boolean addAddressMulticast(String topicAddress) {
        /*
         * 
         * <address name="customer.queue.contact.details">
                <anycast>
                    <queue name="customer.queue.contact.details"/>
                </anycast>
            </address>

            <address name="sales.topic.yearly.balance.status">
                <multicast>
                    <queue name="status-balance-statistics-collector-app"/>
                    <queue name="status-balance-incident-manager-app"/>
                </multicast>
            </address>
         */
        var multicastAddressType = new AddressType();
        multicastAddressType.setName(topicAddress);
        multicastAddressType.setMulticast(new Multicast());
        return artemisConfiguration.getAddresses().getAddress().add(multicastAddressType);
    }

    public boolean addMulticast(String topicAddress, String subscription, boolean subscriptionEnabled) {

        var multicastAddressType = artemisConfiguration.getAddresses().getAddress().stream().filter(address -> (address.getName().equals(topicAddress))).findFirst().get();
        
        var queueType = new QueueType();
        queueType.setName(subscription);
        queueType.setEnabled(subscriptionEnabled);
        return multicastAddressType.getMulticast().getQueue().add(queueType);
        
    }

    public boolean removeAddress(String mainAddress) {
        return artemisConfiguration.getAddresses().getAddress().removeIf(address -> (address.getName().equals(mainAddress)));
        
    }

    public boolean removeMulticast(String topicAddress, String subscription, boolean subscriptionEnabled) {
        var multicastAddressType = artemisConfiguration.getAddresses().getAddress().stream().filter(address -> (address.getName().equals(topicAddress))).findFirst().get();
        return multicastAddressType.getMulticast().getQueue().removeIf(multicast -> (multicast.getName().equals(subscription)));
    }

}
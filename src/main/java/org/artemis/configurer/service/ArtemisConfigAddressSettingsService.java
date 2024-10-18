package org.artemis.configurer.service;

import org.artemis.configuration.jaxb2.AddressSettingType;
import org.artemis.configuration.jaxb2.AddressSettings;
import org.artemis.configuration.jaxb2.ConfigurationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArtemisConfigAddressSettingsService {

    @Autowired
    ConfigurationType artemisConfiguration;
    
    public AddressSettings getAllAddressSettings() {
        return artemisConfiguration.getAddressSettings();
    }

    public boolean findNamespaceAddressByName(String mainAddress) {
        return artemisConfiguration.getAddressSettings().getAddressSetting().stream().anyMatch(setting -> setting.getMatch().equals(mainAddress));
    }

    public boolean deleteNamespaceAddressByName(String mainAddress) {
        return artemisConfiguration.getAddressSettings().getAddressSetting().removeIf(setting -> setting.getMatch().equals(mainAddress));
    }

    public boolean addNamespaceAddressSetting(String mainAddress) {
        String deadLetterQueueSuffix = ".DLQ";        
        String expiryQueueSuffix = ".EXP";        
        var addressSetting = new AddressSettingType();
        addressSetting.setMatch(mainAddress);
        
        addressSetting.setDeadLetterAddress(mainAddress.replaceAll(".#", deadLetterQueueSuffix));
        addressSetting.setAutoCreateAddresses(true);
        addressSetting.setDeadLetterQueuePrefix("");
        addressSetting.setDeadLetterQueueSuffix(deadLetterQueueSuffix);
        addressSetting.setAutoCreateExpiryResources(true);
        addressSetting.setExpiryQueuePrefix("");
        addressSetting.setExpiryQueueSuffix(expiryQueueSuffix);
        addressSetting.setExpiryAddress(mainAddress.replaceAll(".#", expiryQueueSuffix));
        addressSetting.setExpiryDelay(604800000L);
        addressSetting.setRedeliveryDelay(100L);
        addressSetting.setRedistributionDelay(100L);
        addressSetting.setMaxSizeBytes("-1");
        addressSetting.setMessageCounterHistoryDayLimit(10);
        addressSetting.setAddressFullPolicy("PAGE");
        addressSetting.setAutoCreateQueues(true);
        addressSetting.setAutoCreateAddresses(true);
        addressSetting.setAutoCreateJmsQueues(true);
        addressSetting.setAutoCreateJmsTopics(true);

        return artemisConfiguration.getAddressSettings().getAddressSetting().add(addressSetting);

        /*
         * <address-setting match="sales.#">
                <dead-letter-address>sales.DLQ</dead-letter-address>
                <auto-create-dead-letter-resources>true</auto-create-dead-letter-resources>
                <dead-letter-queue-prefix></dead-letter-queue-prefix> <!-- override the default -->
                <dead-letter-queue-suffix>.DLQ</dead-letter-queue-suffix>
                <auto-create-expiry-resources>true</auto-create-expiry-resources>
                <expiry-queue-prefix></expiry-queue-prefix> <!-- override the default -->
                <expiry-queue-suffix>.EXP</expiry-queue-suffix>
                <expiry-address>sales.EXP</expiry-address>
                <expiry-delay>604800000</expiry-delay>
                <redelivery-delay>100</redelivery-delay>
                <redistribution-delay>500</redistribution-delay>
                <!-- with -1 only the global-max-size is in use for limiting -->
                <max-size-bytes>-1</max-size-bytes>
                <message-counter-history-day-limit>10</message-counter-history-day-limit>
                <address-full-policy>PAGE</address-full-policy>
                <auto-create-queues>true</auto-create-queues>
                <auto-create-addresses>true</auto-create-addresses>
                <auto-create-jms-queues>true</auto-create-jms-queues>
                <auto-create-jms-topics>true</auto-create-jms-topics>
            </address-setting>
         * 
         */
    }

}
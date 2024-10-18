package org.artemis.configurer.controller;

import org.artemis.configuration.jaxb2.SecuritySettings;
import org.artemis.configurer.service.ArtemisConfigSecuritySettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/security/settings")
public class ArtemisConfigSecuritySettingsController {


    @Autowired
    ArtemisConfigSecuritySettingsService securitySettingsService;
    

    @GetMapping("/")
    public SecuritySettings getSecuritySettings() {
        return securitySettingsService.getAllSecuritySettings();
    }

    @GetMapping(path="/simple/delete")
    public boolean deleteSecuritySetting(@RequestParam String mainAddress) {
        return securitySettingsService.deleteSecuritySetting(mainAddress);
    }

    @GetMapping(path="/simple/create")
    public boolean addSecuritySetting(@RequestParam String mainAddress, @RequestParam String producerRole, @RequestParam String consumerRole) {
        return securitySettingsService.addSecuritySetting(mainAddress, producerRole, consumerRole);
    }

    @GetMapping(path="/subscription/create")
    public boolean addSubscriptionSecuritySetting(@RequestParam String mainAddress, @RequestParam String consumerRole) {
        
        return securitySettingsService.addSubscriptionSecuritySetting(mainAddress, consumerRole);
    }

    @GetMapping(path="/topic/create")
    public boolean addTopicSecuritySetting(@RequestParam String mainAddress, @RequestParam String producerRole, @RequestParam String adminRole) {
        /*
         *             <ns2:security-setting match="sales.topic.yearly.balance.status.#">
                <ns2:permission type="send" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="consume" roles="sales-admin"/>
                <ns2:permission type="browse" roles="sales-admin"/>
                <ns2:permission type="createNonDurableQueue" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="deleteNonDurableQueue" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="createDurableQueue" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="deleteDurableQueue" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="createAddress" roles="sales-admin,sales-info-app"/>
                <ns2:permission type="deleteAddress" roles="sales-admin,sales-info-app"/>
            </ns2:security-setting>
         * 
         */
           
        return securitySettingsService.addTopicSecuritySetting(mainAddress, producerRole, adminRole);
    }

    @PostMapping(path="/namespace/create")
    public boolean addNamespaceSecuritySetting(@RequestParam String mainAddress, @RequestParam String producerRole, @RequestParam String consumerRole, @RequestParam String adminRole) {
        
           /*
            * 
             <security-setting match="customer.#">
                <permission type="createNonDurableQueue" roles="customer-admin,customer-write,customer-read"/>
                <permission type="deleteNonDurableQueue" roles="customer-admin"/>
                <permission type="createDurableQueue" roles="customer-admin,customer-write,customer-read"/>
                <permission type="deleteDurableQueue" roles="customer-admin"/>
                <permission type="createAddress" roles="customer-admin,customer-write,customer-read"/>
                <permission type="deleteAddress" roles="customer-admin"/>
                <permission type="consume" roles="customer-admin,customer-read"/>
                <permission type="browse" roles="customer-admin,customer-read"/>
                <permission type="send" roles="customer-admin,customer-write"/>
                <!-- we need this otherwise ./artemis data imp wouldn't work -->
                <permission type="manage" roles="customer-admin"/>
            </security-setting>
            */
        return securitySettingsService.addNamespaceSecuritySetting(mainAddress, producerRole, consumerRole, adminRole);
    }
}

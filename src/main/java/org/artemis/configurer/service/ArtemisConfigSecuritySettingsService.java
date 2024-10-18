package org.artemis.configurer.service;

import org.artemis.configuration.jaxb2.ConfigurationType;
import org.artemis.configuration.jaxb2.SecuritySettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtemisConfigSecuritySettingsService {

    @Autowired
    ConfigurationType artemisConfiguration;

    public SecuritySettings getAllSecuritySettings() {
        return artemisConfiguration.getSecuritySettings();
    }

    public boolean deleteSecuritySetting(String mainAddress) {
        return artemisConfiguration.getSecuritySettings().getSecuritySetting().removeIf(setting -> setting.getMatch().equals(mainAddress));
    }

    public boolean addSecuritySetting(String mainAddress, String producerRole, String consumerRole) {
        
        var securitySetting = new SecuritySettings.SecuritySetting();
        securitySetting.setMatch(mainAddress);
        securitySetting.getPermission().add(buildPermission(consumerRole, "consume"));
        securitySetting.getPermission().add(buildPermission(consumerRole, "browse"));
        securitySetting.getPermission().add(buildPermission(consumerRole, "send"));
        return artemisConfiguration.getSecuritySettings().getSecuritySetting().add(securitySetting);

    }

    public boolean addSubscriptionSecuritySetting(String mainAddress, String consumerRole) {
        
        var securitySetting = new SecuritySettings.SecuritySetting();
        securitySetting.setMatch(mainAddress);
        securitySetting.getPermission().add(buildPermission(consumerRole, "consume"));
        securitySetting.getPermission().add(buildPermission(consumerRole, "browse"));
        return artemisConfiguration.getSecuritySettings().getSecuritySetting().add(securitySetting);
    }

    public boolean addTopicSecuritySetting(String mainAddress, String producerRole, String adminRole) {
        var securitySetting = new SecuritySettings.SecuritySetting();
        securitySetting.setMatch(mainAddress);
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "send"));
        securitySetting.getPermission().add(buildPermission(adminRole, "consume"));
        securitySetting.getPermission().add(buildPermission(adminRole, "browse"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "createNonDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "deleteNonDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "createDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "deleteDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "createAddress"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "deleteAddress"));

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
           
        return artemisConfiguration.getSecuritySettings().getSecuritySetting().add(securitySetting);
    }

    public boolean addNamespaceSecuritySetting(String mainAddress, String producerRole, String consumerRole, String adminRole) {
        var securitySetting = new SecuritySettings.SecuritySetting();
        securitySetting.setMatch(mainAddress);
        securitySetting.getPermission().add(buildPermission(adminRole+","+producerRole, "send"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+consumerRole, "consume"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+consumerRole, "browse"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+consumerRole+","+producerRole, "createNonDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole, "deleteNonDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+consumerRole+","+producerRole, "createDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole, "deleteDurableQueue"));
        securitySetting.getPermission().add(buildPermission(adminRole+","+consumerRole+","+producerRole, "createAddress"));
        securitySetting.getPermission().add(buildPermission(adminRole, "deleteAddress"));
        securitySetting.getPermission().add(buildPermission(adminRole, "manage"));
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
        return artemisConfiguration.getSecuritySettings().getSecuritySetting().add(securitySetting);
    }

    private SecuritySettings.SecuritySetting.Permission buildPermission(String consumerRole, String type) {
        var permission = new SecuritySettings.SecuritySetting.Permission();
        permission.setRoles(consumerRole);
        permission.setType(type);
        return permission;
    }

}
package org.artemis.configurer.controller;


import org.artemis.configuration.jaxb2.AddressSettingType;
import org.artemis.configuration.jaxb2.AddressSettings;
import org.artemis.configuration.jaxb2.ConfigurationType;
import org.artemis.configurer.service.ArtemisConfigAddressSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/address/settings")
public class ArtemisConfigAddressSettingsController {

    @Autowired
    ArtemisConfigAddressSettingsService addressSettingsService;    

    @GetMapping("/")
    public AddressSettings getAddressesSettings() {
        return addressSettingsService.getAllAddressSettings();
    }

    @GetMapping(path="/namespace/find")
    public boolean findNamespaceAddressByName(@RequestParam String mainAddress) {
        return addressSettingsService.findNamespaceAddressByName(mainAddress);
    }

    @GetMapping(path="/namespace/delete")
    public boolean deleteNamespaceAddressByName(@RequestParam String mainAddress) {
        return addressSettingsService.deleteNamespaceAddressByName(mainAddress);
    }

    @GetMapping(path="/namespace/create")
    public boolean addNamespaceAddressSetting(@RequestParam String mainAddress) {
        return addressSettingsService.addNamespaceAddressSetting(mainAddress);
    }

    
}

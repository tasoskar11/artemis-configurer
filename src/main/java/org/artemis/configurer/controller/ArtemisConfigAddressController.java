package org.artemis.configurer.controller;


import org.artemis.configuration.jaxb2.Addresses;
import org.artemis.configurer.service.ArtemisConfigAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/addresses")
public class ArtemisConfigAddressController {

    @Autowired
    ArtemisConfigAddressService  addressService;

    @GetMapping("/")
    public Addresses getAddresses() {
        return addressService.getAddresses();
    }
    
    @GetMapping(path="/anycast/create")
    public boolean addAnycast(@RequestParam String mainAddress) {
        return addressService.addAnycast(mainAddress);
    }

    @GetMapping(path="/multicast/create")
    public boolean addAddressMulticast(@RequestParam String topicAddress) {
        return addressService.addAddressMulticast(topicAddress);
    }

    @GetMapping(path="/multicast/subscription/create")
    public boolean addMulticast(@RequestParam String topicAddress, @RequestParam String subscription, @RequestParam boolean subscriptionEnabled) {
        return addressService.addMulticast(topicAddress, subscription, subscriptionEnabled);
    }

    @GetMapping(path="/address/remove")
    public boolean removeAddress(@RequestParam String mainAddress) {
        return addressService.removeAddress(mainAddress);
    }

    @GetMapping(path="/multicast/subscription/remove")
    public boolean removeMulticast(@RequestParam String topicAddress, @RequestParam String subscription, @RequestParam boolean subscriptionEnabled) {
        return addressService.removeMulticast(topicAddress, subscription, subscriptionEnabled);
    }
}

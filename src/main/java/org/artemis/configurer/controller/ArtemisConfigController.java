package org.artemis.configurer.controller;

import org.artemis.configurer.service.ArtemisConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.xml.bind.JAXBException;


@RestController
@RequestMapping("/api/config")
public class ArtemisConfigController {

    @Autowired
    ArtemisConfigService  configService;

    @GetMapping("/")
    public boolean getAddresses() throws JAXBException {
        configService.printTheNewArtemisConfig();
        return true;
    }
    
    
}

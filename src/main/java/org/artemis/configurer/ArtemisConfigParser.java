package org.artemis.configurer;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;


import org.artemis.configuration.jaxb2.*;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class ArtemisConfigParser {
 
    @Bean
    public ConfigurationType artemisConfig() {
        Configuration config = null;
        JAXBElement<ConfigurationType> configurationType = null;
        try {
            // Create JAXB context using the generated ArtemisConfig class
            JAXBContext context = JAXBContext.newInstance(Configuration.class);



            // Create unmarshaller to convert XML to Java object
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Specify the XML file path
            File xmlFile = new File("src/main/resources/broker.xml");

            // Unmarshal (convert) the XML into an ArtemisConfig object
            config = (Configuration) unmarshaller.unmarshal(xmlFile);
            configurationType = (JAXBElement) config.getAny().get(0);
            configurationType.getValue().getAddresses();

            configurationType.getValue().getAddresses();

            configurationType.getValue().getSecuritySettings();
            configurationType.getValue().getAddressSettings();

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return configurationType.getValue();
    }


}
package org.artemis.configurer.service;

import javax.xml.namespace.QName;

import org.artemis.configuration.jaxb2.Configuration;
import org.artemis.configuration.jaxb2.ConfigurationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

@Service
public class ArtemisConfigService {

    @Autowired
    ConfigurationType artemisConfiguration;

    public void printTheNewArtemisConfig() throws JAXBException {
            JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);

            Configuration configuration = new Configuration();
            JAXBElement<ConfigurationType> jaxbElement = new JAXBElement<ConfigurationType>
                                                                        (new QName("urn:activemq:core", "core")
                                                                        , ConfigurationType.class
                                                                        , artemisConfiguration);
            configuration.getAny().add(jaxbElement);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

	        //Print XML String to Console
	        jaxbMarshaller.marshal(configuration, System.out);
    }
    
}

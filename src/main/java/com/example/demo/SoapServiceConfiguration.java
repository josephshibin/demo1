package com.example.demo;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapServiceConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(SoapServiceConfiguration.class);

//    @Bean
//    public JaxWsServerFactoryBean userSoapFactory(UserSoapServiceImpl userSoapServiceImpl) {
//        logger.info("Initializing the UserSoapService endpoint...");
//        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
//        factory.setServiceClass(UserSoapServiceImpl.class);
//        factory.setAddress("/services/userSoapService"); // Access it with /userSoapService
//        factory.setServiceBean(userSoapServiceImpl);
//        return factory;
//    }
private final Bus bus;
    private final UserSoapServiceImpl userSoapService;

    public SoapServiceConfiguration(Bus bus, UserSoapServiceImpl userSoapService) {
        this.bus = bus;
        this.userSoapService = userSoapService;
    }
    @Bean
    public EndpointImpl userSoapEndpoint() { // ✅ Use EndpointImpl as return type
        EndpointImpl endpoint = new EndpointImpl(bus, userSoapService);
        endpoint.publish("/userSoapService");
        return endpoint;
    }
}
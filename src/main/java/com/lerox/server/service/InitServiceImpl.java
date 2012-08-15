package com.lerox.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class InitServiceImpl implements InitService {
    private static final Logger logger = LoggerFactory.getLogger(InitServiceImpl.class);
    String property1;
    String property2;
    String profile;

    @PostConstruct
    public void init()
    {
        logger.debug("Property1: "+property1);
        logger.debug("Property2: "+property2);
        logger.debug("Property2: "+profile);

        logger.debug("com.lerox.profile:" + System.getProperty("com.lerox.profile"));
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    @Override
    public void setProfile(String profile) {
        this.profile = profile;
    }
}

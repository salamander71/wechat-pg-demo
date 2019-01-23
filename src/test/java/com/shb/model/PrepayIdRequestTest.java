package com.shb.model;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.NotifyBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.camel.test.spring.CamelSpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.concurrent.TimeUnit;

@RunWith(CamelSpringRunner.class)
@ContextConfiguration(locations = {"file:src/test/java/com/shb/model/PrepayIdRequestTest.xml"})
public class PrepayIdRequestTest {

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  CamelContext camelContext;

  @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
  @Autowired
  ProducerTemplate producer;


  @Test
  public void testGetXml() {

    NotifyBuilder notify = new NotifyBuilder(camelContext).whenCompleted(1).create();

    producer.sendBody("direct:load", "");

    notify.matches(10, TimeUnit.SECONDS);

  }
}
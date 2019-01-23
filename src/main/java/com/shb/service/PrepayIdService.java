package com.shb.service;

import com.shb.model.ObjectFactory;
import com.shb.model.PrepayIdRequest;
import com.shb.model.PrepayIdResponse;
import org.apache.camel.ProducerTemplate;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PrepayIdService {

  private static final Logger logger = LoggerFactory.getLogger(PrepayIdService.class);

  @Autowired
  ObjectFactory objectFactory;

  @SuppressWarnings("unused")
  public PrepayIdResponse process(PrepayIdRequest prepayIdRequest) {

    PrepayIdResponse prepayIdResponse = objectFactory.createPrepayIdResponse();
    prepayIdResponse.setXml(objectFactory.createPrepayIdResponseXml());

    logger.info("PrepayIdService.process called :{}",
        ReflectionToStringBuilder.toString(prepayIdRequest, ToStringStyle.JSON_STYLE));

    prepayIdResponse. getXml().setReturnCode("200");

    return prepayIdResponse;
  }
}

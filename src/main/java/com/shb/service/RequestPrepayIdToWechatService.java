package com.shb.service;

import com.shb.model.ObjectFactory;
import com.shb.model.PrepayIdRequest;
import com.shb.model.PrepayIdResponse;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestPrepayIdToWechatService {

  private static final Logger logger = LoggerFactory.getLogger(RequestPrepayIdToWechatService.class);

  @Autowired
  ObjectFactory objectFactory;

  @SuppressWarnings("unused")
  public PrepayIdResponse process(PrepayIdRequest prepayIdResquest) {
    // business : 위챗에 보낼 패러미터 조합
    PrepayIdResponse prepayIdResponse = objectFactory.createPrepayIdResponse();
    prepayIdResponse.getXml().setReturnCode("300");

    logger.info("PrepayIdService.process called :",
        ReflectionToStringBuilder.toString(prepayIdResponse, ToStringStyle.JSON_STYLE));

    return prepayIdResponse;
  }
}

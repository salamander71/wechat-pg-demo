package com.shb.infra.repository;

import com.shb.entity.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class UserInfoRepository extends RepositorySupport {

  public UserInfo readAnyUser() {

    UserInfo userInfo = getSqlSession().<UserInfo>selectOne("selectAll");
    return userInfo;
  }
}

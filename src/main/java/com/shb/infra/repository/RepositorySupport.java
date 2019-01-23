package com.shb.infra.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class RepositorySupport {

  @Autowired
  protected SqlSession sqlSession;

  public SqlSession getSqlSession() {
    return sqlSession;
  }
}

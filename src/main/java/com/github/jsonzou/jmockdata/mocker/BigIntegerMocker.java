package com.github.jsonzou.jmockdata.mocker;

import com.github.jsonzou.jmockdata.DataConfig;
import com.github.jsonzou.jmockdata.MockConfig;
import com.github.jsonzou.jmockdata.Mocker;
import com.github.jsonzou.jmockdata.util.RandomUtils;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * BigInteger对象模拟器
 */
public class BigIntegerMocker implements Mocker<BigInteger> {

  @Override
  public BigInteger mock(DataConfig mockConfig) {
    if(mockConfig.numberXeger()!=null){
      return new BigInteger(mockConfig.numberXeger().generate());
    }
    return BigInteger.valueOf(RandomUtils.nextLong(mockConfig.longRange()[0], mockConfig.longRange()[1]));
  }

}

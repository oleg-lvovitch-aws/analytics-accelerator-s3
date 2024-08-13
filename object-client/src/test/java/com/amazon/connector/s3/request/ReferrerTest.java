package com.amazon.connector.s3.request;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ReferrerTest {

  @Test
  void testConstructor() {
    Referrer referrer = new Referrer(null, ReadMode.SYNC);
    assertNotNull(referrer);
  }

  @Test
  void testReferrerToString() {
    Referrer referrer = new Referrer("bytes=11083511-19472118", ReadMode.ASYNC);
    assertEquals(referrer.toString(), "bytes=11083511-19472118,readMode=ASYNC");
  }
}
/*******************************************************************************
 *
 * 
 *
 * Copyright (C) 2011-2019 by Sun : http://www.kingbase.com.cn
 *
 *******************************************************************************
 *
 *
 *    Email : snj1314@163.com
 *
 *
 ******************************************************************************/

package org.pentaho.di.core.database.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.pentaho.di.core.database.DM7DatabaseMeta;

/**
 * 
 * 
 * @author Sun
 * @since 2019年9月6日
 * @version
 * 
 */
public class DM7DatabaseMetaTest {

  @Test
  public void testDriverClass() {
    DM7DatabaseMeta dbMeta = new DM7DatabaseMeta();
    assertEquals("dm.jdbc.driver.DmDriver", dbMeta.getDriverClass());
  }

  @Test
  public void testDefaultDatabasePort() {
    DM7DatabaseMeta dbMeta = new DM7DatabaseMeta();
    assertEquals(5236, dbMeta.getDefaultDatabasePort());
  }

}

package org.mvnsearch;

import org.mvnsearch.client.MyGwtWebAppTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MyGwtWebAppSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for MyGwtWebApp");
    suite.addTestSuite(MyGwtWebAppTest.class);
    return suite;
  }
}

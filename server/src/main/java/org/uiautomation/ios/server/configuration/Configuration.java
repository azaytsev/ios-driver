package org.uiautomation.ios.server.configuration;

import org.openqa.selenium.WebDriverException;

public class Configuration {

  // TODO freynaud extract to method checking sdk ?
  public static boolean SIMULATORS_ENABLED = false;
  public static boolean BETA_FEATURE = false;

  public static void off() {
    throw new WebDriverException("You need to enable beta feature.");
  }
}

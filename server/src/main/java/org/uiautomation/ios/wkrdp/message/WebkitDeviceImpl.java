/*
 * Copyright 2012-2015 eBay Software Foundation and ios-driver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.uiautomation.ios.wkrdp.message;

import com.dd.plist.NSDictionary;
import com.dd.plist.NSObject;

public class WebkitDeviceImpl implements WebkitDevice {

  protected final String wirSimulatorBuild;

  protected final String wirSimulatorProductVersion;

  protected final String wirSimulatorName;

  public WebkitDeviceImpl(NSDictionary nSDictionary) {
    NSObject wirSimulatorBuildObj = nSDictionary.objectForKey(WIRSIMULATORBUILDKEY);
    NSObject wirSimulatorProductVersionObj = nSDictionary.objectForKey(WIRSIMULATORPRODUCTVERSIONKEY);
    NSObject wirSimulatorNameObj = nSDictionary.objectForKey(WIRSIMULATORNAMEKEY);
	// If these fields are blank, this is a physical device
	// Leave the fields as null
    wirSimulatorBuild = (wirSimulatorBuildObj != null) ? wirSimulatorBuildObj.toString() : "";
    wirSimulatorProductVersion = (wirSimulatorProductVersionObj != null) ? wirSimulatorProductVersionObj.toString() : "";
    wirSimulatorName = (wirSimulatorNameObj != null) ? wirSimulatorNameObj.toString() : "";
  }

  @Override
  public String getSimulatorBuild() {
    return wirSimulatorBuild;
  }

  @Override
  public String getSimulatorProductVersion() {
    return wirSimulatorProductVersion;
  }

  @Override
  public String getSimulatorName() {
    return wirSimulatorName;
  }

  @Override
  public String toString() {
    return "[ " + WIRSIMULATORBUILDKEY + " = " + wirSimulatorBuild + 
        ", " + WIRSIMULATORPRODUCTVERSIONKEY + " = " + wirSimulatorProductVersion + 
        ", " + WIRSIMULATORNAMEKEY + " = " + wirSimulatorName + " ]";
  }

}
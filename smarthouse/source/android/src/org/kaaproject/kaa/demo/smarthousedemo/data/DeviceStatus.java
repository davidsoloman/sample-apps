/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kaaproject.kaa.demo.smarthousedemo.data;

import org.kaaproject.kaa.demo.smarthousedemo.R;

public enum DeviceStatus {

    UNKNOWN(R.drawable.device_status_unknown),
    OFFLINE(R.drawable.device_status_offline),
    ONLINE(R.drawable.device_status_online);
    
    int drawbleRes;
    
    DeviceStatus(int _drawableRes) {
        drawbleRes = _drawableRes;
    }
    
    public int getDrawableRes() {
        return drawbleRes;
    }
    
}

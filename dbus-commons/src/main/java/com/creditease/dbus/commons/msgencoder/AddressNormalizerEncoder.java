/*-
 * <<
 * DBus
 * ==
 * Copyright (C) 2016 - 2017 Bridata
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */

package com.creditease.dbus.commons.msgencoder;

import com.creditease.dbus.commons.DataType;
import com.creditease.dbus.commons.DbusMessage;

/**
 * 使用插件实现
 * Created by zhangyf on 17/3/31.
 */
@Deprecated
public class AddressNormalizerEncoder implements EncodeStrategy {
    @Override
    public Object encode(DbusMessage.Field field, Object value, EncodeColumn col) {
        if (field.dataType() == DataType.STRING) {
        }
        return value;
    }
}
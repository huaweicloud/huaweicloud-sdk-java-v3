/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.json;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.huaweicloud.sdk.core.http.FormDataFilePart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

/**
 * @author HuaweiCloud_SDK
 */
public class FormDataDeserializer extends JsonDeserializer<FormDataFilePart> {

    @Override
    public FormDataFilePart deserialize(JsonParser jsonParser,
                                        DeserializationContext deserializationContext) throws IOException {

        if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING) {
            File file = new File(jsonParser.getValueAsString());
            if (file.exists()) {
                return new FormDataFilePart(new FileInputStream(file), file.getName());
            }
            throw new NoSuchFileException(file.getPath() + " not exists.");
        }
        throw new JsonParseException(jsonParser,
                String.format("Current token (%s) not of string type", jsonParser.getCurrentToken()));
    }
}

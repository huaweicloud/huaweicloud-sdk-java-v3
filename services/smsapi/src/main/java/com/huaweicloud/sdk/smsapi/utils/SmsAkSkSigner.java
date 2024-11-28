/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2022. All rights reserved.
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

package com.huaweicloud.sdk.smsapi.utils;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.auth.AKSKSignerFactory;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.IAKSKSigner;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description: 发送短信签名：header+body体
 * <p>
 * User: HuaweiCloud_SDK
 * Date: 2024/10/29 14:38
 */
public class SmsAkSkSigner {
    private static final Pattern ENCODED_CHARACTERS_PATTERN;

    public static Map<String, String> sign(HttpRequest httpRequest, BasicCredentials credentials) {
        IAKSKSigner signer = AKSKSignerFactory.getSigner(httpRequest.getSigningAlgorithm());

        // Content-Type为application/x-www-form-urlencoded这种场景，request的body是null，
        // 数据都在formdata字段。而如果直接调用sdk的签名，formdata将无法参与签名，会导致发送短信失败。
        if (Objects.nonNull(httpRequest.getContentType())
                && httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_X_WWW_FORM_URLENCODED)
                && Objects.isNull(httpRequest.getBodyAsString()) && Objects.nonNull(httpRequest.getFormData())) {
            return signer.sign(httpRequest.builder().withBodyAsString(formdataToString(httpRequest.getFormData())).build(), credentials);
        }

        return signer.sign(httpRequest, credentials);
    }

    private static String formdataToString(Map<String, FormDataPart<?>> formData) {
        Iterator<Map.Entry<String, FormDataPart<?>>> iterator = formData.entrySet().iterator();

        boolean flag = false;
        StringBuilder builer = new StringBuilder();
        while (iterator.hasNext()) {
            Map.Entry<String, FormDataPart<?>> entry = iterator.next();
            if (flag) {
                builer.append("&");
            }

            builer.append(urlEncode(entry.getKey())).append("=").append(urlEncode(entry.getValue().getValue().toString()));
            flag = true;
        }

        return builer.toString();
    }

    static {
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(Pattern.quote("+"));
    }

    // 基于SDKCore提供的SignUtils.urlEncode修改而来，fromdata对部分特殊字符不需要转义
    private static String urlEncode(String value) {
        if (value == null) {
            return "";
        }
        String encoded;
        try {
            encoded = URLEncoder.encode(value, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new SdkException(e);
        }
        Matcher matcher = ENCODED_CHARACTERS_PATTERN.matcher(encoded);

        StringBuffer buffer;
        String replacement;
        for (buffer = new StringBuffer(encoded.length());
            matcher.find();
            matcher.appendReplacement(buffer, replacement)) {
            replacement = matcher.group(0);
            if ("+".equals(replacement)) {
                replacement = "%20";
            }
        }

        matcher.appendTail(buffer);
        return buffer.toString();
    }
}
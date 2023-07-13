/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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

package com.huaweicloud.sdk.core.utils;

import com.huaweicloud.sdk.core.exception.SdkException;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUtils {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private static final Pattern ENCODED_CHARACTERS_PATTERN;

    private SignUtils() {

    }

    static {
        StringBuilder pattern = new StringBuilder();
        pattern.append(Pattern.quote("+"))
                .append("|")
                .append(Pattern.quote("*"))
                .append("|")
                .append(Pattern.quote("%7E"))
                .append("|")
                .append(Pattern.quote("%2F"));
        ENCODED_CHARACTERS_PATTERN = Pattern.compile(pattern.toString());
    }

    public static String urlEncode(String value, boolean path) {
        if (value == null) {
            return "";
        }
        String encoded;
        try {
            encoded = URLEncoder.encode(value, DEFAULT_ENCODING);
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
            } else if ("*".equals(replacement)) {
                replacement = "%2A";
            } else if ("%7E".equals(replacement)) {
                replacement = "~";
            } else if (path && "%2F".equals(replacement)) {
                replacement = "/";
            }
        }

        matcher.appendTail(buffer);
        return buffer.toString();
    }

    public static String convertSortedMap2QueryString(SortedMap<String, List<String>> sortedMap) {
        StringBuilder builder = new StringBuilder();
        Iterator<Map.Entry<String, List<String>>> itr = sortedMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, List<String>> pair = itr.next();
            for (int i = 0; i < pair.getValue().size(); i++) {
                builder.append(pair.getKey());
                builder.append("=");
                builder.append(pair.getValue().get(i));
                if (i < pair.getValue().size() - 1) {
                    builder.append("&");
                }
            }
            if (pair.getValue().size() == 0) {
                builder.append(pair.getKey()).append("=");
            }
            if (itr.hasNext()) {
                builder.append("&");
            }
        }

        return builder.toString();
    }

    public static SortedMap<String, List<String>> convertQuery2SortedMap(String query) {
        SortedMap<String, List<String>> sorted = new TreeMap<>();

        if (query == null || query.isEmpty()) {
            return sorted;
        }

        String[] splitArr = query.split("&");
        for (String split : splitArr) {
            String[] kv = split.split("=");
            if (kv.length == 2) {
                if (!sorted.containsKey(kv[0])) {
                    List<String> values = new ArrayList<>();
                    values.add(kv[1]);
                    sorted.put(kv[0], values);
                } else {
                    sorted.get(kv[0]).add(kv[1]);
                }
            }
        }
        return sorted;
    }
}
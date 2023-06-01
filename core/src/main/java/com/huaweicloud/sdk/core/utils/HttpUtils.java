package com.huaweicloud.sdk.core.utils;

import com.huaweicloud.sdk.core.Constants;

import java.util.Arrays;
import java.util.List;

public final class HttpUtils {

    private static final List<String> TEXT_BASED_CONTENT_TYPES = Arrays.asList(
            Constants.MEDIATYPE.APPLICATION_JSON,
            Constants.MEDIATYPE.APPLICATION_XML,
            Constants.MEDIATYPE.TEXT
    );

    private static final List<String> OCTET_STREAM_CONTENT_TYPES = Arrays.asList(
            Constants.MEDIATYPE.APPLICATION_OCTET_STREAM,
            Constants.MEDIATYPE.BINARY_OCTET_STREAM
    );

    private HttpUtils() {

    }

    public static boolean isTextBasedContentType(String contentType) {
        if (!StringUtils.isEmpty(contentType)) {
            for (String textBasedContentType : TEXT_BASED_CONTENT_TYPES) {
                if (contentType.startsWith(textBasedContentType)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isOctetStreamContentType(String contentType) {
        if (!StringUtils.isEmpty(contentType)) {
            for (String octetStreamContentType : OCTET_STREAM_CONTENT_TYPES) {
                if (contentType.startsWith(octetStreamContentType)) {
                    return true;
                }
            }
        }
        return false;
    }

}

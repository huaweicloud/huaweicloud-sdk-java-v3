package com.huaweicloud.sdk.smsapi.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendDiffSmsRequest;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendDiffSmsRequestBody;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendDiffSmsResponse;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendSmsRequest;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendSmsRequestBody;
import com.huaweicloud.sdk.smsapi.v1.model.BatchSendSmsResponse;

@SuppressWarnings("unchecked")
public class SMSApiMeta {

    public static final HttpRequestDef<BatchSendDiffSmsRequest, BatchSendDiffSmsResponse> batchSendDiffSms =
        genForBatchSendDiffSms();

    private static HttpRequestDef<BatchSendDiffSmsRequest, BatchSendDiffSmsResponse> genForBatchSendDiffSms() {
        // basic
        HttpRequestDef.Builder<BatchSendDiffSmsRequest, BatchSendDiffSmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSendDiffSmsRequest.class, BatchSendDiffSmsResponse.class)
                .withName("BatchSendDiffSms")
                .withUri("/sms/batchSendDiffSms/v1")
                .withContentType("application/json");

        // requests
        builder.<BatchSendDiffSmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSendDiffSmsRequestBody.class),
            f -> f.withMarshaller(BatchSendDiffSmsRequest::getBody, BatchSendDiffSmsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSendSmsRequest, BatchSendSmsResponse> batchSendSms = genForBatchSendSms();

    private static HttpRequestDef<BatchSendSmsRequest, BatchSendSmsResponse> genForBatchSendSms() {
        // basic
        HttpRequestDef.Builder<BatchSendSmsRequest, BatchSendSmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSendSmsRequest.class, BatchSendSmsResponse.class)
                .withName("BatchSendSms")
                .withUri("/sms/batchSendSms/v1")
                .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<BatchSendSmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchSendSmsRequestBody.class),
            f -> f.withMarshaller(BatchSendSmsRequest::getBody, BatchSendSmsRequest::setBody));

        // response

        return builder.build();
    }

}

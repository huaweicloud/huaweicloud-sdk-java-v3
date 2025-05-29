package com.huaweicloud.sdk.voicecall.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.voicecall.v3.model.CallBackReq;
import com.huaweicloud.sdk.voicecall.v3.model.CallNotifyReq;
import com.huaweicloud.sdk.voicecall.v3.model.CallVerifyReq;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallBackRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallBackResponse;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallNotifyRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallNotifyResponse;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallVerifyRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallVerifyResponse;
import com.huaweicloud.sdk.voicecall.v3.model.ShowVoiceRecordRequest;
import com.huaweicloud.sdk.voicecall.v3.model.ShowVoiceRecordResponse;
import com.huaweicloud.sdk.voicecall.v3.model.StopCallBackRequest;
import com.huaweicloud.sdk.voicecall.v3.model.StopCallBackResponse;
import com.huaweicloud.sdk.voicecall.v3.model.StopCallReq;

@SuppressWarnings("unchecked")
public class VoiceCallMeta {

    public static final HttpRequestDef<CreateCallBackRequest, CreateCallBackResponse> createCallBack =
        genForCreateCallBack();

    private static HttpRequestDef<CreateCallBackRequest, CreateCallBackResponse> genForCreateCallBack() {
        // basic
        HttpRequestDef.Builder<CreateCallBackRequest, CreateCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCallBackRequest.class, CreateCallBackResponse.class)
                .withName("CreateCallBack")
                .withUri("/rest/httpsessions/click2Call/v2.0")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallBackRequest::getAuthorization, CreateCallBackRequest::setAuthorization));
        builder.<String>withRequestField("X-AKSK",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallBackRequest::getXAksk, CreateCallBackRequest::setXAksk));
        builder.<CallBackReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallBackReq.class),
            f -> f.withMarshaller(CreateCallBackRequest::getBody, CreateCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVoiceRecordRequest, ShowVoiceRecordResponse> showVoiceRecord =
        genForShowVoiceRecord();

    private static HttpRequestDef<ShowVoiceRecordRequest, ShowVoiceRecordResponse> genForShowVoiceRecord() {
        // basic
        HttpRequestDef.Builder<ShowVoiceRecordRequest, ShowVoiceRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVoiceRecordRequest.class, ShowVoiceRecordResponse.class)
                .withName("ShowVoiceRecord")
                .withUri("/rest/provision/voice/record/v1.0")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("fileName",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceRecordRequest::getFileName, ShowVoiceRecordRequest::setFileName));
        builder.<String>withRequestField("recordDomain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceRecordRequest::getRecordDomain, ShowVoiceRecordRequest::setRecordDomain));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceRecordRequest::getAuthorization, ShowVoiceRecordRequest::setAuthorization));
        builder.<String>withRequestField("X-AKSK",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVoiceRecordRequest::getXAksk, ShowVoiceRecordRequest::setXAksk));

        // response

        builder.<String>withResponseField("Location",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowVoiceRecordResponse::getLocation, ShowVoiceRecordResponse::setLocation));
        return builder.build();
    }

    public static final HttpRequestDef<StopCallBackRequest, StopCallBackResponse> stopCallBack = genForStopCallBack();

    private static HttpRequestDef<StopCallBackRequest, StopCallBackResponse> genForStopCallBack() {
        // basic
        HttpRequestDef.Builder<StopCallBackRequest, StopCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopCallBackRequest.class, StopCallBackResponse.class)
                .withName("StopCallBack")
                .withUri("/rest/httpsessions/callStop/v2.0")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopCallBackRequest::getAuthorization, StopCallBackRequest::setAuthorization));
        builder.<String>withRequestField("X-AKSK",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopCallBackRequest::getXAksk, StopCallBackRequest::setXAksk));
        builder.<StopCallReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopCallReq.class),
            f -> f.withMarshaller(StopCallBackRequest::getBody, StopCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCallNotifyRequest, CreateCallNotifyResponse> createCallNotify =
        genForCreateCallNotify();

    private static HttpRequestDef<CreateCallNotifyRequest, CreateCallNotifyResponse> genForCreateCallNotify() {
        // basic
        HttpRequestDef.Builder<CreateCallNotifyRequest, CreateCallNotifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCallNotifyRequest.class, CreateCallNotifyResponse.class)
                .withName("CreateCallNotify")
                .withUri("/rest/httpsessions/callnotify/v2.0")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallNotifyRequest::getAuthorization,
                CreateCallNotifyRequest::setAuthorization));
        builder.<String>withRequestField("X-AKSK",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallNotifyRequest::getXAksk, CreateCallNotifyRequest::setXAksk));
        builder.<CallNotifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallNotifyReq.class),
            f -> f.withMarshaller(CreateCallNotifyRequest::getBody, CreateCallNotifyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCallVerifyRequest, CreateCallVerifyResponse> createCallVerify =
        genForCreateCallVerify();

    private static HttpRequestDef<CreateCallVerifyRequest, CreateCallVerifyResponse> genForCreateCallVerify() {
        // basic
        HttpRequestDef.Builder<CreateCallVerifyRequest, CreateCallVerifyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCallVerifyRequest.class, CreateCallVerifyResponse.class)
                .withName("CreateCallVerify")
                .withUri("/rest/httpsessions/callVerify/v1.0")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallVerifyRequest::getAuthorization,
                CreateCallVerifyRequest::setAuthorization));
        builder.<String>withRequestField("X-AKSK",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCallVerifyRequest::getXAksk, CreateCallVerifyRequest::setXAksk));
        builder.<CallVerifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CallVerifyReq.class),
            f -> f.withMarshaller(CreateCallVerifyRequest::getBody, CreateCallVerifyRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.oa.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.oa.v3.model.ItemCheckStartReq;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemListResponse;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultRequest;
import com.huaweicloud.sdk.oa.v3.model.ShowCheckItemResultResponse;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckRequest;
import com.huaweicloud.sdk.oa.v3.model.StartItemCheckResponse;

@SuppressWarnings("unchecked")
public class OaMeta {

    public static final HttpRequestDef<ShowCheckItemListRequest, ShowCheckItemListResponse> showCheckItemList =
        genForShowCheckItemList();

    private static HttpRequestDef<ShowCheckItemListRequest, ShowCheckItemListResponse> genForShowCheckItemList() {
        // basic
        HttpRequestDef.Builder<ShowCheckItemListRequest, ShowCheckItemListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckItemListRequest.class, ShowCheckItemListResponse.class)
                .withName("ShowCheckItemList")
                .withUri("/v3/optimization-advisor/check-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckItemListRequest::getXLanguage, ShowCheckItemListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCheckItemResultRequest, ShowCheckItemResultResponse> showCheckItemResult =
        genForShowCheckItemResult();

    private static HttpRequestDef<ShowCheckItemResultRequest, ShowCheckItemResultResponse> genForShowCheckItemResult() {
        // basic
        HttpRequestDef.Builder<ShowCheckItemResultRequest, ShowCheckItemResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCheckItemResultRequest.class, ShowCheckItemResultResponse.class)
                .withName("ShowCheckItemResult")
                .withUri("/v3/optimization-advisor/check-item-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("check_item_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckItemResultRequest::getCheckItemId,
                ShowCheckItemResultRequest::setCheckItemId));
        builder.<String>withRequestField("check_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckItemResultRequest::getCheckNum, ShowCheckItemResultRequest::setCheckNum));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCheckItemResultRequest::getPageNo, ShowCheckItemResultRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCheckItemResultRequest::getPageSize, ShowCheckItemResultRequest::setPageSize));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCheckItemResultRequest::getXLanguage, ShowCheckItemResultRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartItemCheckRequest, StartItemCheckResponse> startItemCheck =
        genForStartItemCheck();

    private static HttpRequestDef<StartItemCheckRequest, StartItemCheckResponse> genForStartItemCheck() {
        // basic
        HttpRequestDef.Builder<StartItemCheckRequest, StartItemCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartItemCheckRequest.class, StartItemCheckResponse.class)
                .withName("StartItemCheck")
                .withUri("/v3/optimization-advisor/item-check/start")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ItemCheckStartReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ItemCheckStartReq.class),
            f -> f.withMarshaller(StartItemCheckRequest::getBody, StartItemCheckRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.codeartsinspector.v2;

import com.huaweicloud.sdk.codeartsinspector.v2.model.CreateCbcOrderRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.CreatePurchaseOrderResponse;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdateCbcOrderRequestBody;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderRequest;
import com.huaweicloud.sdk.codeartsinspector.v2.model.UpdatePurchaseOrderResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CodeArtsInspectorMeta {

    public static final HttpRequestDef<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse> createPurchaseOrder =
        genForCreatePurchaseOrder();

    private static HttpRequestDef<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse> genForCreatePurchaseOrder() {
        // basic
        HttpRequestDef.Builder<CreatePurchaseOrderRequest, CreatePurchaseOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePurchaseOrderRequest.class, CreatePurchaseOrderResponse.class)
                .withName("CreatePurchaseOrder")
                .withUri("/v2/{project_id}/{service}/subscription/purchase")
                .withContentType("application/json;charset=utf8");

        // requests
        builder.<String>withRequestField("service",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePurchaseOrderRequest::getService, CreatePurchaseOrderRequest::setService));
        builder.<CreateCbcOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCbcOrderRequestBody.class),
            f -> f.withMarshaller(CreatePurchaseOrderRequest::getBody, CreatePurchaseOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse> updatePurchaseOrder =
        genForUpdatePurchaseOrder();

    private static HttpRequestDef<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse> genForUpdatePurchaseOrder() {
        // basic
        HttpRequestDef.Builder<UpdatePurchaseOrderRequest, UpdatePurchaseOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePurchaseOrderRequest.class, UpdatePurchaseOrderResponse.class)
                .withName("UpdatePurchaseOrder")
                .withUri("/v2/{project_id}/{service}/subscription/alter")
                .withContentType("application/json;charset=utf8");

        // requests
        builder.<String>withRequestField("service",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePurchaseOrderRequest::getService, UpdatePurchaseOrderRequest::setService));
        builder.<UpdateCbcOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCbcOrderRequestBody.class),
            f -> f.withMarshaller(UpdatePurchaseOrderRequest::getBody, UpdatePurchaseOrderRequest::setBody));

        // response

        return builder.build();
    }

}

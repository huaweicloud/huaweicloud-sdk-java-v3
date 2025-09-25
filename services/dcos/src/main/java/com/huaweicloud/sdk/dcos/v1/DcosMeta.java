package com.huaweicloud.sdk.dcos.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dcos.v1.model.AssetListRequestBody;
import com.huaweicloud.sdk.dcos.v1.model.ListOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.ListOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.OrderCatalogue;
import com.huaweicloud.sdk.dcos.v1.model.SaveOrderBody;
import com.huaweicloud.sdk.dcos.v1.model.SaveOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.SaveOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderCatalogueRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderCatalogueResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderInformationRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderInformationResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowPageAssetListResultRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowPageAssetListResultResponse;
import com.huaweicloud.sdk.dcos.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.dcos.v1.model.UploadFileRequestBody;
import com.huaweicloud.sdk.dcos.v1.model.UploadFileResponse;
import com.huaweicloud.sdk.dcos.v1.model.VerifyOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.VerifyOrderRequestBody;
import com.huaweicloud.sdk.dcos.v1.model.VerifyOrderResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class DcosMeta {

    public static final HttpRequestDef<ListOrderRequest, ListOrderResponse> listOrder = genForListOrder();

    private static HttpRequestDef<ListOrderRequest, ListOrderResponse> genForListOrder() {
        // basic
        HttpRequestDef.Builder<ListOrderRequest, ListOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrderRequest.class, ListOrderResponse.class)
                .withName("ListOrder")
                .withUri("/v1/orders/list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getType, ListOrderRequest::setType));
        builder.<String>withRequestField("sub_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getSubType, ListOrderRequest::setSubType));
        builder.<String>withRequestField("stage",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getStage, ListOrderRequest::setStage));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getStatus, ListOrderRequest::setStatus));
        builder.<String>withRequestField("applicant",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getApplicant, ListOrderRequest::setApplicant));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getStartTime, ListOrderRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getEndTime, ListOrderRequest::setEndTime));
        builder.<String>withRequestField("key_word",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getKeyWord, ListOrderRequest::setKeyWord));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderRequest::getLimit, ListOrderRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOrderRequest::getOffset, ListOrderRequest::setOffset));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getSortKey, ListOrderRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrderRequest::getSortDir, ListOrderRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveOrderRequest, SaveOrderResponse> saveOrder = genForSaveOrder();

    private static HttpRequestDef<SaveOrderRequest, SaveOrderResponse> genForSaveOrder() {
        // basic
        HttpRequestDef.Builder<SaveOrderRequest, SaveOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveOrderRequest.class, SaveOrderResponse.class)
                .withName("SaveOrder")
                .withUri("/v1/orders/save")
                .withContentType("application/json");

        // requests
        builder.<SaveOrderBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveOrderBody.class),
            f -> f.withMarshaller(SaveOrderRequest::getBody, SaveOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrderRequest, ShowOrderResponse> showOrder = genForShowOrder();

    private static HttpRequestDef<ShowOrderRequest, ShowOrderResponse> genForShowOrder() {
        // basic
        HttpRequestDef.Builder<ShowOrderRequest, ShowOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrderRequest.class, ShowOrderResponse.class)
                .withName("ShowOrder")
                .withUri("/v1/orders/{number}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("number",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrderRequest::getNumber, ShowOrderRequest::setNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse> showOrderCatalogue =
        genForShowOrderCatalogue();

    private static HttpRequestDef<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse> genForShowOrderCatalogue() {
        // basic
        HttpRequestDef.Builder<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOrderCatalogueRequest.class, ShowOrderCatalogueResponse.class)
                .withName("ShowOrderCatalogue")
                .withUri("/v1/orders/catalogue")
                .withContentType("application/json");

        // requests

        // response
        builder.<List<OrderCatalogue>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowOrderCatalogueResponse::getBody, ShowOrderCatalogueResponse::setBody)
                .withInnerContainerType(OrderCatalogue.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowOrderInformationRequest, ShowOrderInformationResponse> showOrderInformation =
        genForShowOrderInformation();

    private static HttpRequestDef<ShowOrderInformationRequest, ShowOrderInformationResponse> genForShowOrderInformation() {
        // basic
        HttpRequestDef.Builder<ShowOrderInformationRequest, ShowOrderInformationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOrderInformationRequest.class, ShowOrderInformationResponse.class)
            .withName("ShowOrderInformation")
            .withUri("/v1/orders/information/{model_code}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("model_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOrderInformationRequest::getModelCode,
                ShowOrderInformationRequest::setModelCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse> showPageAssetListResult =
        genForShowPageAssetListResult();

    private static HttpRequestDef<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse> genForShowPageAssetListResult() {
        // basic
        HttpRequestDef.Builder<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowPageAssetListResultRequest.class, ShowPageAssetListResultResponse.class)
            .withName("ShowPageAssetListResult")
            .withUri("/v1/assets")
            .withContentType("application/json");

        // requests
        builder.<AssetListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssetListRequestBody.class),
            f -> f.withMarshaller(ShowPageAssetListResultRequest::getBody, ShowPageAssetListResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadFileRequest, UploadFileResponse> uploadFile = genForUploadFile();

    private static HttpRequestDef<UploadFileRequest, UploadFileResponse> genForUploadFile() {
        // basic
        HttpRequestDef.Builder<UploadFileRequest, UploadFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadFileRequest.class, UploadFileResponse.class)
                .withName("UploadFile")
                .withUri("/v1/files/upload-file")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadFileRequestBody.class),
            f -> f.withMarshaller(UploadFileRequest::getBody, UploadFileRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadFileResponse::getXRequestId, UploadFileResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<VerifyOrderRequest, VerifyOrderResponse> verifyOrder = genForVerifyOrder();

    private static HttpRequestDef<VerifyOrderRequest, VerifyOrderResponse> genForVerifyOrder() {
        // basic
        HttpRequestDef.Builder<VerifyOrderRequest, VerifyOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, VerifyOrderRequest.class, VerifyOrderResponse.class)
                .withName("VerifyOrder")
                .withUri("/v1/orders/verify/{number}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("number",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(VerifyOrderRequest::getNumber, VerifyOrderRequest::setNumber));
        builder.<VerifyOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyOrderRequestBody.class),
            f -> f.withMarshaller(VerifyOrderRequest::getBody, VerifyOrderRequest::setBody));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tms.v1.model.*;

@SuppressWarnings("unchecked")
public class TmsMeta {

    public static final HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTags =
        genForcreatePredefineTags();

    private static HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> genForcreatePredefineTags() {
        // basic
        HttpRequestDef.Builder<CreatePredefineTagsRequest, CreatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePredefineTagsRequest.class, CreatePredefineTagsResponse.class)
                .withName("CreatePredefineTags")
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqCreatePredefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqCreatePredefineTag.class),
            f -> f.withMarshaller(CreatePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTags =
        genFordeletePredefineTags();

    private static HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> genFordeletePredefineTags() {
        // basic
        HttpRequestDef.Builder<DeletePredefineTagsRequest, DeletePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeletePredefineTagsRequest.class, DeletePredefineTagsResponse.class)
                .withName("DeletePredefineTags")
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ReqDeletePredefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReqDeletePredefineTag.class),
            f -> f.withMarshaller(DeletePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTags =
        genForlistPredefineTags();

    private static HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> genForlistPredefineTags() {
        // basic
        HttpRequestDef.Builder<ListPredefineTagsRequest, ListPredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefineTagsRequest.class, ListPredefineTagsResponse.class)
                .withName("ListPredefineTags")
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getValue, (req, v) -> {
                req.setValue(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderField, (req, v) -> {
                req.setOrderField(v);
            }));
        builder.<ListPredefineTagsRequest.OrderMethodEnum>withRequestField("order_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPredefineTagsRequest.OrderMethodEnum.class),
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderMethod, (req, v) -> {
                req.setOrderMethod(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTags =
        genForupdatePredefineTags();

    private static HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> genForupdatePredefineTags() {
        // basic
        HttpRequestDef.Builder<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePredefineTagsRequest.class, UpdatePredefineTagsResponse.class)
                .withName("UpdatePredefineTags")
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ModifyPrefineTag>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPrefineTag.class),
            f -> f.withMarshaller(UpdatePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

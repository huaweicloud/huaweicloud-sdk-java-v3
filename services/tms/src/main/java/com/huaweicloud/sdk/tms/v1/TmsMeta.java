package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.tms.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class TmsMeta {

    public static final HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTags = genForcreatePredefineTags();

    private static HttpRequestDef<CreatePredefineTagsRequest, CreatePredefineTagsResponse> genForcreatePredefineTags() {
        // basic
        HttpRequestDef.Builder<CreatePredefineTagsRequest, CreatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePredefineTagsRequest.class, CreatePredefineTagsResponse.class)
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReqCreatePredefineTag.class,
            f -> f.withMarshaller(CreatePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTags = genFordeletePredefineTags();

    private static HttpRequestDef<DeletePredefineTagsRequest, DeletePredefineTagsResponse> genFordeletePredefineTags() {
        // basic
        HttpRequestDef.Builder<DeletePredefineTagsRequest, DeletePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeletePredefineTagsRequest.class, DeletePredefineTagsResponse.class)
                .withUri("/v1.0/predefine_tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ReqDeletePredefineTag.class,
            f -> f.withMarshaller(DeletePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTags = genForlistPredefineTags();

    private static HttpRequestDef<ListPredefineTagsRequest, ListPredefineTagsResponse> genForlistPredefineTags() {
        // basic
        HttpRequestDef.Builder<ListPredefineTagsRequest, ListPredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefineTagsRequest.class, ListPredefineTagsResponse.class)
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getValue, (req, v) -> {
                req.setValue(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderField, (req, v) -> {
                req.setOrderField(v);
            })
        );
        builder.withRequestField("order_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListPredefineTagsRequest.OrderMethodEnum.class,
            f -> f.withMarshaller(ListPredefineTagsRequest::getOrderMethod, (req, v) -> {
                req.setOrderMethod(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTags = genForupdatePredefineTags();

    private static HttpRequestDef<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> genForupdatePredefineTags() {
        // basic
        HttpRequestDef.Builder<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePredefineTagsRequest.class, UpdatePredefineTagsResponse.class)
                .withUri("/v1.0/predefine_tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyPrefineTag.class,
            f -> f.withMarshaller(UpdatePredefineTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

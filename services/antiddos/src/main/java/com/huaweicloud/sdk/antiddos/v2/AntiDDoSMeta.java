package com.huaweicloud.sdk.antiddos.v2;

import com.huaweicloud.sdk.antiddos.v2.model.ListDDosStatusRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ListDDosStatusResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ListNewConfigsRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ListNewConfigsResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ShowAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ShowAlertConfigResponse;
import com.huaweicloud.sdk.antiddos.v2.model.ShowNewTaskStatusRequest;
import com.huaweicloud.sdk.antiddos.v2.model.ShowNewTaskStatusResponse;
import com.huaweicloud.sdk.antiddos.v2.model.UpdateAlertConfigRequest;
import com.huaweicloud.sdk.antiddos.v2.model.UpdateAlertConfigRequestBody;
import com.huaweicloud.sdk.antiddos.v2.model.UpdateAlertConfigResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class AntiDDoSMeta {

    public static final HttpRequestDef<ShowAlertConfigRequest, ShowAlertConfigResponse> showAlertConfig =
        genForShowAlertConfig();

    private static HttpRequestDef<ShowAlertConfigRequest, ShowAlertConfigResponse> genForShowAlertConfig() {
        // basic
        HttpRequestDef.Builder<ShowAlertConfigRequest, ShowAlertConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertConfigRequest.class, ShowAlertConfigResponse.class)
                .withName("ShowAlertConfig")
                .withUri("/v2/{project_id}/warnalert/alertconfig/query")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertConfigRequest, UpdateAlertConfigResponse> updateAlertConfig =
        genForUpdateAlertConfig();

    private static HttpRequestDef<UpdateAlertConfigRequest, UpdateAlertConfigResponse> genForUpdateAlertConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlertConfigRequest, UpdateAlertConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAlertConfigRequest.class, UpdateAlertConfigResponse.class)
                .withName("UpdateAlertConfig")
                .withUri("/v2/{project_id}/warnalert/alertconfig/update")
                .withContentType("application/json");

        // requests
        builder.<UpdateAlertConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAlertConfigRequest::getBody, UpdateAlertConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> listDDosStatus =
        genForListDDosStatus();

    private static HttpRequestDef<ListDDosStatusRequest, ListDDosStatusResponse> genForListDDosStatus() {
        // basic
        HttpRequestDef.Builder<ListDDosStatusRequest, ListDDosStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDDosStatusRequest.class, ListDDosStatusResponse.class)
                .withName("ListDDosStatus")
                .withUri("/v2/{project_id}/antiddos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getStatus, ListDDosStatusRequest::setStatus));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getLimit, ListDDosStatusRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getOffset, ListDDosStatusRequest::setOffset));
        builder.<String>withRequestField("ips",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDDosStatusRequest::getIps, ListDDosStatusRequest::setIps));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNewConfigsRequest, ListNewConfigsResponse> listNewConfigs =
        genForListNewConfigs();

    private static HttpRequestDef<ListNewConfigsRequest, ListNewConfigsResponse> genForListNewConfigs() {
        // basic
        HttpRequestDef.Builder<ListNewConfigsRequest, ListNewConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNewConfigsRequest.class, ListNewConfigsResponse.class)
                .withName("ListNewConfigs")
                .withUri("/v2/{project_id}/antiddos/query-config-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> showNewTaskStatus =
        genForShowNewTaskStatus();

    private static HttpRequestDef<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> genForShowNewTaskStatus() {
        // basic
        HttpRequestDef.Builder<ShowNewTaskStatusRequest, ShowNewTaskStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNewTaskStatusRequest.class, ShowNewTaskStatusResponse.class)
                .withName("ShowNewTaskStatus")
                .withUri("/v2/{project_id}/query-task-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNewTaskStatusRequest::getTaskId, ShowNewTaskStatusRequest::setTaskId));

        // response

        return builder.build();
    }

}

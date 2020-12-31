package com.huaweicloud.sdk.dgc.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dgc.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DgcMeta {

    public static final HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> createConnection = genForcreateConnection();

    private static HttpRequestDef<CreateConnectionRequest, CreateConnectionResponse> genForcreateConnection() {
        // basic
        HttpRequestDef.Builder<CreateConnectionRequest, CreateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConnectionRequest.class, CreateConnectionResponse.class)
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConnectionInfo.class,
            f -> f.withMarshaller(CreateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> deleteConnction = genFordeleteConnction();

    private static HttpRequestDef<DeleteConnctionRequest, DeleteConnctionResponse> genFordeleteConnction() {
        // basic
        HttpRequestDef.Builder<DeleteConnctionRequest, DeleteConnctionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConnctionRequest.class, DeleteConnctionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteConnctionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> exportConnections = genForexportConnections();

    private static HttpRequestDef<ExportConnectionsRequest, ExportConnectionsResponse> genForexportConnections() {
        // basic
        HttpRequestDef.Builder<ExportConnectionsRequest, ExportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportConnectionsRequest.class, ExportConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections/export")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> importConnections = genForimportConnections();

    private static HttpRequestDef<ImportConnectionsRequest, ImportConnectionsResponse> genForimportConnections() {
        // basic
        HttpRequestDef.Builder<ImportConnectionsRequest, ImportConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportConnectionsRequest.class, ImportConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ImportConnectionReq.class,
            f -> f.withMarshaller(ImportConnectionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections = genForlistConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForlistConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withUri("/v1/{project_id}/connections")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> showConnection = genForshowConnection();

    private static HttpRequestDef<ShowConnectionRequest, ShowConnectionResponse> genForshowConnection() {
        // basic
        HttpRequestDef.Builder<ShowConnectionRequest, ShowConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConnectionRequest.class, ShowConnectionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> updateConnection = genForupdateConnection();

    private static HttpRequestDef<UpdateConnectionRequest, UpdateConnectionResponse> genForupdateConnection() {
        // basic
        HttpRequestDef.Builder<UpdateConnectionRequest, UpdateConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConnectionRequest.class, UpdateConnectionResponse.class)
                .withUri("/v1/{project_id}/connections/{connection_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("connection_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateConnectionRequest::getConnectionName, (req, v) -> {
                req.setConnectionName(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ConnectionInfo.class,
            f -> f.withMarshaller(UpdateConnectionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

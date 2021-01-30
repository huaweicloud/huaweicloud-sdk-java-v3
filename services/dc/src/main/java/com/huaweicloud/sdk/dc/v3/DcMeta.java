package com.huaweicloud.sdk.dc.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dc.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class DcMeta {

    public static final HttpRequestDef<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse> batchCreateDirectConnect = genForbatchCreateDirectConnect();

    private static HttpRequestDef<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse> genForbatchCreateDirectConnect() {
        // basic
        HttpRequestDef.Builder<BatchCreateDirectConnectRequest, BatchCreateDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateDirectConnectRequest.class, BatchCreateDirectConnectResponse.class)
                .withName("BatchCreateDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDirectConnectRequestBody.class,
            f -> f.withMarshaller(BatchCreateDirectConnectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse> batchCreateVirtualGateways = genForbatchCreateVirtualGateways();

    private static HttpRequestDef<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse> genForbatchCreateVirtualGateways() {
        // basic
        HttpRequestDef.Builder<BatchCreateVirtualGatewaysRequest, BatchCreateVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateVirtualGatewaysRequest.class, BatchCreateVirtualGatewaysResponse.class)
                .withName("BatchCreateVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVirtualGatewayRequestBody.class,
            f -> f.withMarshaller(BatchCreateVirtualGatewaysRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse> batchCreateVirtualInterface = genForbatchCreateVirtualInterface();

    private static HttpRequestDef<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse> genForbatchCreateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<BatchCreateVirtualInterfaceRequest, BatchCreateVirtualInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateVirtualInterfaceRequest.class, BatchCreateVirtualInterfaceResponse.class)
                .withName("BatchCreateVirtualInterface")
                .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateVirtualInterfaceRequestBody.class,
            f -> f.withMarshaller(BatchCreateVirtualInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse> batchDeleteDirectConnect = genForbatchDeleteDirectConnect();

    private static HttpRequestDef<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse> genForbatchDeleteDirectConnect() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDirectConnectRequest, BatchDeleteDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteDirectConnectRequest.class, BatchDeleteDirectConnectResponse.class)
                .withName("BatchDeleteDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteDirectConnectRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteDirectConnectResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse> batchDeleteVirtualGateways = genForbatchDeleteVirtualGateways();

    private static HttpRequestDef<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse> genForbatchDeleteVirtualGateways() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVirtualGatewaysRequest, BatchDeleteVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteVirtualGatewaysRequest.class, BatchDeleteVirtualGatewaysResponse.class)
                .withName("BatchDeleteVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteVirtualGatewaysRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteVirtualGatewaysResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse> batchDeleteVirtualInterface = genForbatchDeleteVirtualInterface();

    private static HttpRequestDef<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse> genForbatchDeleteVirtualInterface() {
        // basic
        HttpRequestDef.Builder<BatchDeleteVirtualInterfaceRequest, BatchDeleteVirtualInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteVirtualInterfaceRequest.class, BatchDeleteVirtualInterfaceResponse.class)
                .withName("BatchDeleteVirtualInterface")
                .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteVirtualInterfaceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchDeleteVirtualInterfaceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse> batchUpdateDirectConnect = genForbatchUpdateDirectConnect();

    private static HttpRequestDef<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse> genForbatchUpdateDirectConnect() {
        // basic
        HttpRequestDef.Builder<BatchUpdateDirectConnectRequest, BatchUpdateDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateDirectConnectRequest.class, BatchUpdateDirectConnectResponse.class)
                .withName("BatchUpdateDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUpdateDirectConnectRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDirectConnectRequestBody.class,
            f -> f.withMarshaller(BatchUpdateDirectConnectRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse> batchUpdateVirtualGateways = genForbatchUpdateVirtualGateways();

    private static HttpRequestDef<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse> genForbatchUpdateVirtualGateways() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVirtualGatewaysRequest, BatchUpdateVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateVirtualGatewaysRequest.class, BatchUpdateVirtualGatewaysResponse.class)
                .withName("BatchUpdateVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUpdateVirtualGatewaysRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateVirtualGatewayRequestBody.class,
            f -> f.withMarshaller(BatchUpdateVirtualGatewaysRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse> batchUpdateVirtualInterface = genForbatchUpdateVirtualInterface();

    private static HttpRequestDef<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse> genForbatchUpdateVirtualInterface() {
        // basic
        HttpRequestDef.Builder<BatchUpdateVirtualInterfaceRequest, BatchUpdateVirtualInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateVirtualInterfaceRequest.class, BatchUpdateVirtualInterfaceResponse.class)
                .withName("BatchUpdateVirtualInterface")
                .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchUpdateVirtualInterfaceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateVirtualInterfaceRequestBody.class,
            f -> f.withMarshaller(BatchUpdateVirtualInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDirectConnectRequest, ListDirectConnectResponse> listDirectConnect = genForlistDirectConnect();

    private static HttpRequestDef<ListDirectConnectRequest, ListDirectConnectResponse> genForlistDirectConnect() {
        // basic
        HttpRequestDef.Builder<ListDirectConnectRequest, ListDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDirectConnectRequest.class, ListDirectConnectResponse.class)
                .withName("ListDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> listVirtualGateways = genForlistVirtualGateways();

    private static HttpRequestDef<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> genForlistVirtualGateways() {
        // basic
        HttpRequestDef.Builder<ListVirtualGatewaysRequest, ListVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVirtualGatewaysRequest.class, ListVirtualGatewaysResponse.class)
                .withName("ListVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse> listVirtualInterface = genForlistVirtualInterface();

    private static HttpRequestDef<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse> genForlistVirtualInterface() {
        // basic
        HttpRequestDef.Builder<ListVirtualInterfaceRequest, ListVirtualInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVirtualInterfaceRequest.class, ListVirtualInterfaceResponse.class)
                .withName("ListVirtualInterface")
                .withUri("/v3/{project_id}/dcaas/virtual-interfaces")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> showDirectConnect = genForshowDirectConnect();

    private static HttpRequestDef<ShowDirectConnectRequest, ShowDirectConnectResponse> genForshowDirectConnect() {
        // basic
        HttpRequestDef.Builder<ShowDirectConnectRequest, ShowDirectConnectResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDirectConnectRequest.class, ShowDirectConnectResponse.class)
                .withName("ShowDirectConnect")
                .withUri("/v3/{project_id}/dcaas/direct-connects/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDirectConnectRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse> showVirtualGateways = genForshowVirtualGateways();

    private static HttpRequestDef<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse> genForshowVirtualGateways() {
        // basic
        HttpRequestDef.Builder<ShowVirtualGatewaysRequest, ShowVirtualGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVirtualGatewaysRequest.class, ShowVirtualGatewaysResponse.class)
                .withName("ShowVirtualGateways")
                .withUri("/v3/{project_id}/dcaas/virtual-gateways/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVirtualGatewaysRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> showVirtualInterface = genForshowVirtualInterface();

    private static HttpRequestDef<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> genForshowVirtualInterface() {
        // basic
        HttpRequestDef.Builder<ShowVirtualInterfaceRequest, ShowVirtualInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVirtualInterfaceRequest.class, ShowVirtualInterfaceResponse.class)
                .withName("ShowVirtualInterface")
                .withUri("/v3/{project_id}/dcaas/virtual-interfaces/{id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVirtualInterfaceRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );

        // response

        return builder.build();
    }

}

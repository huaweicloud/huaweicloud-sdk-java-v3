package com.huaweicloud.sdk.iotedge.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotedge.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class IoTEdgeMeta {

    public static final HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNode = genForcreateEdgeNode();

    private static HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> genForcreateEdgeNode() {
        // basic
        HttpRequestDef.Builder<CreateEdgeNodeRequest, CreateEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeNodeRequest.class, CreateEdgeNodeResponse.class)
                .withName("CreateEdgeNode")
                .withUri("/v2/{project_id}/edge-nodes")
                .withContentType("application/json");

        // requests
        builder.<EdgeNodeCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgeNodeCreation.class),
            f -> f.withMarshaller(CreateEdgeNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmd = genForcreateInstallCmd();

    private static HttpRequestDef<CreateInstallCmdRequest, CreateInstallCmdResponse> genForcreateInstallCmd() {
        // basic
        HttpRequestDef.Builder<CreateInstallCmdRequest, CreateInstallCmdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstallCmdRequest.class, CreateInstallCmdResponse.class)
                .withName("CreateInstallCmd")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/install")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstallCmdRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstallCmdRequest::getArch, (req, v) -> {
                req.setArch(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNode = genFordeleteEdgeNode();

    private static HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> genFordeleteEdgeNode() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeNodeRequest.class, DeleteEdgeNodeResponse.class)
                .withName("DeleteEdgeNode")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<Boolean>withRequestField("delete_external_node",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getDeleteExternalNode, (req, v) -> {
                req.setDeleteExternalNode(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeNodeResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodes = genForlistEdgeNodes();

    private static HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> genForlistEdgeNodes() {
        // basic
        HttpRequestDef.Builder<ListEdgeNodesRequest, ListEdgeNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeNodesRequest.class, ListEdgeNodesResponse.class)
                .withName("ListEdgeNodes")
                .withUri("/v2/{project_id}/edge-nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getState, (req, v) -> {
                req.setState(v);
            })
        );
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.<String>withRequestField("space_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getSpaceId, (req, v) -> {
                req.setSpaceId(v);
            })
        );
        builder.<List<String>>withRequestField("node_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getNodeIds, (req, v) -> {
                req.setNodeIds(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeNodeRequest, ShowEdgeNodeResponse> showEdgeNode = genForshowEdgeNode();

    private static HttpRequestDef<ShowEdgeNodeRequest, ShowEdgeNodeResponse> genForshowEdgeNode() {
        // basic
        HttpRequestDef.Builder<ShowEdgeNodeRequest, ShowEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeNodeRequest.class, ShowEdgeNodeResponse.class)
                .withName("ShowEdgeNode")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeNodeRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForaddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForaddDevice() {
        // basic
        HttpRequestDef.Builder<AddDeviceRequest, AddDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddDeviceRequest.class, AddDeviceResponse.class)
                .withName("AddDevice")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeviceRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<AddDeviceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeviceRequestBody.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse> batchUpdateConfigs = genForbatchUpdateConfigs();

    private static HttpRequestDef<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse> genForbatchUpdateConfigs() {
        // basic
        HttpRequestDef.Builder<BatchUpdateConfigsRequest, BatchUpdateConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchUpdateConfigsRequest.class, BatchUpdateConfigsResponse.class)
                .withName("BatchUpdateConfigs")
                .withUri("/v2/{project_id}/devices/batch-configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchUpdateConfigs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateConfigs.class),
            f -> f.withMarshaller(BatchUpdateConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCode = genForcreateAccessCode();

    private static HttpRequestDef<CreateAccessCodeRequest, CreateAccessCodeResponse> genForcreateAccessCode() {
        // basic
        HttpRequestDef.Builder<CreateAccessCodeRequest, CreateAccessCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessCodeRequest.class, CreateAccessCodeResponse.class)
                .withName("CreateAccessCode")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/{device_id}/access-code")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessCodeRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genFordeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genFordeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withName("DeleteDevice")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            })
        );
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowProductConfigRequest, ShowProductConfigResponse> showProductConfig = genForshowProductConfig();

    private static HttpRequestDef<ShowProductConfigRequest, ShowProductConfigResponse> genForshowProductConfig() {
        // basic
        HttpRequestDef.Builder<ShowProductConfigRequest, ShowProductConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductConfigRequest.class, ShowProductConfigResponse.class)
                .withName("ShowProductConfig")
                .withUri("/v2/{project_id}/protocol-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("protocol_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductConfigRequest::getProtocolType, (req, v) -> {
                req.setProtocolType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse> showProtocolMappings = genForshowProtocolMappings();

    private static HttpRequestDef<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse> genForshowProtocolMappings() {
        // basic
        HttpRequestDef.Builder<ShowProtocolMappingsRequest, ShowProtocolMappingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProtocolMappingsRequest.class, ShowProtocolMappingsResponse.class)
                .withName("ShowProtocolMappings")
                .withUri("/v2/{project_id}/products/{product_id}/protocol-mappings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProtocolMappingsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowProtocolMappingsResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/{device_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.<UpdateDesireds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesireds.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse> uploadProtocolMappings = genForuploadProtocolMappings();

    private static HttpRequestDef<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse> genForuploadProtocolMappings() {
        // basic
        HttpRequestDef.Builder<UploadProtocolMappingsRequest, UploadProtocolMappingsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadProtocolMappingsRequest.class, UploadProtocolMappingsResponse.class)
                .withName("UploadProtocolMappings")
                .withUri("/v2/{project_id}/products/{product_id}/protocol-mappings")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadProtocolMappingsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.<UploadProtocolMappingsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadProtocolMappingsRequestBody.class),
            f -> f.withMarshaller(UploadProtocolMappingsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UploadProtocolMappingsResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> batchListEdgeApps = genForbatchListEdgeApps();

    private static HttpRequestDef<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> genForbatchListEdgeApps() {
        // basic
        HttpRequestDef.Builder<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListEdgeAppsRequest.class, BatchListEdgeAppsResponse.class)
                .withName("BatchListEdgeApps")
                .withUri("/v2/{project_id}/edge-apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<BatchListEdgeAppsRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppsRequest.AppTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            })
        );
        builder.<BatchListEdgeAppsRequest.FunctionTypeEnum>withRequestField("function_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppsRequest.FunctionTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getFunctionType, (req, v) -> {
                req.setFunctionType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeApp = genForcreateEdgeApp();

    private static HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> genForcreateEdgeApp() {
        // basic
        HttpRequestDef.Builder<CreateEdgeAppRequest, CreateEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeAppRequest.class, CreateEdgeAppResponse.class)
                .withName("CreateEdgeApp")
                .withUri("/v2/{project_id}/edge-apps")
                .withContentType("application/json");

        // requests
        builder.<CreateEdgeApplicationRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationRequestDTO.class),
            f -> f.withMarshaller(CreateEdgeAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeApp = genFordeleteEdgeApp();

    private static HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> genFordeleteEdgeApp() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeAppRequest, DeleteEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeAppRequest.class, DeleteEdgeAppResponse.class)
                .withName("DeleteEdgeApp")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeAppRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeAppResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeAppRequest, ShowEdgeAppResponse> showEdgeApp = genForshowEdgeApp();

    private static HttpRequestDef<ShowEdgeAppRequest, ShowEdgeAppResponse> genForshowEdgeApp() {
        // basic
        HttpRequestDef.Builder<ShowEdgeAppRequest, ShowEdgeAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeAppRequest.class, ShowEdgeAppResponse.class)
                .withName("ShowEdgeApp")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeAppRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> batchListEdgeAppVersions = genForbatchListEdgeAppVersions();

    private static HttpRequestDef<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> genForbatchListEdgeAppVersions() {
        // basic
        HttpRequestDef.Builder<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListEdgeAppVersionsRequest.class, BatchListEdgeAppVersionsResponse.class)
                .withName("BatchListEdgeAppVersions")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<BatchListEdgeAppVersionsRequest.AiCardTypeEnum>withRequestField("ai_card_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.AiCardTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getAiCardType, (req, v) -> {
                req.setAiCardType(v);
            })
        );
        builder.<BatchListEdgeAppVersionsRequest.ArchEnum>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.ArchEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getArch, (req, v) -> {
                req.setArch(v);
            })
        );
        builder.<BatchListEdgeAppVersionsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.StateEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getState, (req, v) -> {
                req.setState(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersion = genForcreateEdgeApplicationVersion();

    private static HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> genForcreateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeApplicationVersionRequest.class, CreateEdgeApplicationVersionResponse.class)
                .withName("CreateEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<CreateEdgeApplicationVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationVersionDTO.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersion = genFordeleteEdgeApplicationVersion();

    private static HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> genFordeleteEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeApplicationVersionRequest.class, DeleteEdgeApplicationVersionResponse.class)
                .withName("DeleteEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeApplicationVersionResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersion = genForshowEdgeApplicationVersion();

    private static HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> genForshowEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeApplicationVersionRequest.class, ShowEdgeApplicationVersionResponse.class)
                .withName("ShowEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersion = genForupdateEdgeApplicationVersion();

    private static HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> genForupdateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeApplicationVersionRequest.class, UpdateEdgeApplicationVersionResponse.class)
                .withName("UpdateEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<UpdateEdgeAppVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionState = genForupdateEdgeApplicationVersionState();

    private static HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> genForupdateEdgeApplicationVersionState() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeApplicationVersionStateRequest.class, UpdateEdgeApplicationVersionStateResponse.class)
                .withName("UpdateEdgeApplicationVersionState")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getEdgeAppId, (req, v) -> {
                req.setEdgeAppId(v);
            })
        );
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.<UpdateEdgeAppVersionStateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionStateDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateExternalEntityRequest, CreateExternalEntityResponse> createExternalEntity = genForcreateExternalEntity();

    private static HttpRequestDef<CreateExternalEntityRequest, CreateExternalEntityResponse> genForcreateExternalEntity() {
        // basic
        HttpRequestDef.Builder<CreateExternalEntityRequest, CreateExternalEntityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateExternalEntityRequest.class, CreateExternalEntityResponse.class)
                .withName("CreateExternalEntity")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExternalEntityRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<CreateExternalEntityReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalEntityReqDTO.class),
            f -> f.withMarshaller(CreateExternalEntityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteExternalEntityRequest, DeleteExternalEntityResponse> deleteExternalEntity = genFordeleteExternalEntity();

    private static HttpRequestDef<DeleteExternalEntityRequest, DeleteExternalEntityResponse> genFordeleteExternalEntity() {
        // basic
        HttpRequestDef.Builder<DeleteExternalEntityRequest, DeleteExternalEntityResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteExternalEntityRequest.class, DeleteExternalEntityResponse.class)
                .withName("DeleteExternalEntity")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals/{external_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalEntityRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("external_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalEntityRequest::getExternalId, (req, v) -> {
                req.setExternalId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteExternalEntityResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalEntityRequest, ListExternalEntityResponse> listExternalEntity = genForlistExternalEntity();

    private static HttpRequestDef<ListExternalEntityRequest, ListExternalEntityResponse> genForlistExternalEntity() {
        // basic
        HttpRequestDef.Builder<ListExternalEntityRequest, ListExternalEntityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListExternalEntityRequest.class, ListExternalEntityResponse.class)
                .withName("ListExternalEntity")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalEntityRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalEntityRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalEntityRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowExternalEntityRequest, ShowExternalEntityResponse> showExternalEntity = genForshowExternalEntity();

    private static HttpRequestDef<ShowExternalEntityRequest, ShowExternalEntityResponse> genForshowExternalEntity() {
        // basic
        HttpRequestDef.Builder<ShowExternalEntityRequest, ShowExternalEntityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowExternalEntityRequest.class, ShowExternalEntityResponse.class)
                .withName("ShowExternalEntity")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals/{external_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExternalEntityRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("external_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExternalEntityRequest::getExternalId, (req, v) -> {
                req.setExternalId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateExternalEntityRequest, UpdateExternalEntityResponse> updateExternalEntity = genForupdateExternalEntity();

    private static HttpRequestDef<UpdateExternalEntityRequest, UpdateExternalEntityResponse> genForupdateExternalEntity() {
        // basic
        HttpRequestDef.Builder<UpdateExternalEntityRequest, UpdateExternalEntityResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateExternalEntityRequest.class, UpdateExternalEntityResponse.class)
                .withName("UpdateExternalEntity")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals/{external_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("external_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getExternalId, (req, v) -> {
                req.setExternalId(v);
            })
        );
        builder.<UpdateExternalEntityReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateExternalEntityReqDTO.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchListModulesRequest, BatchListModulesResponse> batchListModules = genForbatchListModules();

    private static HttpRequestDef<BatchListModulesRequest, BatchListModulesResponse> genForbatchListModules() {
        // basic
        HttpRequestDef.Builder<BatchListModulesRequest, BatchListModulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListModulesRequest.class, BatchListModulesResponse.class)
                .withName("BatchListModules")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListModulesRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListModulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListModulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.<BatchListModulesRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListModulesRequest.AppTypeEnum.class),
            f -> f.withMarshaller(BatchListModulesRequest::getAppType, (req, v) -> {
                req.setAppType(v);
            })
        );
        builder.<BatchListModulesRequest.FunctionTypeEnum>withRequestField("function_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListModulesRequest.FunctionTypeEnum.class),
            f -> f.withMarshaller(BatchListModulesRequest::getFunctionType, (req, v) -> {
                req.setFunctionType(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateModuleRequest, CreateModuleResponse> createModule = genForcreateModule();

    private static HttpRequestDef<CreateModuleRequest, CreateModuleResponse> genForcreateModule() {
        // basic
        HttpRequestDef.Builder<CreateModuleRequest, CreateModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateModuleRequest.class, CreateModuleResponse.class)
                .withName("CreateModule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateModuleRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<CreateEdgeModuleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeModuleReqDTO.class),
            f -> f.withMarshaller(CreateModuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> deleteModule = genFordeleteModule();

    private static HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> genFordeleteModule() {
        // basic
        HttpRequestDef.Builder<DeleteModuleRequest, DeleteModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteModuleRequest.class, DeleteModuleResponse.class)
                .withName("DeleteModule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModuleRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModuleRequest::getModuleId, (req, v) -> {
                req.setModuleId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteModuleResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ShowModuleRequest, ShowModuleResponse> showModule = genForshowModule();

    private static HttpRequestDef<ShowModuleRequest, ShowModuleResponse> genForshowModule() {
        // basic
        HttpRequestDef.Builder<ShowModuleRequest, ShowModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowModuleRequest.class, ShowModuleResponse.class)
                .withName("ShowModule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleRequest::getModuleId, (req, v) -> {
                req.setModuleId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> updateModule = genForupdateModule();

    private static HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> genForupdateModule() {
        // basic
        HttpRequestDef.Builder<UpdateModuleRequest, UpdateModuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModuleRequest.class, UpdateModuleResponse.class)
                .withName("UpdateModule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleRequest::getModuleId, (req, v) -> {
                req.setModuleId(v);
            })
        );
        builder.<UpdateEdgeModuleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeModuleReqDTO.class),
            f -> f.withMarshaller(UpdateModuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRoutesRequest, ListRoutesResponse> listRoutes = genForlistRoutes();

    private static HttpRequestDef<ListRoutesRequest, ListRoutesResponse> genForlistRoutes() {
        // basic
        HttpRequestDef.Builder<ListRoutesRequest, ListRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRoutesRequest.class, ListRoutesResponse.class)
                .withName("ListRoutes")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRoutesRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<Boolean>withRequestField("parsed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRoutesRequest::getParsed, (req, v) -> {
                req.setParsed(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutes = genForupdateRoutes();

    private static HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> genForupdateRoutes() {
        // basic
        HttpRequestDef.Builder<UpdateRoutesRequest, UpdateRoutesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRoutesRequest.class, UpdateRoutesResponse.class)
                .withName("UpdateRoutes")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/routes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getEdgeNodeId, (req, v) -> {
                req.setEdgeNodeId(v);
            })
        );
        builder.<List<CreateRouterReqDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(CreateRouterReqDTO.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> batchConfirmConfigsNew = genForbatchConfirmConfigsNew();

    private static HttpRequestDef<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> genForbatchConfirmConfigsNew() {
        // basic
        HttpRequestDef.Builder<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchConfirmConfigsNewRequest.class, BatchConfirmConfigsNewResponse.class)
                .withName("BatchConfirmConfigsNew")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/batch-confirm")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<ConfirmIaConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmIaConfigsRequestBody.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchImportConfigsRequest, BatchImportConfigsResponse> batchImportConfigs = genForbatchImportConfigs();

    private static HttpRequestDef<BatchImportConfigsRequest, BatchImportConfigsResponse> genForbatchImportConfigs() {
        // basic
        HttpRequestDef.Builder<BatchImportConfigsRequest, BatchImportConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchImportConfigsRequest.class, BatchImportConfigsResponse.class)
                .withName("BatchImportConfigs")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/batch-import")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportConfigsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportConfigsRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<BatchImportConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportConfigsRequestBody.class),
            f -> f.withMarshaller(BatchImportConfigsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteIaConfigRequest, DeleteIaConfigResponse> deleteIaConfig = genFordeleteIaConfig();

    private static HttpRequestDef<DeleteIaConfigRequest, DeleteIaConfigResponse> genFordeleteIaConfig() {
        // basic
        HttpRequestDef.Builder<DeleteIaConfigRequest, DeleteIaConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIaConfigRequest.class, DeleteIaConfigResponse.class)
                .withName("DeleteIaConfig")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIaConfigRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIaConfigRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIaConfigRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIaConfigResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ListIaConfigsRequest, ListIaConfigsResponse> listIaConfigs = genForlistIaConfigs();

    private static HttpRequestDef<ListIaConfigsRequest, ListIaConfigsResponse> genForlistIaConfigs() {
        // basic
        HttpRequestDef.Builder<ListIaConfigsRequest, ListIaConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIaConfigsRequest.class, ListIaConfigsResponse.class)
                .withName("ListIaConfigs")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowIaConfigRequest, ShowIaConfigResponse> showIaConfig = genForshowIaConfig();

    private static HttpRequestDef<ShowIaConfigRequest, ShowIaConfigResponse> genForshowIaConfig() {
        // basic
        HttpRequestDef.Builder<ShowIaConfigRequest, ShowIaConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIaConfigRequest.class, ShowIaConfigResponse.class)
                .withName("ShowIaConfig")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIaConfigRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIaConfigRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIaConfigRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateIaConfigRequest, UpdateIaConfigResponse> updateIaConfig = genForupdateIaConfig();

    private static HttpRequestDef<UpdateIaConfigRequest, UpdateIaConfigResponse> genForupdateIaConfig() {
        // basic
        HttpRequestDef.Builder<UpdateIaConfigRequest, UpdateIaConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIaConfigRequest.class, UpdateIaConfigResponse.class)
                .withName("UpdateIaConfig")
                .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getIaId, (req, v) -> {
                req.setIaId(v);
            })
        );
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            })
        );
        builder.<UpdateIaConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIaConfigRequestDTO.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> batchAssociateNaToNodes = genForbatchAssociateNaToNodes();

    private static HttpRequestDef<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> genForbatchAssociateNaToNodes() {
        // basic
        HttpRequestDef.Builder<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAssociateNaToNodesRequest.class, BatchAssociateNaToNodesResponse.class)
                .withName("BatchAssociateNaToNodes")
                .withUri("/v2/{project_id}/nas/{na_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getNaId, (req, v) -> {
                req.setNaId(v);
            })
        );
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.<AuthorizeNa2NodesRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeNa2NodesRequestDTO.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteNaRequest, DeleteNaResponse> deleteNa = genFordeleteNa();

    private static HttpRequestDef<DeleteNaRequest, DeleteNaResponse> genFordeleteNa() {
        // basic
        HttpRequestDef.Builder<DeleteNaRequest, DeleteNaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNaRequest.class, DeleteNaResponse.class)
                .withName("DeleteNa")
                .withUri("/v2/{project_id}/nas/{na_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNaRequest::getNaId, (req, v) -> {
                req.setNaId(v);
            })
        );

        // response
        
        builder.<String>withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNaResponse::getBody, (response, data)->{
                response.setBody(data);
            })
        );
        

        return builder.build();
    }

    public static final HttpRequestDef<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> listNaAuthorizedNodes = genForlistNaAuthorizedNodes();

    private static HttpRequestDef<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> genForlistNaAuthorizedNodes() {
        // basic
        HttpRequestDef.Builder<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNaAuthorizedNodesRequest.class, ListNaAuthorizedNodesResponse.class)
                .withName("ListNaAuthorizedNodes")
                .withUri("/v2/{project_id}/nas/{na_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getNaId, (req, v) -> {
                req.setNaId(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListNasRequest, ListNasResponse> listNas = genForlistNas();

    private static HttpRequestDef<ListNasRequest, ListNasResponse> genForlistNas() {
        // basic
        HttpRequestDef.Builder<ListNasRequest, ListNasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNasRequest.class, ListNasResponse.class)
                .withName("ListNas")
                .withUri("/v2/{project_id}/nas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNasRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowNaRequest, ShowNaResponse> showNa = genForshowNa();

    private static HttpRequestDef<ShowNaRequest, ShowNaResponse> genForshowNa() {
        // basic
        HttpRequestDef.Builder<ShowNaRequest, ShowNaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNaRequest.class, ShowNaResponse.class)
                .withName("ShowNa")
                .withUri("/v2/{project_id}/nas/{na_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNaRequest::getNaId, (req, v) -> {
                req.setNaId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateNaRequest, UpdateNaResponse> updateNa = genForupdateNa();

    private static HttpRequestDef<UpdateNaRequest, UpdateNaResponse> genForupdateNa() {
        // basic
        HttpRequestDef.Builder<UpdateNaRequest, UpdateNaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNaRequest.class, UpdateNaResponse.class)
                .withName("UpdateNa")
                .withUri("/v2/{project_id}/nas/{na_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNaRequest::getNaId, (req, v) -> {
                req.setNaId(v);
            })
        );
        builder.<UpdateNaRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNaRequestDTO.class),
            f -> f.withMarshaller(UpdateNaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

}

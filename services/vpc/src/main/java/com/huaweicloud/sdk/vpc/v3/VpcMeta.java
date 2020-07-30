package com.huaweicloud.sdk.vpc.v3;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.vpc.v3.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class VpcMeta {

    public static final HttpRequestDef<BatchCreateSubNetworkInterfaceV3Request, BatchCreateSubNetworkInterfaceV3Response> batchCreateSubNetworkInterfaceV3 = genForbatchCreateSubNetworkInterfaceV3();

    private static HttpRequestDef<BatchCreateSubNetworkInterfaceV3Request, BatchCreateSubNetworkInterfaceV3Response> genForbatchCreateSubNetworkInterfaceV3() {
        // basic
        HttpRequestDef.Builder<BatchCreateSubNetworkInterfaceV3Request, BatchCreateSubNetworkInterfaceV3Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateSubNetworkInterfaceV3Request.class, BatchCreateSubNetworkInterfaceV3Response.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/batch-create")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateSubNetworkInterfaceV3RequestBody.class,
            f -> f.withMarshaller(BatchCreateSubNetworkInterfaceV3Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> createSubNetworkInterface = genForcreateSubNetworkInterface();

    private static HttpRequestDef<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> genForcreateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<CreateSubNetworkInterfaceRequest, CreateSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSubNetworkInterfaceRequest.class, CreateSubNetworkInterfaceResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSubNetworkInterfaceRequestBody.class,
            f -> f.withMarshaller(CreateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> deleteSubNetworkInterface = genFordeleteSubNetworkInterface();

    private static HttpRequestDef<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> genFordeleteSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<DeleteSubNetworkInterfaceRequest, DeleteSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSubNetworkInterfaceRequest.class, DeleteSubNetworkInterfaceResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> listSubNetworkInterfaces = genForlistSubNetworkInterfaces();

    private static HttpRequestDef<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> genForlistSubNetworkInterfaces() {
        // basic
        HttpRequestDef.Builder<ListSubNetworkInterfacesRequest, ListSubNetworkInterfacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubNetworkInterfacesRequest.class, ListSubNetworkInterfacesResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            })
        );
        builder.withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            })
        );
        builder.withRequestField("mac_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getMacAddress, (req, v) -> {
                req.setMacAddress(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSubNetworkInterfacesRequest::getParentId, (req, v) -> {
                req.setParentId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> showSubNetworkInterface = genForshowSubNetworkInterface();

    private static HttpRequestDef<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> genForshowSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfaceRequest, ShowSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubNetworkInterfaceRequest.class, ShowSubNetworkInterfaceResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> showSubNetworkInterfacesQuantity = genForshowSubNetworkInterfacesQuantity();

    private static HttpRequestDef<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> genForshowSubNetworkInterfacesQuantity() {
        // basic
        HttpRequestDef.Builder<ShowSubNetworkInterfacesQuantityRequest, ShowSubNetworkInterfacesQuantityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSubNetworkInterfacesQuantityRequest.class, ShowSubNetworkInterfacesQuantityResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/count");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> updateSubNetworkInterface = genForupdateSubNetworkInterface();

    private static HttpRequestDef<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> genForupdateSubNetworkInterface() {
        // basic
        HttpRequestDef.Builder<UpdateSubNetworkInterfaceRequest, UpdateSubNetworkInterfaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSubNetworkInterfaceRequest.class, UpdateSubNetworkInterfaceResponse.class)
                .withUri("/v3/{project_id}/vpc/sub-network-interfaces/{sub_network_interface_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("sub_network_interface_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getSubNetworkInterfaceId, (req, v) -> {
                req.setSubNetworkInterfaceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateSubNetworkInterfaceRequestBody.class,
            f -> f.withMarshaller(UpdateSubNetworkInterfaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

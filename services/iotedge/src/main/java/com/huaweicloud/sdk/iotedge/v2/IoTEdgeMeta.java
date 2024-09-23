package com.huaweicloud.sdk.iotedge.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iotedge.v2.model.AddAppConfigsTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddAppConfigsTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddDeviceRequestBody;
import com.huaweicloud.sdk.iotedge.v2.model.AddDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddGeneralOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AddOtTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.AddOtTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.AuthorizeNa2NodesRequestDTO;
import com.huaweicloud.sdk.iotedge.v2.model.BatchAssociateNaToNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchAssociateNaToNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchConfirmConfigsNewRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchConfirmConfigsNewResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsRequestBody;
import com.huaweicloud.sdk.iotedge.v2.model.BatchImportConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListAppConfigsTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListAppConfigsTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDevicesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDevicesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListDcPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppVersionsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppVersionsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListEdgeAppsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListModulesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListModulesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListOtTemplatesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.BatchListOtTemplatesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ConfirmIaConfigsRequestBody;
import com.huaweicloud.sdk.iotedge.v2.model.CreateAppConfigsTemplatesReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcDsReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcPointReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationRequestDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeModuleReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateInstallCmdRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateInstallCmdRequestDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateInstallCmdResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.CreateOtTemplatesReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateRouterReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateScheduleReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.CreateScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.CreateScheduleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointsReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDcPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.DeleteScheduleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.DeviceControlDefaultValuesReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.DeviceControlReleaseReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.DeviceControlSetReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.EdgeNodeCreation;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsReleaseRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsReleaseResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsSetRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ExecuteDeviceControlsSetResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsRequestBody;
import com.huaweicloud.sdk.iotedge.v2.model.ImportPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.InvokeModuleMsgRequest;
import com.huaweicloud.sdk.iotedge.v2.model.InvokeModuleMsgResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListDevicesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListDevicesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListEdgeNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListEdgeNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListIaConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListIaConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListNaAuthorizedNodesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListNaAuthorizedNodesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListNasRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListNasResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ListRoutesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ListRoutesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.SetDeviceControlDefaultValuesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.SetDeviceControlDefaultValuesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowAppConfigsTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowAppConfigsTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeAppRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeAppResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeHostsInfoRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeHostsInfoResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleShadowRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowModuleShadowResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowOtTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowOtTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointTemplateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointTemplateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowPointsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.ShowProductConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.ShowProductConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.SynchronizeDcConfigsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.SynchronizeDcConfigsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcDsResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDcPointResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDesireds;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeAppVersionDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeAppVersionStateDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionStateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeApplicationVersionStateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeModuleReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeModuleStateReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeNodeRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateEdgeNodeResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateExternalEntityReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateExternalEntityRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateExternalEntityResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateIaConfigRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateIaConfigRequestDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateIaConfigResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleShadowRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleShadowResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleShadowsRequestBody;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleStateRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateModuleStateResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaRequestDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNodeReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateRoutesRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateRoutesResponse;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateScheduleReqDTO;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateScheduleRequest;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateScheduleResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class IoTEdgeMeta {

    public static final HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNode =
        genForCreateEdgeNode();

    private static HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> genForCreateEdgeNode() {
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
            f -> f.withMarshaller(CreateEdgeNodeRequest::getBody, CreateEdgeNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstallCmdRequest, CreateInstallCmdResponse> createInstallCmd =
        genForCreateInstallCmd();

    private static HttpRequestDef<CreateInstallCmdRequest, CreateInstallCmdResponse> genForCreateInstallCmd() {
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
            f -> f.withMarshaller(CreateInstallCmdRequest::getEdgeNodeId, CreateInstallCmdRequest::setEdgeNodeId));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstallCmdRequest::getArch, CreateInstallCmdRequest::setArch));
        builder.<CreateInstallCmdRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateInstallCmdRequestDTO.class),
            f -> f.withMarshaller(CreateInstallCmdRequest::getBody, CreateInstallCmdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNode =
        genForDeleteEdgeNode();

    private static HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> genForDeleteEdgeNode() {
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
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getEdgeNodeId, DeleteEdgeNodeRequest::setEdgeNodeId));
        builder.<Boolean>withRequestField("delete_external_node",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getDeleteExternalNode,
                DeleteEdgeNodeRequest::setDeleteExternalNode));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeNodeResponse::getBody, DeleteEdgeNodeResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodes =
        genForListEdgeNodes();

    private static HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> genForListEdgeNodes() {
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
            f -> f.withMarshaller(ListEdgeNodesRequest::getName, ListEdgeNodesRequest::setName));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getState, ListEdgeNodesRequest::setState));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getType, ListEdgeNodesRequest::setType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getInstanceId, ListEdgeNodesRequest::setInstanceId));
        builder.<String>withRequestField("space_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getSpaceId, ListEdgeNodesRequest::setSpaceId));
        builder.<List<String>>withRequestField("node_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getNodeIds, ListEdgeNodesRequest::setNodeIds));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getOffset, ListEdgeNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getLimit, ListEdgeNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeNodeRequest, ShowEdgeNodeResponse> showEdgeNode = genForShowEdgeNode();

    private static HttpRequestDef<ShowEdgeNodeRequest, ShowEdgeNodeResponse> genForShowEdgeNode() {
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
            f -> f.withMarshaller(ShowEdgeNodeRequest::getEdgeNodeId, ShowEdgeNodeRequest::setEdgeNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeNodeHostsInfoRequest, ShowEdgeNodeHostsInfoResponse> showEdgeNodeHostsInfo =
        genForShowEdgeNodeHostsInfo();

    private static HttpRequestDef<ShowEdgeNodeHostsInfoRequest, ShowEdgeNodeHostsInfoResponse> genForShowEdgeNodeHostsInfo() {
        // basic
        HttpRequestDef.Builder<ShowEdgeNodeHostsInfoRequest, ShowEdgeNodeHostsInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEdgeNodeHostsInfoRequest.class, ShowEdgeNodeHostsInfoResponse.class)
            .withName("ShowEdgeNodeHostsInfo")
            .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeNodeHostsInfoRequest::getEdgeNodeId,
                ShowEdgeNodeHostsInfoRequest::setEdgeNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNode =
        genForUpdateEdgeNode();

    private static HttpRequestDef<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> genForUpdateEdgeNode() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeNodeRequest.class, UpdateEdgeNodeResponse.class)
                .withName("UpdateEdgeNode")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getEdgeNodeId, UpdateEdgeNodeRequest::setEdgeNodeId));
        builder.<UpdateNodeReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNodeReqDTO.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getBody, UpdateEdgeNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeviceControlsReleaseRequest, ExecuteDeviceControlsReleaseResponse> executeDeviceControlsRelease =
        genForExecuteDeviceControlsRelease();

    private static HttpRequestDef<ExecuteDeviceControlsReleaseRequest, ExecuteDeviceControlsReleaseResponse> genForExecuteDeviceControlsRelease() {
        // basic
        HttpRequestDef.Builder<ExecuteDeviceControlsReleaseRequest, ExecuteDeviceControlsReleaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteDeviceControlsReleaseRequest.class,
                    ExecuteDeviceControlsReleaseResponse.class)
                .withName("ExecuteDeviceControlsRelease")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/{device_id}/controls/release")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeviceControlsReleaseRequest::getEdgeNodeId,
                ExecuteDeviceControlsReleaseRequest::setEdgeNodeId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeviceControlsReleaseRequest::getDeviceId,
                ExecuteDeviceControlsReleaseRequest::setDeviceId));
        builder.<DeviceControlReleaseReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceControlReleaseReqDTO.class),
            f -> f.withMarshaller(ExecuteDeviceControlsReleaseRequest::getBody,
                ExecuteDeviceControlsReleaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteDeviceControlsSetRequest, ExecuteDeviceControlsSetResponse> executeDeviceControlsSet =
        genForExecuteDeviceControlsSet();

    private static HttpRequestDef<ExecuteDeviceControlsSetRequest, ExecuteDeviceControlsSetResponse> genForExecuteDeviceControlsSet() {
        // basic
        HttpRequestDef.Builder<ExecuteDeviceControlsSetRequest, ExecuteDeviceControlsSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteDeviceControlsSetRequest.class, ExecuteDeviceControlsSetResponse.class)
                .withName("ExecuteDeviceControlsSet")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/{device_id}/controls/set")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeviceControlsSetRequest::getEdgeNodeId,
                ExecuteDeviceControlsSetRequest::setEdgeNodeId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteDeviceControlsSetRequest::getDeviceId,
                ExecuteDeviceControlsSetRequest::setDeviceId));
        builder.<DeviceControlSetReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceControlSetReqDTO.class),
            f -> f.withMarshaller(ExecuteDeviceControlsSetRequest::getBody, ExecuteDeviceControlsSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDeviceControlDefaultValuesRequest, SetDeviceControlDefaultValuesResponse> setDeviceControlDefaultValues =
        genForSetDeviceControlDefaultValues();

    private static HttpRequestDef<SetDeviceControlDefaultValuesRequest, SetDeviceControlDefaultValuesResponse> genForSetDeviceControlDefaultValues() {
        // basic
        HttpRequestDef.Builder<SetDeviceControlDefaultValuesRequest, SetDeviceControlDefaultValuesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetDeviceControlDefaultValuesRequest.class,
                    SetDeviceControlDefaultValuesResponse.class)
                .withName("SetDeviceControlDefaultValues")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/devices/controls/default-values")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDeviceControlDefaultValuesRequest::getEdgeNodeId,
                SetDeviceControlDefaultValuesRequest::setEdgeNodeId));
        builder.<DeviceControlDefaultValuesReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceControlDefaultValuesReqDTO.class),
            f -> f.withMarshaller(SetDeviceControlDefaultValuesRequest::getBody,
                SetDeviceControlDefaultValuesRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetDeviceControlDefaultValuesResponse::getBody,
                SetDeviceControlDefaultValuesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<AddDeviceRequest, AddDeviceResponse> addDevice = genForAddDevice();

    private static HttpRequestDef<AddDeviceRequest, AddDeviceResponse> genForAddDevice() {
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
            f -> f.withMarshaller(AddDeviceRequest::getEdgeNodeId, AddDeviceRequest::setEdgeNodeId));
        builder.<AddDeviceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddDeviceRequestBody.class),
            f -> f.withMarshaller(AddDeviceRequest::getBody, AddDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genForDeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genForDeleteDevice() {
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
            f -> f.withMarshaller(DeleteDeviceRequest::getEdgeNodeId, DeleteDeviceRequest::setEdgeNodeId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, DeleteDeviceRequest::setDeviceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDeviceResponse::getBody, DeleteDeviceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForListDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForListDevices() {
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
            f -> f.withMarshaller(ListDevicesRequest::getEdgeNodeId, ListDevicesRequest::setEdgeNodeId));
        builder.<String>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getGatewayId, ListDevicesRequest::setGatewayId));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, ListDevicesRequest::setDeviceName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, ListDevicesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, ListDevicesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductConfigRequest, ShowProductConfigResponse> showProductConfig =
        genForShowProductConfig();

    private static HttpRequestDef<ShowProductConfigRequest, ShowProductConfigResponse> genForShowProductConfig() {
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
            f -> f.withMarshaller(ShowProductConfigRequest::getProtocolType,
                ShowProductConfigRequest::setProtocolType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForUpdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForUpdateDevice() {
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
            f -> f.withMarshaller(UpdateDeviceRequest::getEdgeNodeId, UpdateDeviceRequest::setEdgeNodeId));
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, UpdateDeviceRequest::setDeviceId));
        builder.<UpdateDesireds>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDesireds.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, UpdateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAppConfigsTemplatesRequest, AddAppConfigsTemplatesResponse> addAppConfigsTemplates =
        genForAddAppConfigsTemplates();

    private static HttpRequestDef<AddAppConfigsTemplatesRequest, AddAppConfigsTemplatesResponse> genForAddAppConfigsTemplates() {
        // basic
        HttpRequestDef.Builder<AddAppConfigsTemplatesRequest, AddAppConfigsTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddAppConfigsTemplatesRequest.class, AddAppConfigsTemplatesResponse.class)
            .withName("AddAppConfigsTemplates")
            .withUri("/v2/{project_id}/templates/apps/configs")
            .withContentType("application/json");

        // requests
        builder.<CreateAppConfigsTemplatesReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAppConfigsTemplatesReqDTO.class),
            f -> f.withMarshaller(AddAppConfigsTemplatesRequest::getBody, AddAppConfigsTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddGeneralAppConfigsTemplateRequest, AddGeneralAppConfigsTemplateResponse> addGeneralAppConfigsTemplate =
        genForAddGeneralAppConfigsTemplate();

    private static HttpRequestDef<AddGeneralAppConfigsTemplateRequest, AddGeneralAppConfigsTemplateResponse> genForAddGeneralAppConfigsTemplate() {
        // basic
        HttpRequestDef.Builder<AddGeneralAppConfigsTemplateRequest, AddGeneralAppConfigsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AddGeneralAppConfigsTemplateRequest.class,
                    AddGeneralAppConfigsTemplateResponse.class)
                .withName("AddGeneralAppConfigsTemplate")
                .withUri("/v2/{project_id}/templates/apps/configs/import")
                .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddGeneralAppConfigsTemplateResponse::getBody,
                AddGeneralAppConfigsTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<BatchListAppConfigsTemplatesRequest, BatchListAppConfigsTemplatesResponse> batchListAppConfigsTemplates =
        genForBatchListAppConfigsTemplates();

    private static HttpRequestDef<BatchListAppConfigsTemplatesRequest, BatchListAppConfigsTemplatesResponse> genForBatchListAppConfigsTemplates() {
        // basic
        HttpRequestDef.Builder<BatchListAppConfigsTemplatesRequest, BatchListAppConfigsTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    BatchListAppConfigsTemplatesRequest.class,
                    BatchListAppConfigsTemplatesResponse.class)
                .withName("BatchListAppConfigsTemplates")
                .withUri("/v2/{project_id}/templates/apps/configs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListAppConfigsTemplatesRequest::getOffset,
                BatchListAppConfigsTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListAppConfigsTemplatesRequest::getLimit,
                BatchListAppConfigsTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppConfigsTemplateRequest, DeleteAppConfigsTemplateResponse> deleteAppConfigsTemplate =
        genForDeleteAppConfigsTemplate();

    private static HttpRequestDef<DeleteAppConfigsTemplateRequest, DeleteAppConfigsTemplateResponse> genForDeleteAppConfigsTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAppConfigsTemplateRequest, DeleteAppConfigsTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAppConfigsTemplateRequest.class,
                    DeleteAppConfigsTemplateResponse.class)
                .withName("DeleteAppConfigsTemplate")
                .withUri("/v2/{project_id}/templates/apps/configs/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppConfigsTemplateRequest::getTplId,
                DeleteAppConfigsTemplateRequest::setTplId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAppConfigsTemplateResponse::getBody,
                DeleteAppConfigsTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppConfigsTemplateRequest, ShowAppConfigsTemplateResponse> showAppConfigsTemplate =
        genForShowAppConfigsTemplate();

    private static HttpRequestDef<ShowAppConfigsTemplateRequest, ShowAppConfigsTemplateResponse> genForShowAppConfigsTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAppConfigsTemplateRequest, ShowAppConfigsTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppConfigsTemplateRequest.class, ShowAppConfigsTemplateResponse.class)
            .withName("ShowAppConfigsTemplate")
            .withUri("/v2/{project_id}/templates/apps/configs/{tpl_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppConfigsTemplateRequest::getTplId, ShowAppConfigsTemplateRequest::setTplId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> batchListEdgeApps =
        genForBatchListEdgeApps();

    private static HttpRequestDef<BatchListEdgeAppsRequest, BatchListEdgeAppsResponse> genForBatchListEdgeApps() {
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
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getEdgeAppId, BatchListEdgeAppsRequest::setEdgeAppId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getOffset, BatchListEdgeAppsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getLimit, BatchListEdgeAppsRequest::setLimit));
        builder.<BatchListEdgeAppsRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppsRequest.AppTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getAppType, BatchListEdgeAppsRequest::setAppType));
        builder.<BatchListEdgeAppsRequest.FunctionTypeEnum>withRequestField("function_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppsRequest.FunctionTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppsRequest::getFunctionType,
                BatchListEdgeAppsRequest::setFunctionType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> createEdgeApp =
        genForCreateEdgeApp();

    private static HttpRequestDef<CreateEdgeAppRequest, CreateEdgeAppResponse> genForCreateEdgeApp() {
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
            f -> f.withMarshaller(CreateEdgeAppRequest::getBody, CreateEdgeAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> deleteEdgeApp =
        genForDeleteEdgeApp();

    private static HttpRequestDef<DeleteEdgeAppRequest, DeleteEdgeAppResponse> genForDeleteEdgeApp() {
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
            f -> f.withMarshaller(DeleteEdgeAppRequest::getEdgeAppId, DeleteEdgeAppRequest::setEdgeAppId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeAppResponse::getBody, DeleteEdgeAppResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeAppRequest, ShowEdgeAppResponse> showEdgeApp = genForShowEdgeApp();

    private static HttpRequestDef<ShowEdgeAppRequest, ShowEdgeAppResponse> genForShowEdgeApp() {
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
            f -> f.withMarshaller(ShowEdgeAppRequest::getEdgeAppId, ShowEdgeAppRequest::setEdgeAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> batchListEdgeAppVersions =
        genForBatchListEdgeAppVersions();

    private static HttpRequestDef<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> genForBatchListEdgeAppVersions() {
        // basic
        HttpRequestDef.Builder<BatchListEdgeAppVersionsRequest, BatchListEdgeAppVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, BatchListEdgeAppVersionsRequest.class, BatchListEdgeAppVersionsResponse.class)
                .withName("BatchListEdgeAppVersions")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getEdgeAppId,
                BatchListEdgeAppVersionsRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getVersion,
                BatchListEdgeAppVersionsRequest::setVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getOffset,
                BatchListEdgeAppVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getLimit,
                BatchListEdgeAppVersionsRequest::setLimit));
        builder.<BatchListEdgeAppVersionsRequest.AiCardTypeEnum>withRequestField("ai_card_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.AiCardTypeEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getAiCardType,
                BatchListEdgeAppVersionsRequest::setAiCardType));
        builder.<BatchListEdgeAppVersionsRequest.ArchEnum>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.ArchEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getArch, BatchListEdgeAppVersionsRequest::setArch));
        builder.<BatchListEdgeAppVersionsRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListEdgeAppVersionsRequest.StateEnum.class),
            f -> f.withMarshaller(BatchListEdgeAppVersionsRequest::getState,
                BatchListEdgeAppVersionsRequest::setState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> createEdgeApplicationVersion =
        genForCreateEdgeApplicationVersion();

    private static HttpRequestDef<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> genForCreateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<CreateEdgeApplicationVersionRequest, CreateEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEdgeApplicationVersionRequest.class,
                    CreateEdgeApplicationVersionResponse.class)
                .withName("CreateEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getEdgeAppId,
                CreateEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<CreateEdgeApplicationVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeApplicationVersionDTO.class),
            f -> f.withMarshaller(CreateEdgeApplicationVersionRequest::getBody,
                CreateEdgeApplicationVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> deleteEdgeApplicationVersion =
        genForDeleteEdgeApplicationVersion();

    private static HttpRequestDef<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> genForDeleteEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeApplicationVersionRequest, DeleteEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEdgeApplicationVersionRequest.class,
                    DeleteEdgeApplicationVersionResponse.class)
                .withName("DeleteEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getEdgeAppId,
                DeleteEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeApplicationVersionRequest::getVersion,
                DeleteEdgeApplicationVersionRequest::setVersion));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteEdgeApplicationVersionResponse::getBody,
                DeleteEdgeApplicationVersionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> showEdgeApplicationVersion =
        genForShowEdgeApplicationVersion();

    private static HttpRequestDef<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> genForShowEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<ShowEdgeApplicationVersionRequest, ShowEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowEdgeApplicationVersionRequest.class,
                    ShowEdgeApplicationVersionResponse.class)
                .withName("ShowEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getEdgeAppId,
                ShowEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeApplicationVersionRequest::getVersion,
                ShowEdgeApplicationVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> updateEdgeApplicationVersion =
        genForUpdateEdgeApplicationVersion();

    private static HttpRequestDef<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> genForUpdateEdgeApplicationVersion() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionRequest, UpdateEdgeApplicationVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEdgeApplicationVersionRequest.class,
                    UpdateEdgeApplicationVersionResponse.class)
                .withName("UpdateEdgeApplicationVersion")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getEdgeAppId,
                UpdateEdgeApplicationVersionRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getVersion,
                UpdateEdgeApplicationVersionRequest::setVersion));
        builder.<UpdateEdgeAppVersionDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionRequest::getBody,
                UpdateEdgeApplicationVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> updateEdgeApplicationVersionState =
        genForUpdateEdgeApplicationVersionState();

    private static HttpRequestDef<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> genForUpdateEdgeApplicationVersionState() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeApplicationVersionStateRequest, UpdateEdgeApplicationVersionStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEdgeApplicationVersionStateRequest.class,
                    UpdateEdgeApplicationVersionStateResponse.class)
                .withName("UpdateEdgeApplicationVersionState")
                .withUri("/v2/{project_id}/edge-apps/{edge_app_id}/versions/{version}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getEdgeAppId,
                UpdateEdgeApplicationVersionStateRequest::setEdgeAppId));
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getVersion,
                UpdateEdgeApplicationVersionStateRequest::setVersion));
        builder.<UpdateEdgeAppVersionStateDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeAppVersionStateDTO.class),
            f -> f.withMarshaller(UpdateEdgeApplicationVersionStateRequest::getBody,
                UpdateEdgeApplicationVersionStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListDcDsRequest, BatchListDcDsResponse> batchListDcDs =
        genForBatchListDcDs();

    private static HttpRequestDef<BatchListDcDsRequest, BatchListDcDsResponse> genForBatchListDcDs() {
        // basic
        HttpRequestDef.Builder<BatchListDcDsRequest, BatchListDcDsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListDcDsRequest.class, BatchListDcDsResponse.class)
                .withName("BatchListDcDs")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcDsRequest::getEdgeNodeId, BatchListDcDsRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcDsRequest::getModuleId, BatchListDcDsRequest::setModuleId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcDsRequest::getOffset, BatchListDcDsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcDsRequest::getLimit, BatchListDcDsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDsRequest, CreateDsResponse> createDs = genForCreateDs();

    private static HttpRequestDef<CreateDsRequest, CreateDsResponse> genForCreateDs() {
        // basic
        HttpRequestDef.Builder<CreateDsRequest, CreateDsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDsRequest.class, CreateDsResponse.class)
                .withName("CreateDs")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDsRequest::getEdgeNodeId, CreateDsRequest::setEdgeNodeId));
        builder.<CreateDcDsReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDcDsReqDTO.class),
            f -> f.withMarshaller(CreateDsRequest::getBody, CreateDsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDcDsRequest, DeleteDcDsResponse> deleteDcDs = genForDeleteDcDs();

    private static HttpRequestDef<DeleteDcDsRequest, DeleteDcDsResponse> genForDeleteDcDs() {
        // basic
        HttpRequestDef.Builder<DeleteDcDsRequest, DeleteDcDsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDcDsRequest.class, DeleteDcDsResponse.class)
                .withName("DeleteDcDs")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcDsRequest::getEdgeNodeId, DeleteDcDsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcDsRequest::getDsId, DeleteDcDsRequest::setDsId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDcDsResponse::getBody, DeleteDcDsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDcDsRequest, ShowDcDsResponse> showDcDs = genForShowDcDs();

    private static HttpRequestDef<ShowDcDsRequest, ShowDcDsResponse> genForShowDcDs() {
        // basic
        HttpRequestDef.Builder<ShowDcDsRequest, ShowDcDsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDcDsRequest.class, ShowDcDsResponse.class)
                .withName("ShowDcDs")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcDsRequest::getEdgeNodeId, ShowDcDsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcDsRequest::getDsId, ShowDcDsRequest::setDsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SynchronizeDcConfigsRequest, SynchronizeDcConfigsResponse> synchronizeDcConfigs =
        genForSynchronizeDcConfigs();

    private static HttpRequestDef<SynchronizeDcConfigsRequest, SynchronizeDcConfigsResponse> genForSynchronizeDcConfigs() {
        // basic
        HttpRequestDef.Builder<SynchronizeDcConfigsRequest, SynchronizeDcConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SynchronizeDcConfigsRequest.class, SynchronizeDcConfigsResponse.class)
            .withName("SynchronizeDcConfigs")
            .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/synchronize")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SynchronizeDcConfigsRequest::getEdgeNodeId,
                SynchronizeDcConfigsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SynchronizeDcConfigsRequest::getDsId, SynchronizeDcConfigsRequest::setDsId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SynchronizeDcConfigsResponse::getBody, SynchronizeDcConfigsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDcDsRequest, UpdateDcDsResponse> updateDcDs = genForUpdateDcDs();

    private static HttpRequestDef<UpdateDcDsRequest, UpdateDcDsResponse> genForUpdateDcDs() {
        // basic
        HttpRequestDef.Builder<UpdateDcDsRequest, UpdateDcDsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDcDsRequest.class, UpdateDcDsResponse.class)
                .withName("UpdateDcDs")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDcDsRequest::getEdgeNodeId, UpdateDcDsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDcDsRequest::getDsId, UpdateDcDsRequest::setDsId));
        builder.<UpdateDcDsReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDcDsReqDTO.class),
            f -> f.withMarshaller(UpdateDcDsRequest::getBody, UpdateDcDsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListDcDevicesRequest, BatchListDcDevicesResponse> batchListDcDevices =
        genForBatchListDcDevices();

    private static HttpRequestDef<BatchListDcDevicesRequest, BatchListDcDevicesResponse> genForBatchListDcDevices() {
        // basic
        HttpRequestDef.Builder<BatchListDcDevicesRequest, BatchListDcDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListDcDevicesRequest.class, BatchListDcDevicesResponse.class)
                .withName("BatchListDcDevices")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcDevicesRequest::getEdgeNodeId, BatchListDcDevicesRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcDevicesRequest::getDsId, BatchListDcDevicesRequest::setDsId));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcDevicesRequest::getDeviceId, BatchListDcDevicesRequest::setDeviceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcDevicesRequest::getOffset, BatchListDcDevicesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcDevicesRequest::getLimit, BatchListDcDevicesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListDcPointsRequest, BatchListDcPointsResponse> batchListDcPoints =
        genForBatchListDcPoints();

    private static HttpRequestDef<BatchListDcPointsRequest, BatchListDcPointsResponse> genForBatchListDcPoints() {
        // basic
        HttpRequestDef.Builder<BatchListDcPointsRequest, BatchListDcPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, BatchListDcPointsRequest.class, BatchListDcPointsResponse.class)
                .withName("BatchListDcPoints")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getEdgeNodeId, BatchListDcPointsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getDsId, BatchListDcPointsRequest::setDsId));
        builder.<String>withRequestField("point_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getPointId, BatchListDcPointsRequest::setPointId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getName, BatchListDcPointsRequest::setName));
        builder.<String>withRequestField("property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getProperty, BatchListDcPointsRequest::setProperty));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getDeviceId, BatchListDcPointsRequest::setDeviceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getOffset, BatchListDcPointsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListDcPointsRequest::getLimit, BatchListDcPointsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDcPointRequest, CreateDcPointResponse> createDcPoint =
        genForCreateDcPoint();

    private static HttpRequestDef<CreateDcPointRequest, CreateDcPointResponse> genForCreateDcPoint() {
        // basic
        HttpRequestDef.Builder<CreateDcPointRequest, CreateDcPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDcPointRequest.class, CreateDcPointResponse.class)
                .withName("CreateDcPoint")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDcPointRequest::getEdgeNodeId, CreateDcPointRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDcPointRequest::getDsId, CreateDcPointRequest::setDsId));
        builder.<CreateDcPointReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDcPointReqDTO.class),
            f -> f.withMarshaller(CreateDcPointRequest::getBody, CreateDcPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDcPointRequest, DeleteDcPointResponse> deleteDcPoint =
        genForDeleteDcPoint();

    private static HttpRequestDef<DeleteDcPointRequest, DeleteDcPointResponse> genForDeleteDcPoint() {
        // basic
        HttpRequestDef.Builder<DeleteDcPointRequest, DeleteDcPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDcPointRequest.class, DeleteDcPointResponse.class)
                .withName("DeleteDcPoint")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points/{point_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointRequest::getEdgeNodeId, DeleteDcPointRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointRequest::getDsId, DeleteDcPointRequest::setDsId));
        builder.<String>withRequestField("point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointRequest::getPointId, DeleteDcPointRequest::setPointId));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointRequest::getDeviceId, DeleteDcPointRequest::setDeviceId));
        builder.<String>withRequestField("property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointRequest::getProperty, DeleteDcPointRequest::setProperty));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDcPointResponse::getBody, DeleteDcPointResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDcPointsRequest, DeleteDcPointsResponse> deleteDcPoints =
        genForDeleteDcPoints();

    private static HttpRequestDef<DeleteDcPointsRequest, DeleteDcPointsResponse> genForDeleteDcPoints() {
        // basic
        HttpRequestDef.Builder<DeleteDcPointsRequest, DeleteDcPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteDcPointsRequest.class, DeleteDcPointsResponse.class)
                .withName("DeleteDcPoints")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointsRequest::getEdgeNodeId, DeleteDcPointsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDcPointsRequest::getDsId, DeleteDcPointsRequest::setDsId));
        builder.<DeleteDcPointsReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDcPointsReqDTO.class),
            f -> f.withMarshaller(DeleteDcPointsRequest::getBody, DeleteDcPointsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDcPointRequest, ShowDcPointResponse> showDcPoint = genForShowDcPoint();

    private static HttpRequestDef<ShowDcPointRequest, ShowDcPointResponse> genForShowDcPoint() {
        // basic
        HttpRequestDef.Builder<ShowDcPointRequest, ShowDcPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDcPointRequest.class, ShowDcPointResponse.class)
                .withName("ShowDcPoint")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points/{point_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcPointRequest::getEdgeNodeId, ShowDcPointRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcPointRequest::getDsId, ShowDcPointRequest::setDsId));
        builder.<String>withRequestField("point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcPointRequest::getPointId, ShowDcPointRequest::setPointId));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcPointRequest::getDeviceId, ShowDcPointRequest::setDeviceId));
        builder.<String>withRequestField("property",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDcPointRequest::getProperty, ShowDcPointRequest::setProperty));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDcPointRequest, UpdateDcPointResponse> updateDcPoint =
        genForUpdateDcPoint();

    private static HttpRequestDef<UpdateDcPointRequest, UpdateDcPointResponse> genForUpdateDcPoint() {
        // basic
        HttpRequestDef.Builder<UpdateDcPointRequest, UpdateDcPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDcPointRequest.class, UpdateDcPointResponse.class)
                .withName("UpdateDcPoint")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/points/{point_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDcPointRequest::getEdgeNodeId, UpdateDcPointRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDcPointRequest::getDsId, UpdateDcPointRequest::setDsId));
        builder.<String>withRequestField("point_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDcPointRequest::getPointId, UpdateDcPointRequest::setPointId));
        builder.<UpdateDcPointReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDcPointReqDTO.class),
            f -> f.withMarshaller(UpdateDcPointRequest::getBody, UpdateDcPointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateExternalEntityRequest, CreateExternalEntityResponse> createExternalEntity =
        genForCreateExternalEntity();

    private static HttpRequestDef<CreateExternalEntityRequest, CreateExternalEntityResponse> genForCreateExternalEntity() {
        // basic
        HttpRequestDef.Builder<CreateExternalEntityRequest, CreateExternalEntityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateExternalEntityRequest.class, CreateExternalEntityResponse.class)
            .withName("CreateExternalEntity")
            .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExternalEntityRequest::getEdgeNodeId,
                CreateExternalEntityRequest::setEdgeNodeId));
        builder.<CreateExternalEntityReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalEntityReqDTO.class),
            f -> f.withMarshaller(CreateExternalEntityRequest::getBody, CreateExternalEntityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExternalEntityRequest, DeleteExternalEntityResponse> deleteExternalEntity =
        genForDeleteExternalEntity();

    private static HttpRequestDef<DeleteExternalEntityRequest, DeleteExternalEntityResponse> genForDeleteExternalEntity() {
        // basic
        HttpRequestDef.Builder<DeleteExternalEntityRequest, DeleteExternalEntityResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteExternalEntityRequest.class, DeleteExternalEntityResponse.class)
            .withName("DeleteExternalEntity")
            .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals/{external_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalEntityRequest::getEdgeNodeId,
                DeleteExternalEntityRequest::setEdgeNodeId));
        builder.<String>withRequestField("external_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExternalEntityRequest::getExternalId,
                DeleteExternalEntityRequest::setExternalId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteExternalEntityResponse::getBody, DeleteExternalEntityResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalEntityRequest, ListExternalEntityResponse> listExternalEntity =
        genForListExternalEntity();

    private static HttpRequestDef<ListExternalEntityRequest, ListExternalEntityResponse> genForListExternalEntity() {
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
            f -> f.withMarshaller(ListExternalEntityRequest::getEdgeNodeId, ListExternalEntityRequest::setEdgeNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalEntityRequest::getOffset, ListExternalEntityRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListExternalEntityRequest::getLimit, ListExternalEntityRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExternalEntityRequest, UpdateExternalEntityResponse> updateExternalEntity =
        genForUpdateExternalEntity();

    private static HttpRequestDef<UpdateExternalEntityRequest, UpdateExternalEntityResponse> genForUpdateExternalEntity() {
        // basic
        HttpRequestDef.Builder<UpdateExternalEntityRequest, UpdateExternalEntityResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateExternalEntityRequest.class, UpdateExternalEntityResponse.class)
            .withName("UpdateExternalEntity")
            .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/externals/{external_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getEdgeNodeId,
                UpdateExternalEntityRequest::setEdgeNodeId));
        builder.<String>withRequestField("external_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getExternalId,
                UpdateExternalEntityRequest::setExternalId));
        builder.<UpdateExternalEntityReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateExternalEntityReqDTO.class),
            f -> f.withMarshaller(UpdateExternalEntityRequest::getBody, UpdateExternalEntityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListModulesRequest, BatchListModulesResponse> batchListModules =
        genForBatchListModules();

    private static HttpRequestDef<BatchListModulesRequest, BatchListModulesResponse> genForBatchListModules() {
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
            f -> f.withMarshaller(BatchListModulesRequest::getEdgeNodeId, BatchListModulesRequest::setEdgeNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListModulesRequest::getOffset, BatchListModulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListModulesRequest::getLimit, BatchListModulesRequest::setLimit));
        builder.<BatchListModulesRequest.AppTypeEnum>withRequestField("app_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListModulesRequest.AppTypeEnum.class),
            f -> f.withMarshaller(BatchListModulesRequest::getAppType, BatchListModulesRequest::setAppType));
        builder.<BatchListModulesRequest.FunctionTypeEnum>withRequestField("function_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchListModulesRequest.FunctionTypeEnum.class),
            f -> f.withMarshaller(BatchListModulesRequest::getFunctionType, BatchListModulesRequest::setFunctionType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateModuleRequest, CreateModuleResponse> createModule = genForCreateModule();

    private static HttpRequestDef<CreateModuleRequest, CreateModuleResponse> genForCreateModule() {
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
            f -> f.withMarshaller(CreateModuleRequest::getEdgeNodeId, CreateModuleRequest::setEdgeNodeId));
        builder.<CreateEdgeModuleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEdgeModuleReqDTO.class),
            f -> f.withMarshaller(CreateModuleRequest::getBody, CreateModuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> deleteModule = genForDeleteModule();

    private static HttpRequestDef<DeleteModuleRequest, DeleteModuleResponse> genForDeleteModule() {
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
            f -> f.withMarshaller(DeleteModuleRequest::getEdgeNodeId, DeleteModuleRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteModuleRequest::getModuleId, DeleteModuleRequest::setModuleId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteModuleResponse::getBody, DeleteModuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<InvokeModuleMsgRequest, InvokeModuleMsgResponse> invokeModuleMsg =
        genForInvokeModuleMsg();

    private static HttpRequestDef<InvokeModuleMsgRequest, InvokeModuleMsgResponse> genForInvokeModuleMsg() {
        // basic
        HttpRequestDef.Builder<InvokeModuleMsgRequest, InvokeModuleMsgResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InvokeModuleMsgRequest.class, InvokeModuleMsgResponse.class)
                .withName("InvokeModuleMsg")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeModuleMsgRequest::getEdgeNodeId, InvokeModuleMsgRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeModuleMsgRequest::getModuleId, InvokeModuleMsgRequest::setModuleId));
        builder.<Object>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(InvokeModuleMsgRequest::getBody, InvokeModuleMsgRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(InvokeModuleMsgResponse::getBody, InvokeModuleMsgResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowModuleRequest, ShowModuleResponse> showModule = genForShowModule();

    private static HttpRequestDef<ShowModuleRequest, ShowModuleResponse> genForShowModule() {
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
            f -> f.withMarshaller(ShowModuleRequest::getEdgeNodeId, ShowModuleRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleRequest::getModuleId, ShowModuleRequest::setModuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> updateModule = genForUpdateModule();

    private static HttpRequestDef<UpdateModuleRequest, UpdateModuleResponse> genForUpdateModule() {
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
            f -> f.withMarshaller(UpdateModuleRequest::getEdgeNodeId, UpdateModuleRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleRequest::getModuleId, UpdateModuleRequest::setModuleId));
        builder.<UpdateEdgeModuleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeModuleReqDTO.class),
            f -> f.withMarshaller(UpdateModuleRequest::getBody, UpdateModuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModuleStateRequest, UpdateModuleStateResponse> updateModuleState =
        genForUpdateModuleState();

    private static HttpRequestDef<UpdateModuleStateRequest, UpdateModuleStateResponse> genForUpdateModuleState() {
        // basic
        HttpRequestDef.Builder<UpdateModuleStateRequest, UpdateModuleStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModuleStateRequest.class, UpdateModuleStateResponse.class)
                .withName("UpdateModuleState")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleStateRequest::getEdgeNodeId, UpdateModuleStateRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleStateRequest::getModuleId, UpdateModuleStateRequest::setModuleId));
        builder.<UpdateEdgeModuleStateReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEdgeModuleStateReqDTO.class),
            f -> f.withMarshaller(UpdateModuleStateRequest::getBody, UpdateModuleStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowModuleShadowRequest, ShowModuleShadowResponse> showModuleShadow =
        genForShowModuleShadow();

    private static HttpRequestDef<ShowModuleShadowRequest, ShowModuleShadowResponse> genForShowModuleShadow() {
        // basic
        HttpRequestDef.Builder<ShowModuleShadowRequest, ShowModuleShadowResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowModuleShadowRequest.class, ShowModuleShadowResponse.class)
                .withName("ShowModuleShadow")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleShadowRequest::getEdgeNodeId, ShowModuleShadowRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowModuleShadowRequest::getModuleId, ShowModuleShadowRequest::setModuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateModuleShadowRequest, UpdateModuleShadowResponse> updateModuleShadow =
        genForUpdateModuleShadow();

    private static HttpRequestDef<UpdateModuleShadowRequest, UpdateModuleShadowResponse> genForUpdateModuleShadow() {
        // basic
        HttpRequestDef.Builder<UpdateModuleShadowRequest, UpdateModuleShadowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateModuleShadowRequest.class, UpdateModuleShadowResponse.class)
                .withName("UpdateModuleShadow")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/modules/{module_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleShadowRequest::getEdgeNodeId, UpdateModuleShadowRequest::setEdgeNodeId));
        builder.<String>withRequestField("module_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateModuleShadowRequest::getModuleId, UpdateModuleShadowRequest::setModuleId));
        builder.<UpdateModuleShadowsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateModuleShadowsRequestBody.class),
            f -> f.withMarshaller(UpdateModuleShadowRequest::getBody, UpdateModuleShadowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRoutesRequest, ListRoutesResponse> listRoutes = genForListRoutes();

    private static HttpRequestDef<ListRoutesRequest, ListRoutesResponse> genForListRoutes() {
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
            f -> f.withMarshaller(ListRoutesRequest::getEdgeNodeId, ListRoutesRequest::setEdgeNodeId));
        builder.<Boolean>withRequestField("parsed",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListRoutesRequest::getParsed, ListRoutesRequest::setParsed));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> updateRoutes = genForUpdateRoutes();

    private static HttpRequestDef<UpdateRoutesRequest, UpdateRoutesResponse> genForUpdateRoutes() {
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
            f -> f.withMarshaller(UpdateRoutesRequest::getEdgeNodeId, UpdateRoutesRequest::setEdgeNodeId));
        builder.<List<CreateRouterReqDTO>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateRoutesRequest::getBody, UpdateRoutesRequest::setBody)
                .withInnerContainerType(CreateRouterReqDTO.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddGeneralOtTemplateRequest, AddGeneralOtTemplateResponse> addGeneralOtTemplate =
        genForAddGeneralOtTemplate();

    private static HttpRequestDef<AddGeneralOtTemplateRequest, AddGeneralOtTemplateResponse> genForAddGeneralOtTemplate() {
        // basic
        HttpRequestDef.Builder<AddGeneralOtTemplateRequest, AddGeneralOtTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddGeneralOtTemplateRequest.class, AddGeneralOtTemplateResponse.class)
            .withName("AddGeneralOtTemplate")
            .withUri("/v2/{project_id}/templates/ots/data-sources/import")
            .withContentType("application/json");

        // requests

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(AddGeneralOtTemplateResponse::getBody, AddGeneralOtTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<AddOtTemplatesRequest, AddOtTemplatesResponse> addOtTemplates =
        genForAddOtTemplates();

    private static HttpRequestDef<AddOtTemplatesRequest, AddOtTemplatesResponse> genForAddOtTemplates() {
        // basic
        HttpRequestDef.Builder<AddOtTemplatesRequest, AddOtTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddOtTemplatesRequest.class, AddOtTemplatesResponse.class)
                .withName("AddOtTemplates")
                .withUri("/v2/{project_id}/templates/ots/data-sources")
                .withContentType("application/json");

        // requests
        builder.<CreateOtTemplatesReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOtTemplatesReqDTO.class),
            f -> f.withMarshaller(AddOtTemplatesRequest::getBody, AddOtTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchListOtTemplatesRequest, BatchListOtTemplatesResponse> batchListOtTemplates =
        genForBatchListOtTemplates();

    private static HttpRequestDef<BatchListOtTemplatesRequest, BatchListOtTemplatesResponse> genForBatchListOtTemplates() {
        // basic
        HttpRequestDef.Builder<BatchListOtTemplatesRequest, BatchListOtTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, BatchListOtTemplatesRequest.class, BatchListOtTemplatesResponse.class)
            .withName("BatchListOtTemplates")
            .withUri("/v2/{project_id}/templates/ots/data-sources")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListOtTemplatesRequest::getOffset, BatchListOtTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchListOtTemplatesRequest::getLimit, BatchListOtTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOtTemplateRequest, DeleteOtTemplateResponse> deleteOtTemplate =
        genForDeleteOtTemplate();

    private static HttpRequestDef<DeleteOtTemplateRequest, DeleteOtTemplateResponse> genForDeleteOtTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteOtTemplateRequest, DeleteOtTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteOtTemplateRequest.class, DeleteOtTemplateResponse.class)
                .withName("DeleteOtTemplate")
                .withUri("/v2/{project_id}/templates/ots/data-sources/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOtTemplateRequest::getTplId, DeleteOtTemplateRequest::setTplId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteOtTemplateResponse::getBody, DeleteOtTemplateResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowOtTemplateRequest, ShowOtTemplateResponse> showOtTemplate =
        genForShowOtTemplate();

    private static HttpRequestDef<ShowOtTemplateRequest, ShowOtTemplateResponse> genForShowOtTemplate() {
        // basic
        HttpRequestDef.Builder<ShowOtTemplateRequest, ShowOtTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOtTemplateRequest.class, ShowOtTemplateResponse.class)
                .withName("ShowOtTemplate")
                .withUri("/v2/{project_id}/templates/ots/data-sources/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOtTemplateRequest::getTplId, ShowOtTemplateRequest::setTplId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportPointsRequest, ImportPointsResponse> importPoints = genForImportPoints();

    private static HttpRequestDef<ImportPointsRequest, ImportPointsResponse> genForImportPoints() {
        // basic
        HttpRequestDef.Builder<ImportPointsRequest, ImportPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportPointsRequest.class, ImportPointsResponse.class)
                .withName("ImportPoints")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/import-points")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportPointsRequest::getEdgeNodeId, ImportPointsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportPointsRequest::getDsId, ImportPointsRequest::setDsId));
        builder.<ImportPointsRequest.UpdateTypeEnum>withRequestField("update_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportPointsRequest.UpdateTypeEnum.class),
            f -> f.withMarshaller(ImportPointsRequest::getUpdateType, ImportPointsRequest::setUpdateType));
        builder.<ImportPointsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportPointsRequestBody.class),
            f -> f.withMarshaller(ImportPointsRequest::getBody, ImportPointsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ImportPointsResponse::getBody, ImportPointsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowPointTemplateRequest, ShowPointTemplateResponse> showPointTemplate =
        genForShowPointTemplate();

    private static HttpRequestDef<ShowPointTemplateRequest, ShowPointTemplateResponse> genForShowPointTemplate() {
        // basic
        HttpRequestDef.Builder<ShowPointTemplateRequest, ShowPointTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPointTemplateRequest.class, ShowPointTemplateResponse.class)
                .withName("ShowPointTemplate")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/download-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPointTemplateRequest::getEdgeNodeId, ShowPointTemplateRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPointTemplateRequest::getDsId, ShowPointTemplateRequest::setDsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPointsRequest, ShowPointsResponse> showPoints = genForShowPoints();

    private static HttpRequestDef<ShowPointsRequest, ShowPointsResponse> genForShowPoints() {
        // basic
        HttpRequestDef.Builder<ShowPointsRequest, ShowPointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPointsRequest.class, ShowPointsResponse.class)
                .withName("ShowPoints")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/ots/data-sources/{ds_id}/export-points")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPointsRequest::getEdgeNodeId, ShowPointsRequest::setEdgeNodeId));
        builder.<String>withRequestField("ds_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPointsRequest::getDsId, ShowPointsRequest::setDsId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScheduleRequest, CreateScheduleResponse> createSchedule =
        genForCreateSchedule();

    private static HttpRequestDef<CreateScheduleRequest, CreateScheduleResponse> genForCreateSchedule() {
        // basic
        HttpRequestDef.Builder<CreateScheduleRequest, CreateScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScheduleRequest.class, CreateScheduleResponse.class)
                .withName("CreateSchedule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/schedules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScheduleRequest::getEdgeNodeId, CreateScheduleRequest::setEdgeNodeId));
        builder.<CreateScheduleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateScheduleReqDTO.class),
            f -> f.withMarshaller(CreateScheduleRequest::getBody, CreateScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleRequest, DeleteScheduleResponse> deleteSchedule =
        genForDeleteSchedule();

    private static HttpRequestDef<DeleteScheduleRequest, DeleteScheduleResponse> genForDeleteSchedule() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleRequest, DeleteScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScheduleRequest.class, DeleteScheduleResponse.class)
                .withName("DeleteSchedule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/schedules/{schedule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleRequest::getEdgeNodeId, DeleteScheduleRequest::setEdgeNodeId));
        builder.<String>withRequestField("schedule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleRequest::getScheduleId, DeleteScheduleRequest::setScheduleId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteScheduleResponse::getBody, DeleteScheduleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> updateSchedule =
        genForUpdateSchedule();

    private static HttpRequestDef<UpdateScheduleRequest, UpdateScheduleResponse> genForUpdateSchedule() {
        // basic
        HttpRequestDef.Builder<UpdateScheduleRequest, UpdateScheduleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScheduleRequest.class, UpdateScheduleResponse.class)
                .withName("UpdateSchedule")
                .withUri("/v2/{project_id}/edge-nodes/{edge_node_id}/schedules/{schedule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("edge_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getEdgeNodeId, UpdateScheduleRequest::setEdgeNodeId));
        builder.<String>withRequestField("schedule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getScheduleId, UpdateScheduleRequest::setScheduleId));
        builder.<UpdateScheduleReqDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateScheduleReqDTO.class),
            f -> f.withMarshaller(UpdateScheduleRequest::getBody, UpdateScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> batchConfirmConfigsNew =
        genForBatchConfirmConfigsNew();

    private static HttpRequestDef<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> genForBatchConfirmConfigsNew() {
        // basic
        HttpRequestDef.Builder<BatchConfirmConfigsNewRequest, BatchConfirmConfigsNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchConfirmConfigsNewRequest.class, BatchConfirmConfigsNewResponse.class)
            .withName("BatchConfirmConfigsNew")
            .withUri("/v2/{project_id}/edge-nodes/{node_id}/ias/{ia_id}/configs/batch-confirm")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getNodeId, BatchConfirmConfigsNewRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getIaId, BatchConfirmConfigsNewRequest::setIaId));
        builder.<ConfirmIaConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfirmIaConfigsRequestBody.class),
            f -> f.withMarshaller(BatchConfirmConfigsNewRequest::getBody, BatchConfirmConfigsNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportConfigsRequest, BatchImportConfigsResponse> batchImportConfigs =
        genForBatchImportConfigs();

    private static HttpRequestDef<BatchImportConfigsRequest, BatchImportConfigsResponse> genForBatchImportConfigs() {
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
            f -> f.withMarshaller(BatchImportConfigsRequest::getNodeId, BatchImportConfigsRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchImportConfigsRequest::getIaId, BatchImportConfigsRequest::setIaId));
        builder.<BatchImportConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchImportConfigsRequestBody.class),
            f -> f.withMarshaller(BatchImportConfigsRequest::getBody, BatchImportConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIaConfigRequest, DeleteIaConfigResponse> deleteIaConfig =
        genForDeleteIaConfig();

    private static HttpRequestDef<DeleteIaConfigRequest, DeleteIaConfigResponse> genForDeleteIaConfig() {
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
            f -> f.withMarshaller(DeleteIaConfigRequest::getNodeId, DeleteIaConfigRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIaConfigRequest::getIaId, DeleteIaConfigRequest::setIaId));
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIaConfigRequest::getConfigId, DeleteIaConfigRequest::setConfigId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIaConfigResponse::getBody, DeleteIaConfigResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListIaConfigsRequest, ListIaConfigsResponse> listIaConfigs =
        genForListIaConfigs();

    private static HttpRequestDef<ListIaConfigsRequest, ListIaConfigsResponse> genForListIaConfigs() {
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
            f -> f.withMarshaller(ListIaConfigsRequest::getNodeId, ListIaConfigsRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getIaId, ListIaConfigsRequest::setIaId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getOffset, ListIaConfigsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIaConfigsRequest::getLimit, ListIaConfigsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIaConfigRequest, ShowIaConfigResponse> showIaConfig = genForShowIaConfig();

    private static HttpRequestDef<ShowIaConfigRequest, ShowIaConfigResponse> genForShowIaConfig() {
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
            f -> f.withMarshaller(ShowIaConfigRequest::getNodeId, ShowIaConfigRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIaConfigRequest::getIaId, ShowIaConfigRequest::setIaId));
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIaConfigRequest::getConfigId, ShowIaConfigRequest::setConfigId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIaConfigRequest, UpdateIaConfigResponse> updateIaConfig =
        genForUpdateIaConfig();

    private static HttpRequestDef<UpdateIaConfigRequest, UpdateIaConfigResponse> genForUpdateIaConfig() {
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
            f -> f.withMarshaller(UpdateIaConfigRequest::getNodeId, UpdateIaConfigRequest::setNodeId));
        builder.<String>withRequestField("ia_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getIaId, UpdateIaConfigRequest::setIaId));
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getConfigId, UpdateIaConfigRequest::setConfigId));
        builder.<UpdateIaConfigRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIaConfigRequestDTO.class),
            f -> f.withMarshaller(UpdateIaConfigRequest::getBody, UpdateIaConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> batchAssociateNaToNodes =
        genForBatchAssociateNaToNodes();

    private static HttpRequestDef<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> genForBatchAssociateNaToNodes() {
        // basic
        HttpRequestDef.Builder<BatchAssociateNaToNodesRequest, BatchAssociateNaToNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateNaToNodesRequest.class, BatchAssociateNaToNodesResponse.class)
            .withName("BatchAssociateNaToNodes")
            .withUri("/v2/{project_id}/nas/{na_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getNaId, BatchAssociateNaToNodesRequest::setNaId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getAction,
                BatchAssociateNaToNodesRequest::setAction));
        builder.<AuthorizeNa2NodesRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeNa2NodesRequestDTO.class),
            f -> f.withMarshaller(BatchAssociateNaToNodesRequest::getBody, BatchAssociateNaToNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNaRequest, DeleteNaResponse> deleteNa = genForDeleteNa();

    private static HttpRequestDef<DeleteNaRequest, DeleteNaResponse> genForDeleteNa() {
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
            f -> f.withMarshaller(DeleteNaRequest::getNaId, DeleteNaRequest::setNaId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNaResponse::getBody, DeleteNaResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> listNaAuthorizedNodes =
        genForListNaAuthorizedNodes();

    private static HttpRequestDef<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> genForListNaAuthorizedNodes() {
        // basic
        HttpRequestDef.Builder<ListNaAuthorizedNodesRequest, ListNaAuthorizedNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNaAuthorizedNodesRequest.class, ListNaAuthorizedNodesResponse.class)
            .withName("ListNaAuthorizedNodes")
            .withUri("/v2/{project_id}/nas/{na_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("na_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getNaId, ListNaAuthorizedNodesRequest::setNaId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getOffset, ListNaAuthorizedNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNaAuthorizedNodesRequest::getLimit, ListNaAuthorizedNodesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNasRequest, ListNasResponse> listNas = genForListNas();

    private static HttpRequestDef<ListNasRequest, ListNasResponse> genForListNas() {
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
            f -> f.withMarshaller(ListNasRequest::getName, ListNasRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNasRequest::getOffset, ListNasRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNasRequest::getLimit, ListNasRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNaRequest, ShowNaResponse> showNa = genForShowNa();

    private static HttpRequestDef<ShowNaRequest, ShowNaResponse> genForShowNa() {
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
            f -> f.withMarshaller(ShowNaRequest::getNaId, ShowNaRequest::setNaId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNaRequest, UpdateNaResponse> updateNa = genForUpdateNa();

    private static HttpRequestDef<UpdateNaRequest, UpdateNaResponse> genForUpdateNa() {
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
            f -> f.withMarshaller(UpdateNaRequest::getNaId, UpdateNaRequest::setNaId));
        builder.<UpdateNaRequestDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNaRequestDTO.class),
            f -> f.withMarshaller(UpdateNaRequest::getBody, UpdateNaRequest::setBody));

        // response

        return builder.build();
    }

}

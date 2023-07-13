package com.huaweicloud.sdk.hilens.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hilens.v3.model.ActivateNodeRequestBody;
import com.huaweicloud.sdk.hilens.v3.model.AddDeploymentNodesRequest;
import com.huaweicloud.sdk.hilens.v3.model.AddDeploymentNodesResponse;
import com.huaweicloud.sdk.hilens.v3.model.BatchCreateNodeTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.BatchCreateNodeTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ConfigMapModelBoxDTO;
import com.huaweicloud.sdk.hilens.v3.model.CreateConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateOrderFormRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateOrderFormResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateSkillOrderFrom;
import com.huaweicloud.sdk.hilens.v3.model.CreateTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.CreateWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.CreateWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeletePodRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeletePodResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeleteWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeleteWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.DeploymentAddNodesRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeploymentCreateRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeploymentPatchRequest;
import com.huaweicloud.sdk.hilens.v3.model.DeploymentUpdateRequest;
import com.huaweicloud.sdk.hilens.v3.model.FreezeNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.FreezeNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListConfigMapsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListConfigMapsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListFirmwaresRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListFirmwaresResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListPlatformManagerRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListPlatformManagerResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListSecretsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListSecretsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.hilens.v3.model.ListWorkSpacesRequest;
import com.huaweicloud.sdk.hilens.v3.model.ListWorkSpacesResponse;
import com.huaweicloud.sdk.hilens.v3.model.MultiResourcesMultiTags;
import com.huaweicloud.sdk.hilens.v3.model.NodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.RequestWorkspace;
import com.huaweicloud.sdk.hilens.v3.model.SecretRequestBody;
import com.huaweicloud.sdk.hilens.v3.model.SetDefaultOrderFormRequest;
import com.huaweicloud.sdk.hilens.v3.model.SetDefaultOrderFormResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentPodsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentPodsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowDeploymentsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeActivationRecordsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeActivationRecordsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodesRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowNodesResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowResourceTagsRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowResourceTagsResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillInfoRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillInfoResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillListRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillListResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderInfoRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderInfoResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderListRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowSkillOrderListResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowUpgradeProgressRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowUpgradeProgressResponse;
import com.huaweicloud.sdk.hilens.v3.model.ShowWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.ShowWorkSpaceResponse;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentPodRequest;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentPodResponse;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.StartAndStopDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.SwitchNodeConnectionRequest;
import com.huaweicloud.sdk.hilens.v3.model.SwitchNodeConnectionResponse;
import com.huaweicloud.sdk.hilens.v3.model.TagRequestDetail;
import com.huaweicloud.sdk.hilens.v3.model.TaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.UnfreezeNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.UnfreezeNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateConfigMapRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateConfigMapResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentUsingPatchRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDeploymentUsingPatchResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateDescription;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeCertRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeCertResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeFirmwareRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeFirmwareResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeRequestBody;
import com.huaweicloud.sdk.hilens.v3.model.UpdateNodeResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateSecretRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateSecretResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateTaskRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateTaskResponse;
import com.huaweicloud.sdk.hilens.v3.model.UpdateWorkSpaceRequest;
import com.huaweicloud.sdk.hilens.v3.model.UpdateWorkSpaceResponse;

@SuppressWarnings("unchecked")
public class HiLensMeta {

    public static final HttpRequestDef<AddDeploymentNodesRequest, AddDeploymentNodesResponse> addDeploymentNodes =
        genForaddDeploymentNodes();

    private static HttpRequestDef<AddDeploymentNodesRequest, AddDeploymentNodesResponse> genForaddDeploymentNodes() {
        // basic
        HttpRequestDef.Builder<AddDeploymentNodesRequest, AddDeploymentNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddDeploymentNodesRequest.class, AddDeploymentNodesResponse.class)
                .withName("AddDeploymentNodes")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeploymentNodesRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeploymentNodesRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<DeploymentAddNodesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentAddNodesRequest.class),
            f -> f.withMarshaller(AddDeploymentNodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> batchCreateNodeTags =
        genForbatchCreateNodeTags();

    private static HttpRequestDef<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> genForbatchCreateNodeTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateNodeTagsRequest.class, BatchCreateNodeTagsResponse.class)
                .withName("BatchCreateNodeTags")
                .withUri("/v3/{project_id}/tag-mgr/node-tags")
                .withContentType("application/json");

        // requests
        builder.<MultiResourcesMultiTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MultiResourcesMultiTags.class),
            f -> f.withMarshaller(BatchCreateNodeTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMap =
        genForcreateConfigMap();

    private static HttpRequestDef<CreateConfigMapRequest, CreateConfigMapResponse> genForcreateConfigMap() {
        // basic
        HttpRequestDef.Builder<CreateConfigMapRequest, CreateConfigMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigMapRequest.class, CreateConfigMapResponse.class)
                .withName("CreateConfigMap")
                .withUri("/v3/{project_id}/ai-mgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<ConfigMapModelBoxDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMapModelBoxDTO.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> createDeployment =
        genForcreateDeployment();

    private static HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> genForcreateDeployment() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentRequest, CreateDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentRequest.class, CreateDeploymentResponse.class)
                .withName("CreateDeployment")
                .withUri("/v3/{project_id}/ai-mgr/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getXExpiredTime, (req, v) -> {
                req.setXExpiredTime(v);
            }));
        builder.<DeploymentCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentCreateRequest.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeRequest, CreateNodeResponse> createNode = genForcreateNode();

    private static HttpRequestDef<CreateNodeRequest, CreateNodeResponse> genForcreateNode() {
        // basic
        HttpRequestDef.Builder<CreateNodeRequest, CreateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNodeRequest.class, CreateNodeResponse.class)
                .withName("CreateNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<NodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeRequest.class),
            f -> f.withMarshaller(CreateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderFormRequest, CreateOrderFormResponse> createOrderForm =
        genForcreateOrderForm();

    private static HttpRequestDef<CreateOrderFormRequest, CreateOrderFormResponse> genForcreateOrderForm() {
        // basic
        HttpRequestDef.Builder<CreateOrderFormRequest, CreateOrderFormResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrderFormRequest.class, CreateOrderFormResponse.class)
                .withName("CreateOrderForm")
                .withUri("/v1/{project_id}/skill-market/skill-order")
                .withContentType("application/json");

        // requests
        builder.<CreateSkillOrderFrom>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSkillOrderFrom.class),
            f -> f.withMarshaller(CreateOrderFormRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTags =
        genForcreateResourceTags();

    private static HttpRequestDef<CreateResourceTagsRequest, CreateResourceTagsResponse> genForcreateResourceTags() {
        // basic
        HttpRequestDef.Builder<CreateResourceTagsRequest, CreateResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceTagsRequest.class, CreateResourceTagsResponse.class)
                .withName("CreateResourceTags")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<TagRequestDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagRequestDetail.class),
            f -> f.withMarshaller(CreateResourceTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForcreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForcreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v3/{project_id}/ai-mgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<SecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecretRequestBody.class),
            f -> f.withMarshaller(CreateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForcreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForcreateTask() {
        // basic
        HttpRequestDef.Builder<CreateTaskRequest, CreateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTaskRequest.class, CreateTaskResponse.class)
                .withName("CreateTask")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTaskRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<TaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskRequest.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkSpaceRequest, CreateWorkSpaceResponse> createWorkSpace =
        genForcreateWorkSpace();

    private static HttpRequestDef<CreateWorkSpaceRequest, CreateWorkSpaceResponse> genForcreateWorkSpace() {
        // basic
        HttpRequestDef.Builder<CreateWorkSpaceRequest, CreateWorkSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkSpaceRequest.class, CreateWorkSpaceResponse.class)
                .withName("CreateWorkSpace")
                .withUri("/v3/{project_id}/ai-mgr/workspaces")
                .withContentType("application/json");

        // requests
        builder.<RequestWorkspace>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RequestWorkspace.class),
            f -> f.withMarshaller(CreateWorkSpaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMap =
        genFordeleteConfigMap();

    private static HttpRequestDef<DeleteConfigMapRequest, DeleteConfigMapResponse> genFordeleteConfigMap() {
        // basic
        HttpRequestDef.Builder<DeleteConfigMapRequest, DeleteConfigMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigMapRequest.class, DeleteConfigMapResponse.class)
                .withName("DeleteConfigMap")
                .withUri("/v3/{project_id}/ai-mgr/configmaps/{config_map_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_map_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigMapRequest::getConfigMapId, (req, v) -> {
                req.setConfigMapId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeployment =
        genFordeleteDeployment();

    private static HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> genFordeleteDeployment() {
        // basic
        HttpRequestDef.Builder<DeleteDeploymentRequest, DeleteDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeploymentRequest.class, DeleteDeploymentResponse.class)
                .withName("DeleteDeployment")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getForceDelete, (req, v) -> {
                req.setForceDelete(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getXExpiredTime, (req, v) -> {
                req.setXExpiredTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genFordeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genFordeleteNode() {
        // basic
        HttpRequestDef.Builder<DeleteNodeRequest, DeleteNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNodeRequest.class, DeleteNodeResponse.class)
                .withName("DeleteNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteNodeRequest::getForceDelete, (req, v) -> {
                req.setForceDelete(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePodRequest, DeletePodResponse> deletePod = genFordeletePod();

    private static HttpRequestDef<DeletePodRequest, DeletePodResponse> genFordeletePod() {
        // basic
        HttpRequestDef.Builder<DeletePodRequest, DeletePodResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePodRequest.class, DeletePodResponse.class)
                .withName("DeletePod")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/{pod_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePodRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("pod_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePodRequest::getPodId, (req, v) -> {
                req.setPodId(v);
            }));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePodRequest::getForceDelete, (req, v) -> {
                req.setForceDelete(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genFordeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genFordeleteResourceTag() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagRequest, DeleteResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceTagRequest.class, DeleteResourceTagResponse.class)
                .withName("DeleteResourceTag")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> deleteSecret = genFordeleteSecret();

    private static HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> genFordeleteSecret() {
        // basic
        HttpRequestDef.Builder<DeleteSecretRequest, DeleteSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretRequest.class, DeleteSecretResponse.class)
                .withName("DeleteSecret")
                .withUri("/v3/{project_id}/ai-mgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genFordeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genFordeleteTask() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRequest, DeleteTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRequest.class, DeleteTaskResponse.class)
                .withName("DeleteTask")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> deleteWorkSpace =
        genFordeleteWorkSpace();

    private static HttpRequestDef<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> genFordeleteWorkSpace() {
        // basic
        HttpRequestDef.Builder<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWorkSpaceRequest.class, DeleteWorkSpaceResponse.class)
                .withName("DeleteWorkSpace")
                .withUri("/v3/{project_id}/ai-mgr/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkSpaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezeNodeRequest, FreezeNodeResponse> freezeNode = genForfreezeNode();

    private static HttpRequestDef<FreezeNodeRequest, FreezeNodeResponse> genForfreezeNode() {
        // basic
        HttpRequestDef.Builder<FreezeNodeRequest, FreezeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezeNodeRequest.class, FreezeNodeResponse.class)
                .withName("FreezeNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}/deactivate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezeNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMaps =
        genForlistConfigMaps();

    private static HttpRequestDef<ListConfigMapsRequest, ListConfigMapsResponse> genForlistConfigMaps() {
        // basic
        HttpRequestDef.Builder<ListConfigMapsRequest, ListConfigMapsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigMapsRequest.class, ListConfigMapsResponse.class)
                .withName("ListConfigMaps")
                .withUri("/v3/{project_id}/ai-mgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getTagKey, (req, v) -> {
                req.setTagKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirmwaresRequest, ListFirmwaresResponse> listFirmwares =
        genForlistFirmwares();

    private static HttpRequestDef<ListFirmwaresRequest, ListFirmwaresResponse> genForlistFirmwares() {
        // basic
        HttpRequestDef.Builder<ListFirmwaresRequest, ListFirmwaresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFirmwaresRequest.class, ListFirmwaresResponse.class)
                .withName("ListFirmwares")
                .withUri("/v3/ai-mgr/firmwares")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getDeviceType, (req, v) -> {
                req.setDeviceType(v);
            }));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getArch, (req, v) -> {
                req.setArch(v);
            }));
        builder.<String>withRequestField("os_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOsName, (req, v) -> {
                req.setOsName(v);
            }));
        builder.<String>withRequestField("os_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOsVersion, (req, v) -> {
                req.setOsVersion(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPlatformManagerRequest, ListPlatformManagerResponse> listPlatformManager =
        genForlistPlatformManager();

    private static HttpRequestDef<ListPlatformManagerRequest, ListPlatformManagerResponse> genForlistPlatformManager() {
        // basic
        HttpRequestDef.Builder<ListPlatformManagerRequest, ListPlatformManagerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlatformManagerRequest.class, ListPlatformManagerResponse.class)
                .withName("ListPlatformManager")
                .withUri("/v1/{project_id}/platform-manager/orders")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("device_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getDeviceType, (req, v) -> {
                req.setDeviceType(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForlistResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForlistResourceTags() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsRequest, ListResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsRequest.class, ListResourceTagsResponse.class)
                .withName("ListResourceTags")
                .withUri("/v3/{project_id}/tag-mgr/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretsRequest, ListSecretsResponse> listSecrets = genForlistSecrets();

    private static HttpRequestDef<ListSecretsRequest, ListSecretsResponse> genForlistSecrets() {
        // basic
        HttpRequestDef.Builder<ListSecretsRequest, ListSecretsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretsRequest.class, ListSecretsResponse.class)
                .withName("ListSecrets")
                .withUri("/v3/{project_id}/ai-mgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecretsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecretsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForlistTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForlistTasks() {
        // basic
        HttpRequestDef.Builder<ListTasksRequest, ListTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksRequest.class, ListTasksResponse.class)
                .withName("ListTasks")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkSpacesRequest, ListWorkSpacesResponse> listWorkSpaces =
        genForlistWorkSpaces();

    private static HttpRequestDef<ListWorkSpacesRequest, ListWorkSpacesResponse> genForlistWorkSpaces() {
        // basic
        HttpRequestDef.Builder<ListWorkSpacesRequest, ListWorkSpacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkSpacesRequest.class, ListWorkSpacesResponse.class)
                .withName("ListWorkSpaces")
                .withUri("/v3/{project_id}/ai-mgr/workspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("iam_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkSpacesRequest::getIamUserId, (req, v) -> {
                req.setIamUserId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkSpacesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkSpacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> setDefaultOrderForm =
        genForsetDefaultOrderForm();

    private static HttpRequestDef<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> genForsetDefaultOrderForm() {
        // basic
        HttpRequestDef.Builder<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetDefaultOrderFormRequest.class, SetDefaultOrderFormResponse.class)
                .withName("SetDefaultOrderForm")
                .withUri("/v1/{project_id}/skill-market/skill-order/{order_id}/default")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaultOrderFormRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMap =
        genForshowConfigMap();

    private static HttpRequestDef<ShowConfigMapRequest, ShowConfigMapResponse> genForshowConfigMap() {
        // basic
        HttpRequestDef.Builder<ShowConfigMapRequest, ShowConfigMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigMapRequest.class, ShowConfigMapResponse.class)
                .withName("ShowConfigMap")
                .withUri("/v3/{project_id}/ai-mgr/configmaps/{config_map_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_map_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigMapRequest::getConfigMapId, (req, v) -> {
                req.setConfigMapId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentRequest, ShowDeploymentResponse> showDeployment =
        genForshowDeployment();

    private static HttpRequestDef<ShowDeploymentRequest, ShowDeploymentResponse> genForshowDeployment() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentRequest, ShowDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentRequest.class, ShowDeploymentResponse.class)
                .withName("ShowDeployment")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> showDeploymentPods =
        genForshowDeploymentPods();

    private static HttpRequestDef<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> genForshowDeploymentPods() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentPodsRequest.class, ShowDeploymentPodsResponse.class)
                .withName("ShowDeploymentPods")
                .withUri("/v3/{project_id}/ai-mgr/pods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentsRequest, ShowDeploymentsResponse> showDeployments =
        genForshowDeployments();

    private static HttpRequestDef<ShowDeploymentsRequest, ShowDeploymentsResponse> genForshowDeployments() {
        // basic
        HttpRequestDef.Builder<ShowDeploymentsRequest, ShowDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeploymentsRequest.class, ShowDeploymentsResponse.class)
                .withName("ShowDeployments")
                .withUri("/v3/{project_id}/ai-mgr/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForshowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForshowNode() {
        // basic
        HttpRequestDef.Builder<ShowNodeRequest, ShowNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodeRequest.class, ShowNodeResponse.class)
                .withName("ShowNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> showNodeActivationRecords =
        genForshowNodeActivationRecords();

    private static HttpRequestDef<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> genForshowNodeActivationRecords() {
        // basic
        HttpRequestDef.Builder<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowNodeActivationRecordsRequest.class,
                    ShowNodeActivationRecordsResponse.class)
                .withName("ShowNodeActivationRecords")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}/activation/records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodesRequest, ShowNodesResponse> showNodes = genForshowNodes();

    private static HttpRequestDef<ShowNodesRequest, ShowNodesResponse> genForshowNodes() {
        // basic
        HttpRequestDef.Builder<ShowNodesRequest, ShowNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNodesRequest.class, ShowNodesResponse.class)
                .withName("ShowNodes")
                .withUri("/v3/{project_id}/ai-mgr/nodes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getClusterId, (req, v) -> {
                req.setClusterId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("active_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getActiveStatus, (req, v) -> {
                req.setActiveStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTags =
        genForshowResourceTags();

    private static HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> genForshowResourceTags() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagsRequest, ShowResourceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagsRequest.class, ShowResourceTagsResponse.class)
                .withName("ShowResourceTags")
                .withUri("/v3/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretRequest, ShowSecretResponse> showSecret = genForshowSecret();

    private static HttpRequestDef<ShowSecretRequest, ShowSecretResponse> genForshowSecret() {
        // basic
        HttpRequestDef.Builder<ShowSecretRequest, ShowSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretRequest.class, ShowSecretResponse.class)
                .withName("ShowSecret")
                .withUri("/v3/{project_id}/ai-mgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillInfoRequest, ShowSkillInfoResponse> showSkillInfo =
        genForshowSkillInfo();

    private static HttpRequestDef<ShowSkillInfoRequest, ShowSkillInfoResponse> genForshowSkillInfo() {
        // basic
        HttpRequestDef.Builder<ShowSkillInfoRequest, ShowSkillInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSkillInfoRequest.class, ShowSkillInfoResponse.class)
                .withName("ShowSkillInfo")
                .withUri("/v1/skill-market/skills/{skill_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("skill_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillInfoRequest::getSkillId, (req, v) -> {
                req.setSkillId(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillInfoRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillInfoRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSkillInfoResponse::getXRequestId, ShowSkillInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillListRequest, ShowSkillListResponse> showSkillList =
        genForshowSkillList();

    private static HttpRequestDef<ShowSkillListRequest, ShowSkillListResponse> genForshowSkillList() {
        // basic
        HttpRequestDef.Builder<ShowSkillListRequest, ShowSkillListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSkillListRequest.class, ShowSkillListResponse.class)
                .withName("ShowSkillList")
                .withUri("/v1/skill-market/skills")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("skill_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getSkillName, (req, v) -> {
                req.setSkillName(v);
            }));
        builder.<String>withRequestField("skill_form",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getSkillForm, (req, v) -> {
                req.setSkillForm(v);
            }));
        builder.<String>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getPermission, (req, v) -> {
                req.setPermission(v);
            }));
        builder.<String>withRequestField("template_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getTemplateSource, (req, v) -> {
                req.setTemplateSource(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("charge_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChargeModel, (req, v) -> {
                req.setChargeModel(v);
            }));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getPlatform, (req, v) -> {
                req.setPlatform(v);
            }));
        builder.<String>withRequestField("chip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChip, (req, v) -> {
                req.setChip(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("charge_models",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChargeModels, (req, v) -> {
                req.setChargeModels(v);
            }));
        builder.<String>withRequestField("device_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getDeviceTypes, (req, v) -> {
                req.setDeviceTypes(v);
            }));
        builder.<String>withRequestField("scenes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getScenes, (req, v) -> {
                req.setScenes(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> showSkillOrderInfo =
        genForshowSkillOrderInfo();

    private static HttpRequestDef<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> genForshowSkillOrderInfo() {
        // basic
        HttpRequestDef.Builder<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSkillOrderInfoRequest.class, ShowSkillOrderInfoResponse.class)
                .withName("ShowSkillOrderInfo")
                .withUri("/v1/{project_id}/skill-market/skill-order/{order_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("order_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillOrderInfoRequest::getOrderId, (req, v) -> {
                req.setOrderId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillOrderListRequest, ShowSkillOrderListResponse> showSkillOrderList =
        genForshowSkillOrderList();

    private static HttpRequestDef<ShowSkillOrderListRequest, ShowSkillOrderListResponse> genForshowSkillOrderList() {
        // basic
        HttpRequestDef.Builder<ShowSkillOrderListRequest, ShowSkillOrderListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSkillOrderListRequest.class, ShowSkillOrderListResponse.class)
                .withName("ShowSkillOrderList")
                .withUri("/v1/{project_id}/skill-market/skill-order")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("skill_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getSkillName, (req, v) -> {
                req.setSkillName(v);
            }));
        builder.<String>withRequestField("skill_form",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getSkillForm, (req, v) -> {
                req.setSkillForm(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForshowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForshowTask() {
        // basic
        HttpRequestDef.Builder<ShowTaskRequest, ShowTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTaskRequest.class, ShowTaskResponse.class)
                .withName("ShowTask")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/tasks/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> showUpgradeProgress =
        genForshowUpgradeProgress();

    private static HttpRequestDef<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> genForshowUpgradeProgress() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUpgradeProgressRequest.class, ShowUpgradeProgressResponse.class)
                .withName("ShowUpgradeProgress")
                .withUri("/v3/{project_id}/node-manager/node/{node_id}/firmware/upgrade-progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpace =
        genForshowWorkSpace();

    private static HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> genForshowWorkSpace() {
        // basic
        HttpRequestDef.Builder<ShowWorkSpaceRequest, ShowWorkSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWorkSpaceRequest.class, ShowWorkSpaceResponse.class)
                .withName("ShowWorkSpace")
                .withUri("/v3/{project_id}/ai-mgr/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWorkSpaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> startAndStopDeployment =
        genForstartAndStopDeployment();

    private static HttpRequestDef<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> genForstartAndStopDeployment() {
        // basic
        HttpRequestDef.Builder<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartAndStopDeploymentRequest.class, StartAndStopDeploymentResponse.class)
            .withName("StartAndStopDeployment")
            .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/action/{action}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> startAndStopDeploymentPod =
        genForstartAndStopDeploymentPod();

    private static HttpRequestDef<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> genForstartAndStopDeploymentPod() {
        // basic
        HttpRequestDef.Builder<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartAndStopDeploymentPodRequest.class,
                    StartAndStopDeploymentPodResponse.class)
                .withName("StartAndStopDeploymentPod")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/{pod_id}/action/{action}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("pod_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getPodId, (req, v) -> {
                req.setPodId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> switchNodeConnection =
        genForswitchNodeConnection();

    private static HttpRequestDef<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> genForswitchNodeConnection() {
        // basic
        HttpRequestDef.Builder<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SwitchNodeConnectionRequest.class, SwitchNodeConnectionResponse.class)
            .withName("SwitchNodeConnection")
            .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}/action/{action}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeNodeRequest, UnfreezeNodeResponse> unfreezeNode = genForunfreezeNode();

    private static HttpRequestDef<UnfreezeNodeRequest, UnfreezeNodeResponse> genForunfreezeNode() {
        // basic
        HttpRequestDef.Builder<UnfreezeNodeRequest, UnfreezeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezeNodeRequest.class, UnfreezeNodeResponse.class)
                .withName("UnfreezeNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}/activate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezeNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ActivateNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActivateNodeRequestBody.class),
            f -> f.withMarshaller(UnfreezeNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMap =
        genForupdateConfigMap();

    private static HttpRequestDef<UpdateConfigMapRequest, UpdateConfigMapResponse> genForupdateConfigMap() {
        // basic
        HttpRequestDef.Builder<UpdateConfigMapRequest, UpdateConfigMapResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigMapRequest.class, UpdateConfigMapResponse.class)
                .withName("UpdateConfigMap")
                .withUri("/v3/{project_id}/ai-mgr/configmaps/{config_map_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_map_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getConfigMapId, (req, v) -> {
                req.setConfigMapId(v);
            }));
        builder.<ConfigMapModelBoxDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMapModelBoxDTO.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeployment =
        genForupdateDeployment();

    private static HttpRequestDef<UpdateDeploymentRequest, UpdateDeploymentResponse> genForupdateDeployment() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentRequest, UpdateDeploymentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeploymentRequest.class, UpdateDeploymentResponse.class)
                .withName("UpdateDeployment")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getProvider, (req, v) -> {
                req.setProvider(v);
            }));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getXExpiredTime, (req, v) -> {
                req.setXExpiredTime(v);
            }));
        builder.<DeploymentUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentUpdateRequest.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> updateDeploymentUsingPatch =
        genForupdateDeploymentUsingPatch();

    private static HttpRequestDef<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> genForupdateDeploymentUsingPatch() {
        // basic
        HttpRequestDef.Builder<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateDeploymentUsingPatchRequest.class,
                    UpdateDeploymentUsingPatchResponse.class)
                .withName("UpdateDeploymentUsingPatch")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentUsingPatchRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<DeploymentPatchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentPatchRequest.class),
            f -> f.withMarshaller(UpdateDeploymentUsingPatchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForupdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForupdateNode() {
        // basic
        HttpRequestDef.Builder<UpdateNodeRequest, UpdateNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeRequest.class, UpdateNodeResponse.class)
                .withName("UpdateNode")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<UpdateNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNodeRequestBody.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeCertRequest, UpdateNodeCertResponse> updateNodeCert =
        genForupdateNodeCert();

    private static HttpRequestDef<UpdateNodeCertRequest, UpdateNodeCertResponse> genForupdateNodeCert() {
        // basic
        HttpRequestDef.Builder<UpdateNodeCertRequest, UpdateNodeCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeCertRequest.class, UpdateNodeCertResponse.class)
                .withName("UpdateNodeCert")
                .withUri("/v3/{project_id}/ai-mgr/nodes/{node_id}/cert")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeCertRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> updateNodeFirmware =
        genForupdateNodeFirmware();

    private static HttpRequestDef<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> genForupdateNodeFirmware() {
        // basic
        HttpRequestDef.Builder<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNodeFirmwareRequest.class, UpdateNodeFirmwareResponse.class)
                .withName("UpdateNodeFirmware")
                .withUri("/v3/{project_id}/node-manager/node/{node_id}/firmware/{firmware_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("firmware_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getFirmwareId, (req, v) -> {
                req.setFirmwareId(v);
            }));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getXExpiredTime, (req, v) -> {
                req.setXExpiredTime(v);
            }));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateNodeFirmwareResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        builder.<String>withResponseField("firmware_name",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNodeFirmwareResponse::getFirmwareName,
                UpdateNodeFirmwareResponse::setFirmwareName));
        builder.<String>withResponseField("firmware_id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateNodeFirmwareResponse::getFirmwareId,
                UpdateNodeFirmwareResponse::setFirmwareId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForupdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForupdateSecret() {
        // basic
        HttpRequestDef.Builder<UpdateSecretRequest, UpdateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecretRequest.class, UpdateSecretResponse.class)
                .withName("UpdateSecret")
                .withUri("/v3/{project_id}/ai-mgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<SecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecretRequestBody.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForupdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForupdateTask() {
        // basic
        HttpRequestDef.Builder<UpdateTaskRequest, UpdateTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTaskRequest.class, UpdateTaskResponse.class)
                .withName("UpdateTask")
                .withUri("/v3/{project_id}/ai-mgr/deployments/{deployment_id}/task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<TaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskRequest.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> updateWorkSpace =
        genForupdateWorkSpace();

    private static HttpRequestDef<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> genForupdateWorkSpace() {
        // basic
        HttpRequestDef.Builder<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWorkSpaceRequest.class, UpdateWorkSpaceResponse.class)
                .withName("UpdateWorkSpace")
                .withUri("/v3/{project_id}/ai-mgr/workspaces/{workspace_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkSpaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<UpdateDescription>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDescription.class),
            f -> f.withMarshaller(UpdateWorkSpaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

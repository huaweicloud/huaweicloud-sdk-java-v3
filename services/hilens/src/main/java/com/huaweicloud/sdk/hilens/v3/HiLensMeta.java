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
        genForAddDeploymentNodes();

    private static HttpRequestDef<AddDeploymentNodesRequest, AddDeploymentNodesResponse> genForAddDeploymentNodes() {
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
            f -> f.withMarshaller(AddDeploymentNodesRequest::getDeploymentId,
                AddDeploymentNodesRequest::setDeploymentId));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDeploymentNodesRequest::getProvider, AddDeploymentNodesRequest::setProvider));
        builder.<DeploymentAddNodesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentAddNodesRequest.class),
            f -> f.withMarshaller(AddDeploymentNodesRequest::getBody, AddDeploymentNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> batchCreateNodeTags =
        genForBatchCreateNodeTags();

    private static HttpRequestDef<BatchCreateNodeTagsRequest, BatchCreateNodeTagsResponse> genForBatchCreateNodeTags() {
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
            f -> f.withMarshaller(BatchCreateNodeTagsRequest::getBody, BatchCreateNodeTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigMapRequest, CreateConfigMapResponse> createConfigMap =
        genForCreateConfigMap();

    private static HttpRequestDef<CreateConfigMapRequest, CreateConfigMapResponse> genForCreateConfigMap() {
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
            f -> f.withMarshaller(CreateConfigMapRequest::getProvider, CreateConfigMapRequest::setProvider));
        builder.<ConfigMapModelBoxDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMapModelBoxDTO.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getBody, CreateConfigMapRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> createDeployment =
        genForCreateDeployment();

    private static HttpRequestDef<CreateDeploymentRequest, CreateDeploymentResponse> genForCreateDeployment() {
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
            f -> f.withMarshaller(CreateDeploymentRequest::getProvider, CreateDeploymentRequest::setProvider));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getXExpiredTime, CreateDeploymentRequest::setXExpiredTime));
        builder.<DeploymentCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentCreateRequest.class),
            f -> f.withMarshaller(CreateDeploymentRequest::getBody, CreateDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeRequest, CreateNodeResponse> createNode = genForCreateNode();

    private static HttpRequestDef<CreateNodeRequest, CreateNodeResponse> genForCreateNode() {
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
            f -> f.withMarshaller(CreateNodeRequest::getProvider, CreateNodeRequest::setProvider));
        builder.<NodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeRequest.class),
            f -> f.withMarshaller(CreateNodeRequest::getBody, CreateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrderFormRequest, CreateOrderFormResponse> createOrderForm =
        genForCreateOrderForm();

    private static HttpRequestDef<CreateOrderFormRequest, CreateOrderFormResponse> genForCreateOrderForm() {
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
            f -> f.withMarshaller(CreateOrderFormRequest::getBody, CreateOrderFormRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceTagsRequest, CreateResourceTagsResponse> createResourceTags =
        genForCreateResourceTags();

    private static HttpRequestDef<CreateResourceTagsRequest, CreateResourceTagsResponse> genForCreateResourceTags() {
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
            f -> f.withMarshaller(CreateResourceTagsRequest::getResourceId, CreateResourceTagsRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResourceTagsRequest::getResourceType,
                CreateResourceTagsRequest::setResourceType));
        builder.<TagRequestDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagRequestDetail.class),
            f -> f.withMarshaller(CreateResourceTagsRequest::getBody, CreateResourceTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForCreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForCreateSecret() {
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
            f -> f.withMarshaller(CreateSecretRequest::getProvider, CreateSecretRequest::setProvider));
        builder.<SecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecretRequestBody.class),
            f -> f.withMarshaller(CreateSecretRequest::getBody, CreateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTaskRequest, CreateTaskResponse> createTask = genForCreateTask();

    private static HttpRequestDef<CreateTaskRequest, CreateTaskResponse> genForCreateTask() {
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
            f -> f.withMarshaller(CreateTaskRequest::getDeploymentId, CreateTaskRequest::setDeploymentId));
        builder.<TaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskRequest.class),
            f -> f.withMarshaller(CreateTaskRequest::getBody, CreateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkSpaceRequest, CreateWorkSpaceResponse> createWorkSpace =
        genForCreateWorkSpace();

    private static HttpRequestDef<CreateWorkSpaceRequest, CreateWorkSpaceResponse> genForCreateWorkSpace() {
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
            f -> f.withMarshaller(CreateWorkSpaceRequest::getBody, CreateWorkSpaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigMapRequest, DeleteConfigMapResponse> deleteConfigMap =
        genForDeleteConfigMap();

    private static HttpRequestDef<DeleteConfigMapRequest, DeleteConfigMapResponse> genForDeleteConfigMap() {
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
            f -> f.withMarshaller(DeleteConfigMapRequest::getConfigMapId, DeleteConfigMapRequest::setConfigMapId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> deleteDeployment =
        genForDeleteDeployment();

    private static HttpRequestDef<DeleteDeploymentRequest, DeleteDeploymentResponse> genForDeleteDeployment() {
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
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, DeleteDeploymentRequest::setDeploymentId));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getForceDelete, DeleteDeploymentRequest::setForceDelete));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getProvider, DeleteDeploymentRequest::setProvider));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getXExpiredTime, DeleteDeploymentRequest::setXExpiredTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> deleteNode = genForDeleteNode();

    private static HttpRequestDef<DeleteNodeRequest, DeleteNodeResponse> genForDeleteNode() {
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
            f -> f.withMarshaller(DeleteNodeRequest::getNodeId, DeleteNodeRequest::setNodeId));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteNodeRequest::getForceDelete, DeleteNodeRequest::setForceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePodRequest, DeletePodResponse> deletePod = genForDeletePod();

    private static HttpRequestDef<DeletePodRequest, DeletePodResponse> genForDeletePod() {
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
            f -> f.withMarshaller(DeletePodRequest::getDeploymentId, DeletePodRequest::setDeploymentId));
        builder.<String>withRequestField("pod_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePodRequest::getPodId, DeletePodRequest::setPodId));
        builder.<Boolean>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePodRequest::getForceDelete, DeletePodRequest::setForceDelete));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTag =
        genForDeleteResourceTag();

    private static HttpRequestDef<DeleteResourceTagRequest, DeleteResourceTagResponse> genForDeleteResourceTag() {
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
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> deleteSecret = genForDeleteSecret();

    private static HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> genForDeleteSecret() {
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
            f -> f.withMarshaller(DeleteSecretRequest::getSecretId, DeleteSecretRequest::setSecretId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> deleteTask = genForDeleteTask();

    private static HttpRequestDef<DeleteTaskRequest, DeleteTaskResponse> genForDeleteTask() {
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
            f -> f.withMarshaller(DeleteTaskRequest::getDeploymentId, DeleteTaskRequest::setDeploymentId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRequest::getTaskId, DeleteTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> deleteWorkSpace =
        genForDeleteWorkSpace();

    private static HttpRequestDef<DeleteWorkSpaceRequest, DeleteWorkSpaceResponse> genForDeleteWorkSpace() {
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
            f -> f.withMarshaller(DeleteWorkSpaceRequest::getWorkspaceId, DeleteWorkSpaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezeNodeRequest, FreezeNodeResponse> freezeNode = genForFreezeNode();

    private static HttpRequestDef<FreezeNodeRequest, FreezeNodeResponse> genForFreezeNode() {
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
            f -> f.withMarshaller(FreezeNodeRequest::getNodeId, FreezeNodeRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigMapsRequest, ListConfigMapsResponse> listConfigMaps =
        genForListConfigMaps();

    private static HttpRequestDef<ListConfigMapsRequest, ListConfigMapsResponse> genForListConfigMaps() {
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
            f -> f.withMarshaller(ListConfigMapsRequest::getProvider, ListConfigMapsRequest::setProvider));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getName, ListConfigMapsRequest::setName));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getWorkspaceId, ListConfigMapsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getLimit, ListConfigMapsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getOffset, ListConfigMapsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getSort, ListConfigMapsRequest::setSort));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getTagKey, ListConfigMapsRequest::setTagKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFirmwaresRequest, ListFirmwaresResponse> listFirmwares =
        genForListFirmwares();

    private static HttpRequestDef<ListFirmwaresRequest, ListFirmwaresResponse> genForListFirmwares() {
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
            f -> f.withMarshaller(ListFirmwaresRequest::getDeviceType, ListFirmwaresRequest::setDeviceType));
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getArch, ListFirmwaresRequest::setArch));
        builder.<String>withRequestField("os_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOsName, ListFirmwaresRequest::setOsName));
        builder.<String>withRequestField("os_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOsVersion, ListFirmwaresRequest::setOsVersion));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getOffset, ListFirmwaresRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFirmwaresRequest::getLimit, ListFirmwaresRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPlatformManagerRequest, ListPlatformManagerResponse> listPlatformManager =
        genForListPlatformManager();

    private static HttpRequestDef<ListPlatformManagerRequest, ListPlatformManagerResponse> genForListPlatformManager() {
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
            f -> f.withMarshaller(ListPlatformManagerRequest::getId, ListPlatformManagerRequest::setId));
        builder.<String>withRequestField("device_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getDeviceType,
                ListPlatformManagerRequest::setDeviceType));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getType, ListPlatformManagerRequest::setType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getOffset, ListPlatformManagerRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlatformManagerRequest::getLimit, ListPlatformManagerRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> listResourceTags =
        genForListResourceTags();

    private static HttpRequestDef<ListResourceTagsRequest, ListResourceTagsResponse> genForListResourceTags() {
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
            f -> f.withMarshaller(ListResourceTagsRequest::getResourceType, ListResourceTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretsRequest, ListSecretsResponse> listSecrets = genForListSecrets();

    private static HttpRequestDef<ListSecretsRequest, ListSecretsResponse> genForListSecrets() {
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
            f -> f.withMarshaller(ListSecretsRequest::getOffset, ListSecretsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecretsRequest::getLimit, ListSecretsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getName, ListSecretsRequest::setName));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getWorkspaceId, ListSecretsRequest::setWorkspaceId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getTags, ListSecretsRequest::setTags));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getProvider, ListSecretsRequest::setProvider));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getSort, ListSecretsRequest::setSort));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksRequest, ListTasksResponse> listTasks = genForListTasks();

    private static HttpRequestDef<ListTasksRequest, ListTasksResponse> genForListTasks() {
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
            f -> f.withMarshaller(ListTasksRequest::getDeploymentId, ListTasksRequest::setDeploymentId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getOffset, ListTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksRequest::getLimit, ListTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkSpacesRequest, ListWorkSpacesResponse> listWorkSpaces =
        genForListWorkSpaces();

    private static HttpRequestDef<ListWorkSpacesRequest, ListWorkSpacesResponse> genForListWorkSpaces() {
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
            f -> f.withMarshaller(ListWorkSpacesRequest::getIamUserId, ListWorkSpacesRequest::setIamUserId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkSpacesRequest::getOffset, ListWorkSpacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkSpacesRequest::getLimit, ListWorkSpacesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> setDefaultOrderForm =
        genForSetDefaultOrderForm();

    private static HttpRequestDef<SetDefaultOrderFormRequest, SetDefaultOrderFormResponse> genForSetDefaultOrderForm() {
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
            f -> f.withMarshaller(SetDefaultOrderFormRequest::getOrderId, SetDefaultOrderFormRequest::setOrderId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigMapRequest, ShowConfigMapResponse> showConfigMap =
        genForShowConfigMap();

    private static HttpRequestDef<ShowConfigMapRequest, ShowConfigMapResponse> genForShowConfigMap() {
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
            f -> f.withMarshaller(ShowConfigMapRequest::getConfigMapId, ShowConfigMapRequest::setConfigMapId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentRequest, ShowDeploymentResponse> showDeployment =
        genForShowDeployment();

    private static HttpRequestDef<ShowDeploymentRequest, ShowDeploymentResponse> genForShowDeployment() {
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
            f -> f.withMarshaller(ShowDeploymentRequest::getDeploymentId, ShowDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getProvider, ShowDeploymentRequest::setProvider));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> showDeploymentPods =
        genForShowDeploymentPods();

    private static HttpRequestDef<ShowDeploymentPodsRequest, ShowDeploymentPodsResponse> genForShowDeploymentPods() {
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
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getClusterId, ShowDeploymentPodsRequest::setClusterId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getNodeId, ShowDeploymentPodsRequest::setNodeId));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getProvider, ShowDeploymentPodsRequest::setProvider));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getDeploymentId,
                ShowDeploymentPodsRequest::setDeploymentId));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getWorkspaceId,
                ShowDeploymentPodsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getOffset, ShowDeploymentPodsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentPodsRequest::getLimit, ShowDeploymentPodsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeploymentsRequest, ShowDeploymentsResponse> showDeployments =
        genForShowDeployments();

    private static HttpRequestDef<ShowDeploymentsRequest, ShowDeploymentsResponse> genForShowDeployments() {
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
            f -> f.withMarshaller(ShowDeploymentsRequest::getClusterId, ShowDeploymentsRequest::setClusterId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getNodeId, ShowDeploymentsRequest::setNodeId));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getProvider, ShowDeploymentsRequest::setProvider));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getName, ShowDeploymentsRequest::setName));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getSort, ShowDeploymentsRequest::setSort));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getLimit, ShowDeploymentsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeploymentsRequest::getOffset, ShowDeploymentsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeRequest, ShowNodeResponse> showNode = genForShowNode();

    private static HttpRequestDef<ShowNodeRequest, ShowNodeResponse> genForShowNode() {
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
            f -> f.withMarshaller(ShowNodeRequest::getNodeId, ShowNodeRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> showNodeActivationRecords =
        genForShowNodeActivationRecords();

    private static HttpRequestDef<ShowNodeActivationRecordsRequest, ShowNodeActivationRecordsResponse> genForShowNodeActivationRecords() {
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
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getNodeId,
                ShowNodeActivationRecordsRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getOffset,
                ShowNodeActivationRecordsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodeActivationRecordsRequest::getLimit,
                ShowNodeActivationRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodesRequest, ShowNodesResponse> showNodes = genForShowNodes();

    private static HttpRequestDef<ShowNodesRequest, ShowNodesResponse> genForShowNodes() {
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
            f -> f.withMarshaller(ShowNodesRequest::getOffset, ShowNodesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowNodesRequest::getLimit, ShowNodesRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getName, ShowNodesRequest::setName));
        builder.<String>withRequestField("workspace_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getWorkspaceId, ShowNodesRequest::setWorkspaceId));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getAppName, ShowNodesRequest::setAppName));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getTags, ShowNodesRequest::setTags));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getProvider, ShowNodesRequest::setProvider));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getClusterId, ShowNodesRequest::setClusterId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getStatus, ShowNodesRequest::setStatus));
        builder.<String>withRequestField("active_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesRequest::getActiveStatus, ShowNodesRequest::setActiveStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> showResourceTags =
        genForShowResourceTags();

    private static HttpRequestDef<ShowResourceTagsRequest, ShowResourceTagsResponse> genForShowResourceTags() {
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
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceId, ShowResourceTagsRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagsRequest::getResourceType, ShowResourceTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretRequest, ShowSecretResponse> showSecret = genForShowSecret();

    private static HttpRequestDef<ShowSecretRequest, ShowSecretResponse> genForShowSecret() {
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
            f -> f.withMarshaller(ShowSecretRequest::getSecretId, ShowSecretRequest::setSecretId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillInfoRequest, ShowSkillInfoResponse> showSkillInfo =
        genForShowSkillInfo();

    private static HttpRequestDef<ShowSkillInfoRequest, ShowSkillInfoResponse> genForShowSkillInfo() {
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
            f -> f.withMarshaller(ShowSkillInfoRequest::getSkillId, ShowSkillInfoRequest::setSkillId));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillInfoRequest::getStatus, ShowSkillInfoRequest::setStatus));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillInfoRequest::getVersion, ShowSkillInfoRequest::setVersion));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSkillInfoResponse::getXRequestId, ShowSkillInfoResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillListRequest, ShowSkillListResponse> showSkillList =
        genForShowSkillList();

    private static HttpRequestDef<ShowSkillListRequest, ShowSkillListResponse> genForShowSkillList() {
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
            f -> f.withMarshaller(ShowSkillListRequest::getLimit, ShowSkillListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getOffset, ShowSkillListRequest::setOffset));
        builder.<String>withRequestField("skill_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getSkillName, ShowSkillListRequest::setSkillName));
        builder.<String>withRequestField("skill_form",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getSkillForm, ShowSkillListRequest::setSkillForm));
        builder.<String>withRequestField("permission",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getPermission, ShowSkillListRequest::setPermission));
        builder.<String>withRequestField("template_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getTemplateSource, ShowSkillListRequest::setTemplateSource));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getStatus, ShowSkillListRequest::setStatus));
        builder.<Integer>withRequestField("charge_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChargeModel, ShowSkillListRequest::setChargeModel));
        builder.<String>withRequestField("platform",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getPlatform, ShowSkillListRequest::setPlatform));
        builder.<String>withRequestField("chip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChip, ShowSkillListRequest::setChip));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getType, ShowSkillListRequest::setType));
        builder.<String>withRequestField("charge_models",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getChargeModels, ShowSkillListRequest::setChargeModels));
        builder.<String>withRequestField("device_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getDeviceTypes, ShowSkillListRequest::setDeviceTypes));
        builder.<String>withRequestField("scenes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillListRequest::getScenes, ShowSkillListRequest::setScenes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> showSkillOrderInfo =
        genForShowSkillOrderInfo();

    private static HttpRequestDef<ShowSkillOrderInfoRequest, ShowSkillOrderInfoResponse> genForShowSkillOrderInfo() {
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
            f -> f.withMarshaller(ShowSkillOrderInfoRequest::getOrderId, ShowSkillOrderInfoRequest::setOrderId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSkillOrderListRequest, ShowSkillOrderListResponse> showSkillOrderList =
        genForShowSkillOrderList();

    private static HttpRequestDef<ShowSkillOrderListRequest, ShowSkillOrderListResponse> genForShowSkillOrderList() {
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
            f -> f.withMarshaller(ShowSkillOrderListRequest::getLimit, ShowSkillOrderListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getOffset, ShowSkillOrderListRequest::setOffset));
        builder.<String>withRequestField("skill_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getSkillName, ShowSkillOrderListRequest::setSkillName));
        builder.<String>withRequestField("skill_form",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSkillOrderListRequest::getSkillForm, ShowSkillOrderListRequest::setSkillForm));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTaskRequest, ShowTaskResponse> showTask = genForShowTask();

    private static HttpRequestDef<ShowTaskRequest, ShowTaskResponse> genForShowTask() {
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
            f -> f.withMarshaller(ShowTaskRequest::getDeploymentId, ShowTaskRequest::setDeploymentId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTaskRequest::getTaskId, ShowTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> showUpgradeProgress =
        genForShowUpgradeProgress();

    private static HttpRequestDef<ShowUpgradeProgressRequest, ShowUpgradeProgressResponse> genForShowUpgradeProgress() {
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
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getNodeId, ShowUpgradeProgressRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getOffset, ShowUpgradeProgressRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowUpgradeProgressRequest::getLimit, ShowUpgradeProgressRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> showWorkSpace =
        genForShowWorkSpace();

    private static HttpRequestDef<ShowWorkSpaceRequest, ShowWorkSpaceResponse> genForShowWorkSpace() {
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
            f -> f.withMarshaller(ShowWorkSpaceRequest::getWorkspaceId, ShowWorkSpaceRequest::setWorkspaceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> startAndStopDeployment =
        genForStartAndStopDeployment();

    private static HttpRequestDef<StartAndStopDeploymentRequest, StartAndStopDeploymentResponse> genForStartAndStopDeployment() {
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
            f -> f.withMarshaller(StartAndStopDeploymentRequest::getDeploymentId,
                StartAndStopDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentRequest::getAction, StartAndStopDeploymentRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> startAndStopDeploymentPod =
        genForStartAndStopDeploymentPod();

    private static HttpRequestDef<StartAndStopDeploymentPodRequest, StartAndStopDeploymentPodResponse> genForStartAndStopDeploymentPod() {
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
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getDeploymentId,
                StartAndStopDeploymentPodRequest::setDeploymentId));
        builder.<String>withRequestField("pod_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getPodId,
                StartAndStopDeploymentPodRequest::setPodId));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAndStopDeploymentPodRequest::getAction,
                StartAndStopDeploymentPodRequest::setAction));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> switchNodeConnection =
        genForSwitchNodeConnection();

    private static HttpRequestDef<SwitchNodeConnectionRequest, SwitchNodeConnectionResponse> genForSwitchNodeConnection() {
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
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getNodeId, SwitchNodeConnectionRequest::setNodeId));
        builder.<String>withRequestField("action",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getAction, SwitchNodeConnectionRequest::setAction));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchNodeConnectionRequest::getProvider, SwitchNodeConnectionRequest::setProvider));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezeNodeRequest, UnfreezeNodeResponse> unfreezeNode = genForUnfreezeNode();

    private static HttpRequestDef<UnfreezeNodeRequest, UnfreezeNodeResponse> genForUnfreezeNode() {
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
            f -> f.withMarshaller(UnfreezeNodeRequest::getNodeId, UnfreezeNodeRequest::setNodeId));
        builder.<ActivateNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ActivateNodeRequestBody.class),
            f -> f.withMarshaller(UnfreezeNodeRequest::getBody, UnfreezeNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigMapRequest, UpdateConfigMapResponse> updateConfigMap =
        genForUpdateConfigMap();

    private static HttpRequestDef<UpdateConfigMapRequest, UpdateConfigMapResponse> genForUpdateConfigMap() {
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
            f -> f.withMarshaller(UpdateConfigMapRequest::getConfigMapId, UpdateConfigMapRequest::setConfigMapId));
        builder.<ConfigMapModelBoxDTO>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMapModelBoxDTO.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getBody, UpdateConfigMapRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentRequest, UpdateDeploymentResponse> updateDeployment =
        genForUpdateDeployment();

    private static HttpRequestDef<UpdateDeploymentRequest, UpdateDeploymentResponse> genForUpdateDeployment() {
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
            f -> f.withMarshaller(UpdateDeploymentRequest::getDeploymentId, UpdateDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getProvider, UpdateDeploymentRequest::setProvider));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getXExpiredTime, UpdateDeploymentRequest::setXExpiredTime));
        builder.<DeploymentUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentUpdateRequest.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getBody, UpdateDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> updateDeploymentUsingPatch =
        genForUpdateDeploymentUsingPatch();

    private static HttpRequestDef<UpdateDeploymentUsingPatchRequest, UpdateDeploymentUsingPatchResponse> genForUpdateDeploymentUsingPatch() {
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
            f -> f.withMarshaller(UpdateDeploymentUsingPatchRequest::getDeploymentId,
                UpdateDeploymentUsingPatchRequest::setDeploymentId));
        builder.<DeploymentPatchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeploymentPatchRequest.class),
            f -> f.withMarshaller(UpdateDeploymentUsingPatchRequest::getBody,
                UpdateDeploymentUsingPatchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> updateNode = genForUpdateNode();

    private static HttpRequestDef<UpdateNodeRequest, UpdateNodeResponse> genForUpdateNode() {
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
            f -> f.withMarshaller(UpdateNodeRequest::getNodeId, UpdateNodeRequest::setNodeId));
        builder.<UpdateNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNodeRequestBody.class),
            f -> f.withMarshaller(UpdateNodeRequest::getBody, UpdateNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeCertRequest, UpdateNodeCertResponse> updateNodeCert =
        genForUpdateNodeCert();

    private static HttpRequestDef<UpdateNodeCertRequest, UpdateNodeCertResponse> genForUpdateNodeCert() {
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
            f -> f.withMarshaller(UpdateNodeCertRequest::getNodeId, UpdateNodeCertRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> updateNodeFirmware =
        genForUpdateNodeFirmware();

    private static HttpRequestDef<UpdateNodeFirmwareRequest, UpdateNodeFirmwareResponse> genForUpdateNodeFirmware() {
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
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getNodeId, UpdateNodeFirmwareRequest::setNodeId));
        builder.<String>withRequestField("firmware_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getFirmwareId, UpdateNodeFirmwareRequest::setFirmwareId));
        builder.<Integer>withRequestField("X-Expired-Time",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateNodeFirmwareRequest::getXExpiredTime,
                UpdateNodeFirmwareRequest::setXExpiredTime));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateNodeFirmwareResponse::getBody, UpdateNodeFirmwareResponse::setBody));

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

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForUpdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForUpdateSecret() {
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
            f -> f.withMarshaller(UpdateSecretRequest::getSecretId, UpdateSecretRequest::setSecretId));
        builder.<SecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecretRequestBody.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, UpdateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> updateTask = genForUpdateTask();

    private static HttpRequestDef<UpdateTaskRequest, UpdateTaskResponse> genForUpdateTask() {
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
            f -> f.withMarshaller(UpdateTaskRequest::getDeploymentId, UpdateTaskRequest::setDeploymentId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTaskRequest::getTaskId, UpdateTaskRequest::setTaskId));
        builder.<TaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaskRequest.class),
            f -> f.withMarshaller(UpdateTaskRequest::getBody, UpdateTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> updateWorkSpace =
        genForUpdateWorkSpace();

    private static HttpRequestDef<UpdateWorkSpaceRequest, UpdateWorkSpaceResponse> genForUpdateWorkSpace() {
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
            f -> f.withMarshaller(UpdateWorkSpaceRequest::getWorkspaceId, UpdateWorkSpaceRequest::setWorkspaceId));
        builder.<UpdateDescription>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDescription.class),
            f -> f.withMarshaller(UpdateWorkSpaceRequest::getBody, UpdateWorkSpaceRequest::setBody));

        // response

        return builder.build();
    }

}

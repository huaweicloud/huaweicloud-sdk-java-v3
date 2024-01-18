package com.huaweicloud.sdk.ief.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ief.v1.model.App;
import com.huaweicloud.sdk.ief.v1.model.BachTags;
import com.huaweicloud.sdk.ief.v1.model.BatchAddDeleteTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.BatchAddDeleteTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.BatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.Cert;
import com.huaweicloud.sdk.ief.v1.model.ConfigMaps;
import com.huaweicloud.sdk.ief.v1.model.CreateAppRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateAppResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateAppVersionsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateAppVersionsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeploymentsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeploymentsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupCertRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupCertResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateEndpointRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateEndpointResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateProductRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateProductResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.CreateTagRequest;
import com.huaweicloud.sdk.ief.v1.model.CreateTagRequestBody;
import com.huaweicloud.sdk.ief.v1.model.CreateTagResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppVersionRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteAppVersionResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupCertRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupCertResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteEndPointRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteEndPointResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteProductRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteProductResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.DeleteSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.DeleteSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.Deployment;
import com.huaweicloud.sdk.ief.v1.model.DeviceTemplate;
import com.huaweicloud.sdk.ief.v1.model.DeviceTemplateUpdate;
import com.huaweicloud.sdk.ief.v1.model.Devices;
import com.huaweicloud.sdk.ief.v1.model.EdgeGroupCertListResp;
import com.huaweicloud.sdk.ief.v1.model.EdgeGroupCertRequest;
import com.huaweicloud.sdk.ief.v1.model.EdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.EdgeGroupUpdateRequest;
import com.huaweicloud.sdk.ief.v1.model.EdgeNodeUpdateByDevice;
import com.huaweicloud.sdk.ief.v1.model.EdgemgrDevices;
import com.huaweicloud.sdk.ief.v1.model.EdgemgrDevicesUpdate;
import com.huaweicloud.sdk.ief.v1.model.EnableDisableEdgeNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.EnableDisableEdgeNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.EncryptDataNodeReq;
import com.huaweicloud.sdk.ief.v1.model.EncryptDataReq;
import com.huaweicloud.sdk.ief.v1.model.Endpoint;
import com.huaweicloud.sdk.ief.v1.model.EventCreateReq;
import com.huaweicloud.sdk.ief.v1.model.ListAppVersionsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListAppVersionsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.ListBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.ListConfigMapsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListConfigMapsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDeploymentsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDeploymentsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDeviceTemplatesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDeviceTemplatesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListDevicesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListDevicesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeGroupsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodeCertsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodeCertsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEdgeNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdataNodesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdataNodesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ListEndpointsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListEndpointsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListNodeEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ListNodeEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ListPodsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListPodsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListProductsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListProductsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListResourceByTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListResourceByTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListRuleErrorsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListRuleErrorsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListRulesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListRulesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListSecretsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListSecretsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListServicesRequest;
import com.huaweicloud.sdk.ief.v1.model.ListServicesResponse;
import com.huaweicloud.sdk.ief.v1.model.ListSystemEventsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListSystemEventsResponse;
import com.huaweicloud.sdk.ief.v1.model.ListTagsByResourceTypeRequest;
import com.huaweicloud.sdk.ief.v1.model.ListTagsByResourceTypeResponse;
import com.huaweicloud.sdk.ief.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.ief.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.ief.v1.model.Node;
import com.huaweicloud.sdk.ief.v1.model.NodeAction;
import com.huaweicloud.sdk.ief.v1.model.ProductCreateRequest;
import com.huaweicloud.sdk.ief.v1.model.RestartDeploymentsPodRequest;
import com.huaweicloud.sdk.ief.v1.model.RestartDeploymentsPodResponse;
import com.huaweicloud.sdk.ief.v1.model.RestoreBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.RestoreBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.RetryBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.RetryBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.RuleDetail;
import com.huaweicloud.sdk.ief.v1.model.Secret;
import com.huaweicloud.sdk.ief.v1.model.Service;
import com.huaweicloud.sdk.ief.v1.model.ShowAppDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowAppDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowAppVersionDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowAppVersionDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTemplateRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTemplateResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTwinRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowDeviceTwinResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupCertDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupCertDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeGroupDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeNodeDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEdgeNodeDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowEndPointDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowEndPointDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowProductDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowProductDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowRuleDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowRuleDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowServiceDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowServiceDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.ShowSystemEventDetailRequest;
import com.huaweicloud.sdk.ief.v1.model.ShowSystemEventDetailResponse;
import com.huaweicloud.sdk.ief.v1.model.StartRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.StartRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.StartSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.StartSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.StopBatchJobRequest;
import com.huaweicloud.sdk.ief.v1.model.StopBatchJobResponse;
import com.huaweicloud.sdk.ief.v1.model.StopRuleRequest;
import com.huaweicloud.sdk.ief.v1.model.StopRuleResponse;
import com.huaweicloud.sdk.ief.v1.model.StopSystemEventRequest;
import com.huaweicloud.sdk.ief.v1.model.StopSystemEventResponse;
import com.huaweicloud.sdk.ief.v1.model.Tags;
import com.huaweicloud.sdk.ief.v1.model.TwinUpdateDetail;
import com.huaweicloud.sdk.ief.v1.model.UpdataAppVersionBody;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppBody;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppVersionRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateAppVersionResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateConfigMapRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateConfigMapResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateConfigMaps;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeployment;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeploymentRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeploymentResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTemplateByIdRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTemplateByIdResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTwinRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateDeviceTwinResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupNodeBindingRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupNodeBindingResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeGroupResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeBody;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeDeviceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeDeviceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateEncryptdatasRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateEncryptdatasResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateGroupNodeBindingRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateNodeByDeviceIdRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateNodeByDeviceIdResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateSecret;
import com.huaweicloud.sdk.ief.v1.model.UpdateSecretRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateSecretResponse;
import com.huaweicloud.sdk.ief.v1.model.UpdateServiceRequest;
import com.huaweicloud.sdk.ief.v1.model.UpdateServiceResponse;
import com.huaweicloud.sdk.ief.v1.model.UpgradeEdgeNodeRequest;
import com.huaweicloud.sdk.ief.v1.model.UpgradeEdgeNodeResponse;
import com.huaweicloud.sdk.ief.v1.model.Version;

import java.util.List;

@SuppressWarnings("unchecked")
public class IefMeta {

    public static final HttpRequestDef<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> batchAddDeleteTags =
        genForBatchAddDeleteTags();

    private static HttpRequestDef<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> genForBatchAddDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddDeleteTagsRequest.class, BatchAddDeleteTagsResponse.class)
                .withName("BatchAddDeleteTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getResourceType,
                BatchAddDeleteTagsRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getResourceId, BatchAddDeleteTagsRequest::setResourceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getIefInstanceId,
                BatchAddDeleteTagsRequest::setIefInstanceId));
        builder.<BachTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BachTags.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getBody, BatchAddDeleteTagsRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAddDeleteTagsResponse::getBody, BatchAddDeleteTagsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForCreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForCreateApp() {
        // basic
        HttpRequestDef.Builder<CreateAppRequest, CreateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppRequest.class, CreateAppResponse.class)
                .withName("CreateApp")
                .withUri("/v2/{project_id}/edgemgr/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppRequest::getIefInstanceId, CreateAppRequest::setIefInstanceId));
        builder.<App>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(App.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, CreateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppVersionsRequest, CreateAppVersionsResponse> createAppVersions =
        genForCreateAppVersions();

    private static HttpRequestDef<CreateAppVersionsRequest, CreateAppVersionsResponse> genForCreateAppVersions() {
        // basic
        HttpRequestDef.Builder<CreateAppVersionsRequest, CreateAppVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppVersionsRequest.class, CreateAppVersionsResponse.class)
                .withName("CreateAppVersions")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppVersionsRequest::getAppId, CreateAppVersionsRequest::setAppId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppVersionsRequest::getIefInstanceId,
                CreateAppVersionsRequest::setIefInstanceId));
        builder.<Version>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Version.class),
            f -> f.withMarshaller(CreateAppVersionsRequest::getBody, CreateAppVersionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJob =
        genForCreateBatchJob();

    private static HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> genForCreateBatchJob() {
        // basic
        HttpRequestDef.Builder<CreateBatchJobRequest, CreateBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBatchJobRequest.class, CreateBatchJobResponse.class)
                .withName("CreateBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getIefInstanceId, CreateBatchJobRequest::setIefInstanceId));
        builder.<BatchJobRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchJobRequest.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getBody, CreateBatchJobRequest::setBody));

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
                .withUri("/v2/{project_id}/edgemgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getIefInstanceId, CreateConfigMapRequest::setIefInstanceId));
        builder.<ConfigMaps>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMaps.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getBody, CreateConfigMapRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentsRequest, CreateDeploymentsResponse> createDeployments =
        genForCreateDeployments();

    private static HttpRequestDef<CreateDeploymentsRequest, CreateDeploymentsResponse> genForCreateDeployments() {
        // basic
        HttpRequestDef.Builder<CreateDeploymentsRequest, CreateDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeploymentsRequest.class, CreateDeploymentsResponse.class)
                .withName("CreateDeployments")
                .withUri("/v3/{project_id}/edgemgr/deployments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeploymentsRequest::getIefInstanceId,
                CreateDeploymentsRequest::setIefInstanceId));
        builder.<Deployment>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Deployment.class),
            f -> f.withMarshaller(CreateDeploymentsRequest::getBody, CreateDeploymentsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> createDevice = genForCreateDevice();

    private static HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> genForCreateDevice() {
        // basic
        HttpRequestDef.Builder<CreateDeviceRequest, CreateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceRequest.class, CreateDeviceResponse.class)
                .withName("CreateDevice")
                .withUri("/v2/{project_id}/edgemgr/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceRequest::getIefInstanceId, CreateDeviceRequest::setIefInstanceId));
        builder.<EdgemgrDevices>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgemgrDevices.class),
            f -> f.withMarshaller(CreateDeviceRequest::getBody, CreateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> createDeviceTemplate =
        genForCreateDeviceTemplate();

    private static HttpRequestDef<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> genForCreateDeviceTemplate() {
        // basic
        HttpRequestDef.Builder<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateDeviceTemplateRequest.class, CreateDeviceTemplateResponse.class)
            .withName("CreateDeviceTemplate")
            .withUri("/v2/{project_id}/edgemgr/device-templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDeviceTemplateRequest::getIefInstanceId,
                CreateDeviceTemplateRequest::setIefInstanceId));
        builder.<DeviceTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceTemplate.class),
            f -> f.withMarshaller(CreateDeviceTemplateRequest::getBody, CreateDeviceTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeGroupRequest, CreateEdgeGroupResponse> createEdgeGroup =
        genForCreateEdgeGroup();

    private static HttpRequestDef<CreateEdgeGroupRequest, CreateEdgeGroupResponse> genForCreateEdgeGroup() {
        // basic
        HttpRequestDef.Builder<CreateEdgeGroupRequest, CreateEdgeGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeGroupRequest.class, CreateEdgeGroupResponse.class)
                .withName("CreateEdgeGroup")
                .withUri("/v2/{project_id}/edgemgr/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeGroupRequest::getIefInstanceId, CreateEdgeGroupRequest::setIefInstanceId));
        builder.<EdgeGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupRequest.class),
            f -> f.withMarshaller(CreateEdgeGroupRequest::getBody, CreateEdgeGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> createEdgeGroupCert =
        genForCreateEdgeGroupCert();

    private static HttpRequestDef<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> genForCreateEdgeGroupCert() {
        // basic
        HttpRequestDef.Builder<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeGroupCertRequest.class, CreateEdgeGroupCertResponse.class)
                .withName("CreateEdgeGroupCert")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}/certs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getGroupId, CreateEdgeGroupCertRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getIefInstanceId,
                CreateEdgeGroupCertRequest::setIefInstanceId));
        builder.<EdgeGroupCertRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupCertRequest.class),
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getBody, CreateEdgeGroupCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNode =
        genForCreateEdgeNode();

    private static HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> genForCreateEdgeNode() {
        // basic
        HttpRequestDef.Builder<CreateEdgeNodeRequest, CreateEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeNodeRequest.class, CreateEdgeNodeResponse.class)
                .withName("CreateEdgeNode")
                .withUri("/v2/{project_id}/edgemgr/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeNodeRequest::getIefInstanceId, CreateEdgeNodeRequest::setIefInstanceId));
        builder.<Node>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Node.class),
            f -> f.withMarshaller(CreateEdgeNodeRequest::getBody, CreateEdgeNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> createEdgeNodeCerts =
        genForCreateEdgeNodeCerts();

    private static HttpRequestDef<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> genForCreateEdgeNodeCerts() {
        // basic
        HttpRequestDef.Builder<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEdgeNodeCertsRequest.class, CreateEdgeNodeCertsResponse.class)
                .withName("CreateEdgeNodeCerts")
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/certs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getNodeId, CreateEdgeNodeCertsRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getIefInstanceId,
                CreateEdgeNodeCertsRequest::setIefInstanceId));
        builder.<Cert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Cert.class),
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getBody, CreateEdgeNodeCertsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEncryptdatasRequest, CreateEncryptdatasResponse> createEncryptdatas =
        genForCreateEncryptdatas();

    private static HttpRequestDef<CreateEncryptdatasRequest, CreateEncryptdatasResponse> genForCreateEncryptdatas() {
        // basic
        HttpRequestDef.Builder<CreateEncryptdatasRequest, CreateEncryptdatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEncryptdatasRequest.class, CreateEncryptdatasResponse.class)
                .withName("CreateEncryptdatas")
                .withUri("/v2/{project_id}/edm/encryptdatas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEncryptdatasRequest::getIefInstanceId,
                CreateEncryptdatasRequest::setIefInstanceId));
        builder.<EncryptDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataReq.class),
            f -> f.withMarshaller(CreateEncryptdatasRequest::getBody, CreateEncryptdatasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForCreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForCreateEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateEndpointRequest, CreateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointRequest.class, CreateEndpointResponse.class)
                .withName("CreateEndpoint")
                .withUri("/v2/{project_id}/routemgr/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEndpointRequest::getIefInstanceId, CreateEndpointRequest::setIefInstanceId));
        builder.<Endpoint>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Endpoint.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> createNodeEncryptdatas =
        genForCreateNodeEncryptdatas();

    private static HttpRequestDef<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> genForCreateNodeEncryptdatas() {
        // basic
        HttpRequestDef.Builder<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNodeEncryptdatasRequest.class, CreateNodeEncryptdatasResponse.class)
            .withName("CreateNodeEncryptdatas")
            .withUri("/v2/{project_id}/edm/nodes/{node_id}/encryptdatas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getNodeId, CreateNodeEncryptdatasRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getIefInstanceId,
                CreateNodeEncryptdatasRequest::setIefInstanceId));
        builder.<EncryptDataNodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataNodeReq.class),
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getBody, CreateNodeEncryptdatasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForCreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForCreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v2/{project_id}/productmgr/products")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProductRequest::getIefInstanceId, CreateProductRequest::setIefInstanceId));
        builder.<ProductCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ProductCreateRequest.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, CreateProductRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForCreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForCreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v2/{project_id}/routemgr/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRuleRequest::getIefInstanceId, CreateRuleRequest::setIefInstanceId));
        builder.<RuleDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleDetail.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, CreateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForCreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForCreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v2/{project_id}/edgemgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretRequest::getIefInstanceId, CreateSecretRequest::setIefInstanceId));
        builder.<Secret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Secret.class),
            f -> f.withMarshaller(CreateSecretRequest::getBody, CreateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForCreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForCreateService() {
        // basic
        HttpRequestDef.Builder<CreateServiceRequest, CreateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceRequest.class, CreateServiceResponse.class)
                .withName("CreateService")
                .withUri("/v2/{project_id}/edgemgr/services")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateServiceRequest::getIefInstanceId, CreateServiceRequest::setIefInstanceId));
        builder.<Service>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Service.class),
            f -> f.withMarshaller(CreateServiceRequest::getBody, CreateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSystemEventRequest, CreateSystemEventResponse> createSystemEvent =
        genForCreateSystemEvent();

    private static HttpRequestDef<CreateSystemEventRequest, CreateSystemEventResponse> genForCreateSystemEvent() {
        // basic
        HttpRequestDef.Builder<CreateSystemEventRequest, CreateSystemEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSystemEventRequest.class, CreateSystemEventResponse.class)
                .withName("CreateSystemEvent")
                .withUri("/v2/{project_id}/routemgr/exchanger/systemevents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSystemEventRequest::getIefInstanceId,
                CreateSystemEventRequest::setIefInstanceId));
        builder.<EventCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EventCreateReq.class),
            f -> f.withMarshaller(CreateSystemEventRequest::getBody, CreateSystemEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, CreateTagRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, CreateTagRequest::setResourceType));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getIefInstanceId, CreateTagRequest::setIefInstanceId));
        builder.<CreateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagRequestBody.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTagResponse::getBody, CreateTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genForDeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genForDeleteApp() {
        // basic
        HttpRequestDef.Builder<DeleteAppRequest, DeleteAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppRequest.class, DeleteAppResponse.class)
                .withName("DeleteApp")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getAppId, DeleteAppRequest::setAppId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getIefInstanceId, DeleteAppRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersion =
        genForDeleteAppVersion();

    private static HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> genForDeleteAppVersion() {
        // basic
        HttpRequestDef.Builder<DeleteAppVersionRequest, DeleteAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppVersionRequest.class, DeleteAppVersionResponse.class)
                .withName("DeleteAppVersion")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getAppId, DeleteAppVersionRequest::setAppId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getVersionId, DeleteAppVersionRequest::setVersionId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getIefInstanceId,
                DeleteAppVersionRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJob =
        genForDeleteBatchJob();

    private static HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> genForDeleteBatchJob() {
        // basic
        HttpRequestDef.Builder<DeleteBatchJobRequest, DeleteBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBatchJobRequest.class, DeleteBatchJobResponse.class)
                .withName("DeleteBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchJobRequest::getJobId, DeleteBatchJobRequest::setJobId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchJobRequest::getIefInstanceId, DeleteBatchJobRequest::setIefInstanceId));

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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigMapRequest::getConfigmapId, DeleteConfigMapRequest::setConfigmapId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigMapRequest::getIefInstanceId, DeleteConfigMapRequest::setIefInstanceId));

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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, DeleteDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getForceDelete, DeleteDeploymentRequest::setForceDelete));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getIefInstanceId,
                DeleteDeploymentRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genForDeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genForDeleteDevice() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceRequest, DeleteDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceRequest.class, DeleteDeviceResponse.class)
                .withName("DeleteDevice")
                .withUri("/v2/{project_id}/edgemgr/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, DeleteDeviceRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getIefInstanceId, DeleteDeviceRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> deleteDeviceTemplate =
        genForDeleteDeviceTemplate();

    private static HttpRequestDef<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> genForDeleteDeviceTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDeviceTemplateRequest.class, DeleteDeviceTemplateResponse.class)
            .withName("DeleteDeviceTemplate")
            .withUri("/v2/{project_id}/edgemgr/device-templates/{device_template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceTemplateRequest::getDeviceTemplateId,
                DeleteDeviceTemplateRequest::setDeviceTemplateId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceTemplateRequest::getIefInstanceId,
                DeleteDeviceTemplateRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> deleteEdgeGroup =
        genForDeleteEdgeGroup();

    private static HttpRequestDef<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> genForDeleteEdgeGroup() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEdgeGroupRequest.class, DeleteEdgeGroupResponse.class)
                .withName("DeleteEdgeGroup")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupRequest::getGroupId, DeleteEdgeGroupRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupRequest::getIefInstanceId, DeleteEdgeGroupRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> deleteEdgeGroupCert =
        genForDeleteEdgeGroupCert();

    private static HttpRequestDef<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> genForDeleteEdgeGroupCert() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEdgeGroupCertRequest.class, DeleteEdgeGroupCertResponse.class)
            .withName("DeleteEdgeGroupCert")
            .withUri("/v2/{project_id}/edgemgr/groups/{group_id}/certs/{group_cert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getGroupId, DeleteEdgeGroupCertRequest::setGroupId));
        builder.<String>withRequestField("group_cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getGroupCertId,
                DeleteEdgeGroupCertRequest::setGroupCertId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getIefInstanceId,
                DeleteEdgeGroupCertRequest::setIefInstanceId));

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
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getNodeId, DeleteEdgeNodeRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getIefInstanceId, DeleteEdgeNodeRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> deleteEdgeNodeCerts =
        genForDeleteEdgeNodeCerts();

    private static HttpRequestDef<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> genForDeleteEdgeNodeCerts() {
        // basic
        HttpRequestDef.Builder<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEdgeNodeCertsRequest.class, DeleteEdgeNodeCertsResponse.class)
            .withName("DeleteEdgeNodeCerts")
            .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/certs/{cert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getNodeId, DeleteEdgeNodeCertsRequest::setNodeId));
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getCertId, DeleteEdgeNodeCertsRequest::setCertId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getIefInstanceId,
                DeleteEdgeNodeCertsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> deleteEncryptdatas =
        genForDeleteEncryptdatas();

    private static HttpRequestDef<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> genForDeleteEncryptdatas() {
        // basic
        HttpRequestDef.Builder<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEncryptdatasRequest.class, DeleteEncryptdatasResponse.class)
                .withName("DeleteEncryptdatas")
                .withUri("/v2/{project_id}/edm/encryptdatas/{encryptdata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEncryptdatasRequest::getEncryptdataId,
                DeleteEncryptdatasRequest::setEncryptdataId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEncryptdatasRequest::getIefInstanceId,
                DeleteEncryptdatasRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndPointRequest, DeleteEndPointResponse> deleteEndPoint =
        genForDeleteEndPoint();

    private static HttpRequestDef<DeleteEndPointRequest, DeleteEndPointResponse> genForDeleteEndPoint() {
        // basic
        HttpRequestDef.Builder<DeleteEndPointRequest, DeleteEndPointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEndPointRequest.class, DeleteEndPointResponse.class)
                .withName("DeleteEndPoint")
                .withUri("/v2/{project_id}/routemgr/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndPointRequest::getEndpointId, DeleteEndPointRequest::setEndpointId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndPointRequest::getIefInstanceId, DeleteEndPointRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> deleteNodeEncryptdatas =
        genForDeleteNodeEncryptdatas();

    private static HttpRequestDef<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> genForDeleteNodeEncryptdatas() {
        // basic
        HttpRequestDef.Builder<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNodeEncryptdatasRequest.class, DeleteNodeEncryptdatasResponse.class)
            .withName("DeleteNodeEncryptdatas")
            .withUri("/v2/{project_id}/edm/nodes/{node_id}/encryptdatas/{encryptdata_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getNodeId, DeleteNodeEncryptdatasRequest::setNodeId));
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getEncryptdataId,
                DeleteNodeEncryptdatasRequest::setEncryptdataId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getIefInstanceId,
                DeleteNodeEncryptdatasRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genForDeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genForDeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v2/{project_id}/productmgr/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getProductId, DeleteProductRequest::setProductId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getIefInstanceId, DeleteProductRequest::setIefInstanceId));

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
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType,
                DeleteResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, DeleteResourceTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, DeleteResourceTagRequest::setKey));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getIefInstanceId,
                DeleteResourceTagRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v2/{project_id}/routemgr/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, DeleteRuleRequest::setRuleId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getIefInstanceId, DeleteRuleRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> deleteSecret = genForDeleteSecret();

    private static HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> genForDeleteSecret() {
        // basic
        HttpRequestDef.Builder<DeleteSecretRequest, DeleteSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretRequest.class, DeleteSecretResponse.class)
                .withName("DeleteSecret")
                .withUri("/v2/{project_id}/edgemgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getSecretId, DeleteSecretRequest::setSecretId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getIefInstanceId, DeleteSecretRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genForDeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genForDeleteService() {
        // basic
        HttpRequestDef.Builder<DeleteServiceRequest, DeleteServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceRequest.class, DeleteServiceResponse.class)
                .withName("DeleteService")
                .withUri("/v2/{project_id}/edgemgr/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, DeleteServiceRequest::setServiceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceRequest::getIefInstanceId, DeleteServiceRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSystemEventRequest, DeleteSystemEventResponse> deleteSystemEvent =
        genForDeleteSystemEvent();

    private static HttpRequestDef<DeleteSystemEventRequest, DeleteSystemEventResponse> genForDeleteSystemEvent() {
        // basic
        HttpRequestDef.Builder<DeleteSystemEventRequest, DeleteSystemEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSystemEventRequest.class, DeleteSystemEventResponse.class)
                .withName("DeleteSystemEvent")
                .withUri("/v2/{project_id}/routemgr/exchanger/systemevents/{event_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSystemEventRequest::getEventId, DeleteSystemEventRequest::setEventId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSystemEventRequest::getIefInstanceId,
                DeleteSystemEventRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> enableDisableEdgeNodes =
        genForEnableDisableEdgeNodes();

    private static HttpRequestDef<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> genForEnableDisableEdgeNodes() {
        // basic
        HttpRequestDef.Builder<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, EnableDisableEdgeNodesRequest.class, EnableDisableEdgeNodesResponse.class)
            .withName("EnableDisableEdgeNodes")
            .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getNodeId, EnableDisableEdgeNodesRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getIefInstanceId,
                EnableDisableEdgeNodesRequest::setIefInstanceId));
        builder.<NodeAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeAction.class),
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getBody, EnableDisableEdgeNodesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersions =
        genForListAppVersions();

    private static HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> genForListAppVersions() {
        // basic
        HttpRequestDef.Builder<ListAppVersionsRequest, ListAppVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppVersionsRequest.class, ListAppVersionsResponse.class)
                .withName("ListAppVersions")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getAppId, ListAppVersionsRequest::setAppId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getLimit, ListAppVersionsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getOffset, ListAppVersionsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getIefInstanceId, ListAppVersionsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v2/{project_id}/edgemgr/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getName, ListAppsRequest::setName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, ListAppsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, ListAppsRequest::setOffset));
        builder.<String>withRequestField("alias",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAlias, ListAppsRequest::setAlias));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getVisibility, ListAppsRequest::setVisibility));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getIefInstanceId, ListAppsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchJobRequest, ListBatchJobResponse> listBatchJob = genForListBatchJob();

    private static HttpRequestDef<ListBatchJobRequest, ListBatchJobResponse> genForListBatchJob() {
        // basic
        HttpRequestDef.Builder<ListBatchJobRequest, ListBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBatchJobRequest.class, ListBatchJobResponse.class)
                .withName("ListBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobRequest::getJobType, ListBatchJobRequest::setJobType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobRequest::getLimit, ListBatchJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobRequest::getOffset, ListBatchJobRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobRequest::getSort, ListBatchJobRequest::setSort));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobRequest::getIefInstanceId, ListBatchJobRequest::setIefInstanceId));

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
                .withUri("/v2/{project_id}/edgemgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getName, ListConfigMapsRequest::setName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getLimit, ListConfigMapsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getOffset, ListConfigMapsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getIefInstanceId, ListConfigMapsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> listDeployments =
        genForListDeployments();

    private static HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> genForListDeployments() {
        // basic
        HttpRequestDef.Builder<ListDeploymentsRequest, ListDeploymentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeploymentsRequest.class, ListDeploymentsResponse.class)
                .withName("ListDeployments")
                .withUri("/v3/{project_id}/edgemgr/deployments")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getLimit, ListDeploymentsRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getOffset, ListDeploymentsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getSort, ListDeploymentsRequest::setSort));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getName, ListDeploymentsRequest::setName));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getNodeId, ListDeploymentsRequest::setNodeId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getGroupId, ListDeploymentsRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getIefInstanceId, ListDeploymentsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> listDeviceTemplates =
        genForListDeviceTemplates();

    private static HttpRequestDef<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> genForListDeviceTemplates() {
        // basic
        HttpRequestDef.Builder<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceTemplatesRequest.class, ListDeviceTemplatesResponse.class)
                .withName("ListDeviceTemplates")
                .withUri("/v2/{project_id}/edgemgr/device-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getName, ListDeviceTemplatesRequest::setName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getOffset, ListDeviceTemplatesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getLimit, ListDeviceTemplatesRequest::setLimit));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getIefInstanceId,
                ListDeviceTemplatesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForListDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForListDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v2/{project_id}/edgemgr/devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getName, ListDevicesRequest::setName));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, ListDevicesRequest::setNodeId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, ListDevicesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, ListDevicesRequest::setOffset));
        builder.<String>withRequestField("is_binding",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getIsBinding, ListDevicesRequest::setIsBinding));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getTags, ListDevicesRequest::setTags));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getIefInstanceId, ListDevicesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> listEdgeGroupCerts =
        genForListEdgeGroupCerts();

    private static HttpRequestDef<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> genForListEdgeGroupCerts() {
        // basic
        HttpRequestDef.Builder<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeGroupCertsRequest.class, ListEdgeGroupCertsResponse.class)
                .withName("ListEdgeGroupCerts")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}/certs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getGroupId, ListEdgeGroupCertsRequest::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getLimit, ListEdgeGroupCertsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getOffset, ListEdgeGroupCertsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getIefInstanceId,
                ListEdgeGroupCertsRequest::setIefInstanceId));

        // response
        builder.<List<EdgeGroupCertListResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeGroupCertsResponse::getBody, ListEdgeGroupCertsResponse::setBody)
                .withInnerContainerType(EdgeGroupCertListResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeGroupsRequest, ListEdgeGroupsResponse> listEdgeGroups =
        genForListEdgeGroups();

    private static HttpRequestDef<ListEdgeGroupsRequest, ListEdgeGroupsResponse> genForListEdgeGroups() {
        // basic
        HttpRequestDef.Builder<ListEdgeGroupsRequest, ListEdgeGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeGroupsRequest.class, ListEdgeGroupsResponse.class)
                .withName("ListEdgeGroups")
                .withUri("/v2/{project_id}/edgemgr/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getName, ListEdgeGroupsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getLimit, ListEdgeGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getOffset, ListEdgeGroupsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getSort, ListEdgeGroupsRequest::setSort));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getIefInstanceId, ListEdgeGroupsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> listEdgeNodeCerts =
        genForListEdgeNodeCerts();

    private static HttpRequestDef<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> genForListEdgeNodeCerts() {
        // basic
        HttpRequestDef.Builder<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeNodeCertsRequest.class, ListEdgeNodeCertsResponse.class)
                .withName("ListEdgeNodeCerts")
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/certs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getNodeId, ListEdgeNodeCertsRequest::setNodeId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getLimit, ListEdgeNodeCertsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getOffset, ListEdgeNodeCertsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getIefInstanceId,
                ListEdgeNodeCertsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodes =
        genForListEdgeNodes();

    private static HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> genForListEdgeNodes() {
        // basic
        HttpRequestDef.Builder<ListEdgeNodesRequest, ListEdgeNodesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEdgeNodesRequest.class, ListEdgeNodesResponse.class)
                .withName("ListEdgeNodes")
                .withUri("/v2/{project_id}/edgemgr/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getName, ListEdgeNodesRequest::setName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getLimit, ListEdgeNodesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getOffset, ListEdgeNodesRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getSort, ListEdgeNodesRequest::setSort));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getDeviceId, ListEdgeNodesRequest::setDeviceId));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getDeviceName, ListEdgeNodesRequest::setDeviceName));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getAppName, ListEdgeNodesRequest::setAppName));
        builder.<ListEdgeNodesRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeNodesRequest.StateEnum.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getState, ListEdgeNodesRequest::setState));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getTags, ListEdgeNodesRequest::setTags));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getGroupId, ListEdgeNodesRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getIefInstanceId, ListEdgeNodesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> listEncryptdataNodes =
        genForListEncryptdataNodes();

    private static HttpRequestDef<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> genForListEncryptdataNodes() {
        // basic
        HttpRequestDef.Builder<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEncryptdataNodesRequest.class, ListEncryptdataNodesResponse.class)
            .withName("ListEncryptdataNodes")
            .withUri("/v2/{project_id}/edm/encryptdatas/{encryptdata_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getEncryptdataId,
                ListEncryptdataNodesRequest::setEncryptdataId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getLimit, ListEncryptdataNodesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getOffset, ListEncryptdataNodesRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getIefInstanceId,
                ListEncryptdataNodesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptdatasRequest, ListEncryptdatasResponse> listEncryptdatas =
        genForListEncryptdatas();

    private static HttpRequestDef<ListEncryptdatasRequest, ListEncryptdatasResponse> genForListEncryptdatas() {
        // basic
        HttpRequestDef.Builder<ListEncryptdatasRequest, ListEncryptdatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEncryptdatasRequest.class, ListEncryptdatasResponse.class)
                .withName("ListEncryptdatas")
                .withUri("/v2/{project_id}/edm/encryptdatas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getName, ListEncryptdatasRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getLimit, ListEncryptdatasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getOffset, ListEncryptdatasRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getIefInstanceId,
                ListEncryptdatasRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForListEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForListEndpoints() {
        // basic
        HttpRequestDef.Builder<ListEndpointsRequest, ListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointsRequest.class, ListEndpointsResponse.class)
                .withName("ListEndpoints")
                .withUri("/v2/{project_id}/routemgr/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getName, ListEndpointsRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getType, ListEndpointsRequest::setType));
        builder.<String>withRequestField("is_shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getIsShared, ListEndpointsRequest::setIsShared));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, ListEndpointsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getIefInstanceId, ListEndpointsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> listNodeEncryptdatas =
        genForListNodeEncryptdatas();

    private static HttpRequestDef<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> genForListNodeEncryptdatas() {
        // basic
        HttpRequestDef.Builder<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNodeEncryptdatasRequest.class, ListNodeEncryptdatasResponse.class)
            .withName("ListNodeEncryptdatas")
            .withUri("/v2/{project_id}/edm/nodes/{node_id}/encryptdatas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getNodeId, ListNodeEncryptdatasRequest::setNodeId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getLimit, ListNodeEncryptdatasRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getOffset, ListNodeEncryptdatasRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getIefInstanceId,
                ListNodeEncryptdatasRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPodsRequest, ListPodsResponse> listPods = genForListPods();

    private static HttpRequestDef<ListPodsRequest, ListPodsResponse> genForListPods() {
        // basic
        HttpRequestDef.Builder<ListPodsRequest, ListPodsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPodsRequest.class, ListPodsResponse.class)
                .withName("ListPods")
                .withUri("/v3/{project_id}/edgemgr/pods")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getNodeId, ListPodsRequest::setNodeId));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getGroupId, ListPodsRequest::setGroupId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getDeploymentId, ListPodsRequest::setDeploymentId));
        builder.<String>withRequestField("deployment_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getDeploymentIds, ListPodsRequest::setDeploymentIds));
        builder.<String>withRequestField("plugin_instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getPluginInstanceName, ListPodsRequest::setPluginInstanceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPodsRequest::getLimit, ListPodsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPodsRequest::getOffset, ListPodsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getIefInstanceId, ListPodsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForListProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForListProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/productmgr/products")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getLimit, ListProductsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, ListProductsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getSort, ListProductsRequest::setSort));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getIefInstanceId, ListProductsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceByTagsRequest, ListResourceByTagsResponse> listResourceByTags =
        genForListResourceByTags();

    private static HttpRequestDef<ListResourceByTagsRequest, ListResourceByTagsResponse> genForListResourceByTags() {
        // basic
        HttpRequestDef.Builder<ListResourceByTagsRequest, ListResourceByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListResourceByTagsRequest.class, ListResourceByTagsResponse.class)
                .withName("ListResourceByTags")
                .withUri("/v2/{project_id}/{resource_type}/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceByTagsRequest::getResourceType,
                ListResourceByTagsRequest::setResourceType));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceByTagsRequest::getIefInstanceId,
                ListResourceByTagsRequest::setIefInstanceId));
        builder.<Tags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Tags.class),
            f -> f.withMarshaller(ListResourceByTagsRequest::getBody, ListResourceByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleErrorsRequest, ListRuleErrorsResponse> listRuleErrors =
        genForListRuleErrors();

    private static HttpRequestDef<ListRuleErrorsRequest, ListRuleErrorsResponse> genForListRuleErrors() {
        // basic
        HttpRequestDef.Builder<ListRuleErrorsRequest, ListRuleErrorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleErrorsRequest.class, ListRuleErrorsResponse.class)
                .withName("ListRuleErrors")
                .withUri("/v2/{project_id}/routemgr/rules/{rule_id}/errors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getRuleId, ListRuleErrorsRequest::setRuleId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getLimit, ListRuleErrorsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getOffset, ListRuleErrorsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getIefInstanceId, ListRuleErrorsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForListRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForListRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v2/{project_id}/routemgr/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getName, ListRulesRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, ListRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, ListRulesRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getIefInstanceId, ListRulesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretsRequest, ListSecretsResponse> listSecrets = genForListSecrets();

    private static HttpRequestDef<ListSecretsRequest, ListSecretsResponse> genForListSecrets() {
        // basic
        HttpRequestDef.Builder<ListSecretsRequest, ListSecretsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretsRequest.class, ListSecretsResponse.class)
                .withName("ListSecrets")
                .withUri("/v2/{project_id}/edgemgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getName, ListSecretsRequest::setName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getLimit, ListSecretsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getOffset, ListSecretsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getSort, ListSecretsRequest::setSort));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getIefInstanceId, ListSecretsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForListServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForListServices() {
        // basic
        HttpRequestDef.Builder<ListServicesRequest, ListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServicesRequest.class, ListServicesResponse.class)
                .withName("ListServices")
                .withUri("/v2/{project_id}/edgemgr/services")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListServicesRequest::getLimit, ListServicesRequest::setLimit));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListServicesRequest::getOffset, ListServicesRequest::setOffset));
        builder.<String>withRequestField("sorted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getSorted, ListServicesRequest::setSorted));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getName, ListServicesRequest::setName));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getApp, ListServicesRequest::setApp));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getIefInstanceId, ListServicesRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemEventsRequest, ListSystemEventsResponse> listSystemEvents =
        genForListSystemEvents();

    private static HttpRequestDef<ListSystemEventsRequest, ListSystemEventsResponse> genForListSystemEvents() {
        // basic
        HttpRequestDef.Builder<ListSystemEventsRequest, ListSystemEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSystemEventsRequest.class, ListSystemEventsResponse.class)
                .withName("ListSystemEvents")
                .withUri("/v2/{project_id}/routemgr/exchanger/systemevents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getName, ListSystemEventsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getLimit, ListSystemEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getOffset, ListSystemEventsRequest::setOffset));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getIefInstanceId,
                ListSystemEventsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceId, ListTagsRequest::setResourceId));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getIefInstanceId, ListTagsRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> listTagsByResourceType =
        genForListTagsByResourceType();

    private static HttpRequestDef<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> genForListTagsByResourceType() {
        // basic
        HttpRequestDef.Builder<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListTagsByResourceTypeRequest.class, ListTagsByResourceTypeResponse.class)
            .withName("ListTagsByResourceType")
            .withUri("/v2/{project_id}/{resource_type}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsByResourceTypeRequest::getResourceType,
                ListTagsByResourceTypeRequest::setResourceType));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsByResourceTypeRequest::getIefInstanceId,
                ListTagsByResourceTypeRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> restartDeploymentsPod =
        genForRestartDeploymentsPod();

    private static HttpRequestDef<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> genForRestartDeploymentsPod() {
        // basic
        HttpRequestDef.Builder<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartDeploymentsPodRequest.class, RestartDeploymentsPodResponse.class)
            .withName("RestartDeploymentsPod")
            .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}/pods/{pod_name}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getDeploymentId,
                RestartDeploymentsPodRequest::setDeploymentId));
        builder.<String>withRequestField("pod_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getPodName, RestartDeploymentsPodRequest::setPodName));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getIefInstanceId,
                RestartDeploymentsPodRequest::setIefInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestartDeploymentsPodResponse::getBody, RestartDeploymentsPodResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBatchJobRequest, RestoreBatchJobResponse> restoreBatchJob =
        genForRestoreBatchJob();

    private static HttpRequestDef<RestoreBatchJobRequest, RestoreBatchJobResponse> genForRestoreBatchJob() {
        // basic
        HttpRequestDef.Builder<RestoreBatchJobRequest, RestoreBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreBatchJobRequest.class, RestoreBatchJobResponse.class)
                .withName("RestoreBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs/{job_id}/restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBatchJobRequest::getJobId, RestoreBatchJobRequest::setJobId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBatchJobRequest::getIefInstanceId, RestoreBatchJobRequest::setIefInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreBatchJobResponse::getBody, RestoreBatchJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<RetryBatchJobRequest, RetryBatchJobResponse> retryBatchJob =
        genForRetryBatchJob();

    private static HttpRequestDef<RetryBatchJobRequest, RetryBatchJobResponse> genForRetryBatchJob() {
        // basic
        HttpRequestDef.Builder<RetryBatchJobRequest, RetryBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RetryBatchJobRequest.class, RetryBatchJobResponse.class)
                .withName("RetryBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs/{job_id}/retry")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchJobRequest::getJobId, RetryBatchJobRequest::setJobId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchJobRequest::getIefInstanceId, RetryBatchJobRequest::setIefInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RetryBatchJobResponse::getBody, RetryBatchJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetail =
        genForShowAppDetail();

    private static HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> genForShowAppDetail() {
        // basic
        HttpRequestDef.Builder<ShowAppDetailRequest, ShowAppDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppDetailRequest.class, ShowAppDetailResponse.class)
                .withName("ShowAppDetail")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailRequest::getAppId, ShowAppDetailRequest::setAppId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailRequest::getIefInstanceId, ShowAppDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> showAppVersionDetail =
        genForShowAppVersionDetail();

    private static HttpRequestDef<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> genForShowAppVersionDetail() {
        // basic
        HttpRequestDef.Builder<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAppVersionDetailRequest.class, ShowAppVersionDetailResponse.class)
            .withName("ShowAppVersionDetail")
            .withUri("/v2/{project_id}/edgemgr/apps/{app_id}/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getAppId, ShowAppVersionDetailRequest::setAppId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getVersionId,
                ShowAppVersionDetailRequest::setVersionId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getIefInstanceId,
                ShowAppVersionDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJob = genForShowBatchJob();

    private static HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> genForShowBatchJob() {
        // basic
        HttpRequestDef.Builder<ShowBatchJobRequest, ShowBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBatchJobRequest.class, ShowBatchJobResponse.class)
                .withName("ShowBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchJobRequest::getJobId, ShowBatchJobRequest::setJobId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchJobRequest::getIefInstanceId, ShowBatchJobRequest::setIefInstanceId));

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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigMapRequest::getConfigmapId, ShowConfigMapRequest::setConfigmapId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigMapRequest::getIefInstanceId, ShowConfigMapRequest::setIefInstanceId));

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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getDeploymentId, ShowDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getIefInstanceId, ShowDeploymentRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForShowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForShowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withName("ShowDevice")
                .withUri("/v2/{project_id}/edgemgr/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, ShowDeviceRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getIefInstanceId, ShowDeviceRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> showDeviceTemplate =
        genForShowDeviceTemplate();

    private static HttpRequestDef<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> genForShowDeviceTemplate() {
        // basic
        HttpRequestDef.Builder<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceTemplateRequest.class, ShowDeviceTemplateResponse.class)
                .withName("ShowDeviceTemplate")
                .withUri("/v2/{project_id}/edgemgr/device-templates/{device_template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTemplateRequest::getDeviceTemplateId,
                ShowDeviceTemplateRequest::setDeviceTemplateId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTemplateRequest::getIefInstanceId,
                ShowDeviceTemplateRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTwinRequest, ShowDeviceTwinResponse> showDeviceTwin =
        genForShowDeviceTwin();

    private static HttpRequestDef<ShowDeviceTwinRequest, ShowDeviceTwinResponse> genForShowDeviceTwin() {
        // basic
        HttpRequestDef.Builder<ShowDeviceTwinRequest, ShowDeviceTwinResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceTwinRequest.class, ShowDeviceTwinResponse.class)
                .withName("ShowDeviceTwin")
                .withUri("/v2/{project_id}/edgemgr/devices/{device_id}/twin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTwinRequest::getDeviceId, ShowDeviceTwinRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTwinRequest::getIefInstanceId, ShowDeviceTwinRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> showEdgeGroupCertDetail =
        genForShowEdgeGroupCertDetail();

    private static HttpRequestDef<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> genForShowEdgeGroupCertDetail() {
        // basic
        HttpRequestDef.Builder<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEdgeGroupCertDetailRequest.class, ShowEdgeGroupCertDetailResponse.class)
            .withName("ShowEdgeGroupCertDetail")
            .withUri("/v2/{project_id}/edgemgr/groups/{group_id}/certs/{group_cert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getGroupId,
                ShowEdgeGroupCertDetailRequest::setGroupId));
        builder.<String>withRequestField("group_cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getGroupCertId,
                ShowEdgeGroupCertDetailRequest::setGroupCertId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getIefInstanceId,
                ShowEdgeGroupCertDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> showEdgeGroupDetail =
        genForShowEdgeGroupDetail();

    private static HttpRequestDef<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> genForShowEdgeGroupDetail() {
        // basic
        HttpRequestDef.Builder<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeGroupDetailRequest.class, ShowEdgeGroupDetailResponse.class)
                .withName("ShowEdgeGroupDetail")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupDetailRequest::getGroupId, ShowEdgeGroupDetailRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupDetailRequest::getIefInstanceId,
                ShowEdgeGroupDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> showEdgeNodeDetail =
        genForShowEdgeNodeDetail();

    private static HttpRequestDef<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> genForShowEdgeNodeDetail() {
        // basic
        HttpRequestDef.Builder<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEdgeNodeDetailRequest.class, ShowEdgeNodeDetailResponse.class)
                .withName("ShowEdgeNodeDetail")
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeNodeDetailRequest::getNodeId, ShowEdgeNodeDetailRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeNodeDetailRequest::getIefInstanceId,
                ShowEdgeNodeDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEncryptdatasRequest, ShowEncryptdatasResponse> showEncryptdatas =
        genForShowEncryptdatas();

    private static HttpRequestDef<ShowEncryptdatasRequest, ShowEncryptdatasResponse> genForShowEncryptdatas() {
        // basic
        HttpRequestDef.Builder<ShowEncryptdatasRequest, ShowEncryptdatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEncryptdatasRequest.class, ShowEncryptdatasResponse.class)
                .withName("ShowEncryptdatas")
                .withUri("/v2/{project_id}/edm/encryptdatas/{encryptdata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEncryptdatasRequest::getEncryptdataId,
                ShowEncryptdatasRequest::setEncryptdataId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEncryptdatasRequest::getIefInstanceId,
                ShowEncryptdatasRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndPointDetailRequest, ShowEndPointDetailResponse> showEndPointDetail =
        genForShowEndPointDetail();

    private static HttpRequestDef<ShowEndPointDetailRequest, ShowEndPointDetailResponse> genForShowEndPointDetail() {
        // basic
        HttpRequestDef.Builder<ShowEndPointDetailRequest, ShowEndPointDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEndPointDetailRequest.class, ShowEndPointDetailResponse.class)
                .withName("ShowEndPointDetail")
                .withUri("/v2/{project_id}/routemgr/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndPointDetailRequest::getEndpointId, ShowEndPointDetailRequest::setEndpointId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndPointDetailRequest::getIefInstanceId,
                ShowEndPointDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductDetailRequest, ShowProductDetailResponse> showProductDetail =
        genForShowProductDetail();

    private static HttpRequestDef<ShowProductDetailRequest, ShowProductDetailResponse> genForShowProductDetail() {
        // basic
        HttpRequestDef.Builder<ShowProductDetailRequest, ShowProductDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductDetailRequest.class, ShowProductDetailResponse.class)
                .withName("ShowProductDetail")
                .withUri("/v2/{project_id}/productmgr/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductDetailRequest::getProductId, ShowProductDetailRequest::setProductId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductDetailRequest::getIefInstanceId,
                ShowProductDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v2/{project_id}/edgemgr/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaRequest::getTypes, ShowQuotaRequest::setTypes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleDetailRequest, ShowRuleDetailResponse> showRuleDetail =
        genForShowRuleDetail();

    private static HttpRequestDef<ShowRuleDetailRequest, ShowRuleDetailResponse> genForShowRuleDetail() {
        // basic
        HttpRequestDef.Builder<ShowRuleDetailRequest, ShowRuleDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleDetailRequest.class, ShowRuleDetailResponse.class)
                .withName("ShowRuleDetail")
                .withUri("/v2/{project_id}/routemgr/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleDetailRequest::getRuleId, ShowRuleDetailRequest::setRuleId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleDetailRequest::getIefInstanceId, ShowRuleDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretRequest, ShowSecretResponse> showSecret = genForShowSecret();

    private static HttpRequestDef<ShowSecretRequest, ShowSecretResponse> genForShowSecret() {
        // basic
        HttpRequestDef.Builder<ShowSecretRequest, ShowSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretRequest.class, ShowSecretResponse.class)
                .withName("ShowSecret")
                .withUri("/v2/{project_id}/edgemgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getSecretId, ShowSecretRequest::setSecretId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getIefInstanceId, ShowSecretRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetail =
        genForShowServiceDetail();

    private static HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> genForShowServiceDetail() {
        // basic
        HttpRequestDef.Builder<ShowServiceDetailRequest, ShowServiceDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServiceDetailRequest.class, ShowServiceDetailResponse.class)
                .withName("ShowServiceDetail")
                .withUri("/v2/{project_id}/edgemgr/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceDetailRequest::getServiceId, ShowServiceDetailRequest::setServiceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceDetailRequest::getIefInstanceId,
                ShowServiceDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> showSystemEventDetail =
        genForShowSystemEventDetail();

    private static HttpRequestDef<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> genForShowSystemEventDetail() {
        // basic
        HttpRequestDef.Builder<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSystemEventDetailRequest.class, ShowSystemEventDetailResponse.class)
            .withName("ShowSystemEventDetail")
            .withUri("/v2/{project_id}/routemgr/exchanger/systemevents/{event_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemEventDetailRequest::getEventId, ShowSystemEventDetailRequest::setEventId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemEventDetailRequest::getIefInstanceId,
                ShowSystemEventDetailRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartRuleRequest, StartRuleResponse> startRule = genForStartRule();

    private static HttpRequestDef<StartRuleRequest, StartRuleResponse> genForStartRule() {
        // basic
        HttpRequestDef.Builder<StartRuleRequest, StartRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartRuleRequest.class, StartRuleResponse.class)
                .withName("StartRule")
                .withUri("/v2/{project_id}/routemgr/rules/{rule_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartRuleRequest::getRuleId, StartRuleRequest::setRuleId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartRuleRequest::getIefInstanceId, StartRuleRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSystemEventRequest, StartSystemEventResponse> startSystemEvent =
        genForStartSystemEvent();

    private static HttpRequestDef<StartSystemEventRequest, StartSystemEventResponse> genForStartSystemEvent() {
        // basic
        HttpRequestDef.Builder<StartSystemEventRequest, StartSystemEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartSystemEventRequest.class, StartSystemEventResponse.class)
                .withName("StartSystemEvent")
                .withUri("/v2/{project_id}/routemgr/exchanger/systemevents/{event_id}/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSystemEventRequest::getEventId, StartSystemEventRequest::setEventId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSystemEventRequest::getIefInstanceId,
                StartSystemEventRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBatchJobRequest, StopBatchJobResponse> stopBatchJob = genForStopBatchJob();

    private static HttpRequestDef<StopBatchJobRequest, StopBatchJobResponse> genForStopBatchJob() {
        // basic
        HttpRequestDef.Builder<StopBatchJobRequest, StopBatchJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBatchJobRequest.class, StopBatchJobResponse.class)
                .withName("StopBatchJob")
                .withUri("/v2/{project_id}/productmgr/jobs/{job_id}/pause")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchJobRequest::getJobId, StopBatchJobRequest::setJobId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchJobRequest::getIefInstanceId, StopBatchJobRequest::setIefInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopBatchJobResponse::getBody, StopBatchJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<StopRuleRequest, StopRuleResponse> stopRule = genForStopRule();

    private static HttpRequestDef<StopRuleRequest, StopRuleResponse> genForStopRule() {
        // basic
        HttpRequestDef.Builder<StopRuleRequest, StopRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopRuleRequest.class, StopRuleResponse.class)
                .withName("StopRule")
                .withUri("/v2/{project_id}/routemgr/rules/{rule_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopRuleRequest::getRuleId, StopRuleRequest::setRuleId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopRuleRequest::getIefInstanceId, StopRuleRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSystemEventRequest, StopSystemEventResponse> stopSystemEvent =
        genForStopSystemEvent();

    private static HttpRequestDef<StopSystemEventRequest, StopSystemEventResponse> genForStopSystemEvent() {
        // basic
        HttpRequestDef.Builder<StopSystemEventRequest, StopSystemEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopSystemEventRequest.class, StopSystemEventResponse.class)
                .withName("StopSystemEvent")
                .withUri("/v2/{project_id}/routemgr/exchanger/systemevents/{event_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSystemEventRequest::getEventId, StopSystemEventRequest::setEventId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSystemEventRequest::getIefInstanceId, StopSystemEventRequest::setIefInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForUpdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForUpdateApp() {
        // basic
        HttpRequestDef.Builder<UpdateAppRequest, UpdateAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppRequest.class, UpdateAppResponse.class)
                .withName("UpdateApp")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getAppId, UpdateAppRequest::setAppId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getIefInstanceId, UpdateAppRequest::setIefInstanceId));
        builder.<UpdateAppBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppBody.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, UpdateAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppVersionRequest, UpdateAppVersionResponse> updateAppVersion =
        genForUpdateAppVersion();

    private static HttpRequestDef<UpdateAppVersionRequest, UpdateAppVersionResponse> genForUpdateAppVersion() {
        // basic
        HttpRequestDef.Builder<UpdateAppVersionRequest, UpdateAppVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppVersionRequest.class, UpdateAppVersionResponse.class)
                .withName("UpdateAppVersion")
                .withUri("/v2/{project_id}/edgemgr/apps/{app_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getAppId, UpdateAppVersionRequest::setAppId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getVersionId, UpdateAppVersionRequest::setVersionId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getIefInstanceId,
                UpdateAppVersionRequest::setIefInstanceId));
        builder.<UpdataAppVersionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdataAppVersionBody.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getBody, UpdateAppVersionRequest::setBody));

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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getConfigmapId, UpdateConfigMapRequest::setConfigmapId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getIefInstanceId, UpdateConfigMapRequest::setIefInstanceId));
        builder.<UpdateConfigMaps>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigMaps.class),
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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getDeploymentId, UpdateDeploymentRequest::setDeploymentId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getIefInstanceId,
                UpdateDeploymentRequest::setIefInstanceId));
        builder.<UpdateDeployment>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeployment.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getBody, UpdateDeploymentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForUpdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForUpdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v2/{project_id}/edgemgr/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, UpdateDeviceRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getIefInstanceId, UpdateDeviceRequest::setIefInstanceId));
        builder.<EdgemgrDevicesUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgemgrDevicesUpdate.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, UpdateDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> updateDeviceTemplateById =
        genForUpdateDeviceTemplateById();

    private static HttpRequestDef<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> genForUpdateDeviceTemplateById() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateDeviceTemplateByIdRequest.class, UpdateDeviceTemplateByIdResponse.class)
                .withName("UpdateDeviceTemplateById")
                .withUri("/v2/{project_id}/edgemgr/device-templates/{device_template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getDeviceTemplateId,
                UpdateDeviceTemplateByIdRequest::setDeviceTemplateId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getIefInstanceId,
                UpdateDeviceTemplateByIdRequest::setIefInstanceId));
        builder.<DeviceTemplateUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceTemplateUpdate.class),
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getBody, UpdateDeviceTemplateByIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> updateDeviceTwin =
        genForUpdateDeviceTwin();

    private static HttpRequestDef<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> genForUpdateDeviceTwin() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceTwinRequest.class, UpdateDeviceTwinResponse.class)
                .withName("UpdateDeviceTwin")
                .withUri("/v2/{project_id}/edgemgr/devices/{device_id}/twin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getDeviceId, UpdateDeviceTwinRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getIefInstanceId,
                UpdateDeviceTwinRequest::setIefInstanceId));
        builder.<TwinUpdateDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TwinUpdateDetail.class),
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getBody, UpdateDeviceTwinRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> updateEdgeGroup =
        genForUpdateEdgeGroup();

    private static HttpRequestDef<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> genForUpdateEdgeGroup() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEdgeGroupRequest.class, UpdateEdgeGroupResponse.class)
                .withName("UpdateEdgeGroup")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getGroupId, UpdateEdgeGroupRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getIefInstanceId, UpdateEdgeGroupRequest::setIefInstanceId));
        builder.<EdgeGroupUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupUpdateRequest.class),
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getBody, UpdateEdgeGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> updateEdgeGroupNodeBinding =
        genForUpdateEdgeGroupNodeBinding();

    private static HttpRequestDef<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> genForUpdateEdgeGroupNodeBinding() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateEdgeGroupNodeBindingRequest.class,
                    UpdateEdgeGroupNodeBindingResponse.class)
                .withName("UpdateEdgeGroupNodeBinding")
                .withUri("/v2/{project_id}/edgemgr/groups/{group_id}/nodes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getGroupId,
                UpdateEdgeGroupNodeBindingRequest::setGroupId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getIefInstanceId,
                UpdateEdgeGroupNodeBindingRequest::setIefInstanceId));
        builder.<UpdateGroupNodeBindingRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateGroupNodeBindingRequest.class),
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getBody,
                UpdateEdgeGroupNodeBindingRequest::setBody));

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
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getNodeId, UpdateEdgeNodeRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getIefInstanceId, UpdateEdgeNodeRequest::setIefInstanceId));
        builder.<UpdateEdgeNodeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEdgeNodeBody.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getBody, UpdateEdgeNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> updateEdgeNodeDevice =
        genForUpdateEdgeNodeDevice();

    private static HttpRequestDef<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> genForUpdateEdgeNodeDevice() {
        // basic
        HttpRequestDef.Builder<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateEdgeNodeDeviceRequest.class, UpdateEdgeNodeDeviceResponse.class)
            .withName("UpdateEdgeNodeDevice")
            .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/devices")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getNodeId, UpdateEdgeNodeDeviceRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getIefInstanceId,
                UpdateEdgeNodeDeviceRequest::setIefInstanceId));
        builder.<Devices>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Devices.class),
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getBody, UpdateEdgeNodeDeviceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> updateEncryptdatas =
        genForUpdateEncryptdatas();

    private static HttpRequestDef<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> genForUpdateEncryptdatas() {
        // basic
        HttpRequestDef.Builder<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEncryptdatasRequest.class, UpdateEncryptdatasResponse.class)
                .withName("UpdateEncryptdatas")
                .withUri("/v2/{project_id}/edm/encryptdatas/{encryptdata_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getEncryptdataId,
                UpdateEncryptdatasRequest::setEncryptdataId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getIefInstanceId,
                UpdateEncryptdatasRequest::setIefInstanceId));
        builder.<EncryptDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataReq.class),
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getBody, UpdateEncryptdatasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> updateNodeByDeviceId =
        genForUpdateNodeByDeviceId();

    private static HttpRequestDef<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> genForUpdateNodeByDeviceId() {
        // basic
        HttpRequestDef.Builder<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNodeByDeviceIdRequest.class, UpdateNodeByDeviceIdResponse.class)
            .withName("UpdateNodeByDeviceId")
            .withUri("/v2/{project_id}/edgemgr/devices/{device_id}/nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getDeviceId, UpdateNodeByDeviceIdRequest::setDeviceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getIefInstanceId,
                UpdateNodeByDeviceIdRequest::setIefInstanceId));
        builder.<EdgeNodeUpdateByDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgeNodeUpdateByDevice.class),
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getBody, UpdateNodeByDeviceIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForUpdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForUpdateSecret() {
        // basic
        HttpRequestDef.Builder<UpdateSecretRequest, UpdateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecretRequest.class, UpdateSecretResponse.class)
                .withName("UpdateSecret")
                .withUri("/v2/{project_id}/edgemgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getSecretId, UpdateSecretRequest::setSecretId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getIefInstanceId, UpdateSecretRequest::setIefInstanceId));
        builder.<UpdateSecret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecret.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, UpdateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForUpdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForUpdateService() {
        // basic
        HttpRequestDef.Builder<UpdateServiceRequest, UpdateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceRequest.class, UpdateServiceResponse.class)
                .withName("UpdateService")
                .withUri("/v2/{project_id}/edgemgr/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, UpdateServiceRequest::setServiceId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceRequest::getIefInstanceId, UpdateServiceRequest::setIefInstanceId));
        builder.<Service>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Service.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, UpdateServiceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> upgradeEdgeNode =
        genForUpgradeEdgeNode();

    private static HttpRequestDef<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> genForUpgradeEdgeNode() {
        // basic
        HttpRequestDef.Builder<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeEdgeNodeRequest.class, UpgradeEdgeNodeResponse.class)
                .withName("UpgradeEdgeNode")
                .withUri("/v2/{project_id}/edgemgr/nodes/{node_id}/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEdgeNodeRequest::getNodeId, UpgradeEdgeNodeRequest::setNodeId));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEdgeNodeRequest::getIefInstanceId, UpgradeEdgeNodeRequest::setIefInstanceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpgradeEdgeNodeResponse::getBody, UpgradeEdgeNodeResponse::setBody));

        return builder.build();
    }

}

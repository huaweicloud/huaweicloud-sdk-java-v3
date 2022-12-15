package com.huaweicloud.sdk.ief.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ief.v1.model.*;

import java.util.List;

@SuppressWarnings("unchecked")
public class IefMeta {

    public static final HttpRequestDef<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> batchAddDeleteTags =
        genForbatchAddDeleteTags();

    private static HttpRequestDef<BatchAddDeleteTagsRequest, BatchAddDeleteTagsResponse> genForbatchAddDeleteTags() {
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
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<BachTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BachTags.class),
            f -> f.withMarshaller(BatchAddDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchAddDeleteTagsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppRequest, CreateAppResponse> createApp = genForcreateApp();

    private static HttpRequestDef<CreateAppRequest, CreateAppResponse> genForcreateApp() {
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
            f -> f.withMarshaller(CreateAppRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<App>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(App.class),
            f -> f.withMarshaller(CreateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppVersionsRequest, CreateAppVersionsResponse> createAppVersions =
        genForcreateAppVersions();

    private static HttpRequestDef<CreateAppVersionsRequest, CreateAppVersionsResponse> genForcreateAppVersions() {
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
            f -> f.withMarshaller(CreateAppVersionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppVersionsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Version>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Version.class),
            f -> f.withMarshaller(CreateAppVersionsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> createBatchJob =
        genForcreateBatchJob();

    private static HttpRequestDef<CreateBatchJobRequest, CreateBatchJobResponse> genForcreateBatchJob() {
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
            f -> f.withMarshaller(CreateBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<BatchJobRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchJobRequest.class),
            f -> f.withMarshaller(CreateBatchJobRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/edgemgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<ConfigMaps>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigMaps.class),
            f -> f.withMarshaller(CreateConfigMapRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeploymentsRequest, CreateDeploymentsResponse> createDeployments =
        genForcreateDeployments();

    private static HttpRequestDef<CreateDeploymentsRequest, CreateDeploymentsResponse> genForcreateDeployments() {
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
            f -> f.withMarshaller(CreateDeploymentsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Deployment>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Deployment.class),
            f -> f.withMarshaller(CreateDeploymentsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> createDevice = genForcreateDevice();

    private static HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> genForcreateDevice() {
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
            f -> f.withMarshaller(CreateDeviceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgemgrDevices>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgemgrDevices.class),
            f -> f.withMarshaller(CreateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> createDeviceTemplate =
        genForcreateDeviceTemplate();

    private static HttpRequestDef<CreateDeviceTemplateRequest, CreateDeviceTemplateResponse> genForcreateDeviceTemplate() {
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
            f -> f.withMarshaller(CreateDeviceTemplateRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<DeviceTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceTemplate.class),
            f -> f.withMarshaller(CreateDeviceTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeGroupRequest, CreateEdgeGroupResponse> createEdgeGroup =
        genForcreateEdgeGroup();

    private static HttpRequestDef<CreateEdgeGroupRequest, CreateEdgeGroupResponse> genForcreateEdgeGroup() {
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
            f -> f.withMarshaller(CreateEdgeGroupRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgeGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupRequest.class),
            f -> f.withMarshaller(CreateEdgeGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> createEdgeGroupCert =
        genForcreateEdgeGroupCert();

    private static HttpRequestDef<CreateEdgeGroupCertRequest, CreateEdgeGroupCertResponse> genForcreateEdgeGroupCert() {
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
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgeGroupCertRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupCertRequest.class),
            f -> f.withMarshaller(CreateEdgeGroupCertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> createEdgeNode =
        genForcreateEdgeNode();

    private static HttpRequestDef<CreateEdgeNodeRequest, CreateEdgeNodeResponse> genForcreateEdgeNode() {
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
            f -> f.withMarshaller(CreateEdgeNodeRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Node>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Node.class),
            f -> f.withMarshaller(CreateEdgeNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> createEdgeNodeCerts =
        genForcreateEdgeNodeCerts();

    private static HttpRequestDef<CreateEdgeNodeCertsRequest, CreateEdgeNodeCertsResponse> genForcreateEdgeNodeCerts() {
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
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Cert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Cert.class),
            f -> f.withMarshaller(CreateEdgeNodeCertsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEncryptdatasRequest, CreateEncryptdatasResponse> createEncryptdatas =
        genForcreateEncryptdatas();

    private static HttpRequestDef<CreateEncryptdatasRequest, CreateEncryptdatasResponse> genForcreateEncryptdatas() {
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
            f -> f.withMarshaller(CreateEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EncryptDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataReq.class),
            f -> f.withMarshaller(CreateEncryptdatasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForcreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForcreateEndpoint() {
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
            f -> f.withMarshaller(CreateEndpointRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Endpoint>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Endpoint.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> createNodeEncryptdatas =
        genForcreateNodeEncryptdatas();

    private static HttpRequestDef<CreateNodeEncryptdatasRequest, CreateNodeEncryptdatasResponse> genForcreateNodeEncryptdatas() {
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
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EncryptDataNodeReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataNodeReq.class),
            f -> f.withMarshaller(CreateNodeEncryptdatasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct =
        genForcreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForcreateProduct() {
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
            f -> f.withMarshaller(CreateProductRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<ProductCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ProductCreateRequest.class),
            f -> f.withMarshaller(CreateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForcreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForcreateRule() {
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
            f -> f.withMarshaller(CreateRuleRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<RuleDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RuleDetail.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/edgemgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Secret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Secret.class),
            f -> f.withMarshaller(CreateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService =
        genForcreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForcreateService() {
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
            f -> f.withMarshaller(CreateServiceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Service>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Service.class),
            f -> f.withMarshaller(CreateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSystemEventRequest, CreateSystemEventResponse> createSystemEvent =
        genForcreateSystemEvent();

    private static HttpRequestDef<CreateSystemEventRequest, CreateSystemEventResponse> genForcreateSystemEvent() {
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
            f -> f.withMarshaller(CreateSystemEventRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EventCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EventCreateReq.class),
            f -> f.withMarshaller(CreateSystemEventRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
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
            f -> f.withMarshaller(CreateTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<CreateTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagRequestBody.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppRequest, DeleteAppResponse> deleteApp = genFordeleteApp();

    private static HttpRequestDef<DeleteAppRequest, DeleteAppResponse> genFordeleteApp() {
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
            f -> f.withMarshaller(DeleteAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> deleteAppVersion =
        genFordeleteAppVersion();

    private static HttpRequestDef<DeleteAppVersionRequest, DeleteAppVersionResponse> genFordeleteAppVersion() {
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
            f -> f.withMarshaller(DeleteAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppVersionRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> deleteBatchJob =
        genFordeleteBatchJob();

    private static HttpRequestDef<DeleteBatchJobRequest, DeleteBatchJobResponse> genFordeleteBatchJob() {
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
            f -> f.withMarshaller(DeleteBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigMapRequest::getConfigmapId, (req, v) -> {
                req.setConfigmapId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigMapRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("force_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getForceDelete, (req, v) -> {
                req.setForceDelete(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeploymentRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> deleteDevice = genFordeleteDevice();

    private static HttpRequestDef<DeleteDeviceRequest, DeleteDeviceResponse> genFordeleteDevice() {
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
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> deleteDeviceTemplate =
        genFordeleteDeviceTemplate();

    private static HttpRequestDef<DeleteDeviceTemplateRequest, DeleteDeviceTemplateResponse> genFordeleteDeviceTemplate() {
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
            f -> f.withMarshaller(DeleteDeviceTemplateRequest::getDeviceTemplateId, (req, v) -> {
                req.setDeviceTemplateId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDeviceTemplateRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> deleteEdgeGroup =
        genFordeleteEdgeGroup();

    private static HttpRequestDef<DeleteEdgeGroupRequest, DeleteEdgeGroupResponse> genFordeleteEdgeGroup() {
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
            f -> f.withMarshaller(DeleteEdgeGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> deleteEdgeGroupCert =
        genFordeleteEdgeGroupCert();

    private static HttpRequestDef<DeleteEdgeGroupCertRequest, DeleteEdgeGroupCertResponse> genFordeleteEdgeGroupCert() {
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
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("group_cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getGroupCertId, (req, v) -> {
                req.setGroupCertId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeGroupCertRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> deleteEdgeNode =
        genFordeleteEdgeNode();

    private static HttpRequestDef<DeleteEdgeNodeRequest, DeleteEdgeNodeResponse> genFordeleteEdgeNode() {
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
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> deleteEdgeNodeCerts =
        genFordeleteEdgeNodeCerts();

    private static HttpRequestDef<DeleteEdgeNodeCertsRequest, DeleteEdgeNodeCertsResponse> genFordeleteEdgeNodeCerts() {
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
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getCertId, (req, v) -> {
                req.setCertId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEdgeNodeCertsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> deleteEncryptdatas =
        genFordeleteEncryptdatas();

    private static HttpRequestDef<DeleteEncryptdatasRequest, DeleteEncryptdatasResponse> genFordeleteEncryptdatas() {
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
            f -> f.withMarshaller(DeleteEncryptdatasRequest::getEncryptdataId, (req, v) -> {
                req.setEncryptdataId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndPointRequest, DeleteEndPointResponse> deleteEndPoint =
        genFordeleteEndPoint();

    private static HttpRequestDef<DeleteEndPointRequest, DeleteEndPointResponse> genFordeleteEndPoint() {
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
            f -> f.withMarshaller(DeleteEndPointRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndPointRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> deleteNodeEncryptdatas =
        genFordeleteNodeEncryptdatas();

    private static HttpRequestDef<DeleteNodeEncryptdatasRequest, DeleteNodeEncryptdatasResponse> genFordeleteNodeEncryptdatas() {
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
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("encryptdata_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getEncryptdataId, (req, v) -> {
                req.setEncryptdataId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNodeEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct =
        genFordeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genFordeleteProduct() {
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
            f -> f.withMarshaller(DeleteProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProductRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genFordeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genFordeleteRule() {
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
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService =
        genFordeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genFordeleteService() {
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
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSystemEventRequest, DeleteSystemEventResponse> deleteSystemEvent =
        genFordeleteSystemEvent();

    private static HttpRequestDef<DeleteSystemEventRequest, DeleteSystemEventResponse> genFordeleteSystemEvent() {
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
            f -> f.withMarshaller(DeleteSystemEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSystemEventRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> enableDisableEdgeNodes =
        genForenableDisableEdgeNodes();

    private static HttpRequestDef<EnableDisableEdgeNodesRequest, EnableDisableEdgeNodesResponse> genForenableDisableEdgeNodes() {
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
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<NodeAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NodeAction.class),
            f -> f.withMarshaller(EnableDisableEdgeNodesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> listAppVersions =
        genForlistAppVersions();

    private static HttpRequestDef<ListAppVersionsRequest, ListAppVersionsResponse> genForlistAppVersions() {
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
            f -> f.withMarshaller(ListAppVersionsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppVersionsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
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
            f -> f.withMarshaller(ListAppsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("alias",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getAlias, (req, v) -> {
                req.setAlias(v);
            }));
        builder.<String>withRequestField("visibility",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getVisibility, (req, v) -> {
                req.setVisibility(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchJobRequest, ListBatchJobResponse> listBatchJob = genForlistBatchJob();

    private static HttpRequestDef<ListBatchJobRequest, ListBatchJobResponse> genForlistBatchJob() {
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
            f -> f.withMarshaller(ListBatchJobRequest::getJobType, (req, v) -> {
                req.setJobType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchJobRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/configmaps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigMapsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> listDeployments =
        genForlistDeployments();

    private static HttpRequestDef<ListDeploymentsRequest, ListDeploymentsResponse> genForlistDeployments() {
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
            f -> f.withMarshaller(ListDeploymentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeploymentsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> listDeviceTemplates =
        genForlistDeviceTemplates();

    private static HttpRequestDef<ListDeviceTemplatesRequest, ListDeviceTemplatesResponse> genForlistDeviceTemplates() {
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
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceTemplatesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
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
            f -> f.withMarshaller(ListDevicesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("is_binding",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getIsBinding, (req, v) -> {
                req.setIsBinding(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> listEdgeGroupCerts =
        genForlistEdgeGroupCerts();

    private static HttpRequestDef<ListEdgeGroupCertsRequest, ListEdgeGroupCertsResponse> genForlistEdgeGroupCerts() {
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
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupCertsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<List<EdgeGroupCertListResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEdgeGroupCertsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(EdgeGroupCertListResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeGroupsRequest, ListEdgeGroupsResponse> listEdgeGroups =
        genForlistEdgeGroups();

    private static HttpRequestDef<ListEdgeGroupsRequest, ListEdgeGroupsResponse> genForlistEdgeGroups() {
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
            f -> f.withMarshaller(ListEdgeGroupsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeGroupsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> listEdgeNodeCerts =
        genForlistEdgeNodeCerts();

    private static HttpRequestDef<ListEdgeNodeCertsRequest, ListEdgeNodeCertsResponse> genForlistEdgeNodeCerts() {
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
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodeCertsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> listEdgeNodes =
        genForlistEdgeNodes();

    private static HttpRequestDef<ListEdgeNodesRequest, ListEdgeNodesResponse> genForlistEdgeNodes() {
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
            f -> f.withMarshaller(ListEdgeNodesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<ListEdgeNodesRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEdgeNodesRequest.StateEnum.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEdgeNodesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> listEncryptdataNodes =
        genForlistEncryptdataNodes();

    private static HttpRequestDef<ListEncryptdataNodesRequest, ListEncryptdataNodesResponse> genForlistEncryptdataNodes() {
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
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getEncryptdataId, (req, v) -> {
                req.setEncryptdataId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdataNodesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEncryptdatasRequest, ListEncryptdatasResponse> listEncryptdatas =
        genForlistEncryptdatas();

    private static HttpRequestDef<ListEncryptdatasRequest, ListEncryptdatasResponse> genForlistEncryptdatas() {
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
            f -> f.withMarshaller(ListEncryptdatasRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForlistEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForlistEndpoints() {
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
            f -> f.withMarshaller(ListEndpointsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("is_shared",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getIsShared, (req, v) -> {
                req.setIsShared(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> listNodeEncryptdatas =
        genForlistNodeEncryptdatas();

    private static HttpRequestDef<ListNodeEncryptdatasRequest, ListNodeEncryptdatasResponse> genForlistNodeEncryptdatas() {
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
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNodeEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPodsRequest, ListPodsResponse> listPods = genForlistPods();

    private static HttpRequestDef<ListPodsRequest, ListPodsResponse> genForlistPods() {
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
            f -> f.withMarshaller(ListPodsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("deployment_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getDeploymentIds, (req, v) -> {
                req.setDeploymentIds(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPodsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPodsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPodsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
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
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProductsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceByTagsRequest, ListResourceByTagsResponse> listResourceByTags =
        genForlistResourceByTags();

    private static HttpRequestDef<ListResourceByTagsRequest, ListResourceByTagsResponse> genForlistResourceByTags() {
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
            f -> f.withMarshaller(ListResourceByTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceByTagsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Tags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Tags.class),
            f -> f.withMarshaller(ListResourceByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleErrorsRequest, ListRuleErrorsResponse> listRuleErrors =
        genForlistRuleErrors();

    private static HttpRequestDef<ListRuleErrorsRequest, ListRuleErrorsResponse> genForlistRuleErrors() {
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
            f -> f.withMarshaller(ListRuleErrorsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleErrorsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForlistRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForlistRules() {
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
            f -> f.withMarshaller(ListRulesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRulesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForlistServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForlistServices() {
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
            f -> f.withMarshaller(ListServicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListServicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("sorted",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getSorted, (req, v) -> {
                req.setSorted(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicesRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemEventsRequest, ListSystemEventsResponse> listSystemEvents =
        genForlistSystemEvents();

    private static HttpRequestDef<ListSystemEventsRequest, ListSystemEventsResponse> genForlistSystemEvents() {
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
            f -> f.withMarshaller(ListSystemEventsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemEventsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
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
            f -> f.withMarshaller(ListTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> listTagsByResourceType =
        genForlistTagsByResourceType();

    private static HttpRequestDef<ListTagsByResourceTypeRequest, ListTagsByResourceTypeResponse> genForlistTagsByResourceType() {
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
            f -> f.withMarshaller(ListTagsByResourceTypeRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsByResourceTypeRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> restartDeploymentsPod =
        genForrestartDeploymentsPod();

    private static HttpRequestDef<RestartDeploymentsPodRequest, RestartDeploymentsPodResponse> genForrestartDeploymentsPod() {
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
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("pod_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getPodName, (req, v) -> {
                req.setPodName(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartDeploymentsPodRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestartDeploymentsPodResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<RestoreBatchJobRequest, RestoreBatchJobResponse> restoreBatchJob =
        genForrestoreBatchJob();

    private static HttpRequestDef<RestoreBatchJobRequest, RestoreBatchJobResponse> genForrestoreBatchJob() {
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
            f -> f.withMarshaller(RestoreBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RestoreBatchJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<RetryBatchJobRequest, RetryBatchJobResponse> retryBatchJob =
        genForretryBatchJob();

    private static HttpRequestDef<RetryBatchJobRequest, RetryBatchJobResponse> genForretryBatchJob() {
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
            f -> f.withMarshaller(RetryBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(RetryBatchJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> showAppDetail =
        genForshowAppDetail();

    private static HttpRequestDef<ShowAppDetailRequest, ShowAppDetailResponse> genForshowAppDetail() {
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
            f -> f.withMarshaller(ShowAppDetailRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> showAppVersionDetail =
        genForshowAppVersionDetail();

    private static HttpRequestDef<ShowAppVersionDetailRequest, ShowAppVersionDetailResponse> genForshowAppVersionDetail() {
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
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAppVersionDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> showBatchJob = genForshowBatchJob();

    private static HttpRequestDef<ShowBatchJobRequest, ShowBatchJobResponse> genForshowBatchJob() {
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
            f -> f.withMarshaller(ShowBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigMapRequest::getConfigmapId, (req, v) -> {
                req.setConfigmapId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigMapRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeploymentRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForshowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForshowDevice() {
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
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> showDeviceTemplate =
        genForshowDeviceTemplate();

    private static HttpRequestDef<ShowDeviceTemplateRequest, ShowDeviceTemplateResponse> genForshowDeviceTemplate() {
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
            f -> f.withMarshaller(ShowDeviceTemplateRequest::getDeviceTemplateId, (req, v) -> {
                req.setDeviceTemplateId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTemplateRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceTwinRequest, ShowDeviceTwinResponse> showDeviceTwin =
        genForshowDeviceTwin();

    private static HttpRequestDef<ShowDeviceTwinRequest, ShowDeviceTwinResponse> genForshowDeviceTwin() {
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
            f -> f.withMarshaller(ShowDeviceTwinRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeviceTwinRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> showEdgeGroupCertDetail =
        genForshowEdgeGroupCertDetail();

    private static HttpRequestDef<ShowEdgeGroupCertDetailRequest, ShowEdgeGroupCertDetailResponse> genForshowEdgeGroupCertDetail() {
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
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("group_cert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getGroupCertId, (req, v) -> {
                req.setGroupCertId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupCertDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> showEdgeGroupDetail =
        genForshowEdgeGroupDetail();

    private static HttpRequestDef<ShowEdgeGroupDetailRequest, ShowEdgeGroupDetailResponse> genForshowEdgeGroupDetail() {
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
            f -> f.withMarshaller(ShowEdgeGroupDetailRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeGroupDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> showEdgeNodeDetail =
        genForshowEdgeNodeDetail();

    private static HttpRequestDef<ShowEdgeNodeDetailRequest, ShowEdgeNodeDetailResponse> genForshowEdgeNodeDetail() {
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
            f -> f.withMarshaller(ShowEdgeNodeDetailRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEdgeNodeDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEncryptdatasRequest, ShowEncryptdatasResponse> showEncryptdatas =
        genForshowEncryptdatas();

    private static HttpRequestDef<ShowEncryptdatasRequest, ShowEncryptdatasResponse> genForshowEncryptdatas() {
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
            f -> f.withMarshaller(ShowEncryptdatasRequest::getEncryptdataId, (req, v) -> {
                req.setEncryptdataId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndPointDetailRequest, ShowEndPointDetailResponse> showEndPointDetail =
        genForshowEndPointDetail();

    private static HttpRequestDef<ShowEndPointDetailRequest, ShowEndPointDetailResponse> genForshowEndPointDetail() {
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
            f -> f.withMarshaller(ShowEndPointDetailRequest::getEndpointId, (req, v) -> {
                req.setEndpointId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndPointDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductDetailRequest, ShowProductDetailResponse> showProductDetail =
        genForshowProductDetail();

    private static HttpRequestDef<ShowProductDetailRequest, ShowProductDetailResponse> genForshowProductDetail() {
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
            f -> f.withMarshaller(ShowProductDetailRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProductDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
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
            f -> f.withMarshaller(ShowQuotaRequest::getTypes, (req, v) -> {
                req.setTypes(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleDetailRequest, ShowRuleDetailResponse> showRuleDetail =
        genForshowRuleDetail();

    private static HttpRequestDef<ShowRuleDetailRequest, ShowRuleDetailResponse> genForshowRuleDetail() {
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
            f -> f.withMarshaller(ShowRuleDetailRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRuleDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
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
                .withUri("/v2/{project_id}/edgemgr/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> showServiceDetail =
        genForshowServiceDetail();

    private static HttpRequestDef<ShowServiceDetailRequest, ShowServiceDetailResponse> genForshowServiceDetail() {
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
            f -> f.withMarshaller(ShowServiceDetailRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowServiceDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> showSystemEventDetail =
        genForshowSystemEventDetail();

    private static HttpRequestDef<ShowSystemEventDetailRequest, ShowSystemEventDetailResponse> genForshowSystemEventDetail() {
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
            f -> f.withMarshaller(ShowSystemEventDetailRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSystemEventDetailRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartRuleRequest, StartRuleResponse> startRule = genForstartRule();

    private static HttpRequestDef<StartRuleRequest, StartRuleResponse> genForstartRule() {
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
            f -> f.withMarshaller(StartRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartRuleRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartSystemEventRequest, StartSystemEventResponse> startSystemEvent =
        genForstartSystemEvent();

    private static HttpRequestDef<StartSystemEventRequest, StartSystemEventResponse> genForstartSystemEvent() {
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
            f -> f.withMarshaller(StartSystemEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartSystemEventRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBatchJobRequest, StopBatchJobResponse> stopBatchJob = genForstopBatchJob();

    private static HttpRequestDef<StopBatchJobRequest, StopBatchJobResponse> genForstopBatchJob() {
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
            f -> f.withMarshaller(StopBatchJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBatchJobRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(StopBatchJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<StopRuleRequest, StopRuleResponse> stopRule = genForstopRule();

    private static HttpRequestDef<StopRuleRequest, StopRuleResponse> genForstopRule() {
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
            f -> f.withMarshaller(StopRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopRuleRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopSystemEventRequest, StopSystemEventResponse> stopSystemEvent =
        genForstopSystemEvent();

    private static HttpRequestDef<StopSystemEventRequest, StopSystemEventResponse> genForstopSystemEvent() {
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
            f -> f.withMarshaller(StopSystemEventRequest::getEventId, (req, v) -> {
                req.setEventId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopSystemEventRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppRequest, UpdateAppResponse> updateApp = genForupdateApp();

    private static HttpRequestDef<UpdateAppRequest, UpdateAppResponse> genForupdateApp() {
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
            f -> f.withMarshaller(UpdateAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateAppBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAppBody.class),
            f -> f.withMarshaller(UpdateAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppVersionRequest, UpdateAppVersionResponse> updateAppVersion =
        genForupdateAppVersion();

    private static HttpRequestDef<UpdateAppVersionRequest, UpdateAppVersionResponse> genForupdateAppVersion() {
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
            f -> f.withMarshaller(UpdateAppVersionRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdataAppVersionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdataAppVersionBody.class),
            f -> f.withMarshaller(UpdateAppVersionRequest::getBody, (req, v) -> {
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
                .withUri("/v2/{project_id}/edgemgr/configmaps/{configmap_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configmap_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getConfigmapId, (req, v) -> {
                req.setConfigmapId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigMapRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateConfigMaps>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigMaps.class),
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
                .withUri("/v3/{project_id}/edgemgr/deployments/{deployment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deployment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getDeploymentId, (req, v) -> {
                req.setDeploymentId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateDeployment>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDeployment.class),
            f -> f.withMarshaller(UpdateDeploymentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
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
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgemgrDevicesUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgemgrDevicesUpdate.class),
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> updateDeviceTemplateById =
        genForupdateDeviceTemplateById();

    private static HttpRequestDef<UpdateDeviceTemplateByIdRequest, UpdateDeviceTemplateByIdResponse> genForupdateDeviceTemplateById() {
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
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getDeviceTemplateId, (req, v) -> {
                req.setDeviceTemplateId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<DeviceTemplateUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeviceTemplateUpdate.class),
            f -> f.withMarshaller(UpdateDeviceTemplateByIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> updateDeviceTwin =
        genForupdateDeviceTwin();

    private static HttpRequestDef<UpdateDeviceTwinRequest, UpdateDeviceTwinResponse> genForupdateDeviceTwin() {
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
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<TwinUpdateDetail>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TwinUpdateDetail.class),
            f -> f.withMarshaller(UpdateDeviceTwinRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> updateEdgeGroup =
        genForupdateEdgeGroup();

    private static HttpRequestDef<UpdateEdgeGroupRequest, UpdateEdgeGroupResponse> genForupdateEdgeGroup() {
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
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgeGroupUpdateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EdgeGroupUpdateRequest.class),
            f -> f.withMarshaller(UpdateEdgeGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> updateEdgeGroupNodeBinding =
        genForupdateEdgeGroupNodeBinding();

    private static HttpRequestDef<UpdateEdgeGroupNodeBindingRequest, UpdateEdgeGroupNodeBindingResponse> genForupdateEdgeGroupNodeBinding() {
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
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateGroupNodeBindingRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateGroupNodeBindingRequest.class),
            f -> f.withMarshaller(UpdateEdgeGroupNodeBindingRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> updateEdgeNode =
        genForupdateEdgeNode();

    private static HttpRequestDef<UpdateEdgeNodeRequest, UpdateEdgeNodeResponse> genForupdateEdgeNode() {
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
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateEdgeNodeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateEdgeNodeBody.class),
            f -> f.withMarshaller(UpdateEdgeNodeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> updateEdgeNodeDevice =
        genForupdateEdgeNodeDevice();

    private static HttpRequestDef<UpdateEdgeNodeDeviceRequest, UpdateEdgeNodeDeviceResponse> genForupdateEdgeNodeDevice() {
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
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Devices>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Devices.class),
            f -> f.withMarshaller(UpdateEdgeNodeDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> updateEncryptdatas =
        genForupdateEncryptdatas();

    private static HttpRequestDef<UpdateEncryptdatasRequest, UpdateEncryptdatasResponse> genForupdateEncryptdatas() {
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
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getEncryptdataId, (req, v) -> {
                req.setEncryptdataId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EncryptDataReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataReq.class),
            f -> f.withMarshaller(UpdateEncryptdatasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> updateNodeByDeviceId =
        genForupdateNodeByDeviceId();

    private static HttpRequestDef<UpdateNodeByDeviceIdRequest, UpdateNodeByDeviceIdResponse> genForupdateNodeByDeviceId() {
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
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<EdgeNodeUpdateByDevice>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EdgeNodeUpdateByDevice.class),
            f -> f.withMarshaller(UpdateNodeByDeviceIdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForupdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForupdateSecret() {
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
            f -> f.withMarshaller(UpdateSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<UpdateSecret>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecret.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService =
        genForupdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForupdateService() {
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
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServiceRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));
        builder.<Service>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Service.class),
            f -> f.withMarshaller(UpdateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> upgradeEdgeNode =
        genForupgradeEdgeNode();

    private static HttpRequestDef<UpgradeEdgeNodeRequest, UpgradeEdgeNodeResponse> genForupgradeEdgeNode() {
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
            f -> f.withMarshaller(UpgradeEdgeNodeRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<String>withRequestField("ief-instance-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEdgeNodeRequest::getIefInstanceId, (req, v) -> {
                req.setIefInstanceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpgradeEdgeNodeResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}

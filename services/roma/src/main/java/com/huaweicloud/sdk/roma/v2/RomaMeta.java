package com.huaweicloud.sdk.roma.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.roma.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class RomaMeta {

    public static final HttpRequestDef<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> addSubsetsToGateway = genForaddSubsetsToGateway();

    private static HttpRequestDef<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> genForaddSubsetsToGateway() {
        // basic
        HttpRequestDef.Builder<AddSubsetsToGatewayRequest, AddSubsetsToGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddSubsetsToGatewayRequest.class, AddSubsetsToGatewayResponse.class)
                .withName("AddSubsetsToGateway")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/subsets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddSubsetsToGatewayRequestBody.class,
            f -> f.withMarshaller(AddSubsetsToGatewayRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(AddSubsetsToGatewayResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(Device.class)
        );

        return builder.build();
    }

    public static final HttpRequestDef<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> associateAppsForAppQuota = genForassociateAppsForAppQuota();

    private static HttpRequestDef<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> genForassociateAppsForAppQuota() {
        // basic
        HttpRequestDef.Builder<AssociateAppsForAppQuotaRequest, AssociateAppsForAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateAppsForAppQuotaRequest.class, AssociateAppsForAppQuotaResponse.class)
                .withName("AssociateAppsForAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/binding-apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAppQuotaBindingApp.class,
            f -> f.withMarshaller(AssociateAppsForAppQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2 = genForassociateCertificateV2();

    private static HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> genForassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<AssociateCertificateV2Request, AssociateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateCertificateV2Request.class, AssociateCertificateV2Response.class)
                .withName("AssociateCertificateV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DomainCertReq.class,
            f -> f.withMarshaller(AssociateCertificateV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2 = genForassociateDomainV2();

    private static HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> genForassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<AssociateDomainV2Request, AssociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateDomainV2Request.class, AssociateDomainV2Response.class)
                .withName("AssociateDomainV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UrlDomainCreate.class,
            f -> f.withMarshaller(AssociateDomainV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2 = genForassociateSignatureKeyV2();

    private static HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> genForassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateSignatureKeyV2Request.class, AssociateSignatureKeyV2Response.class)
                .withName("AssociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignBindingReq.class,
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> batchAddDeviceToGroup = genForbatchAddDeviceToGroup();

    private static HttpRequestDef<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> genForbatchAddDeviceToGroup() {
        // basic
        HttpRequestDef.Builder<BatchAddDeviceToGroupRequest, BatchAddDeviceToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddDeviceToGroupRequest.class, BatchAddDeviceToGroupResponse.class)
                .withName("BatchAddDeviceToGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices/batch-add")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BatchAddDeviceToGroupRequestBody.class,
            f -> f.withMarshaller(BatchAddDeviceToGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> batchDeleteDevices = genForbatchDeleteDevices();

    private static HttpRequestDef<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> genForbatchDeleteDevices() {
        // basic
        HttpRequestDef.Builder<BatchDeleteDevicesRequest, BatchDeleteDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteDevicesRequest.class, BatchDeleteDevicesResponse.class)
                .withName("BatchDeleteDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BatchDeleteDevicesRequestBody.class,
            f -> f.withMarshaller(BatchDeleteDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> batchDeleteMqsInstanceTopic = genForbatchDeleteMqsInstanceTopic();

    private static HttpRequestDef<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> genForbatchDeleteMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<BatchDeleteMqsInstanceTopicRequest, BatchDeleteMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteMqsInstanceTopicRequest.class, BatchDeleteMqsInstanceTopicResponse.class)
                .withName("BatchDeleteMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteMqsInstanceTopicReq.class,
            f -> f.withMarshaller(BatchDeleteMqsInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRulesRequest, BatchDeleteRulesResponse> batchDeleteRules = genForbatchDeleteRules();

    private static HttpRequestDef<BatchDeleteRulesRequest, BatchDeleteRulesResponse> genForbatchDeleteRules() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRulesRequest, BatchDeleteRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchDeleteRulesRequest.class, BatchDeleteRulesResponse.class)
                .withName("BatchDeleteRules")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/batch-delete")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchDeleteRulesRequestBody.class,
            f -> f.withMarshaller(BatchDeleteRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> batchFreezeDevices = genForbatchFreezeDevices();

    private static HttpRequestDef<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> genForbatchFreezeDevices() {
        // basic
        HttpRequestDef.Builder<BatchFreezeDevicesRequest, BatchFreezeDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchFreezeDevicesRequest.class, BatchFreezeDevicesResponse.class)
                .withName("BatchFreezeDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/force-offline")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchFreezeDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            BatchFreezeDevicesRequestBody.class,
            f -> f.withMarshaller(BatchFreezeDevicesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckLivedataApisV2Request, CheckLivedataApisV2Response> checkLivedataApisV2 = genForcheckLivedataApisV2();

    private static HttpRequestDef<CheckLivedataApisV2Request, CheckLivedataApisV2Response> genForcheckLivedataApisV2() {
        // basic
        HttpRequestDef.Builder<CheckLivedataApisV2Request, CheckLivedataApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckLivedataApisV2Request.class, CheckLivedataApisV2Response.class)
                .withName("CheckLivedataApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckLivedataApisV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LdApiCheckInfo.class,
            f -> f.withMarshaller(CheckLivedataApisV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountDevicesRequest, CountDevicesResponse> countDevices = genForcountDevices();

    private static HttpRequestDef<CountDevicesRequest, CountDevicesResponse> genForcountDevices() {
        // basic
        HttpRequestDef.Builder<CountDevicesRequest, CountDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountDevicesRequest.class, CountDevicesResponse.class)
                .withName("CountDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/statistics/devices-count")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CountDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2 = genForcreateAppCodeAutoV2();

    private static HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> genForcreateAppCodeAutoV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateAppCodeAutoV2Request.class, CreateAppCodeAutoV2Response.class)
                .withName("CreateAppCodeAutoV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2 = genForcreateAppCodeV2();

    private static HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> genForcreateAppCodeV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeV2Request, CreateAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppCodeV2Request.class, CreateAppCodeV2Response.class)
                .withName("CreateAppCodeV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppCodeCreate.class,
            f -> f.withMarshaller(CreateAppCodeV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppConfigV2Request, CreateAppConfigV2Response> createAppConfigV2 = genForcreateAppConfigV2();

    private static HttpRequestDef<CreateAppConfigV2Request, CreateAppConfigV2Response> genForcreateAppConfigV2() {
        // basic
        HttpRequestDef.Builder<CreateAppConfigV2Request, CreateAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppConfigV2Request.class, CreateAppConfigV2Response.class)
                .withName("CreateAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppConfigV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppConfigV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppConfigCreateRequest.class,
            f -> f.withMarshaller(CreateAppConfigV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> createAppQuota = genForcreateAppQuota();

    private static HttpRequestDef<CreateAppQuotaRequest, CreateAppQuotaResponse> genForcreateAppQuota() {
        // basic
        HttpRequestDef.Builder<CreateAppQuotaRequest, CreateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppQuotaRequest.class, CreateAppQuotaResponse.class)
                .withName("CreateAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppQuotaCreate.class,
            f -> f.withMarshaller(CreateAppQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCommandRequest, CreateCommandResponse> createCommand = genForcreateCommand();

    private static HttpRequestDef<CreateCommandRequest, CreateCommandResponse> genForcreateCommand() {
        // basic
        HttpRequestDef.Builder<CreateCommandRequest, CreateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCommandRequest.class, CreateCommandResponse.class)
                .withName("CreateCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCommandRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCommandRequestBody.class,
            f -> f.withMarshaller(CreateCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2 = genForcreateCustomAuthorizerV2();

    private static HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> genForcreateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomAuthorizerV2Request.class, CreateCustomAuthorizerV2Response.class)
                .withName("CreateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AuthorizerCreate.class,
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDestinationRequest, CreateDestinationResponse> createDestination = genForcreateDestination();

    private static HttpRequestDef<CreateDestinationRequest, CreateDestinationResponse> genForcreateDestination() {
        // basic
        HttpRequestDef.Builder<CreateDestinationRequest, CreateDestinationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDestinationRequest.class, CreateDestinationResponse.class)
                .withName("CreateDestination")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDestinationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDestinationRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDestinationRequestBody.class,
            f -> f.withMarshaller(CreateDestinationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> createDevice = genForcreateDevice();

    private static HttpRequestDef<CreateDeviceRequest, CreateDeviceResponse> genForcreateDevice() {
        // basic
        HttpRequestDef.Builder<CreateDeviceRequest, CreateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceRequest.class, CreateDeviceResponse.class)
                .withName("CreateDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDeviceRequestBody.class,
            f -> f.withMarshaller(CreateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDeviceGroupRequest, CreateDeviceGroupResponse> createDeviceGroup = genForcreateDeviceGroup();

    private static HttpRequestDef<CreateDeviceGroupRequest, CreateDeviceGroupResponse> genForcreateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<CreateDeviceGroupRequest, CreateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDeviceGroupRequest.class, CreateDeviceGroupResponse.class)
                .withName("CreateDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDeviceGroupRequestBody.class,
            f -> f.withMarshaller(CreateDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2 = genForcreateEnvironmentV2();

    private static HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> genForcreateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentV2Request, CreateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentV2Request.class, CreateEnvironmentV2Response.class)
                .withName("CreateEnvironmentV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvReq.class,
            f -> f.withMarshaller(CreateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2 = genForcreateEnvironmentVariableV2();

    private static HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> genForcreateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentVariableV2Request.class, CreateEnvironmentVariableV2Response.class)
                .withName("CreateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvVariableReq.class,
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2 = genForcreateFeatureV2();

    private static HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> genForcreateFeatureV2() {
        // basic
        HttpRequestDef.Builder<CreateFeatureV2Request, CreateFeatureV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFeatureV2Request.class, CreateFeatureV2Response.class)
                .withName("CreateFeatureV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/features")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateFeatureV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            FeatureToggle.class,
            f -> f.withMarshaller(CreateFeatureV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> createLiveDataApiScriptV2 = genForcreateLiveDataApiScriptV2();

    private static HttpRequestDef<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> genForcreateLiveDataApiScriptV2() {
        // basic
        HttpRequestDef.Builder<CreateLiveDataApiScriptV2Request, CreateLiveDataApiScriptV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLiveDataApiScriptV2Request.class, CreateLiveDataApiScriptV2Response.class)
                .withName("CreateLiveDataApiScriptV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LdApiScriptCreate.class,
            f -> f.withMarshaller(CreateLiveDataApiScriptV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> createLiveDataApiV2 = genForcreateLiveDataApiV2();

    private static HttpRequestDef<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> genForcreateLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<CreateLiveDataApiV2Request, CreateLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLiveDataApiV2Request.class, CreateLiveDataApiV2Response.class)
                .withName("CreateLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LdApiCreate.class,
            f -> f.withMarshaller(CreateLiveDataApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> createMqsInstanceTopic = genForcreateMqsInstanceTopic();

    private static HttpRequestDef<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> genForcreateMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<CreateMqsInstanceTopicRequest, CreateMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMqsInstanceTopicRequest.class, CreateMqsInstanceTopicResponse.class)
                .withName("CreateMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMqsInstanceTopicReq.class,
            f -> f.withMarshaller(CreateMqsInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductRequest, CreateProductResponse> createProduct = genForcreateProduct();

    private static HttpRequestDef<CreateProductRequest, CreateProductResponse> genForcreateProduct() {
        // basic
        HttpRequestDef.Builder<CreateProductRequest, CreateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductRequest.class, CreateProductResponse.class)
                .withName("CreateProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProductRequestBody.class,
            f -> f.withMarshaller(CreateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductTemplateRequest, CreateProductTemplateResponse> createProductTemplate = genForcreateProductTemplate();

    private static HttpRequestDef<CreateProductTemplateRequest, CreateProductTemplateResponse> genForcreateProductTemplate() {
        // basic
        HttpRequestDef.Builder<CreateProductTemplateRequest, CreateProductTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductTemplateRequest.class, CreateProductTemplateResponse.class)
                .withName("CreateProductTemplate")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateProductTemplateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProductTemplateRequestBody.class,
            f -> f.withMarshaller(CreateProductTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProductTopicRequest, CreateProductTopicResponse> createProductTopic = genForcreateProductTopic();

    private static HttpRequestDef<CreateProductTopicRequest, CreateProductTopicResponse> genForcreateProductTopic() {
        // basic
        HttpRequestDef.Builder<CreateProductTopicRequest, CreateProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProductTopicRequest.class, CreateProductTopicResponse.class)
                .withName("CreateProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateProductTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(CreateProductTopicRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateProductTopicRequestBody.class,
            f -> f.withMarshaller(CreateProductTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePropertyRequest, CreatePropertyResponse> createProperty = genForcreateProperty();

    private static HttpRequestDef<CreatePropertyRequest, CreatePropertyResponse> genForcreateProperty() {
        // basic
        HttpRequestDef.Builder<CreatePropertyRequest, CreatePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePropertyRequest.class, CreatePropertyResponse.class)
                .withName("CreateProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreatePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePropertyRequestBody.class,
            f -> f.withMarshaller(CreatePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestPropertyRequest, CreateRequestPropertyResponse> createRequestProperty = genForcreateRequestProperty();

    private static HttpRequestDef<CreateRequestPropertyRequest, CreateRequestPropertyResponse> genForcreateRequestProperty() {
        // basic
        HttpRequestDef.Builder<CreateRequestPropertyRequest, CreateRequestPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRequestPropertyRequest.class, CreateRequestPropertyResponse.class)
                .withName("CreateRequestProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRequestPropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRequestPropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(CreateRequestPropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePropertyRequestBody.class,
            f -> f.withMarshaller(CreateRequestPropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2 = genForcreateRequestThrottlingPolicyV2();

    private static HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> genForcreateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRequestThrottlingPolicyV2Request.class, CreateRequestThrottlingPolicyV2Response.class)
                .withName("CreateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleReq.class,
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResponsePropertyRequest, CreateResponsePropertyResponse> createResponseProperty = genForcreateResponseProperty();

    private static HttpRequestDef<CreateResponsePropertyRequest, CreateResponsePropertyResponse> genForcreateResponseProperty() {
        // basic
        HttpRequestDef.Builder<CreateResponsePropertyRequest, CreateResponsePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResponsePropertyRequest.class, CreateResponsePropertyResponse.class)
                .withName("CreateResponseProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateResponsePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateResponsePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(CreateResponsePropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePropertyRequestBody.class,
            f -> f.withMarshaller(CreateResponsePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForcreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForcreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRuleRequestBody.class,
            f -> f.withMarshaller(CreateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceRequest, CreateServiceResponse> createService = genForcreateService();

    private static HttpRequestDef<CreateServiceRequest, CreateServiceResponse> genForcreateService() {
        // basic
        HttpRequestDef.Builder<CreateServiceRequest, CreateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateServiceRequest.class, CreateServiceResponse.class)
                .withName("CreateService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateServiceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateServiceRequestBody.class,
            f -> f.withMarshaller(CreateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2 = genForcreateSignatureKeyV2();

    private static HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> genForcreateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSignatureKeyV2Request.class, CreateSignatureKeyV2Response.class)
                .withName("CreateSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignatureReq.class,
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSourceRequest, CreateSourceResponse> createSource = genForcreateSource();

    private static HttpRequestDef<CreateSourceRequest, CreateSourceResponse> genForcreateSource() {
        // basic
        HttpRequestDef.Builder<CreateSourceRequest, CreateSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSourceRequest.class, CreateSourceResponse.class)
                .withName("CreateSource")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSourceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSourceRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateSourceRequestBody.class,
            f -> f.withMarshaller(CreateSourceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2 = genForcreateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> genForcreateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSpecialThrottlingConfigurationV2Request.class, CreateSpecialThrottlingConfigurationV2Response.class)
                .withName("CreateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleSpecialReq.class,
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> debugLiveDataApiV2 = genFordebugLiveDataApiV2();

    private static HttpRequestDef<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> genFordebugLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<DebugLiveDataApiV2Request, DebugLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugLiveDataApiV2Request.class, DebugLiveDataApiV2Response.class)
                .withName("DebugLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/test")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            LdApiTest.class,
            f -> f.withMarshaller(DebugLiveDataApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugRuleRequest, DebugRuleResponse> debugRule = genFordebugRule();

    private static HttpRequestDef<DebugRuleRequest, DebugRuleResponse> genFordebugRule() {
        // basic
        HttpRequestDef.Builder<DebugRuleRequest, DebugRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugRuleRequest.class, DebugRuleResponse.class)
                .withName("DebugRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rule-test")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DebugRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DebugRuleRequestBody.class,
            f -> f.withMarshaller(DebugRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> deleteAppAcl = genFordeleteAppAcl();

    private static HttpRequestDef<DeleteAppAclRequest, DeleteAppAclResponse> genFordeleteAppAcl() {
        // basic
        HttpRequestDef.Builder<DeleteAppAclRequest, DeleteAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppAclRequest.class, DeleteAppAclResponse.class)
                .withName("DeleteAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppAclRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppAclRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2 = genFordeleteAppCodeV2();

    private static HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> genFordeleteAppCodeV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppCodeV2Request, DeleteAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppCodeV2Request.class, DeleteAppCodeV2Response.class)
                .withName("DeleteAppCodeV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppCodeId, (req, v) -> {
                req.setAppCodeId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppConfigV2Request, DeleteAppConfigV2Response> deleteAppConfigV2 = genFordeleteAppConfigV2();

    private static HttpRequestDef<DeleteAppConfigV2Request, DeleteAppConfigV2Response> genFordeleteAppConfigV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppConfigV2Request, DeleteAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppConfigV2Request.class, DeleteAppConfigV2Response.class)
                .withName("DeleteAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppConfigV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppConfigV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppConfigV2Request::getAppConfigId, (req, v) -> {
                req.setAppConfigId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> deleteAppQuota = genFordeleteAppQuota();

    private static HttpRequestDef<DeleteAppQuotaRequest, DeleteAppQuotaResponse> genFordeleteAppQuota() {
        // basic
        HttpRequestDef.Builder<DeleteAppQuotaRequest, DeleteAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppQuotaRequest.class, DeleteAppQuotaResponse.class)
                .withName("DeleteAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAppQuotaRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCommandRequest, DeleteCommandResponse> deleteCommand = genFordeleteCommand();

    private static HttpRequestDef<DeleteCommandRequest, DeleteCommandResponse> genFordeleteCommand() {
        // basic
        HttpRequestDef.Builder<DeleteCommandRequest, DeleteCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCommandRequest.class, DeleteCommandResponse.class)
                .withName("DeleteCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCommandRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteCommandRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2 = genFordeleteCustomAuthorizerV2();

    private static HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> genFordeleteCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomAuthorizerV2Request.class, DeleteCustomAuthorizerV2Response.class)
                .withName("DeleteCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDestinationRequest, DeleteDestinationResponse> deleteDestination = genFordeleteDestination();

    private static HttpRequestDef<DeleteDestinationRequest, DeleteDestinationResponse> genFordeleteDestination() {
        // basic
        HttpRequestDef.Builder<DeleteDestinationRequest, DeleteDestinationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDestinationRequest.class, DeleteDestinationResponse.class)
                .withName("DeleteDestination")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations/{destination_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDestinationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDestinationRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("destination_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDestinationRequest::getDestinationId, (req, v) -> {
                req.setDestinationId(v);
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
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> deleteDeviceFromGroup = genFordeleteDeviceFromGroup();

    private static HttpRequestDef<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> genFordeleteDeviceFromGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceFromGroupRequest, DeleteDeviceFromGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceFromGroupRequest.class, DeleteDeviceFromGroupResponse.class)
                .withName("DeleteDeviceFromGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeviceFromGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroup = genFordeleteDeviceGroup();

    private static HttpRequestDef<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> genFordeleteDeviceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDeviceGroupRequest.class, DeleteDeviceGroupResponse.class)
                .withName("DeleteDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2 = genFordeleteEnvironmentV2();

    private static HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> genFordeleteEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentV2Request.class, DeleteEnvironmentV2Response.class)
                .withName("DeleteEnvironmentV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2 = genFordeleteEnvironmentVariableV2();

    private static HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> genFordeleteEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentVariableV2Request.class, DeleteEnvironmentVariableV2Response.class)
                .withName("DeleteEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> deleteLiveDataApiV2 = genFordeleteLiveDataApiV2();

    private static HttpRequestDef<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> genFordeleteLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteLiveDataApiV2Request, DeleteLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLiveDataApiV2Request.class, DeleteLiveDataApiV2Response.class)
                .withName("DeleteLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> deleteMqsInstanceTopic = genFordeleteMqsInstanceTopic();

    private static HttpRequestDef<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> genFordeleteMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<DeleteMqsInstanceTopicRequest, DeleteMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMqsInstanceTopicRequest.class, DeleteMqsInstanceTopicResponse.class)
                .withName("DeleteMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMqsInstanceTopicRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductRequest, DeleteProductResponse> deleteProduct = genFordeleteProduct();

    private static HttpRequestDef<DeleteProductRequest, DeleteProductResponse> genFordeleteProduct() {
        // basic
        HttpRequestDef.Builder<DeleteProductRequest, DeleteProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductRequest.class, DeleteProductResponse.class)
                .withName("DeleteProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductTemplateRequest, DeleteProductTemplateResponse> deleteProductTemplate = genFordeleteProductTemplate();

    private static HttpRequestDef<DeleteProductTemplateRequest, DeleteProductTemplateResponse> genFordeleteProductTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteProductTemplateRequest, DeleteProductTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductTemplateRequest.class, DeleteProductTemplateResponse.class)
                .withName("DeleteProductTemplate")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProductTemplateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteProductTemplateRequest::getProductTemplateId, (req, v) -> {
                req.setProductTemplateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProductTopicRequest, DeleteProductTopicResponse> deleteProductTopic = genFordeleteProductTopic();

    private static HttpRequestDef<DeleteProductTopicRequest, DeleteProductTopicResponse> genFordeleteProductTopic() {
        // basic
        HttpRequestDef.Builder<DeleteProductTopicRequest, DeleteProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProductTopicRequest.class, DeleteProductTopicResponse.class)
                .withName("DeleteProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics/{topic_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteProductTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteProductTopicRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteProductTopicRequest::getTopicId, (req, v) -> {
                req.setTopicId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePropertyRequest, DeletePropertyResponse> deleteProperty = genFordeleteProperty();

    private static HttpRequestDef<DeletePropertyRequest, DeletePropertyResponse> genFordeleteProperty() {
        // basic
        HttpRequestDef.Builder<DeletePropertyRequest, DeletePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePropertyRequest.class, DeletePropertyResponse.class)
                .withName("DeleteProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeletePropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> deleteRequestProperty = genFordeleteRequestProperty();

    private static HttpRequestDef<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> genFordeleteRequestProperty() {
        // basic
        HttpRequestDef.Builder<DeleteRequestPropertyRequest, DeleteRequestPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRequestPropertyRequest.class, DeleteRequestPropertyResponse.class)
                .withName("DeleteRequestProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteRequestPropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2 = genFordeleteRequestThrottlingPolicyV2();

    private static HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> genFordeleteRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRequestThrottlingPolicyV2Request.class, DeleteRequestThrottlingPolicyV2Response.class)
                .withName("DeleteRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> deleteResponseProperty = genFordeleteResponseProperty();

    private static HttpRequestDef<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> genFordeleteResponseProperty() {
        // basic
        HttpRequestDef.Builder<DeleteResponsePropertyRequest, DeleteResponsePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResponsePropertyRequest.class, DeleteResponsePropertyResponse.class)
                .withName("DeleteResponseProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteResponsePropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genFordeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genFordeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> deleteService = genFordeleteService();

    private static HttpRequestDef<DeleteServiceRequest, DeleteServiceResponse> genFordeleteService() {
        // basic
        HttpRequestDef.Builder<DeleteServiceRequest, DeleteServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteServiceRequest.class, DeleteServiceResponse.class)
                .withName("DeleteService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServiceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2 = genFordeleteSignatureKeyV2();

    private static HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> genFordeleteSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSignatureKeyV2Request.class, DeleteSignatureKeyV2Response.class)
                .withName("DeleteSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs/{sign_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSourceRequest, DeleteSourceResponse> deleteSource = genFordeleteSource();

    private static HttpRequestDef<DeleteSourceRequest, DeleteSourceResponse> genFordeleteSource() {
        // basic
        HttpRequestDef.Builder<DeleteSourceRequest, DeleteSourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSourceRequest.class, DeleteSourceResponse.class)
                .withName("DeleteSource")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources/{source_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSourceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSourceRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("source_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteSourceRequest::getSourceId, (req, v) -> {
                req.setSourceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2 = genFordeleteSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> genFordeleteSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSpecialThrottlingConfigurationV2Request.class, DeleteSpecialThrottlingConfigurationV2Response.class)
                .withName("DeleteSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> disassociateAppQuotaWithApp = genFordisassociateAppQuotaWithApp();

    private static HttpRequestDef<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> genFordisassociateAppQuotaWithApp() {
        // basic
        HttpRequestDef.Builder<DisassociateAppQuotaWithAppRequest, DisassociateAppQuotaWithAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateAppQuotaWithAppRequest.class, DisassociateAppQuotaWithAppResponse.class)
                .withName("DisassociateAppQuotaWithApp")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateAppQuotaWithAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2 = genFordisassociateCertificateV2();

    private static HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> genFordisassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<DisassociateCertificateV2Request, DisassociateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateCertificateV2Request.class, DisassociateCertificateV2Response.class)
                .withName("DisassociateCertificateV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2 = genFordisassociateDomainV2();

    private static HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> genFordisassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<DisassociateDomainV2Request, DisassociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateDomainV2Request.class, DisassociateDomainV2Response.class)
                .withName("DisassociateDomainV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2 = genFordisassociateSignatureKeyV2();

    private static HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> genFordisassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateSignatureKeyV2Request.class, DisassociateSignatureKeyV2Response.class)
                .withName("DisassociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/{sign_bindings_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getSignBindingsId, (req, v) -> {
                req.setSignBindingsId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadProductsRequest, DownloadProductsResponse> downloadProducts = genFordownloadProducts();

    private static HttpRequestDef<DownloadProductsRequest, DownloadProductsResponse> genFordownloadProducts() {
        // basic
        HttpRequestDef.Builder<DownloadProductsRequest, DownloadProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DownloadProductsRequest.class, DownloadProductsResponse.class)
                .withName("DownloadProducts")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/export")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DownloadProductsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DownloadProductsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> exportMqsInstanceTopic = genForexportMqsInstanceTopic();

    private static HttpRequestDef<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> genForexportMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<ExportMqsInstanceTopicRequest, ExportMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportMqsInstanceTopicRequest.class, ExportMqsInstanceTopicResponse.class)
                .withName("ExportMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/export")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExportMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExportMqsInstanceTopicRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> importMqsInstanceTopic = genForimportMqsInstanceTopic();

    private static HttpRequestDef<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> genForimportMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<ImportMqsInstanceTopicRequest, ImportMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportMqsInstanceTopicRequest.class, ImportMqsInstanceTopicResponse.class)
                .withName("ImportMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/import")
                .withContentType("multipart/form-data");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ImportMqsInstanceTopicRequest.ModeEnum.class,
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ImportMqsInstanceTopicRequest::getPrefix, (req, v) -> {
                req.setPrefix(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2 = genForlistApisBindedToSignatureKeyV2();

    private static HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> genForlistApisBindedToSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToSignatureKeyV2Request.class, ListApisBindedToSignatureKeyV2Response.class)
                .withName("ListApisBindedToSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2 = genForlistApisNotBoundWithSignatureKeyV2();

    private static HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> genForlistApisNotBoundWithSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisNotBoundWithSignatureKeyV2Request.class, ListApisNotBoundWithSignatureKeyV2Response.class)
                .withName("ListApisNotBoundWithSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2 = genForlistAppCodesV2();

    private static HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> genForlistAppCodesV2() {
        // basic
        HttpRequestDef.Builder<ListAppCodesV2Request, ListAppCodesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppCodesV2Request.class, ListAppCodesV2Response.class)
                .withName("ListAppCodesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppCodesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppCodesV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppCodesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppCodesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppConfigsV2Request, ListAppConfigsV2Response> listAppConfigsV2 = genForlistAppConfigsV2();

    private static HttpRequestDef<ListAppConfigsV2Request, ListAppConfigsV2Response> genForlistAppConfigsV2() {
        // basic
        HttpRequestDef.Builder<ListAppConfigsV2Request, ListAppConfigsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppConfigsV2Request.class, ListAppConfigsV2Response.class)
                .withName("ListAppConfigsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/configs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("config_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getConfigName, (req, v) -> {
                req.setConfigName(v);
            })
        );
        builder.withRequestField("roma_app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getRomaAppName, (req, v) -> {
                req.setRomaAppName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppConfigsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> listAppQuotaBindableApps = genForlistAppQuotaBindableApps();

    private static HttpRequestDef<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> genForlistAppQuotaBindableApps() {
        // basic
        HttpRequestDef.Builder<ListAppQuotaBindableAppsRequest, ListAppQuotaBindableAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuotaBindableAppsRequest.class, ListAppQuotaBindableAppsResponse.class)
                .withName("ListAppQuotaBindableApps")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bindable-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppQuotaBindableAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> listAppQuotaBoundApps = genForlistAppQuotaBoundApps();

    private static HttpRequestDef<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> genForlistAppQuotaBoundApps() {
        // basic
        HttpRequestDef.Builder<ListAppQuotaBoundAppsRequest, ListAppQuotaBoundAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuotaBoundAppsRequest.class, ListAppQuotaBoundAppsResponse.class)
                .withName("ListAppQuotaBoundApps")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}/bound-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppQuotaBoundAppsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuotasRequest, ListAppQuotasResponse> listAppQuotas = genForlistAppQuotas();

    private static HttpRequestDef<ListAppQuotasRequest, ListAppQuotasResponse> genForlistAppQuotas() {
        // basic
        HttpRequestDef.Builder<ListAppQuotasRequest, ListAppQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuotasRequest.class, ListAppQuotasResponse.class)
                .withName("ListAppQuotas")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppQuotasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppQuotasRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppQuotasRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppQuotasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppUsagesTopNRequest, ListAppUsagesTopNResponse> listAppUsagesTopN = genForlistAppUsagesTopN();

    private static HttpRequestDef<ListAppUsagesTopNRequest, ListAppUsagesTopNResponse> genForlistAppUsagesTopN() {
        // basic
        HttpRequestDef.Builder<ListAppUsagesTopNRequest, ListAppUsagesTopNResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppUsagesTopNRequest.class, ListAppUsagesTopNResponse.class)
                .withName("ListAppUsagesTopN")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/app-usages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAppUsagesTopNRequest.ModeEnum.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getRomaAppId, (req, v) -> {
                req.setRomaAppId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListAppUsagesTopNRequest.CycleEnum.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppUsagesTopNRequest::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsV2Request, ListAppsV2Response> listAppsV2 = genForlistAppsV2();

    private static HttpRequestDef<ListAppsV2Request, ListAppsV2Response> genForlistAppsV2() {
        // basic
        HttpRequestDef.Builder<ListAppsV2Request, ListAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsV2Request.class, ListAppsV2Response.class)
                .withName("ListAppsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsV2Request::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getAppKey, (req, v) -> {
                req.setAppKey(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommandsRequest, ListCommandsResponse> listCommands = genForlistCommands();

    private static HttpRequestDef<ListCommandsRequest, ListCommandsResponse> genForlistCommands() {
        // basic
        HttpRequestDef.Builder<ListCommandsRequest, ListCommandsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommandsRequest.class, ListCommandsResponse.class)
                .withName("ListCommands")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCommandsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCommandsRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCommandsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCommandsRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("command_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCommandsRequest::getCommandName, (req, v) -> {
                req.setCommandName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCommandsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2 = genForlistCustomAuthorizersV2();

    private static HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> genForlistCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomAuthorizersV2Request.class, ListCustomAuthorizersV2Response.class)
                .withName("ListCustomAuthorizersV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDestinationsRequest, ListDestinationsResponse> listDestinations = genForlistDestinations();

    private static HttpRequestDef<ListDestinationsRequest, ListDestinationsResponse> genForlistDestinations() {
        // basic
        HttpRequestDef.Builder<ListDestinationsRequest, ListDestinationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDestinationsRequest.class, ListDestinationsResponse.class)
                .withName("ListDestinations")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/destinations")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDestinationsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDestinationsRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDestinationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDestinationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getProductName, (req, v) -> {
                req.setProductName(v);
            })
        );
        builder.withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            })
        );
        builder.withRequestField("client_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getClientId, (req, v) -> {
                req.setClientId(v);
            })
        );
        builder.withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            })
        );
        builder.withRequestField("node_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDevicesRequest::getNodeType, (req, v) -> {
                req.setNodeType(v);
            })
        );
        builder.withRequestField("online_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getOnlineStatus, (req, v) -> {
                req.setOnlineStatus(v);
            })
        );
        builder.withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListDevicesRequest::getCreatedDateStart, (req, v) -> {
                req.setCreatedDateStart(v);
            })
        );
        builder.withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListDevicesRequest::getCreatedDateEnd, (req, v) -> {
                req.setCreatedDateEnd(v);
            })
        );
        builder.withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDevicesRequest::getTag, (req, v) -> {
                req.setTag(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesInProductRequest, ListDevicesInProductResponse> listDevicesInProduct = genForlistDevicesInProduct();

    private static HttpRequestDef<ListDevicesInProductRequest, ListDevicesInProductResponse> genForlistDevicesInProduct() {
        // basic
        HttpRequestDef.Builder<ListDevicesInProductRequest, ListDevicesInProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesInProductRequest.class, ListDevicesInProductResponse.class)
                .withName("ListDevicesInProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/devices-summary")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDevicesInProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListDevicesInProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2 = genForlistEnvironmentVariablesV2();

    private static HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> genForlistEnvironmentVariablesV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentVariablesV2Request.class, ListEnvironmentVariablesV2Response.class)
                .withName("ListEnvironmentVariablesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("variable_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getVariableName, (req, v) -> {
                req.setVariableName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2 = genForlistEnvironmentsV2();

    private static HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> genForlistEnvironmentsV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsV2Request, ListEnvironmentsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsV2Request.class, ListEnvironmentsV2Response.class)
                .withName("ListEnvironmentsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEnvironmentsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2 = genForlistFeaturesV2();

    private static HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> genForlistFeaturesV2() {
        // basic
        HttpRequestDef.Builder<ListFeaturesV2Request, ListFeaturesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesV2Request.class, ListFeaturesV2Response.class)
                .withName("ListFeaturesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/features")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListFeaturesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListFeaturesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListFeaturesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2 = genForlistLatelyApiStatisticsV2();

    private static HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> genForlistLatelyApiStatisticsV2() {
        // basic
        HttpRequestDef.Builder<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLatelyApiStatisticsV2Request.class, ListLatelyApiStatisticsV2Response.class)
                .withName("ListLatelyApiStatisticsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/api/latest")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> listLiveDataApiDeploymentHistoryV2 = genForlistLiveDataApiDeploymentHistoryV2();

    private static HttpRequestDef<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> genForlistLiveDataApiDeploymentHistoryV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiDeploymentHistoryV2Request, ListLiveDataApiDeploymentHistoryV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataApiDeploymentHistoryV2Request.class, ListLiveDataApiDeploymentHistoryV2Response.class)
                .withName("ListLiveDataApiDeploymentHistoryV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiDeploymentHistoryV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiDeploymentHistoryV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> listLiveDataApiTestHistoryV2 = genForlistLiveDataApiTestHistoryV2();

    private static HttpRequestDef<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> genForlistLiveDataApiTestHistoryV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiTestHistoryV2Request, ListLiveDataApiTestHistoryV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataApiTestHistoryV2Request.class, ListLiveDataApiTestHistoryV2Response.class)
                .withName("ListLiveDataApiTestHistoryV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/test")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiTestHistoryV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataApiV2Request, ListLiveDataApiV2Response> listLiveDataApiV2 = genForlistLiveDataApiV2();

    private static HttpRequestDef<ListLiveDataApiV2Request, ListLiveDataApiV2Response> genForlistLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataApiV2Request, ListLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataApiV2Request.class, ListLiveDataApiV2Response.class)
                .withName("ListLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getPath, (req, v) -> {
                req.setPath(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLiveDataApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> listLiveDataDataSourcesV2 = genForlistLiveDataDataSourcesV2();

    private static HttpRequestDef<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> genForlistLiveDataDataSourcesV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataDataSourcesV2Request, ListLiveDataDataSourcesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataDataSourcesV2Request.class, ListLiveDataDataSourcesV2Response.class)
                .withName("ListLiveDataDataSourcesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/data-sources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLiveDataDataSourcesV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> listLiveDataQuotaV2 = genForlistLiveDataQuotaV2();

    private static HttpRequestDef<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> genForlistLiveDataQuotaV2() {
        // basic
        HttpRequestDef.Builder<ListLiveDataQuotaV2Request, ListLiveDataQuotaV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLiveDataQuotaV2Request.class, ListLiveDataQuotaV2Response.class)
                .withName("ListLiveDataQuotaV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-quota")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListLiveDataQuotaV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorInfosRequest, ListMonitorInfosResponse> listMonitorInfos = genForlistMonitorInfos();

    private static HttpRequestDef<ListMonitorInfosRequest, ListMonitorInfosResponse> genForlistMonitorInfos() {
        // basic
        HttpRequestDef.Builder<ListMonitorInfosRequest, ListMonitorInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitorInfosRequest.class, ListMonitorInfosResponse.class)
                .withName("ListMonitorInfos")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/task-monitors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitorInfosRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitorInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitorInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMonitorInfosRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            })
        );
        builder.withRequestField("execute_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListMonitorInfosRequest.ExecuteStatusEnum.class,
            f -> f.withMarshaller(ListMonitorInfosRequest::getExecuteStatus, (req, v) -> {
                req.setExecuteStatus(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitorLogRequest, ListMonitorLogResponse> listMonitorLog = genForlistMonitorLog();

    private static HttpRequestDef<ListMonitorLogRequest, ListMonitorLogResponse> genForlistMonitorLog() {
        // basic
        HttpRequestDef.Builder<ListMonitorLogRequest, ListMonitorLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMonitorLogRequest.class, ListMonitorLogResponse.class)
                .withName("ListMonitorLog")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/monitor-logs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListMonitorLogRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> listMqsInstanceTopics = genForlistMqsInstanceTopics();

    private static HttpRequestDef<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> genForlistMqsInstanceTopics() {
        // basic
        HttpRequestDef.Builder<ListMqsInstanceTopicsRequest, ListMqsInstanceTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMqsInstanceTopicsRequest.class, ListMqsInstanceTopicsResponse.class)
                .withName("ListMqsInstanceTopics")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMqsInstanceTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTemplatesRequest, ListProductTemplatesResponse> listProductTemplates = genForlistProductTemplates();

    private static HttpRequestDef<ListProductTemplatesRequest, ListProductTemplatesResponse> genForlistProductTemplates() {
        // basic
        HttpRequestDef.Builder<ListProductTemplatesRequest, ListProductTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductTemplatesRequest.class, ListProductTemplatesResponse.class)
                .withName("ListProductTemplates")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListProductTemplatesRequest.StatusEnum.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedUserName, (req, v) -> {
                req.setCreatedUserName(v);
            })
        );
        builder.withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedDateStart, (req, v) -> {
                req.setCreatedDateStart(v);
            })
        );
        builder.withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getCreatedDateEnd, (req, v) -> {
                req.setCreatedDateEnd(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductTopicsRequest, ListProductTopicsResponse> listProductTopics = genForlistProductTopics();

    private static HttpRequestDef<ListProductTopicsRequest, ListProductTopicsResponse> genForlistProductTopics() {
        // basic
        HttpRequestDef.Builder<ListProductTopicsRequest, ListProductTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductTopicsRequest.class, ListProductTopicsResponse.class)
                .withName("ListProductTopics")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProductTopicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListProductTopicsRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProductsRequest, ListProductsResponse> listProducts = genForlistProducts();

    private static HttpRequestDef<ListProductsRequest, ListProductsResponse> genForlistProducts() {
        // basic
        HttpRequestDef.Builder<ListProductsRequest, ListProductsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProductsRequest.class, ListProductsResponse.class)
                .withName("ListProducts")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("manufacturer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getManufacturerId, (req, v) -> {
                req.setManufacturerId(v);
            })
        );
        builder.withRequestField("manufacturer_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getManufacturerName, (req, v) -> {
                req.setManufacturerName(v);
            })
        );
        builder.withRequestField("model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getModel, (req, v) -> {
                req.setModel(v);
            })
        );
        builder.withRequestField("device_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getDeviceType, (req, v) -> {
                req.setDeviceType(v);
            })
        );
        builder.withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListProductsRequest::getCreatedUserName, (req, v) -> {
                req.setCreatedUserName(v);
            })
        );
        builder.withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListProductsRequest::getCreatedDateStart, (req, v) -> {
                req.setCreatedDateStart(v);
            })
        );
        builder.withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListProductsRequest::getCreatedDateEnd, (req, v) -> {
                req.setCreatedDateEnd(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProductsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2 = genForlistProjectCofigsV2();

    private static HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> genForlistProjectCofigsV2() {
        // basic
        HttpRequestDef.Builder<ListProjectCofigsV2Request, ListProjectCofigsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectCofigsV2Request.class, ListProjectCofigsV2Response.class)
                .withName("ListProjectCofigsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/project/configs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListProjectCofigsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListProjectCofigsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListProjectCofigsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> listProperties = genForlistProperties();

    private static HttpRequestDef<ListPropertiesRequest, ListPropertiesResponse> genForlistProperties() {
        // basic
        HttpRequestDef.Builder<ListPropertiesRequest, ListPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPropertiesRequest.class, ListPropertiesResponse.class)
                .withName("ListProperties")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPropertiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPropertiesRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );
        builder.withRequestField("property_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPropertiesRequest::getPropertyName, (req, v) -> {
                req.setPropertyName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPropertiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestPropertiesRequest, ListRequestPropertiesResponse> listRequestProperties = genForlistRequestProperties();

    private static HttpRequestDef<ListRequestPropertiesRequest, ListRequestPropertiesResponse> genForlistRequestProperties() {
        // basic
        HttpRequestDef.Builder<ListRequestPropertiesRequest, ListRequestPropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestPropertiesRequest.class, ListRequestPropertiesResponse.class)
                .withName("ListRequestProperties")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("request_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getRequestId, (req, v) -> {
                req.setRequestId(v);
            })
        );
        builder.withRequestField("request_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getRequestName, (req, v) -> {
                req.setRequestName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestPropertiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2 = genForlistRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> genForlistRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestThrottlingPolicyV2Request.class, ListRequestThrottlingPolicyV2Response.class)
                .withName("ListRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResponsePropertiesRequest, ListResponsePropertiesResponse> listResponseProperties = genForlistResponseProperties();

    private static HttpRequestDef<ListResponsePropertiesRequest, ListResponsePropertiesResponse> genForlistResponseProperties() {
        // basic
        HttpRequestDef.Builder<ListResponsePropertiesRequest, ListResponsePropertiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResponsePropertiesRequest.class, ListResponsePropertiesResponse.class)
                .withName("ListResponseProperties")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("response_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getResponseId, (req, v) -> {
                req.setResponseId(v);
            })
        );
        builder.withRequestField("response_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getResponseName, (req, v) -> {
                req.setResponseName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResponsePropertiesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRomaAppUsagesTopNRequest, ListRomaAppUsagesTopNResponse> listRomaAppUsagesTopN = genForlistRomaAppUsagesTopN();

    private static HttpRequestDef<ListRomaAppUsagesTopNRequest, ListRomaAppUsagesTopNResponse> genForlistRomaAppUsagesTopN() {
        // basic
        HttpRequestDef.Builder<ListRomaAppUsagesTopNRequest, ListRomaAppUsagesTopNResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRomaAppUsagesTopNRequest.class, ListRomaAppUsagesTopNResponse.class)
                .withName("ListRomaAppUsagesTopN")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/roma-app-usages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRomaAppUsagesTopNRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListRomaAppUsagesTopNRequest.CycleEnum.class,
            f -> f.withMarshaller(ListRomaAppUsagesTopNRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppUsagesTopNRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppUsagesTopNRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppUsagesTopNRequest::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRulesRequest, ListRulesResponse> listRules = genForlistRules();

    private static HttpRequestDef<ListRulesRequest, ListRulesResponse> genForlistRules() {
        // basic
        HttpRequestDef.Builder<ListRulesRequest, ListRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRulesRequest.class, ListRulesResponse.class)
                .withName("ListRules")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRulesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicesRequest, ListServicesResponse> listServices = genForlistServices();

    private static HttpRequestDef<ListServicesRequest, ListServicesResponse> genForlistServices() {
        // basic
        HttpRequestDef.Builder<ListServicesRequest, ListServicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServicesRequest.class, ListServicesResponse.class)
                .withName("ListServices")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListServicesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServicesRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("service_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServicesRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            })
        );
        builder.withRequestField("product_template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServicesRequest::getProductTemplateId, (req, v) -> {
                req.setProductTemplateId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServicesRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("created_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListServicesRequest::getCreatedUserName, (req, v) -> {
                req.setCreatedUserName(v);
            })
        );
        builder.withRequestField("created_date_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListServicesRequest::getCreatedDateStart, (req, v) -> {
                req.setCreatedDateStart(v);
            })
        );
        builder.withRequestField("created_date_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListServicesRequest::getCreatedDateEnd, (req, v) -> {
                req.setCreatedDateEnd(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListServicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShadowsRequest, ListShadowsResponse> listShadows = genForlistShadows();

    private static HttpRequestDef<ListShadowsRequest, ListShadowsResponse> genForlistShadows() {
        // basic
        HttpRequestDef.Builder<ListShadowsRequest, ListShadowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShadowsRequest.class, ListShadowsResponse.class)
                .withName("ListShadows")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/shadow")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListShadowsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListShadowsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListShadowsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ShadowService.class)
        );

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2 = genForlistSignatureKeysBindedToApiV2();

    private static HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> genForlistSignatureKeysBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysBindedToApiV2Request.class, ListSignatureKeysBindedToApiV2Response.class)
                .withName("ListSignatureKeysBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/sign-bindings/binded-signs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignName, (req, v) -> {
                req.setSignName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2 = genForlistSignatureKeysV2();

    private static HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> genForlistSignatureKeysV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysV2Request, ListSignatureKeysV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysV2Request.class, ListSignatureKeysV2Response.class)
                .withName("ListSignatureKeysV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSignatureKeysV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSourcesRequest, ListSourcesResponse> listSources = genForlistSources();

    private static HttpRequestDef<ListSourcesRequest, ListSourcesResponse> genForlistSources() {
        // basic
        HttpRequestDef.Builder<ListSourcesRequest, ListSourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSourcesRequest.class, ListSourcesResponse.class)
                .withName("ListSources")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}/sources")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourcesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSourcesRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSourcesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSourcesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2 = genForlistSpecialThrottlingConfigurationsV2();

    private static HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> genForlistSpecialThrottlingConfigurationsV2() {
        // basic
        HttpRequestDef.Builder<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpecialThrottlingConfigurationsV2Request.class, ListSpecialThrottlingConfigurationsV2Response.class)
                .withName("ListSpecialThrottlingConfigurationsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getObjectType, (req, v) -> {
                req.setObjectType(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsApiRequest, ListStatisticsApiResponse> listStatisticsApi = genForlistStatisticsApi();

    private static HttpRequestDef<ListStatisticsApiRequest, ListStatisticsApiResponse> genForlistStatisticsApi() {
        // basic
        HttpRequestDef.Builder<ListStatisticsApiRequest, ListStatisticsApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsApiRequest.class, ListStatisticsApiResponse.class)
                .withName("ListStatisticsApi")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/api")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStatisticsApiRequest.ModeEnum.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getRomaAppId, (req, v) -> {
                req.setRomaAppId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStatisticsApiRequest.CycleEnum.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsApiRequest::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsConsumerAppForSplitRomaAppsRequest, ListStatisticsConsumerAppForSplitRomaAppsResponse> listStatisticsConsumerAppForSplitRomaApps = genForlistStatisticsConsumerAppForSplitRomaApps();

    private static HttpRequestDef<ListStatisticsConsumerAppForSplitRomaAppsRequest, ListStatisticsConsumerAppForSplitRomaAppsResponse> genForlistStatisticsConsumerAppForSplitRomaApps() {
        // basic
        HttpRequestDef.Builder<ListStatisticsConsumerAppForSplitRomaAppsRequest, ListStatisticsConsumerAppForSplitRomaAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsConsumerAppForSplitRomaAppsRequest.class, ListStatisticsConsumerAppForSplitRomaAppsResponse.class)
                .withName("ListStatisticsConsumerAppForSplitRomaApps")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/apps/{consumer_app_id}/roma-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("consumer_app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getConsumerAppId, (req, v) -> {
                req.setConsumerAppId(v);
            })
        );
        builder.withRequestField("roma_app_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getRomaAppIds, (req, v) -> {
                req.setRomaAppIds(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStatisticsConsumerAppForSplitRomaAppsRequest.CycleEnum.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsConsumerAppForSplitRomaAppsRequest::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRomaAppRequest, ListStatisticsRomaAppResponse> listStatisticsRomaApp = genForlistStatisticsRomaApp();

    private static HttpRequestDef<ListStatisticsRomaAppRequest, ListStatisticsRomaAppResponse> genForlistStatisticsRomaApp() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRomaAppRequest, ListStatisticsRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRomaAppRequest.class, ListStatisticsRomaAppResponse.class)
                .withName("ListStatisticsRomaApp")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/statistics/roma-app")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStatisticsRomaAppRequest.ModeEnum.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getMode, (req, v) -> {
                req.setMode(v);
            })
        );
        builder.withRequestField("consumer_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getConsumerAppId, (req, v) -> {
                req.setConsumerAppId(v);
            })
        );
        builder.withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getRomaAppId, (req, v) -> {
                req.setRomaAppId(v);
            })
        );
        builder.withRequestField("cycle",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListStatisticsRomaAppRequest.CycleEnum.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getCycle, (req, v) -> {
                req.setCycle(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("duration",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListStatisticsRomaAppRequest::getDuration, (req, v) -> {
                req.setDuration(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSubsetsRequest, ListSubsetsResponse> listSubsets = genForlistSubsets();

    private static HttpRequestDef<ListSubsetsRequest, ListSubsetsResponse> genForlistSubsets() {
        // basic
        HttpRequestDef.Builder<ListSubsetsRequest, ListSubsetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSubsetsRequest.class, ListSubsetsResponse.class)
                .withName("ListSubsets")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/subsets")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSubsetsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListSubsetsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubsetsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSubsetsRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSubsetsRequest.StatusEnum.class,
            f -> f.withMarshaller(ListSubsetsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("online_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListSubsetsRequest.OnlineStatusEnum.class,
            f -> f.withMarshaller(ListSubsetsRequest::getOnlineStatus, (req, v) -> {
                req.setOnlineStatus(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListSubsetsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsV2Request, ListTagsV2Response> listTagsV2 = genForlistTagsV2();

    private static HttpRequestDef<ListTagsV2Request, ListTagsV2Response> genForlistTagsV2() {
        // basic
        HttpRequestDef.Builder<ListTagsV2Request, ListTagsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsV2Request.class, ListTagsV2Response.class)
                .withName("ListTagsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTagsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListTagsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTagsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopicsRequest, ListTopicsResponse> listTopics = genForlistTopics();

    private static HttpRequestDef<ListTopicsRequest, ListTopicsResponse> genForlistTopics() {
        // basic
        HttpRequestDef.Builder<ListTopicsRequest, ListTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopicsRequest.class, ListTopicsResponse.class)
                .withName("ListTopics")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/topics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTopicsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ListTopicsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopicsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListTopicsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> publishLiveDataApiV2 = genForpublishLiveDataApiV2();

    private static HttpRequestDef<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> genForpublishLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<PublishLiveDataApiV2Request, PublishLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, PublishLiveDataApiV2Request.class, PublishLiveDataApiV2Response.class)
                .withName("PublishLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/deploy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LdApiDeploy.class,
            f -> f.withMarshaller(PublishLiveDataApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAuthenticationRequest, ResetAuthenticationResponse> resetAuthentication = genForresetAuthentication();

    private static HttpRequestDef<ResetAuthenticationRequest, ResetAuthenticationResponse> genForresetAuthentication() {
        // basic
        HttpRequestDef.Builder<ResetAuthenticationRequest, ResetAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetAuthenticationRequest.class, ResetAuthenticationResponse.class)
                .withName("ResetAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetAuthenticationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ResetAuthenticationRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetMessagesRequest, ResetMessagesResponse> resetMessages = genForresetMessages();

    private static HttpRequestDef<ResetMessagesRequest, ResetMessagesResponse> genForresetMessages() {
        // basic
        HttpRequestDef.Builder<ResetMessagesRequest, ResetMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetMessagesRequest.class, ResetMessagesResponse.class)
                .withName("ResetMessages")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/messages/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetMessagesRequest.ActionIdEnum.class,
            f -> f.withMarshaller(ResetMessagesRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ResetMessagesReq.class,
            f -> f.withMarshaller(ResetMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> resetProductAuthentication = genForresetProductAuthentication();

    private static HttpRequestDef<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> genForresetProductAuthentication() {
        // basic
        HttpRequestDef.Builder<ResetProductAuthenticationRequest, ResetProductAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetProductAuthenticationRequest.class, ResetProductAuthenticationResponse.class)
                .withName("ResetProductAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetProductAuthenticationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ResetProductAuthenticationRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunTaskRequest, RunTaskResponse> runTask = genForrunTask();

    private static HttpRequestDef<RunTaskRequest, RunTaskResponse> genForrunTask() {
        // basic
        HttpRequestDef.Builder<RunTaskRequest, RunTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunTaskRequest.class, RunTaskResponse.class)
                .withName("RunTask")
                .withUri("/v2/{project_id}/fdi/instances/{instance_id}/tasks/{task_id}/run")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RunTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(RunTaskRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendCommandRequest, SendCommandResponse> sendCommand = genForsendCommand();

    private static HttpRequestDef<SendCommandRequest, SendCommandResponse> genForsendCommand() {
        // basic
        HttpRequestDef.Builder<SendCommandRequest, SendCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SendCommandRequest.class, SendCommandResponse.class)
                .withName("SendCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/send-command")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(SendCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(SendCommandRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SendCommandRequestBody.class,
            f -> f.withMarshaller(SendCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> showAppBoundAppQuota = genForshowAppBoundAppQuota();

    private static HttpRequestDef<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> genForshowAppBoundAppQuota() {
        // basic
        HttpRequestDef.Builder<ShowAppBoundAppQuotaRequest, ShowAppBoundAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppBoundAppQuotaRequest.class, ShowAppBoundAppQuotaResponse.class)
                .withName("ShowAppBoundAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/bound-quota")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAppBoundAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAppBoundAppQuotaRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAppQuotaRequest, ShowAppQuotaResponse> showAppQuota = genForshowAppQuota();

    private static HttpRequestDef<ShowAppQuotaRequest, ShowAppQuotaResponse> genForshowAppQuota() {
        // basic
        HttpRequestDef.Builder<ShowAppQuotaRequest, ShowAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAppQuotaRequest.class, ShowAppQuotaResponse.class)
                .withName("ShowAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAppQuotaRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthenticationRequest, ShowAuthenticationResponse> showAuthentication = genForshowAuthentication();

    private static HttpRequestDef<ShowAuthenticationRequest, ShowAuthenticationResponse> genForshowAuthentication() {
        // basic
        HttpRequestDef.Builder<ShowAuthenticationRequest, ShowAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthenticationRequest.class, ShowAuthenticationResponse.class)
                .withName("ShowAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAuthenticationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowAuthenticationRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCommandRequest, ShowCommandResponse> showCommand = genForshowCommand();

    private static HttpRequestDef<ShowCommandRequest, ShowCommandResponse> genForshowCommand() {
        // basic
        HttpRequestDef.Builder<ShowCommandRequest, ShowCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCommandRequest.class, ShowCommandResponse.class)
                .withName("ShowCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCommandRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowCommandRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> showDetailsOfAppAcl = genForshowDetailsOfAppAcl();

    private static HttpRequestDef<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> genForshowDetailsOfAppAcl() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppAclRequest, ShowDetailsOfAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppAclRequest.class, ShowDetailsOfAppAclResponse.class)
                .withName("ShowDetailsOfAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppAclRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppAclRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2 = genForshowDetailsOfAppCodeV2();

    private static HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> genForshowDetailsOfAppCodeV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppCodeV2Request.class, ShowDetailsOfAppCodeV2Response.class)
                .withName("ShowDetailsOfAppCodeV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppCodeId, (req, v) -> {
                req.setAppCodeId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> showDetailsOfAppConfigV2 = genForshowDetailsOfAppConfigV2();

    private static HttpRequestDef<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> genForshowDetailsOfAppConfigV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppConfigV2Request, ShowDetailsOfAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppConfigV2Request.class, ShowDetailsOfAppConfigV2Response.class)
                .withName("ShowDetailsOfAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppConfigV2Request::getAppConfigId, (req, v) -> {
                req.setAppConfigId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2 = genForshowDetailsOfAppV2();

    private static HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> genForshowDetailsOfAppV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppV2Request.class, ShowDetailsOfAppV2Response.class)
                .withName("ShowDetailsOfAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2 = genForshowDetailsOfCustomAuthorizersV2();

    private static HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> genForshowDetailsOfCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfCustomAuthorizersV2Request.class, ShowDetailsOfCustomAuthorizersV2Response.class)
                .withName("ShowDetailsOfCustomAuthorizersV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2 = genForshowDetailsOfDomainNameCertificateV2();

    private static HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> genForshowDetailsOfDomainNameCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfDomainNameCertificateV2Request.class, ShowDetailsOfDomainNameCertificateV2Response.class)
                .withName("ShowDetailsOfDomainNameCertificateV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2 = genForshowDetailsOfEnvironmentVariableV2();

    private static HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> genForshowDetailsOfEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfEnvironmentVariableV2Request.class, ShowDetailsOfEnvironmentVariableV2Response.class)
                .withName("ShowDetailsOfEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2 = genForshowDetailsOfInstanceV2();

    private static HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> genForshowDetailsOfInstanceV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfInstanceV2Request.class, ShowDetailsOfInstanceV2Response.class)
                .withName("ShowDetailsOfInstanceV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2 = genForshowDetailsOfRequestThrottlingPolicyV2();

    private static HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> genForshowDetailsOfRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfRequestThrottlingPolicyV2Request.class, ShowDetailsOfRequestThrottlingPolicyV2Response.class)
                .withName("ShowDetailsOfRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> showDevice = genForshowDevice();

    private static HttpRequestDef<ShowDeviceRequest, ShowDeviceResponse> genForshowDevice() {
        // basic
        HttpRequestDef.Builder<ShowDeviceRequest, ShowDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceRequest.class, ShowDeviceResponse.class)
                .withName("ShowDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroup = genForshowDeviceGroup();

    private static HttpRequestDef<ShowDeviceGroupRequest, ShowDeviceGroupResponse> genForshowDeviceGroup() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupRequest, ShowDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupRequest.class, ShowDeviceGroupResponse.class)
                .withName("ShowDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> showDeviceGroupTree = genForshowDeviceGroupTree();

    private static HttpRequestDef<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> genForshowDeviceGroupTree() {
        // basic
        HttpRequestDef.Builder<ShowDeviceGroupTreeRequest, ShowDeviceGroupTreeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeviceGroupTreeRequest.class, ShowDeviceGroupTreeResponse.class)
                .withName("ShowDeviceGroupTree")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceGroupTreeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDeviceGroupTreeRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroup = genForshowDevicesInGroup();

    private static HttpRequestDef<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> genForshowDevicesInGroup() {
        // basic
        HttpRequestDef.Builder<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDevicesInGroupRequest.class, ShowDevicesInGroupResponse.class)
                .withName("ShowDevicesInGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}/devices")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("product_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getProductName, (req, v) -> {
                req.setProductName(v);
            })
        );
        builder.withRequestField("device_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getDeviceName, (req, v) -> {
                req.setDeviceName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ShowDevicesInGroupRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> showLiveDataApiV2 = genForshowLiveDataApiV2();

    private static HttpRequestDef<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> genForshowLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<ShowLiveDataApiV2Request, ShowLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLiveDataApiV2Request.class, ShowLiveDataApiV2Response.class)
                .withName("ShowLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> showMqsInstanceMessages = genForshowMqsInstanceMessages();

    private static HttpRequestDef<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> genForshowMqsInstanceMessages() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceMessagesRequest, ShowMqsInstanceMessagesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMqsInstanceMessagesRequest.class, ShowMqsInstanceMessagesResponse.class)
                .withName("ShowMqsInstanceMessages")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/messages")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getTopic, (req, v) -> {
                req.setTopic(v);
            })
        );
        builder.withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getAsc, (req, v) -> {
                req.setAsc(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("download",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getDownload, (req, v) -> {
                req.setDownload(v);
            })
        );
        builder.withRequestField("message_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getMessageOffset, (req, v) -> {
                req.setMessageOffset(v);
            })
        );
        builder.withRequestField("partition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceMessagesRequest::getPartition, (req, v) -> {
                req.setPartition(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> showMqsInstanceTopicAccessPolicy = genForshowMqsInstanceTopicAccessPolicy();

    private static HttpRequestDef<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> genForshowMqsInstanceTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceTopicAccessPolicyRequest, ShowMqsInstanceTopicAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMqsInstanceTopicAccessPolicyRequest.class, ShowMqsInstanceTopicAccessPolicyResponse.class)
                .withName("ShowMqsInstanceTopicAccessPolicy")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/{topic_name}/accesspolicy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("topic_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getTopicName, (req, v) -> {
                req.setTopicName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceTopicAccessPolicyRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductRequest, ShowProductResponse> showProduct = genForshowProduct();

    private static HttpRequestDef<ShowProductRequest, ShowProductResponse> genForshowProduct() {
        // basic
        HttpRequestDef.Builder<ShowProductRequest, ShowProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductRequest.class, ShowProductResponse.class)
                .withName("ShowProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> showProductAuthentication = genForshowProductAuthentication();

    private static HttpRequestDef<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> genForshowProductAuthentication() {
        // basic
        HttpRequestDef.Builder<ShowProductAuthenticationRequest, ShowProductAuthenticationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductAuthenticationRequest.class, ShowProductAuthenticationResponse.class)
                .withName("ShowProductAuthentication")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/authentication")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProductAuthenticationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowProductAuthenticationRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProductTemplateRequest, ShowProductTemplateResponse> showProductTemplate = genForshowProductTemplate();

    private static HttpRequestDef<ShowProductTemplateRequest, ShowProductTemplateResponse> genForshowProductTemplate() {
        // basic
        HttpRequestDef.Builder<ShowProductTemplateRequest, ShowProductTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProductTemplateRequest.class, ShowProductTemplateResponse.class)
                .withName("ShowProductTemplate")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowProductTemplateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowProductTemplateRequest::getProductTemplateId, (req, v) -> {
                req.setProductTemplateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPropertyRequest, ShowPropertyResponse> showProperty = genForshowProperty();

    private static HttpRequestDef<ShowPropertyRequest, ShowPropertyResponse> genForshowProperty() {
        // basic
        HttpRequestDef.Builder<ShowPropertyRequest, ShowPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPropertyRequest.class, ShowPropertyResponse.class)
                .withName("ShowProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowPropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRequestPropertyRequest, ShowRequestPropertyResponse> showRequestProperty = genForshowRequestProperty();

    private static HttpRequestDef<ShowRequestPropertyRequest, ShowRequestPropertyResponse> genForshowRequestProperty() {
        // basic
        HttpRequestDef.Builder<ShowRequestPropertyRequest, ShowRequestPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRequestPropertyRequest.class, ShowRequestPropertyResponse.class)
                .withName("ShowRequestProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRequestPropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRequestPropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowRequestPropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowRequestPropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResponsePropertyRequest, ShowResponsePropertyResponse> showResponseProperty = genForshowResponseProperty();

    private static HttpRequestDef<ShowResponsePropertyRequest, ShowResponsePropertyResponse> genForshowResponseProperty() {
        // basic
        HttpRequestDef.Builder<ShowResponsePropertyRequest, ShowResponsePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResponsePropertyRequest.class, ShowResponsePropertyResponse.class)
                .withName("ShowResponseProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResponsePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResponsePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowResponsePropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowResponsePropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> showRestrictionOfInstanceV2 = genForshowRestrictionOfInstanceV2();

    private static HttpRequestDef<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> genForshowRestrictionOfInstanceV2() {
        // basic
        HttpRequestDef.Builder<ShowRestrictionOfInstanceV2Request, ShowRestrictionOfInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRestrictionOfInstanceV2Request.class, ShowRestrictionOfInstanceV2Response.class)
                .withName("ShowRestrictionOfInstanceV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/restriction")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRestrictionOfInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRuleRequest, ShowRuleResponse> showRule = genForshowRule();

    private static HttpRequestDef<ShowRuleRequest, ShowRuleResponse> genForshowRule() {
        // basic
        HttpRequestDef.Builder<ShowRuleRequest, ShowRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRuleRequest.class, ShowRuleResponse.class)
                .withName("ShowRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowServiceRequest, ShowServiceResponse> showService = genForshowService();

    private static HttpRequestDef<ShowServiceRequest, ShowServiceResponse> genForshowService() {
        // basic
        HttpRequestDef.Builder<ShowServiceRequest, ShowServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowServiceRequest.class, ShowServiceResponse.class)
                .withName("ShowService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowServiceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> unpublishLiveDataApiV2 = genForunpublishLiveDataApiV2();

    private static HttpRequestDef<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> genForunpublishLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<UnpublishLiveDataApiV2Request, UnpublishLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnpublishLiveDataApiV2Request.class, UnpublishLiveDataApiV2Response.class)
                .withName("UnpublishLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}/undeploy")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UnpublishLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UnpublishLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> updateAppAcl = genForupdateAppAcl();

    private static HttpRequestDef<UpdateAppAclRequest, UpdateAppAclResponse> genForupdateAppAcl() {
        // basic
        HttpRequestDef.Builder<UpdateAppAclRequest, UpdateAppAclResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppAclRequest.class, UpdateAppAclResponse.class)
                .withName("UpdateAppAcl")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/app-acl")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppAclRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppAclRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppAclCreate.class,
            f -> f.withMarshaller(UpdateAppAclRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppConfigV2Request, UpdateAppConfigV2Response> updateAppConfigV2 = genForupdateAppConfigV2();

    private static HttpRequestDef<UpdateAppConfigV2Request, UpdateAppConfigV2Response> genForupdateAppConfigV2() {
        // basic
        HttpRequestDef.Builder<UpdateAppConfigV2Request, UpdateAppConfigV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppConfigV2Request.class, UpdateAppConfigV2Response.class)
                .withName("UpdateAppConfigV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apps/{app_id}/configs/{app_config_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppConfigV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppConfigV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("app_config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppConfigV2Request::getAppConfigId, (req, v) -> {
                req.setAppConfigId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppConfigModifyRequest.class,
            f -> f.withMarshaller(UpdateAppConfigV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> updateAppQuota = genForupdateAppQuota();

    private static HttpRequestDef<UpdateAppQuotaRequest, UpdateAppQuotaResponse> genForupdateAppQuota() {
        // basic
        HttpRequestDef.Builder<UpdateAppQuotaRequest, UpdateAppQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppQuotaRequest.class, UpdateAppQuotaResponse.class)
                .withName("UpdateAppQuota")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-quotas/{app_quota_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppQuotaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_quota_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAppQuotaRequest::getAppQuotaId, (req, v) -> {
                req.setAppQuotaId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AppQuotaCreate.class,
            f -> f.withMarshaller(UpdateAppQuotaRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCommandRequest, UpdateCommandResponse> updateCommand = genForupdateCommand();

    private static HttpRequestDef<UpdateCommandRequest, UpdateCommandResponse> genForupdateCommand() {
        // basic
        HttpRequestDef.Builder<UpdateCommandRequest, UpdateCommandResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCommandRequest.class, UpdateCommandResponse.class)
                .withName("UpdateCommand")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCommandRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCommandRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateCommandRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateCommandRequestBody.class,
            f -> f.withMarshaller(UpdateCommandRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2 = genForupdateCustomAuthorizerV2();

    private static HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> genForupdateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomAuthorizerV2Request.class, UpdateCustomAuthorizerV2Response.class)
                .withName("UpdateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AuthorizerCreate.class,
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> updateDevice = genForupdateDevice();

    private static HttpRequestDef<UpdateDeviceRequest, UpdateDeviceResponse> genForupdateDevice() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceRequest, UpdateDeviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceRequest.class, UpdateDeviceResponse.class)
                .withName("UpdateDevice")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/devices/{device_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("device_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDeviceRequestBody.class,
            f -> f.withMarshaller(UpdateDeviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroup = genForupdateDeviceGroup();

    private static HttpRequestDef<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> genForupdateDeviceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDeviceGroupRequest.class, UpdateDeviceGroupResponse.class)
                .withName("UpdateDeviceGroup")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/device-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDeviceGroupRequestBody.class,
            f -> f.withMarshaller(UpdateDeviceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2 = genForupdateDomainV2();

    private static HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> genForupdateDomainV2() {
        // basic
        HttpRequestDef.Builder<UpdateDomainV2Request, UpdateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainV2Request.class, UpdateDomainV2Response.class)
                .withName("UpdateDomainV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDomainV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UrlDomainBase.class,
            f -> f.withMarshaller(UpdateDomainV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2 = genForupdateEnvironmentV2();

    private static HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> genForupdateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentV2Request.class, UpdateEnvironmentV2Response.class)
                .withName("UpdateEnvironmentV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvReq.class,
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> updateEnvironmentVariableV2 = genForupdateEnvironmentVariableV2();

    private static HttpRequestDef<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> genForupdateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentVariableV2Request, UpdateEnvironmentVariableV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentVariableV2Request.class, UpdateEnvironmentVariableV2Response.class)
                .withName("UpdateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EnvVariableBase.class,
            f -> f.withMarshaller(UpdateEnvironmentVariableV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> updateLiveDataApiV2 = genForupdateLiveDataApiV2();

    private static HttpRequestDef<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> genForupdateLiveDataApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateLiveDataApiV2Request, UpdateLiveDataApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLiveDataApiV2Request.class, UpdateLiveDataApiV2Response.class)
                .withName("UpdateLiveDataApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/livedata-apis/{ld_api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("ld_api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getLdApiId, (req, v) -> {
                req.setLdApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LdApiCreate.class,
            f -> f.withMarshaller(UpdateLiveDataApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> updateMqsInstanceTopic = genForupdateMqsInstanceTopic();

    private static HttpRequestDef<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> genForupdateMqsInstanceTopic() {
        // basic
        HttpRequestDef.Builder<UpdateMqsInstanceTopicRequest, UpdateMqsInstanceTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMqsInstanceTopicRequest.class, UpdateMqsInstanceTopicResponse.class)
                .withName("UpdateMqsInstanceTopic")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMqsInstanceTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMqsInstanceTopicReq.class,
            f -> f.withMarshaller(UpdateMqsInstanceTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductRequest, UpdateProductResponse> updateProduct = genForupdateProduct();

    private static HttpRequestDef<UpdateProductRequest, UpdateProductResponse> genForupdateProduct() {
        // basic
        HttpRequestDef.Builder<UpdateProductRequest, UpdateProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductRequest.class, UpdateProductResponse.class)
                .withName("UpdateProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateProductRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProductRequestBody.class,
            f -> f.withMarshaller(UpdateProductRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductTemplateRequest, UpdateProductTemplateResponse> updateProductTemplate = genForupdateProductTemplate();

    private static HttpRequestDef<UpdateProductTemplateRequest, UpdateProductTemplateResponse> genForupdateProductTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateProductTemplateRequest, UpdateProductTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductTemplateRequest.class, UpdateProductTemplateResponse.class)
                .withName("UpdateProductTemplate")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/product-templates/{product_template_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProductTemplateRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateProductTemplateRequest::getProductTemplateId, (req, v) -> {
                req.setProductTemplateId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProductTemplateRequestBody.class,
            f -> f.withMarshaller(UpdateProductTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProductTopicRequest, UpdateProductTopicResponse> updateProductTopic = genForupdateProductTopic();

    private static HttpRequestDef<UpdateProductTopicRequest, UpdateProductTopicResponse> genForupdateProductTopic() {
        // basic
        HttpRequestDef.Builder<UpdateProductTopicRequest, UpdateProductTopicResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProductTopicRequest.class, UpdateProductTopicResponse.class)
                .withName("UpdateProductTopic")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/{product_id}/topics/{topic_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateProductTopicRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("product_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateProductTopicRequest::getProductId, (req, v) -> {
                req.setProductId(v);
            })
        );
        builder.withRequestField("topic_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateProductTopicRequest::getTopicId, (req, v) -> {
                req.setTopicId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateProductTopicRequestBody.class,
            f -> f.withMarshaller(UpdateProductTopicRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePropertyRequest, UpdatePropertyResponse> updateProperty = genForupdateProperty();

    private static HttpRequestDef<UpdatePropertyRequest, UpdatePropertyResponse> genForupdateProperty() {
        // basic
        HttpRequestDef.Builder<UpdatePropertyRequest, UpdatePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePropertyRequest.class, UpdatePropertyResponse.class)
                .withName("UpdateProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/properties/{property_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdatePropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePropertyRequestBody.class,
            f -> f.withMarshaller(UpdatePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> updateRequestProperty = genForupdateRequestProperty();

    private static HttpRequestDef<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> genForupdateRequestProperty() {
        // basic
        HttpRequestDef.Builder<UpdateRequestPropertyRequest, UpdateRequestPropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRequestPropertyRequest.class, UpdateRequestPropertyResponse.class)
                .withName("UpdateRequestProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/requests/{property_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePropertyRequestBody.class,
            f -> f.withMarshaller(UpdateRequestPropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2 = genForupdateRequestThrottlingPolicyV2();

    private static HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> genForupdateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRequestThrottlingPolicyV2Request.class, UpdateRequestThrottlingPolicyV2Response.class)
                .withName("UpdateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleReq.class,
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> updateResponseProperty = genForupdateResponseProperty();

    private static HttpRequestDef<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> genForupdateResponseProperty() {
        // basic
        HttpRequestDef.Builder<UpdateResponsePropertyRequest, UpdateResponsePropertyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResponsePropertyRequest.class, UpdateResponsePropertyResponse.class)
                .withName("UpdateResponseProperty")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}/commands/{command_id}/responses/{property_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("command_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getCommandId, (req, v) -> {
                req.setCommandId(v);
            })
        );
        builder.withRequestField("property_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getPropertyId, (req, v) -> {
                req.setPropertyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdatePropertyRequestBody.class,
            f -> f.withMarshaller(UpdateResponsePropertyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForupdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForupdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/rules/{rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRuleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateRuleRequestBody.class,
            f -> f.withMarshaller(UpdateRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> updateService = genForupdateService();

    private static HttpRequestDef<UpdateServiceRequest, UpdateServiceResponse> genForupdateService() {
        // basic
        HttpRequestDef.Builder<UpdateServiceRequest, UpdateServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateServiceRequest.class, UpdateServiceResponse.class)
                .withName("UpdateService")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/services/{service_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateServiceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("service_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateServiceRequest::getServiceId, (req, v) -> {
                req.setServiceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateServiceRequestBody.class,
            f -> f.withMarshaller(UpdateServiceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2 = genForupdateSignatureKeyV2();

    private static HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> genForupdateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSignatureKeyV2Request.class, UpdateSignatureKeyV2Response.class)
                .withName("UpdateSignatureKeyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/signs/{sign_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SignatureReq.class,
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2 = genForupdateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> genForupdateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSpecialThrottlingConfigurationV2Request.class, UpdateSpecialThrottlingConfigurationV2Response.class)
                .withName("UpdateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleSpecialUpdateReq.class,
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> updateTopicAccessPolicy = genForupdateTopicAccessPolicy();

    private static HttpRequestDef<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> genForupdateTopicAccessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateTopicAccessPolicyRequest, UpdateTopicAccessPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateTopicAccessPolicyRequest.class, UpdateTopicAccessPolicyResponse.class)
                .withName("UpdateTopicAccessPolicy")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}/topics/accesspolicy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateTopicAccessPolicyReq.class,
            f -> f.withMarshaller(UpdateTopicAccessPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadProductRequest, UploadProductResponse> uploadProduct = genForuploadProduct();

    private static HttpRequestDef<UploadProductRequest, UploadProductResponse> genForuploadProduct() {
        // basic
        HttpRequestDef.Builder<UploadProductRequest, UploadProductResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadProductRequest.class, UploadProductResponse.class)
                .withName("UploadProduct")
                .withUri("/v2/{project_id}/link/instances/{instance_id}/products/import")
                .withContentType("multipart/form-data");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UploadProductRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2 = genForbatchDeleteAclV2();

    private static HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> genForbatchDeleteAclV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAclV2Request, BatchDeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDeleteAclV2Request.class, BatchDeleteAclV2Response.class)
                .withName("BatchDeleteAclV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteAclV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteAclV2Request::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AclBatchDelete.class,
            f -> f.withMarshaller(BatchDeleteAclV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2 = genForcreateAclStrategyV2();

    private static HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> genForcreateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<CreateAclStrategyV2Request, CreateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAclStrategyV2Request.class, CreateAclStrategyV2Response.class)
                .withName("CreateAclStrategyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAclStrategyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiAclCreate.class,
            f -> f.withMarshaller(CreateAclStrategyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2 = genFordeleteAclV2();

    private static HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> genFordeleteAclV2() {
        // basic
        HttpRequestDef.Builder<DeleteAclV2Request, DeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclV2Request.class, DeleteAclV2Response.class)
                .withName("DeleteAclV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAclV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAclV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2 = genForlistAclStrategiesV2();

    private static HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> genForlistAclStrategiesV2() {
        // basic
        HttpRequestDef.Builder<ListAclStrategiesV2Request, ListAclStrategiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclStrategiesV2Request.class, ListAclStrategiesV2Response.class)
                .withName("ListAclStrategiesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("acl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getAclType, (req, v) -> {
                req.setAclType(v);
            })
        );
        builder.withRequestField("entity_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getEntityType, (req, v) -> {
                req.setEntityType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclStrategiesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2 = genForshowDetailsOfAclPolicyV2();

    private static HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> genForshowDetailsOfAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAclPolicyV2Request.class, ShowDetailsOfAclPolicyV2Response.class)
                .withName("ShowDetailsOfAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2 = genForupdateAclStrategyV2();

    private static HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> genForupdateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclStrategyV2Request.class, UpdateAclStrategyV2Response.class)
                .withName("UpdateAclStrategyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiAclCreate.class,
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2 = genForassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> genForassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRequestThrottlingPolicyV2Request.class, AssociateRequestThrottlingPolicyV2Response.class)
                .withName("AssociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleBindingReq.class,
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2 = genForbatchDisassociateThrottlingPolicyV2();

    private static HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> genForbatchDisassociateThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDisassociateThrottlingPolicyV2Request.class, BatchDisassociateThrottlingPolicyV2Response.class)
                .withName("BatchDisassociateThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ThrottleBindingBatchDelete.class,
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2 = genForbatchPublishOrOfflineApiV2();

    private static HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> genForbatchPublishOrOfflineApiV2() {
        // basic
        HttpRequestDef.Builder<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchPublishOrOfflineApiV2Request.class, BatchPublishOrOfflineApiV2Response.class)
                .withName("BatchPublishOrOfflineApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiBatchPublish.class,
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2 = genForchangeApiVersionV2();

    private static HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> genForchangeApiVersionV2() {
        // basic
        HttpRequestDef.Builder<ChangeApiVersionV2Request, ChangeApiVersionV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeApiVersionV2Request.class, ChangeApiVersionV2Response.class)
                .withName("ChangeApiVersionV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeApiVersionV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ChangeApiVersionV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiVersionInfo.class,
            f -> f.withMarshaller(ChangeApiVersionV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckApiGroupsV2Request, CheckApiGroupsV2Response> checkApiGroupsV2 = genForcheckApiGroupsV2();

    private static HttpRequestDef<CheckApiGroupsV2Request, CheckApiGroupsV2Response> genForcheckApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<CheckApiGroupsV2Request, CheckApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckApiGroupsV2Request.class, CheckApiGroupsV2Response.class)
                .withName("CheckApiGroupsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckApiGroupsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiGroupCheck.class,
            f -> f.withMarshaller(CheckApiGroupsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckApisV2Request, CheckApisV2Response> checkApisV2 = genForcheckApisV2();

    private static HttpRequestDef<CheckApisV2Request, CheckApisV2Response> genForcheckApisV2() {
        // basic
        HttpRequestDef.Builder<CheckApisV2Request, CheckApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckApisV2Request.class, CheckApisV2Response.class)
                .withName("CheckApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckApisV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiCheckInfo.class,
            f -> f.withMarshaller(CheckApisV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckBackendConnectivityRequest, CheckBackendConnectivityResponse> checkBackendConnectivity = genForcheckBackendConnectivity();

    private static HttpRequestDef<CheckBackendConnectivityRequest, CheckBackendConnectivityResponse> genForcheckBackendConnectivity() {
        // basic
        HttpRequestDef.Builder<CheckBackendConnectivityRequest, CheckBackendConnectivityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckBackendConnectivityRequest.class, CheckBackendConnectivityResponse.class)
                .withName("CheckBackendConnectivity")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/backend/connectivity/check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckBackendConnectivityRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CheckBackendConnectivityReq.class,
            f -> f.withMarshaller(CheckBackendConnectivityRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2 = genForcreateApiGroupV2();

    private static HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> genForcreateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<CreateApiGroupV2Request, CreateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiGroupV2Request.class, CreateApiGroupV2Response.class)
                .withName("CreateApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiGroupReq.class,
            f -> f.withMarshaller(CreateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiV2Request, CreateApiV2Response> createApiV2 = genForcreateApiV2();

    private static HttpRequestDef<CreateApiV2Request, CreateApiV2Response> genForcreateApiV2() {
        // basic
        HttpRequestDef.Builder<CreateApiV2Request, CreateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiV2Request.class, CreateApiV2Response.class)
                .withName("CreateApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiCreate.class,
            f -> f.withMarshaller(CreateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2 = genForcreateOrDeletePublishRecordForApiV2();

    private static HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> genForcreateOrDeletePublishRecordForApiV2() {
        // basic
        HttpRequestDef.Builder<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOrDeletePublishRecordForApiV2Request.class, CreateOrDeletePublishRecordForApiV2Response.class)
                .withName("CreateOrDeletePublishRecordForApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiPublishReq.class,
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugApiV2Request, DebugApiV2Response> debugApiV2 = genFordebugApiV2();

    private static HttpRequestDef<DebugApiV2Request, DebugApiV2Response> genFordebugApiV2() {
        // basic
        HttpRequestDef.Builder<DebugApiV2Request, DebugApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugApiV2Request.class, DebugApiV2Response.class)
                .withName("DebugApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/debug/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DebugApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DebugApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DebugApiReq.class,
            f -> f.withMarshaller(DebugApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2 = genFordeleteApiByVersionIdV2();

    private static HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> genFordeleteApiByVersionIdV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiByVersionIdV2Request.class, DeleteApiByVersionIdV2Response.class)
                .withName("DeleteApiByVersionIdV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2 = genFordeleteApiGroupV2();

    private static HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> genFordeleteApiGroupV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiGroupV2Request, DeleteApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiGroupV2Request.class, DeleteApiGroupV2Response.class)
                .withName("DeleteApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2 = genFordeleteApiV2();

    private static HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> genFordeleteApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiV2Request, DeleteApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiV2Request.class, DeleteApiV2Response.class)
                .withName("DeleteApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2 = genFordisassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> genFordisassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisassociateRequestThrottlingPolicyV2Request.class, DisassociateRequestThrottlingPolicyV2Response.class)
                .withName("DisassociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/{throttle_binding_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_binding_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getThrottleBindingId, (req, v) -> {
                req.setThrottleBindingId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2 = genForlistApiGroupsV2();

    private static HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> genForlistApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsV2Request, ListApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiGroupsV2Request.class, ListApiGroupsV2Response.class)
                .withName("ListApiGroupsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("roma_app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getRomaAppId, (req, v) -> {
                req.setRomaAppId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiGroupsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2 = genForlistApiRuntimeDefinitionV2();

    private static HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> genForlistApiRuntimeDefinitionV2() {
        // basic
        HttpRequestDef.Builder<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiRuntimeDefinitionV2Request.class, ListApiRuntimeDefinitionV2Response.class)
                .withName("ListApiRuntimeDefinitionV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/runtime/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2 = genForlistApiVersionDetailV2();

    private static HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> genForlistApiVersionDetailV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionDetailV2Request.class, ListApiVersionDetailV2Response.class)
                .withName("ListApiVersionDetailV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2 = genForlistApiVersionsV2();

    private static HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> genForlistApiVersionsV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsV2Request, ListApiVersionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsV2Request.class, ListApiVersionsV2Response.class)
                .withName("ListApiVersionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvName, (req, v) -> {
                req.setEnvName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApiVersionsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2 = genForlistApisBindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> genForlistApisBindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToRequestThrottlingPolicyV2Request.class, ListApisBindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisBindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2 = genForlistApisUnbindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> genForlistApisUnbindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisUnbindedToRequestThrottlingPolicyV2Request.class, ListApisUnbindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisUnbindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisV2Request, ListApisV2Response> listApisV2 = genForlistApisV2();

    private static HttpRequestDef<ListApisV2Request, ListApisV2Response> genForlistApisV2() {
        // basic
        HttpRequestDef.Builder<ListApisV2Request, ListApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisV2Request.class, ListApisV2Response.class)
                .withName("ListApisV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("req_protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqProtocol, (req, v) -> {
                req.setReqProtocol(v);
            })
        );
        builder.withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqMethod, (req, v) -> {
                req.setReqMethod(v);
            })
        );
        builder.withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getReqUri, (req, v) -> {
                req.setReqUri(v);
            })
        );
        builder.withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getAuthType, (req, v) -> {
                req.setAuthType(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisV2Request::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2 = genForlistRequestThrottlingPoliciesBindedToApiV2();

    private static HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> genForlistRequestThrottlingPoliciesBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestThrottlingPoliciesBindedToApiV2Request.class, ListRequestThrottlingPoliciesBindedToApiV2Response.class)
                .withName("ListRequestThrottlingPoliciesBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/throttle-bindings/binded-throttles")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            })
        );
        builder.withRequestField("throttle_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleName, (req, v) -> {
                req.setThrottleName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2 = genForshowDetailsOfApiGroupV2();

    private static HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> genForshowDetailsOfApiGroupV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiGroupV2Request.class, ShowDetailsOfApiGroupV2Response.class)
                .withName("ShowDetailsOfApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2 = genForshowDetailsOfApiV2();

    private static HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> genForshowDetailsOfApiV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiV2Request.class, ShowDetailsOfApiV2Response.class)
                .withName("ShowDetailsOfApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2 = genForupdateApiGroupV2();

    private static HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> genForupdateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiGroupV2Request, UpdateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiGroupV2Request.class, UpdateApiGroupV2Response.class)
                .withName("UpdateApiGroupV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiGroupBase.class,
            f -> f.withMarshaller(UpdateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> updateApiV2 = genForupdateApiV2();

    private static HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> genForupdateApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiV2Request, UpdateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiV2Request.class, UpdateApiV2Response.class)
                .withName("UpdateApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiCreate.class,
            f -> f.withMarshaller(UpdateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2 = genForbatchDeleteApiAclBindingV2();

    private static HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> genForbatchDeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDeleteApiAclBindingV2Request.class, BatchDeleteApiAclBindingV2Response.class)
                .withName("BatchDeleteApiAclBindingV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AclBindingBatchDelete.class,
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2 = genForcreateApiAclBindingV2();

    private static HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> genForcreateApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiAclBindingV2Request.class, CreateApiAclBindingV2Response.class)
                .withName("CreateApiAclBindingV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AclApiBindingCreate.class,
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2 = genFordeleteApiAclBindingV2();

    private static HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> genFordeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiAclBindingV2Request.class, DeleteApiAclBindingV2Response.class)
                .withName("DeleteApiAclBindingV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/{acl_bindings_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getAclBindingsId, (req, v) -> {
                req.setAclBindingsId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2 = genForlistAclPolicyBindedToApiV2();

    private static HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> genForlistAclPolicyBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclPolicyBindedToApiV2Request.class, ListAclPolicyBindedToApiV2Response.class)
                .withName("ListAclPolicyBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/binded-acls")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvName, (req, v) -> {
                req.setEnvName(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );
        builder.withRequestField("acl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclName, (req, v) -> {
                req.setAclName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2 = genForlistApisBindedToAclPolicyV2();

    private static HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> genForlistApisBindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToAclPolicyV2Request.class, ListApisBindedToAclPolicyV2Response.class)
                .withName("ListApisBindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2 = genForlistApisUnbindedToAclPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> genForlistApisUnbindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisUnbindedToAclPolicyV2Request.class, ListApisUnbindedToAclPolicyV2Response.class)
                .withName("ListApisUnbindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/acl-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2 = genForcancelingAuthorizationV2();

    private static HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> genForcancelingAuthorizationV2() {
        // basic
        HttpRequestDef.Builder<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelingAuthorizationV2Request.class, CancelingAuthorizationV2Response.class)
                .withName("CancelingAuthorizationV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/{app_auth_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_auth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getAppAuthId, (req, v) -> {
                req.setAppAuthId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2 = genForcreateAuthorizingAppsV2();

    private static HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> genForcreateAuthorizingAppsV2() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAuthorizingAppsV2Request.class, CreateAuthorizingAppsV2Response.class)
                .withName("CreateAuthorizingAppsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ApiAuthCreate.class,
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2 = genForlistApisBindedToAppV2();

    private static HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> genForlistApisBindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisBindedToAppV2Request.class, ListApisBindedToAppV2Response.class)
                .withName("ListApisBindedToAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/binded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2 = genForlistApisUnbindedToAppV2();

    private static HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> genForlistApisUnbindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisUnbindedToAppV2Request.class, ListApisUnbindedToAppV2Response.class)
                .withName("ListApisUnbindedToAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2 = genForlistAppsBindedToApiV2();

    private static HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> genForlistAppsBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsBindedToApiV2Request.class, ListAppsBindedToApiV2Response.class)
                .withName("ListAppsBindedToApiV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/binded-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            })
        );
        builder.withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> listDuplicateApisForAppV2 = genForlistDuplicateApisForAppV2();

    private static HttpRequestDef<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> genForlistDuplicateApisForAppV2() {
        // basic
        HttpRequestDef.Builder<ListDuplicateApisForAppV2Request, ListDuplicateApisForAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDuplicateApisForAppV2Request.class, ListDuplicateApisForAppV2Response.class)
                .withName("ListDuplicateApisForAppV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/app-auths/duplicate-apis")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDuplicateApisForAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDuplicateApisForAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddUserToAppRequest, AddUserToAppResponse> addUserToApp = genForaddUserToApp();

    private static HttpRequestDef<AddUserToAppRequest, AddUserToAppResponse> genForaddUserToApp() {
        // basic
        HttpRequestDef.Builder<AddUserToAppRequest, AddUserToAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddUserToAppRequest.class, AddUserToAppResponse.class)
                .withName("AddUserToApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddUserToAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddUserToAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            AddUserToApp.class,
            f -> f.withMarshaller(AddUserToAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> checkAuthUsersOfApp = genForcheckAuthUsersOfApp();

    private static HttpRequestDef<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> genForcheckAuthUsersOfApp() {
        // basic
        HttpRequestDef.Builder<CheckAuthUsersOfAppRequest, CheckAuthUsersOfAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAuthUsersOfAppRequest.class, CheckAuthUsersOfAppResponse.class)
                .withName("CheckAuthUsersOfApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/users")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckAuthUsersOfAppRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> checkCanAuthUsersOfApp = genForcheckCanAuthUsersOfApp();

    private static HttpRequestDef<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> genForcheckCanAuthUsersOfApp() {
        // basic
        HttpRequestDef.Builder<CheckCanAuthUsersOfAppRequest, CheckCanAuthUsersOfAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckCanAuthUsersOfAppRequest.class, CheckCanAuthUsersOfAppResponse.class)
                .withName("CheckCanAuthUsersOfApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/candidates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CheckCanAuthUsersOfAppRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> checkRomaAppDetails = genForcheckRomaAppDetails();

    private static HttpRequestDef<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> genForcheckRomaAppDetails() {
        // basic
        HttpRequestDef.Builder<CheckRomaAppDetailsRequest, CheckRomaAppDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckRomaAppDetailsRequest.class, CheckRomaAppDetailsResponse.class)
                .withName("CheckRomaAppDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckRomaAppDetailsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckRomaAppDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> checkRomaAppSecret = genForcheckRomaAppSecret();

    private static HttpRequestDef<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> genForcheckRomaAppSecret() {
        // basic
        HttpRequestDef.Builder<CheckRomaAppSecretRequest, CheckRomaAppSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckRomaAppSecretRequest.class, CheckRomaAppSecretResponse.class)
                .withName("CheckRomaAppSecret")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/secret")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckRomaAppSecretRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckRomaAppSecretRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRomaAppRequest, CreateRomaAppResponse> createRomaApp = genForcreateRomaApp();

    private static HttpRequestDef<CreateRomaAppRequest, CreateRomaAppResponse> genForcreateRomaApp() {
        // basic
        HttpRequestDef.Builder<CreateRomaAppRequest, CreateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRomaAppRequest.class, CreateRomaAppResponse.class)
                .withName("CreateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAppReq.class,
            f -> f.withMarshaller(CreateRomaAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRomaAppRequest, DeleteRomaAppResponse> deleteRomaApp = genFordeleteRomaApp();

    private static HttpRequestDef<DeleteRomaAppRequest, DeleteRomaAppResponse> genFordeleteRomaApp() {
        // basic
        HttpRequestDef.Builder<DeleteRomaAppRequest, DeleteRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRomaAppRequest.class, DeleteRomaAppResponse.class)
                .withName("DeleteRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRomaAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRomaAppRequest, ListRomaAppResponse> listRomaApp = genForlistRomaApp();

    private static HttpRequestDef<ListRomaAppRequest, ListRomaAppResponse> genForlistRomaApp() {
        // basic
        HttpRequestDef.Builder<ListRomaAppRequest, ListRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRomaAppRequest.class, ListRomaAppResponse.class)
                .withName("ListRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRomaAppRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListRomaAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("favorite",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListRomaAppRequest::getFavorite, (req, v) -> {
                req.setFavorite(v);
            })
        );
        builder.withRequestField("auth_role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppRequest::getAuthRole, (req, v) -> {
                req.setAuthRole(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("owner",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListRomaAppRequest::getOwner, (req, v) -> {
                req.setOwner(v);
            })
        );
        builder.withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRomaAppRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> resetRomaAppSecret = genForresetRomaAppSecret();

    private static HttpRequestDef<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> genForresetRomaAppSecret() {
        // basic
        HttpRequestDef.Builder<ResetRomaAppSecretRequest, ResetRomaAppSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetRomaAppSecretRequest.class, ResetRomaAppSecretResponse.class)
                .withName("ResetRomaAppSecret")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}/secret")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAppSecretReq.class,
            f -> f.withMarshaller(ResetRomaAppSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRomaAppRequest, UpdateRomaAppResponse> updateRomaApp = genForupdateRomaApp();

    private static HttpRequestDef<UpdateRomaAppRequest, UpdateRomaAppResponse> genForupdateRomaApp() {
        // basic
        HttpRequestDef.Builder<UpdateRomaAppRequest, UpdateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRomaAppRequest.class, UpdateRomaAppResponse.class)
                .withName("UpdateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRomaAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAppReq.class,
            f -> f.withMarshaller(UpdateRomaAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateRomaAppRequest, ValidateRomaAppResponse> validateRomaApp = genForvalidateRomaApp();

    private static HttpRequestDef<ValidateRomaAppRequest, ValidateRomaAppResponse> genForvalidateRomaApp() {
        // basic
        HttpRequestDef.Builder<ValidateRomaAppRequest, ValidateRomaAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateRomaAppRequest.class, ValidateRomaAppResponse.class)
                .withName("ValidateRomaApp")
                .withUri("/v2/{project_id}/instances/{instance_id}/validate-apps")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ValidateRomaAppRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateRomaAppRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateRomaAppRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateRomaAppRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> checkAssetJobStatus = genForcheckAssetJobStatus();

    private static HttpRequestDef<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> genForcheckAssetJobStatus() {
        // basic
        HttpRequestDef.Builder<CheckAssetJobStatusRequest, CheckAssetJobStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAssetJobStatusRequest.class, CheckAssetJobStatusResponse.class)
                .withName("CheckAssetJobStatus")
                .withUri("/v2/{project_id}/instances/{instance_id}/assets/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAssetJobStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckAssetJobStatusRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDictionaryRequest, CheckDictionaryResponse> checkDictionary = genForcheckDictionary();

    private static HttpRequestDef<CheckDictionaryRequest, CheckDictionaryResponse> genForcheckDictionary() {
        // basic
        HttpRequestDef.Builder<CheckDictionaryRequest, CheckDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckDictionaryRequest.class, CheckDictionaryResponse.class)
                .withName("CheckDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckDictionaryRequest::getDictId, (req, v) -> {
                req.setDictId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CheckDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDictionaryRequest, CreateDictionaryResponse> createDictionary = genForcreateDictionary();

    private static HttpRequestDef<CreateDictionaryRequest, CreateDictionaryResponse> genForcreateDictionary() {
        // basic
        HttpRequestDef.Builder<CreateDictionaryRequest, CreateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDictionaryRequest.class, CreateDictionaryResponse.class)
                .withName("CreateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDictionary.class,
            f -> f.withMarshaller(CreateDictionaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDictionaryRequest, DeleteDictionaryResponse> deleteDictionary = genFordeleteDictionary();

    private static HttpRequestDef<DeleteDictionaryRequest, DeleteDictionaryResponse> genFordeleteDictionary() {
        // basic
        HttpRequestDef.Builder<DeleteDictionaryRequest, DeleteDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDictionaryRequest.class, DeleteDictionaryResponse.class)
                .withName("DeleteDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDictionaryRequest::getDictId, (req, v) -> {
                req.setDictId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDictionaryRequest, ListDictionaryResponse> listDictionary = genForlistDictionary();

    private static HttpRequestDef<ListDictionaryRequest, ListDictionaryResponse> genForlistDictionary() {
        // basic
        HttpRequestDef.Builder<ListDictionaryRequest, ListDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDictionaryRequest.class, ListDictionaryResponse.class)
                .withName("ListDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("parent_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getParentCode, (req, v) -> {
                req.setParentCode(v);
            })
        );
        builder.withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getCode, (req, v) -> {
                req.setCode(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDictionaryRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDictionaryRequest, UpdateDictionaryResponse> updateDictionary = genForupdateDictionary();

    private static HttpRequestDef<UpdateDictionaryRequest, UpdateDictionaryResponse> genForupdateDictionary() {
        // basic
        HttpRequestDef.Builder<UpdateDictionaryRequest, UpdateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDictionaryRequest.class, UpdateDictionaryResponse.class)
                .withName("UpdateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/dictionaries/{dict_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("dict_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDictionaryRequest::getDictId, (req, v) -> {
                req.setDictId(v);
            })
        );
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateDictionary.class,
            f -> f.withMarshaller(UpdateDictionaryRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateDictionaryRequest, ValidateDictionaryResponse> validateDictionary = genForvalidateDictionary();

    private static HttpRequestDef<ValidateDictionaryRequest, ValidateDictionaryResponse> genForvalidateDictionary() {
        // basic
        HttpRequestDef.Builder<ValidateDictionaryRequest, ValidateDictionaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ValidateDictionaryRequest.class, ValidateDictionaryResponse.class)
                .withName("ValidateDictionary")
                .withUri("/v2/{project_id}/instances/{instance_id}/validate-dictionaries")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ValidateDictionaryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateDictionaryRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ValidateDictionaryRequest::getCode, (req, v) -> {
                req.setCode(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMqsInstanceRequest, ListMqsInstanceResponse> listMqsInstance = genForlistMqsInstance();

    private static HttpRequestDef<ListMqsInstanceRequest, ListMqsInstanceResponse> genForlistMqsInstance() {
        // basic
        HttpRequestDef.Builder<ListMqsInstanceRequest, ListMqsInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMqsInstanceRequest.class, ListMqsInstanceResponse.class)
                .withName("ListMqsInstance")
                .withUri("/v2/{project_id}/mqs/instances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMqsInstanceRequest, ShowMqsInstanceResponse> showMqsInstance = genForshowMqsInstance();

    private static HttpRequestDef<ShowMqsInstanceRequest, ShowMqsInstanceResponse> genForshowMqsInstance() {
        // basic
        HttpRequestDef.Builder<ShowMqsInstanceRequest, ShowMqsInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMqsInstanceRequest.class, ShowMqsInstanceResponse.class)
                .withName("ShowMqsInstance")
                .withUri("/v2/{project_id}/mqs/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMqsInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2 = genForexportApiDefinitionsV2();

    private static HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> genForexportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportApiDefinitionsV2Request.class, ExportApiDefinitionsV2Response.class)
                .withName("ExportApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            SwaggerReq.class,
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> exportLiveDataApiDefinitionsV2 = genForexportLiveDataApiDefinitionsV2();

    private static HttpRequestDef<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> genForexportLiveDataApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportLiveDataApiDefinitionsV2Request, ExportLiveDataApiDefinitionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportLiveDataApiDefinitionsV2Request.class, ExportLiveDataApiDefinitionsV2Response.class)
                .withName("ExportLiveDataApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/livedata-apis/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ExportLiveDataApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            LiveDataExportReq.class,
            f -> f.withMarshaller(ExportLiveDataApiDefinitionsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2 = genForimportApiDefinitionsV2();

    private static HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> genForimportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportApiDefinitionsV2Request.class, ImportApiDefinitionsV2Response.class)
                .withName("ImportApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/import")
                .withContentType("multipart/form-data");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ImportApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> importLiveDataApiDefinitionsV2 = genForimportLiveDataApiDefinitionsV2();

    private static HttpRequestDef<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> genForimportLiveDataApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ImportLiveDataApiDefinitionsV2Request, ImportLiveDataApiDefinitionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportLiveDataApiDefinitionsV2Request.class, ImportLiveDataApiDefinitionsV2Response.class)
                .withName("ImportLiveDataApiDefinitionsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/openapi/livedata-apis/import")
                .withContentType("multipart/form-data");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ImportLiveDataApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2 = genForaddingBackendInstancesV2();

    private static HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> genForaddingBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddingBackendInstancesV2Request.class, AddingBackendInstancesV2Response.class)
                .withName("AddingBackendInstancesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VpcMemberCreate.class,
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2 = genForcreateVpcChannelV2();

    private static HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> genForcreateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<CreateVpcChannelV2Request, CreateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcChannelV2Request.class, CreateVpcChannelV2Response.class)
                .withName("CreateVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VpcCreate.class,
            f -> f.withMarshaller(CreateVpcChannelV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2 = genFordeleteBackendInstanceV2();

    private static HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> genFordeleteBackendInstanceV2() {
        // basic
        HttpRequestDef.Builder<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackendInstanceV2Request.class, DeleteBackendInstanceV2Response.class)
                .withName("DeleteBackendInstanceV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2 = genFordeleteVpcChannelV2();

    private static HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> genFordeleteVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcChannelV2Request.class, DeleteVpcChannelV2Response.class)
                .withName("DeleteVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2 = genForlistBackendInstancesV2();

    private static HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> genForlistBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<ListBackendInstancesV2Request, ListBackendInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackendInstancesV2Request.class, ListBackendInstancesV2Response.class)
                .withName("ListBackendInstancesV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackendInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListBackendInstancesV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBackendInstancesV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackendInstancesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListBackendInstancesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2 = genForlistVpcChannelsV2();

    private static HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> genForlistVpcChannelsV2() {
        // basic
        HttpRequestDef.Builder<ListVpcChannelsV2Request, ListVpcChannelsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcChannelsV2Request.class, ListVpcChannelsV2Response.class)
                .withName("ListVpcChannelsV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("vpc_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getVpcType, (req, v) -> {
                req.setVpcType(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListVpcChannelsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2 = genForshowDetailsOfVpcChannelV2();

    private static HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> genForshowDetailsOfVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfVpcChannelV2Request.class, ShowDetailsOfVpcChannelV2Response.class)
                .withName("ShowDetailsOfVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2 = genForupdateVpcChannelV2();

    private static HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> genForupdateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcChannelV2Request.class, UpdateVpcChannelV2Response.class)
                .withName("UpdateVpcChannelV2")
                .withUri("/v2/{project_id}/apic/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            })
        );
        builder.withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            VpcCreate.class,
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

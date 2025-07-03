package com.huaweicloud.sdk.cbh.v2;

import com.huaweicloud.sdk.cbh.v2.model.AuthorizeCsmsAndKmsRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.CbsGetResourceIdTags;
import com.huaweicloud.sdk.cbh.v2.model.CbsGetSpecInfo;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceSecurityGroups;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceTypeRequest;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceTypeResponse;
import com.huaweicloud.sdk.cbh.v2.model.CommonCbhRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.CountInstancesByTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.CountInstancesByTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.CreateInstanceBody;
import com.huaweicloud.sdk.cbh.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.InstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v2.model.InstallInstanceEipResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListCBHByTagsRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesByTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesByTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListSpecificationsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListSpecificationsResponse;
import com.huaweicloud.sdk.cbh.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceAdminRequest;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceAdminResponse;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.LoginInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.OperateEipRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.RebootCbhRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.RebootInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.RebootInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.RegisterAuthorizationRequest;
import com.huaweicloud.sdk.cbh.v2.model.RegisterAuthorizationResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstanceLoginMethodRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstanceLoginMethodResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstancePasswordRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResetInstancePasswordResponse;
import com.huaweicloud.sdk.cbh.v2.model.ResetPassword;
import com.huaweicloud.sdk.cbh.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.RollbackInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.RollbackInstanceRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.RollbackInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowAuthorizationRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowAuthorizationResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowEcsQuotaRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowEcsQuotaResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceStatusRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceStatusResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceTagsRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowInstanceTagsResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowOmUrlRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowOmUrlResponse;
import com.huaweicloud.sdk.cbh.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cbh.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cbh.v2.model.StartInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.StartInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.StopInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.StopInstanceResponse;
import com.huaweicloud.sdk.cbh.v2.model.SwitchInstanceVpcRequest;
import com.huaweicloud.sdk.cbh.v2.model.SwitchInstanceVpcResponse;
import com.huaweicloud.sdk.cbh.v2.model.SwitchVirtualPrivateCloudRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.UninstallInstanceEipRequest;
import com.huaweicloud.sdk.cbh.v2.model.UninstallInstanceEipResponse;
import com.huaweicloud.sdk.cbh.v2.model.UpdateInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.cbh.v2.model.UpdateInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.cbh.v2.model.UpgradeCbhRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.UpgradeInstanceRequest;
import com.huaweicloud.sdk.cbh.v2.model.UpgradeInstanceResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CbhMeta {

    public static final HttpRequestDef<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> batchCreateInstanceTag =
        genForBatchCreateInstanceTag();

    private static HttpRequestDef<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> genForBatchCreateInstanceTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateInstanceTagRequest.class, BatchCreateInstanceTagResponse.class)
            .withName("BatchCreateInstanceTag")
            .withUri("/v2/{project_id}/cbs/instance/{resource_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateInstanceTagRequest::getResourceId,
                BatchCreateInstanceTagRequest::setResourceId));
        builder.<CbsGetResourceIdTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CbsGetResourceIdTags.class),
            f -> f.withMarshaller(BatchCreateInstanceTagRequest::getBody, BatchCreateInstanceTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstanceTypeRequest, ChangeInstanceTypeResponse> changeInstanceType =
        genForChangeInstanceType();

    private static HttpRequestDef<ChangeInstanceTypeRequest, ChangeInstanceTypeResponse> genForChangeInstanceType() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceTypeRequest, ChangeInstanceTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeInstanceTypeRequest.class, ChangeInstanceTypeResponse.class)
                .withName("ChangeInstanceType")
                .withUri("/v2/{project_id}/cbs/instance/type")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceTypeRequest::getServerId, ChangeInstanceTypeRequest::setServerId));
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceTypeRequest::getAvailabilityZone,
                ChangeInstanceTypeRequest::setAvailabilityZone));
        builder.<Integer>withRequestField("is_auto_pay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ChangeInstanceTypeRequest::getIsAutoPay, ChangeInstanceTypeRequest::setIsAutoPay));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountInstancesByTagRequest, CountInstancesByTagResponse> countInstancesByTag =
        genForCountInstancesByTag();

    private static HttpRequestDef<CountInstancesByTagRequest, CountInstancesByTagResponse> genForCountInstancesByTag() {
        // basic
        HttpRequestDef.Builder<CountInstancesByTagRequest, CountInstancesByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CountInstancesByTagRequest.class, CountInstancesByTagResponse.class)
                .withName("CountInstancesByTag")
                .withUri("/v2/{project_id}/cbs/instance/count")
                .withContentType("application/json");

        // requests
        builder.<ListCBHByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCBHByTagsRequestBody.class),
            f -> f.withMarshaller(CountInstancesByTagRequest::getBody, CountInstancesByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{project_id}/cbs/instance")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/{project_id}/cbs/instance")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallInstanceEipRequest, InstallInstanceEipResponse> installInstanceEip =
        genForInstallInstanceEip();

    private static HttpRequestDef<InstallInstanceEipRequest, InstallInstanceEipResponse> genForInstallInstanceEip() {
        // basic
        HttpRequestDef.Builder<InstallInstanceEipRequest, InstallInstanceEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallInstanceEipRequest.class, InstallInstanceEipResponse.class)
                .withName("InstallInstanceEip")
                .withUri("/v2/{project_id}/cbs/instance/{server_id}/eip/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InstallInstanceEipRequest::getServerId, InstallInstanceEipRequest::setServerId));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(InstallInstanceEipRequest::getBody, InstallInstanceEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/{project_id}/cbs/available-zone")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/cbs/instance/list")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, ListInstancesRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagRequest, ListInstancesByTagResponse> listInstancesByTag =
        genForListInstancesByTag();

    private static HttpRequestDef<ListInstancesByTagRequest, ListInstancesByTagResponse> genForListInstancesByTag() {
        // basic
        HttpRequestDef.Builder<ListInstancesByTagRequest, ListInstancesByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesByTagRequest.class, ListInstancesByTagResponse.class)
                .withName("ListInstancesByTag")
                .withUri("/v2/{project_id}/cbs/instance/filter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesByTagRequest::getLimit, ListInstancesByTagRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesByTagRequest::getOffset, ListInstancesByTagRequest::setOffset));
        builder.<ListCBHByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCBHByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByTagRequest::getBody, ListInstancesByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecificationsRequest, ListSpecificationsResponse> listSpecifications =
        genForListSpecifications();

    private static HttpRequestDef<ListSpecificationsRequest, ListSpecificationsResponse> genForListSpecifications() {
        // basic
        HttpRequestDef.Builder<ListSpecificationsRequest, ListSpecificationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpecificationsRequest.class, ListSpecificationsResponse.class)
                .withName("ListSpecifications")
                .withUri("/v2/{project_id}/cbs/instance/specification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecificationsRequest::getAction, ListSpecificationsRequest::setAction));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecificationsRequest::getSpecCode, ListSpecificationsRequest::setSpecCode));

        // response
        builder.<List<CbsGetSpecInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSpecificationsResponse::getBody, ListSpecificationsResponse::setBody)
                .withInnerContainerType(CbsGetSpecInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v2/{project_id}/cbs/instance/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoginInstanceRequest, LoginInstanceResponse> loginInstance =
        genForLoginInstance();

    private static HttpRequestDef<LoginInstanceRequest, LoginInstanceResponse> genForLoginInstance() {
        // basic
        HttpRequestDef.Builder<LoginInstanceRequest, LoginInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LoginInstanceRequest.class, LoginInstanceResponse.class)
                .withName("LoginInstance")
                .withUri("/v2/{project_id}/cbs/instance/login")
                .withContentType("application/json");

        // requests
        builder.<CommonCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommonCbhRequestBody.class),
            f -> f.withMarshaller(LoginInstanceRequest::getBody, LoginInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoginInstanceAdminRequest, LoginInstanceAdminResponse> loginInstanceAdmin =
        genForLoginInstanceAdmin();

    private static HttpRequestDef<LoginInstanceAdminRequest, LoginInstanceAdminResponse> genForLoginInstanceAdmin() {
        // basic
        HttpRequestDef.Builder<LoginInstanceAdminRequest, LoginInstanceAdminResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, LoginInstanceAdminRequest.class, LoginInstanceAdminResponse.class)
                .withName("LoginInstanceAdmin")
                .withUri("/v2/{project_id}/cbs/instances/{server_id}/admin-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LoginInstanceAdminRequest::getServerId, LoginInstanceAdminRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootInstanceRequest, RebootInstanceResponse> rebootInstance =
        genForRebootInstance();

    private static HttpRequestDef<RebootInstanceRequest, RebootInstanceResponse> genForRebootInstance() {
        // basic
        HttpRequestDef.Builder<RebootInstanceRequest, RebootInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RebootInstanceRequest.class, RebootInstanceResponse.class)
                .withName("RebootInstance")
                .withUri("/v2/{project_id}/cbs/instance/reboot")
                .withContentType("application/json");

        // requests
        builder.<RebootCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebootCbhRequestBody.class),
            f -> f.withMarshaller(RebootInstanceRequest::getBody, RebootInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAuthorizationRequest, RegisterAuthorizationResponse> registerAuthorization =
        genForRegisterAuthorization();

    private static HttpRequestDef<RegisterAuthorizationRequest, RegisterAuthorizationResponse> genForRegisterAuthorization() {
        // basic
        HttpRequestDef.Builder<RegisterAuthorizationRequest, RegisterAuthorizationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RegisterAuthorizationRequest.class, RegisterAuthorizationResponse.class)
            .withName("RegisterAuthorization")
            .withUri("/v2/{project_id}/cbs/agency/authorization")
            .withContentType("application/json");

        // requests
        builder.<AuthorizeCsmsAndKmsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizeCsmsAndKmsRequestBody.class),
            f -> f.withMarshaller(RegisterAuthorizationRequest::getBody, RegisterAuthorizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> resetInstanceLoginMethod =
        genForResetInstanceLoginMethod();

    private static HttpRequestDef<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> genForResetInstanceLoginMethod() {
        // basic
        HttpRequestDef.Builder<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, ResetInstanceLoginMethodRequest.class, ResetInstanceLoginMethodResponse.class)
                .withName("ResetInstanceLoginMethod")
                .withUri("/v2/{project_id}/cbs/instance/login-method")
                .withContentType("application/json");

        // requests
        builder.<CommonCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommonCbhRequestBody.class),
            f -> f.withMarshaller(ResetInstanceLoginMethodRequest::getBody, ResetInstanceLoginMethodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetInstancePasswordRequest, ResetInstancePasswordResponse> resetInstancePassword =
        genForResetInstancePassword();

    private static HttpRequestDef<ResetInstancePasswordRequest, ResetInstancePasswordResponse> genForResetInstancePassword() {
        // basic
        HttpRequestDef.Builder<ResetInstancePasswordRequest, ResetInstancePasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResetInstancePasswordRequest.class, ResetInstancePasswordResponse.class)
            .withName("ResetInstancePassword")
            .withUri("/v2/{project_id}/cbs/instance/password")
            .withContentType("application/json");

        // requests
        builder.<ResetPassword>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPassword.class),
            f -> f.withMarshaller(ResetInstancePasswordRequest::getBody, ResetInstancePasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{project_id}/cbs/instance")
                .withContentType("application/json");

        // requests
        builder.<ChangeInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceRequestBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackInstanceRequest, RollbackInstanceResponse> rollbackInstance =
        genForRollbackInstance();

    private static HttpRequestDef<RollbackInstanceRequest, RollbackInstanceResponse> genForRollbackInstance() {
        // basic
        HttpRequestDef.Builder<RollbackInstanceRequest, RollbackInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RollbackInstanceRequest.class, RollbackInstanceResponse.class)
                .withName("RollbackInstance")
                .withUri("/v2/{project_id}/cbs/instance/rollback")
                .withContentType("application/json");

        // requests
        builder.<RollbackInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RollbackInstanceRequestBody.class),
            f -> f.withMarshaller(RollbackInstanceRequest::getBody, RollbackInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizationRequest, ShowAuthorizationResponse> showAuthorization =
        genForShowAuthorization();

    private static HttpRequestDef<ShowAuthorizationRequest, ShowAuthorizationResponse> genForShowAuthorization() {
        // basic
        HttpRequestDef.Builder<ShowAuthorizationRequest, ShowAuthorizationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuthorizationRequest.class, ShowAuthorizationResponse.class)
                .withName("ShowAuthorization")
                .withUri("/v2/{project_id}/cbs/agency/authorization")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEcsQuotaRequest, ShowEcsQuotaResponse> showEcsQuota = genForShowEcsQuota();

    private static HttpRequestDef<ShowEcsQuotaRequest, ShowEcsQuotaResponse> genForShowEcsQuota() {
        // basic
        HttpRequestDef.Builder<ShowEcsQuotaRequest, ShowEcsQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEcsQuotaRequest.class, ShowEcsQuotaResponse.class)
                .withName("ShowEcsQuota")
                .withUri("/v2/{project_id}/cbs/instance/ecs-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcsQuotaRequest::getAvailabilityZone, ShowEcsQuotaRequest::setAvailabilityZone));
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcsQuotaRequest::getResourceSpecCode, ShowEcsQuotaRequest::setResourceSpecCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus =
        genForShowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForShowInstanceStatus() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusRequest, ShowInstanceStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceStatusRequest.class, ShowInstanceStatusResponse.class)
                .withName("ShowInstanceStatus")
                .withUri("/v2/{project_id}/cbs/instance/{server_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceStatusRequest::getServerId, ShowInstanceStatusRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTags =
        genForShowInstanceTags();

    private static HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> genForShowInstanceTags() {
        // basic
        HttpRequestDef.Builder<ShowInstanceTagsRequest, ShowInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceTagsRequest.class, ShowInstanceTagsResponse.class)
                .withName("ShowInstanceTags")
                .withUri("/v2/{project_id}/cbs/instance/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceTagsRequest::getResourceId, ShowInstanceTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOmUrlRequest, ShowOmUrlResponse> showOmUrl = genForShowOmUrl();

    private static HttpRequestDef<ShowOmUrlRequest, ShowOmUrlResponse> genForShowOmUrl() {
        // basic
        HttpRequestDef.Builder<ShowOmUrlRequest, ShowOmUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOmUrlRequest.class, ShowOmUrlResponse.class)
                .withName("ShowOmUrl")
                .withUri("/v2/{project_id}/cbs/instance/get-om-url")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOmUrlRequest::getServerId, ShowOmUrlRequest::setServerId));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOmUrlRequest::getIpAddress, ShowOmUrlRequest::setIpAddress));
        builder.<String>withRequestField("host_account_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOmUrlRequest::getHostAccountName, ShowOmUrlRequest::setHostAccountName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v2/{project_id}/cbs/instance/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForStartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForStartInstance() {
        // basic
        HttpRequestDef.Builder<StartInstanceRequest, StartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartInstanceRequest.class, StartInstanceResponse.class)
                .withName("StartInstance")
                .withUri("/v2/{project_id}/cbs/instance/start")
                .withContentType("application/json");

        // requests
        builder.<CommonCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommonCbhRequestBody.class),
            f -> f.withMarshaller(StartInstanceRequest::getBody, StartInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForStopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForStopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInstanceRequest.class, StopInstanceResponse.class)
                .withName("StopInstance")
                .withUri("/v2/{project_id}/cbs/instance/stop")
                .withContentType("application/json");

        // requests
        builder.<CommonCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CommonCbhRequestBody.class),
            f -> f.withMarshaller(StopInstanceRequest::getBody, StopInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchInstanceVpcRequest, SwitchInstanceVpcResponse> switchInstanceVpc =
        genForSwitchInstanceVpc();

    private static HttpRequestDef<SwitchInstanceVpcRequest, SwitchInstanceVpcResponse> genForSwitchInstanceVpc() {
        // basic
        HttpRequestDef.Builder<SwitchInstanceVpcRequest, SwitchInstanceVpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchInstanceVpcRequest.class, SwitchInstanceVpcResponse.class)
                .withName("SwitchInstanceVpc")
                .withUri("/v2/{project_id}/cbs/instance/vpc")
                .withContentType("application/json");

        // requests
        builder.<SwitchVirtualPrivateCloudRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchVirtualPrivateCloudRequestBody.class),
            f -> f.withMarshaller(SwitchInstanceVpcRequest::getBody, SwitchInstanceVpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEip =
        genForUninstallInstanceEip();

    private static HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> genForUninstallInstanceEip() {
        // basic
        HttpRequestDef.Builder<UninstallInstanceEipRequest, UninstallInstanceEipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UninstallInstanceEipRequest.class, UninstallInstanceEipResponse.class)
            .withName("UninstallInstanceEip")
            .withUri("/v2/{project_id}/cbs/instance/{server_id}/eip/unbind")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallInstanceEipRequest::getServerId, UninstallInstanceEipRequest::setServerId));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(UninstallInstanceEipRequest::getBody, UninstallInstanceEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroup =
        genForUpdateInstanceSecurityGroup();

    private static HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> genForUpdateInstanceSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceSecurityGroupRequest.class,
                    UpdateInstanceSecurityGroupResponse.class)
                .withName("UpdateInstanceSecurityGroup")
                .withUri("/v2/{project_id}/cbs/instance/{server_id}/security-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getServerId,
                UpdateInstanceSecurityGroupRequest::setServerId));
        builder.<ChangeInstanceSecurityGroups>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceSecurityGroups.class),
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getBody,
                UpdateInstanceSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstance =
        genForUpgradeInstance();

    private static HttpRequestDef<UpgradeInstanceRequest, UpgradeInstanceResponse> genForUpgradeInstance() {
        // basic
        HttpRequestDef.Builder<UpgradeInstanceRequest, UpgradeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeInstanceRequest.class, UpgradeInstanceResponse.class)
                .withName("UpgradeInstance")
                .withUri("/v2/{project_id}/cbs/instance/upgrade")
                .withContentType("application/json");

        // requests
        builder.<UpgradeCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeCbhRequestBody.class),
            f -> f.withMarshaller(UpgradeInstanceRequest::getBody, UpgradeInstanceRequest::setBody));

        // response

        return builder.build();
    }

}

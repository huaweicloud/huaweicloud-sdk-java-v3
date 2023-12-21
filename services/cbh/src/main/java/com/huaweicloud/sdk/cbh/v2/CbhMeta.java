package com.huaweicloud.sdk.cbh.v2;

import com.huaweicloud.sdk.cbh.v2.model.AuthorizeCsmsAndKmsRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagRequest;
import com.huaweicloud.sdk.cbh.v2.model.BatchCreateInstanceTagResponse;
import com.huaweicloud.sdk.cbh.v2.model.CbsGetResourceIdTags;
import com.huaweicloud.sdk.cbh.v2.model.CbsGetSpecInfo;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceRequestBody;
import com.huaweicloud.sdk.cbh.v2.model.ChangeInstanceSecurityGroups;
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

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("unchecked")
public class CbhMeta {

    public static final HttpRequestDef<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> batchCreateInstanceTag =
        genForbatchCreateInstanceTag();

    private static HttpRequestDef<BatchCreateInstanceTagRequest, BatchCreateInstanceTagResponse> genForbatchCreateInstanceTag() {
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
            f -> f.withMarshaller(BatchCreateInstanceTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CbsGetResourceIdTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CbsGetResourceIdTags.class),
            f -> f.withMarshaller(BatchCreateInstanceTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountInstancesByTagRequest, CountInstancesByTagResponse> countInstancesByTag =
        genForcountInstancesByTag();

    private static HttpRequestDef<CountInstancesByTagRequest, CountInstancesByTagResponse> genForcountInstancesByTag() {
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
            f -> f.withMarshaller(CountInstancesByTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
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
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/{project_id}/cbs/instance")
                .withContentType("application/json");

        // requests
        builder.<BigDecimal>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallInstanceEipRequest, InstallInstanceEipResponse> installInstanceEip =
        genForinstallInstanceEip();

    private static HttpRequestDef<InstallInstanceEipRequest, InstallInstanceEipResponse> genForinstallInstanceEip() {
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
            f -> f.withMarshaller(InstallInstanceEipRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(InstallInstanceEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForlistAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForlistAvailableZones() {
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
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/cbs/instance/list")
                .withContentType("application/json");

        // requests
        builder.<BigDecimal>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesByTagRequest, ListInstancesByTagResponse> listInstancesByTag =
        genForlistInstancesByTag();

    private static HttpRequestDef<ListInstancesByTagRequest, ListInstancesByTagResponse> genForlistInstancesByTag() {
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
            f -> f.withMarshaller(ListInstancesByTagRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesByTagRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListCBHByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCBHByTagsRequestBody.class),
            f -> f.withMarshaller(ListInstancesByTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecificationsRequest, ListSpecificationsResponse> listSpecifications =
        genForlistSpecifications();

    private static HttpRequestDef<ListSpecificationsRequest, ListSpecificationsResponse> genForlistSpecifications() {
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
            f -> f.withMarshaller(ListSpecificationsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecificationsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));

        // response
        builder.<List<CbsGetSpecInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSpecificationsResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(CbsGetSpecInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
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
        genForloginInstance();

    private static HttpRequestDef<LoginInstanceRequest, LoginInstanceResponse> genForloginInstance() {
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
            f -> f.withMarshaller(LoginInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RebootInstanceRequest, RebootInstanceResponse> rebootInstance =
        genForrebootInstance();

    private static HttpRequestDef<RebootInstanceRequest, RebootInstanceResponse> genForrebootInstance() {
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
            f -> f.withMarshaller(RebootInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterAuthorizationRequest, RegisterAuthorizationResponse> registerAuthorization =
        genForregisterAuthorization();

    private static HttpRequestDef<RegisterAuthorizationRequest, RegisterAuthorizationResponse> genForregisterAuthorization() {
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
            f -> f.withMarshaller(RegisterAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> resetInstanceLoginMethod =
        genForresetInstanceLoginMethod();

    private static HttpRequestDef<ResetInstanceLoginMethodRequest, ResetInstanceLoginMethodResponse> genForresetInstanceLoginMethod() {
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
            f -> f.withMarshaller(ResetInstanceLoginMethodRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetInstancePasswordRequest, ResetInstancePasswordResponse> resetInstancePassword =
        genForresetInstancePassword();

    private static HttpRequestDef<ResetInstancePasswordRequest, ResetInstancePasswordResponse> genForresetInstancePassword() {
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
            f -> f.withMarshaller(ResetInstancePasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForresizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForresizeInstance() {
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
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RollbackInstanceRequest, RollbackInstanceResponse> rollbackInstance =
        genForrollbackInstance();

    private static HttpRequestDef<RollbackInstanceRequest, RollbackInstanceResponse> genForrollbackInstance() {
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
            f -> f.withMarshaller(RollbackInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizationRequest, ShowAuthorizationResponse> showAuthorization =
        genForshowAuthorization();

    private static HttpRequestDef<ShowAuthorizationRequest, ShowAuthorizationResponse> genForshowAuthorization() {
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

    public static final HttpRequestDef<ShowEcsQuotaRequest, ShowEcsQuotaResponse> showEcsQuota = genForshowEcsQuota();

    private static HttpRequestDef<ShowEcsQuotaRequest, ShowEcsQuotaResponse> genForshowEcsQuota() {
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
            f -> f.withMarshaller(ShowEcsQuotaRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEcsQuotaRequest::getResourceSpecCode, (req, v) -> {
                req.setResourceSpecCode(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> showInstanceStatus =
        genForshowInstanceStatus();

    private static HttpRequestDef<ShowInstanceStatusRequest, ShowInstanceStatusResponse> genForshowInstanceStatus() {
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
            f -> f.withMarshaller(ShowInstanceStatusRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> showInstanceTags =
        genForshowInstanceTags();

    private static HttpRequestDef<ShowInstanceTagsRequest, ShowInstanceTagsResponse> genForshowInstanceTags() {
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
            f -> f.withMarshaller(ShowInstanceTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOmUrlRequest, ShowOmUrlResponse> showOmUrl = genForshowOmUrl();

    private static HttpRequestDef<ShowOmUrlRequest, ShowOmUrlResponse> genForshowOmUrl() {
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
            f -> f.withMarshaller(ShowOmUrlRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<String>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOmUrlRequest::getIpAddress, (req, v) -> {
                req.setIpAddress(v);
            }));
        builder.<String>withRequestField("host_account_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOmUrlRequest::getHostAccountName, (req, v) -> {
                req.setHostAccountName(v);
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
                .withUri("/v2/{project_id}/cbs/instance/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForstartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForstartInstance() {
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
            f -> f.withMarshaller(StartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForstopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForstopInstance() {
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
            f -> f.withMarshaller(StopInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEip =
        genForuninstallInstanceEip();

    private static HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> genForuninstallInstanceEip() {
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
            f -> f.withMarshaller(UninstallInstanceEipRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(UninstallInstanceEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> updateInstanceSecurityGroup =
        genForupdateInstanceSecurityGroup();

    private static HttpRequestDef<UpdateInstanceSecurityGroupRequest, UpdateInstanceSecurityGroupResponse> genForupdateInstanceSecurityGroup() {
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
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ChangeInstanceSecurityGroups>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceSecurityGroups.class),
            f -> f.withMarshaller(UpdateInstanceSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeInstanceRequest, UpgradeInstanceResponse> upgradeInstance =
        genForupgradeInstance();

    private static HttpRequestDef<UpgradeInstanceRequest, UpgradeInstanceResponse> genForupgradeInstance() {
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
            f -> f.withMarshaller(UpgradeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

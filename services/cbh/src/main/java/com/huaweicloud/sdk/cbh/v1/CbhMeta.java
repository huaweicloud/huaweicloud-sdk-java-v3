package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CbhMeta {

    public static final HttpRequestDef<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetwork =
        genForchangeInstanceNetwork();

    private static HttpRequestDef<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> genForchangeInstanceNetwork() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeInstanceNetworkRequest.class, ChangeInstanceNetworkResponse.class)
            .withName("ChangeInstanceNetwork")
            .withUri("/v1/{project_id}/cbs/{server_id}/network/change")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceNetworkRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));
        builder.<ChangeInstanceNetwork>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceNetwork.class),
            f -> f.withMarshaller(ChangeInstanceNetworkRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/cbs/instance/create")
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

    public static final HttpRequestDef<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrder =
        genForcreateInstanceOrder();

    private static HttpRequestDef<CreateInstanceOrderRequest, CreateInstanceOrderResponse> genForcreateInstanceOrder() {
        // basic
        HttpRequestDef.Builder<CreateInstanceOrderRequest, CreateInstanceOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceOrderRequest.class, CreateInstanceOrderResponse.class)
                .withName("CreateInstanceOrder")
                .withUri("/v1/{project_id}/cbs/period/order")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceOrder>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceOrder.class),
            f -> f.withMarshaller(CreateInstanceOrderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstance =
        genForlistCbhInstance();

    private static HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> genForlistCbhInstance() {
        // basic
        HttpRequestDef.Builder<ListCbhInstanceRequest, ListCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCbhInstanceRequest.class, ListCbhInstanceResponse.class)
                .withName("ListCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstance =
        genForrestartCbhInstance();

    private static HttpRequestDef<RestartCbhInstanceRequest, RestartCbhInstanceResponse> genForrestartCbhInstance() {
        // basic
        HttpRequestDef.Builder<RestartCbhInstanceRequest, RestartCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestartCbhInstanceRequest.class, RestartCbhInstanceResponse.class)
                .withName("RestartCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/reboot")
                .withContentType("application/json");

        // requests
        builder.<RebootCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RebootCbhRequestBody.class),
            f -> f.withMarshaller(RestartCbhInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQuotaRequest, SearchQuotaResponse> searchQuota = genForsearchQuota();

    private static HttpRequestDef<SearchQuotaRequest, SearchQuotaResponse> genForsearchQuota() {
        // basic
        HttpRequestDef.Builder<SearchQuotaRequest, SearchQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchQuotaRequest.class, SearchQuotaResponse.class)
                .withName("SearchQuota")
                .withUri("/v1/{project_id}/cbs/instance/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> showAvailableZoneInfo =
        genForshowAvailableZoneInfo();

    private static HttpRequestDef<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> genForshowAvailableZoneInfo() {
        // basic
        HttpRequestDef.Builder<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableZoneInfoRequest.class, ShowAvailableZoneInfoResponse.class)
            .withName("ShowAvailableZoneInfo")
            .withUri("/v1/{project_id}/cbs/available-zone")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> showNetworkConfiguration =
        genForshowNetworkConfiguration();

    private static HttpRequestDef<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> genForshowNetworkConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowNetworkConfigurationRequest.class, ShowNetworkConfigurationResponse.class)
                .withName("ShowNetworkConfiguration")
                .withUri("/v1/{project_id}/cbs/network/configuration")
                .withContentType("application/json");

        // requests
        builder.<NetworkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(NetworkRequestBody.class),
            f -> f.withMarshaller(ShowNetworkConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstance =
        genForstartCbhInstance();

    private static HttpRequestDef<StartCbhInstanceRequest, StartCbhInstanceResponse> genForstartCbhInstance() {
        // basic
        HttpRequestDef.Builder<StartCbhInstanceRequest, StartCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartCbhInstanceRequest.class, StartCbhInstanceResponse.class)
                .withName("StartCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/start")
                .withContentType("application/json");

        // requests
        builder.<StartCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartCbhRequestBody.class),
            f -> f.withMarshaller(StartCbhInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstance =
        genForupgradeCbhInstance();

    private static HttpRequestDef<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> genForupgradeCbhInstance() {
        // basic
        HttpRequestDef.Builder<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeCbhInstanceRequest.class, UpgradeCbhInstanceResponse.class)
                .withName("UpgradeCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/upgrade")
                .withContentType("application/json");

        // requests
        builder.<UpgradeCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeCbhRequestBody.class),
            f -> f.withMarshaller(UpgradeCbhInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethod =
        genForresetLoginMethod();

    private static HttpRequestDef<ResetLoginMethodRequest, ResetLoginMethodResponse> genForresetLoginMethod() {
        // basic
        HttpRequestDef.Builder<ResetLoginMethodRequest, ResetLoginMethodResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetLoginMethodRequest.class, ResetLoginMethodResponse.class)
                .withName("ResetLoginMethod")
                .withUri("/v1/{project_id}/cbs/instance/{server_id}/login-method")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetLoginMethodRequest::getServerId, (req, v) -> {
                req.setServerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForresetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForresetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v1/{project_id}/cbs/instance/password")
                .withContentType("application/json");

        // requests
        builder.<ResetPassword>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetPassword.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstance =
        genForstopCbhInstance();

    private static HttpRequestDef<StopCbhInstanceRequest, StopCbhInstanceResponse> genForstopCbhInstance() {
        // basic
        HttpRequestDef.Builder<StopCbhInstanceRequest, StopCbhInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopCbhInstanceRequest.class, StopCbhInstanceResponse.class)
                .withName("StopCbhInstance")
                .withUri("/v1/{project_id}/cbs/instance/stop")
                .withContentType("application/json");

        // requests
        builder.<StopCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopCbhRequestBody.class),
            f -> f.withMarshaller(StopCbhInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotaStateRequest, ListQuotaStateResponse> listQuotaState =
        genForlistQuotaState();

    private static HttpRequestDef<ListQuotaStateRequest, ListQuotaStateResponse> genForlistQuotaState() {
        // basic
        HttpRequestDef.Builder<ListQuotaStateRequest, ListQuotaStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaStateRequest.class, ListQuotaStateResponse.class)
                .withName("ListQuotaState")
                .withUri("/v1/{project_id}/cbs/instance/ecs-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotaStateRequest::getAvailabilityZone, (req, v) -> {
                req.setAvailabilityZone(v);
            }));
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotaStateRequest::getResourceSpecCode, (req, v) -> {
                req.setResourceSpecCode(v);
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
                .withUri("/v1/{project_id}/cbs/instance/{server_id}/eip/bind")
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

    public static final HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> uninstallInstanceEip =
        genForuninstallInstanceEip();

    private static HttpRequestDef<UninstallInstanceEipRequest, UninstallInstanceEipResponse> genForuninstallInstanceEip() {
        // basic
        HttpRequestDef.Builder<UninstallInstanceEipRequest, UninstallInstanceEipResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UninstallInstanceEipRequest.class, UninstallInstanceEipResponse.class)
            .withName("UninstallInstanceEip")
            .withUri("/v1/{project_id}/cbs/instance/{server_id}/eip/unbind")
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

}

package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetwork;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceNetworkResponse;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.ChangeInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateCbhRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateCbhResponse;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceBody;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrder;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderRequest;
import com.huaweicloud.sdk.cbh.v1.model.CreateInstanceOrderResponse;
import com.huaweicloud.sdk.cbh.v1.model.InstallCbhEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.InstallCbhEipResponse;
import com.huaweicloud.sdk.cbh.v1.model.ListCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.ListCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.ListQuotaStatusRequest;
import com.huaweicloud.sdk.cbh.v1.model.ListQuotaStatusResponse;
import com.huaweicloud.sdk.cbh.v1.model.LoginCbhRequest;
import com.huaweicloud.sdk.cbh.v1.model.LoginCbhRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.LoginCbhResponse;
import com.huaweicloud.sdk.cbh.v1.model.NetworkRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.OperateEipRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.RebootCbhRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.ResetLoginMethodRequest;
import com.huaweicloud.sdk.cbh.v1.model.ResetLoginMethodResponse;
import com.huaweicloud.sdk.cbh.v1.model.ResetPassword;
import com.huaweicloud.sdk.cbh.v1.model.ResetPasswordRequest;
import com.huaweicloud.sdk.cbh.v1.model.ResetPasswordResponse;
import com.huaweicloud.sdk.cbh.v1.model.RestartCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.RestartCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.SearchQuotaRequest;
import com.huaweicloud.sdk.cbh.v1.model.SearchQuotaResponse;
import com.huaweicloud.sdk.cbh.v1.model.ShowAvailableZoneInfoRequest;
import com.huaweicloud.sdk.cbh.v1.model.ShowAvailableZoneInfoResponse;
import com.huaweicloud.sdk.cbh.v1.model.ShowNetworkConfigurationRequest;
import com.huaweicloud.sdk.cbh.v1.model.ShowNetworkConfigurationResponse;
import com.huaweicloud.sdk.cbh.v1.model.StartCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.StartCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.StartCbhRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.StopCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.StopCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.StopCbhRequestBody;
import com.huaweicloud.sdk.cbh.v1.model.UninstallCbhEipRequest;
import com.huaweicloud.sdk.cbh.v1.model.UninstallCbhEipResponse;
import com.huaweicloud.sdk.cbh.v1.model.UpgradeCbhInstanceRequest;
import com.huaweicloud.sdk.cbh.v1.model.UpgradeCbhInstanceResponse;
import com.huaweicloud.sdk.cbh.v1.model.UpgradeCbhRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CbhMeta {

    public static final HttpRequestDef<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> changeInstanceNetwork =
        genForChangeInstanceNetwork();

    private static HttpRequestDef<ChangeInstanceNetworkRequest, ChangeInstanceNetworkResponse> genForChangeInstanceNetwork() {
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
            f -> f.withMarshaller(ChangeInstanceNetworkRequest::getServerId,
                ChangeInstanceNetworkRequest::setServerId));
        builder.<ChangeInstanceNetwork>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceNetwork.class),
            f -> f.withMarshaller(ChangeInstanceNetworkRequest::getBody, ChangeInstanceNetworkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> changeInstanceOrder =
        genForChangeInstanceOrder();

    private static HttpRequestDef<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> genForChangeInstanceOrder() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceOrderRequest, ChangeInstanceOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ChangeInstanceOrderRequest.class, ChangeInstanceOrderResponse.class)
                .withName("ChangeInstanceOrder")
                .withUri("/v1/{project_id}/cbs/{server_id}/alter/{instance_key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceOrderRequest::getServerId, ChangeInstanceOrderRequest::setServerId));
        builder.<String>withRequestField("instance_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceOrderRequest::getInstanceKey,
                ChangeInstanceOrderRequest::setInstanceKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCbhRequest, CreateCbhResponse> createCbh = genForCreateCbh();

    private static HttpRequestDef<CreateCbhRequest, CreateCbhResponse> genForCreateCbh() {
        // basic
        HttpRequestDef.Builder<CreateCbhRequest, CreateCbhResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCbhRequest.class, CreateCbhResponse.class)
                .withName("CreateCbh")
                .withUri("/v1/{project_id}/cbs/instance/create")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceBody.class),
            f -> f.withMarshaller(CreateCbhRequest::getBody, CreateCbhRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceOrderRequest, CreateInstanceOrderResponse> createInstanceOrder =
        genForCreateInstanceOrder();

    private static HttpRequestDef<CreateInstanceOrderRequest, CreateInstanceOrderResponse> genForCreateInstanceOrder() {
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
            f -> f.withMarshaller(CreateInstanceOrderRequest::getBody, CreateInstanceOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InstallCbhEipRequest, InstallCbhEipResponse> installCbhEip =
        genForInstallCbhEip();

    private static HttpRequestDef<InstallCbhEipRequest, InstallCbhEipResponse> genForInstallCbhEip() {
        // basic
        HttpRequestDef.Builder<InstallCbhEipRequest, InstallCbhEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InstallCbhEipRequest.class, InstallCbhEipResponse.class)
                .withName("InstallCbhEip")
                .withUri("/v1/{project_id}/cbs/instance/{server_id}/eip/bind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InstallCbhEipRequest::getServerId, InstallCbhEipRequest::setServerId));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(InstallCbhEipRequest::getBody, InstallCbhEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstance =
        genForListCbhInstance();

    private static HttpRequestDef<ListCbhInstanceRequest, ListCbhInstanceResponse> genForListCbhInstance() {
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

    public static final HttpRequestDef<ListQuotaStatusRequest, ListQuotaStatusResponse> listQuotaStatus =
        genForListQuotaStatus();

    private static HttpRequestDef<ListQuotaStatusRequest, ListQuotaStatusResponse> genForListQuotaStatus() {
        // basic
        HttpRequestDef.Builder<ListQuotaStatusRequest, ListQuotaStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotaStatusRequest.class, ListQuotaStatusResponse.class)
                .withName("ListQuotaStatus")
                .withUri("/v1/{project_id}/cbs/instance/ecs-quota")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("availability_zone",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotaStatusRequest::getAvailabilityZone,
                ListQuotaStatusRequest::setAvailabilityZone));
        builder.<String>withRequestField("resource_spec_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQuotaStatusRequest::getResourceSpecCode,
                ListQuotaStatusRequest::setResourceSpecCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetLoginMethodRequest, ResetLoginMethodResponse> resetLoginMethod =
        genForResetLoginMethod();

    private static HttpRequestDef<ResetLoginMethodRequest, ResetLoginMethodResponse> genForResetLoginMethod() {
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
            f -> f.withMarshaller(ResetLoginMethodRequest::getServerId, ResetLoginMethodRequest::setServerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
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
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartCbhInstanceRequest, RestartCbhInstanceResponse> restartCbhInstance =
        genForRestartCbhInstance();

    private static HttpRequestDef<RestartCbhInstanceRequest, RestartCbhInstanceResponse> genForRestartCbhInstance() {
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
            f -> f.withMarshaller(RestartCbhInstanceRequest::getBody, RestartCbhInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQuotaRequest, SearchQuotaResponse> searchQuota = genForSearchQuota();

    private static HttpRequestDef<SearchQuotaRequest, SearchQuotaResponse> genForSearchQuota() {
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
        genForShowAvailableZoneInfo();

    private static HttpRequestDef<ShowAvailableZoneInfoRequest, ShowAvailableZoneInfoResponse> genForShowAvailableZoneInfo() {
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
        genForShowNetworkConfiguration();

    private static HttpRequestDef<ShowNetworkConfigurationRequest, ShowNetworkConfigurationResponse> genForShowNetworkConfiguration() {
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
            f -> f.withMarshaller(ShowNetworkConfigurationRequest::getBody, ShowNetworkConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartCbhInstanceRequest, StartCbhInstanceResponse> startCbhInstance =
        genForStartCbhInstance();

    private static HttpRequestDef<StartCbhInstanceRequest, StartCbhInstanceResponse> genForStartCbhInstance() {
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
            f -> f.withMarshaller(StartCbhInstanceRequest::getBody, StartCbhInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopCbhInstanceRequest, StopCbhInstanceResponse> stopCbhInstance =
        genForStopCbhInstance();

    private static HttpRequestDef<StopCbhInstanceRequest, StopCbhInstanceResponse> genForStopCbhInstance() {
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
            f -> f.withMarshaller(StopCbhInstanceRequest::getBody, StopCbhInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallCbhEipRequest, UninstallCbhEipResponse> uninstallCbhEip =
        genForUninstallCbhEip();

    private static HttpRequestDef<UninstallCbhEipRequest, UninstallCbhEipResponse> genForUninstallCbhEip() {
        // basic
        HttpRequestDef.Builder<UninstallCbhEipRequest, UninstallCbhEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UninstallCbhEipRequest.class, UninstallCbhEipResponse.class)
                .withName("UninstallCbhEip")
                .withUri("/v1/{project_id}/cbs/instance/{server_id}/eip/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("server_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallCbhEipRequest::getServerId, UninstallCbhEipRequest::setServerId));
        builder.<OperateEipRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateEipRequestBody.class),
            f -> f.withMarshaller(UninstallCbhEipRequest::getBody, UninstallCbhEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> upgradeCbhInstance =
        genForUpgradeCbhInstance();

    private static HttpRequestDef<UpgradeCbhInstanceRequest, UpgradeCbhInstanceResponse> genForUpgradeCbhInstance() {
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
            f -> f.withMarshaller(UpgradeCbhInstanceRequest::getBody, UpgradeCbhInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoginCbhRequest, LoginCbhResponse> loginCbh = genForLoginCbh();

    private static HttpRequestDef<LoginCbhRequest, LoginCbhResponse> genForLoginCbh() {
        // basic
        HttpRequestDef.Builder<LoginCbhRequest, LoginCbhResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LoginCbhRequest.class, LoginCbhResponse.class)
                .withName("LoginCbh")
                .withUri("/v1/{project_id}/cbs/instance/login")
                .withContentType("application/json");

        // requests
        builder.<LoginCbhRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoginCbhRequestBody.class),
            f -> f.withMarshaller(LoginCbhRequest::getBody, LoginCbhRequest::setBody));

        // response

        return builder.build();
    }

}

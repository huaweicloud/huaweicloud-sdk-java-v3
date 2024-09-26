package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rgc.v1.model.ControlOperateReqBody;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationResponse;

@SuppressWarnings("unchecked")
public class RgcMeta {

    public static final HttpRequestDef<DisableControlRequest, DisableControlResponse> disableControl =
        genForDisableControl();

    private static HttpRequestDef<DisableControlRequest, DisableControlResponse> genForDisableControl() {
        // basic
        HttpRequestDef.Builder<DisableControlRequest, DisableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableControlRequest.class, DisableControlResponse.class)
                .withName("DisableControl")
                .withUri("/v1/governance/controls/disable")
                .withContentType("application/json");

        // requests
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(DisableControlRequest::getBody, DisableControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableControlRequest, EnableControlResponse> enableControl =
        genForEnableControl();

    private static HttpRequestDef<EnableControlRequest, EnableControlResponse> genForEnableControl() {
        // basic
        HttpRequestDef.Builder<EnableControlRequest, EnableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableControlRequest.class, EnableControlResponse.class)
                .withName("EnableControl")
                .withUri("/v1/governance/controls/enable")
                .withContentType("application/json");

        // requests
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(EnableControlRequest::getBody, EnableControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> listControlsForOrganizationalUnit =
        genForListControlsForOrganizationalUnit();

    private static HttpRequestDef<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> genForListControlsForOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListControlsForOrganizationalUnitRequest.class,
                    ListControlsForOrganizationalUnitResponse.class)
                .withName("ListControlsForOrganizationalUnit")
                .withUri("/v1/governance/managed-organizational-units/{managed_organizational_unit_id}/controls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                ListControlsForOrganizationalUnitRequest::setManagedOrganizationalUnitId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getLimit,
                ListControlsForOrganizationalUnitRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getMarker,
                ListControlsForOrganizationalUnitRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> listEnabledControls =
        genForListEnabledControls();

    private static HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> genForListEnabledControls() {
        // basic
        HttpRequestDef.Builder<ListEnabledControlsRequest, ListEnabledControlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnabledControlsRequest.class, ListEnabledControlsResponse.class)
                .withName("ListEnabledControls")
                .withUri("/v1/governance/enabled-controls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getLimit, ListEnabledControlsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getMarker, ListEnabledControlsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> showControlOperate =
        genForShowControlOperate();

    private static HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> genForShowControlOperate() {
        // basic
        HttpRequestDef.Builder<ShowControlOperateRequest, ShowControlOperateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowControlOperateRequest.class, ShowControlOperateResponse.class)
                .withName("ShowControlOperate")
                .withUri("/v1/governance/operation-control-status/{operation_control_status_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_control_status_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlOperateRequest::getOperationControlStatusId,
                ShowControlOperateRequest::setOperationControlStatusId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccountRequest, CreateAccountResponse> createAccount =
        genForCreateAccount();

    private static HttpRequestDef<CreateAccountRequest, CreateAccountResponse> genForCreateAccount() {
        // basic
        HttpRequestDef.Builder<CreateAccountRequest, CreateAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccountRequest.class, CreateAccountResponse.class)
                .withName("CreateAccount")
                .withUri("/v1/managed-organization/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<CreateManagedAccountRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManagedAccountRequest.class),
            f -> f.withMarshaller(CreateAccountRequest::getBody, CreateAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> registerOrganizationalUnit =
        genForRegisterOrganizationalUnit();

    private static HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> genForRegisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RegisterOrganizationalUnitRequest.class,
                    RegisterOrganizationalUnitResponse.class)
                .withName("RegisterOrganizationalUnit")
                .withUri("/v1/managed-organization/organizational-units/{organizational_unit_id}/register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterOrganizationalUnitRequest::getOrganizationalUnitId,
                RegisterOrganizationalUnitRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> showManagedAccount =
        genForShowManagedAccount();

    private static HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> genForShowManagedAccount() {
        // basic
        HttpRequestDef.Builder<ShowManagedAccountRequest, ShowManagedAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowManagedAccountRequest.class, ShowManagedAccountResponse.class)
                .withName("ShowManagedAccount")
                .withUri("/v1/managed-organization/managed-accounts/{managed_account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedAccountRequest::getManagedAccountId,
                ShowManagedAccountRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOperationRequest, ShowOperationResponse> showOperation =
        genForShowOperation();

    private static HttpRequestDef<ShowOperationRequest, ShowOperationResponse> genForShowOperation() {
        // basic
        HttpRequestDef.Builder<ShowOperationRequest, ShowOperationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOperationRequest.class, ShowOperationResponse.class)
                .withName("ShowOperation")
                .withUri("/v1/managed-organization/{operation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOperationRequest::getOperationId, ShowOperationRequest::setOperationId));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchRequest;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchResponse;
import com.huaweicloud.sdk.rgc.v1.model.ControlOperateReqBody;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleComplianceRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleComplianceResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneReqBody;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneRequest;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationResponse;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountResponse;

@SuppressWarnings("unchecked")
public class RgcMeta {

    public static final HttpRequestDef<DisableControlRequest, DisableControlResponse> disableControl =
        genFordisableControl();

    private static HttpRequestDef<DisableControlRequest, DisableControlResponse> genFordisableControl() {
        // basic
        HttpRequestDef.Builder<DisableControlRequest, DisableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableControlRequest.class, DisableControlResponse.class)
                .withName("DisableControl")
                .withUri("/v1/governance/control/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableControlRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(DisableControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableControlRequest, EnableControlResponse> enableControl =
        genForenableControl();

    private static HttpRequestDef<EnableControlRequest, EnableControlResponse> genForenableControl() {
        // basic
        HttpRequestDef.Builder<EnableControlRequest, EnableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableControlRequest.class, EnableControlResponse.class)
                .withName("EnableControl")
                .withUri("/v1/governance/control/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableControlRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(EnableControlRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse> listConfigRuleCompliance =
        genForlistConfigRuleCompliance();

    private static HttpRequestDef<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse> genForlistConfigRuleCompliance() {
        // basic
        HttpRequestDef.Builder<ListConfigRuleComplianceRequest, ListConfigRuleComplianceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListConfigRuleComplianceRequest.class, ListConfigRuleComplianceResponse.class)
                .withName("ListConfigRuleCompliance")
                .withUri("/v1/governance/account/{account_id}/config-rule-compliances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigRuleComplianceRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigRuleComplianceRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlViolationsRequest, ListControlViolationsResponse> listControlViolations =
        genForlistControlViolations();

    private static HttpRequestDef<ListControlViolationsRequest, ListControlViolationsResponse> genForlistControlViolations() {
        // basic
        HttpRequestDef.Builder<ListControlViolationsRequest, ListControlViolationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListControlViolationsRequest.class, ListControlViolationsResponse.class)
            .withName("ListControlViolations")
            .withUri("/v1/governance/control-violations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlViolationsRequest::getAccountId, (req, v) -> {
                req.setAccountId(v);
            }));
        builder.<String>withRequestField("organization_unit_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlViolationsRequest::getOrganizationUnitId, (req, v) -> {
                req.setOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlViolationsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsRequest, ListControlsResponse> listControls = genForlistControls();

    private static HttpRequestDef<ListControlsRequest, ListControlsResponse> genForlistControls() {
        // basic
        HttpRequestDef.Builder<ListControlsRequest, ListControlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListControlsRequest.class, ListControlsResponse.class)
                .withName("ListControls")
                .withUri("/v1/governance/controls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForAccountRequest, ListControlsForAccountResponse> listControlsForAccount =
        genForlistControlsForAccount();

    private static HttpRequestDef<ListControlsForAccountRequest, ListControlsForAccountResponse> genForlistControlsForAccount() {
        // basic
        HttpRequestDef.Builder<ListControlsForAccountRequest, ListControlsForAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListControlsForAccountRequest.class, ListControlsForAccountResponse.class)
            .withName("ListControlsForAccount")
            .withUri("/v1/governance/managed-account/{managed_account_id}/controls")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getManagedAccountId, (req, v) -> {
                req.setManagedAccountId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> listControlsForOrganizationUnit =
        genForlistControlsForOrganizationUnit();

    private static HttpRequestDef<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> genForlistControlsForOrganizationUnit() {
        // basic
        HttpRequestDef.Builder<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListControlsForOrganizationUnitRequest.class,
                    ListControlsForOrganizationUnitResponse.class)
                .withName("ListControlsForOrganizationUnit")
                .withUri("/v1/governance/managed-organization-unit/{managed_organization_unit_id}/controls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDriftDetailsRequest, ListDriftDetailsResponse> listDriftDetails =
        genForlistDriftDetails();

    private static HttpRequestDef<ListDriftDetailsRequest, ListDriftDetailsResponse> genForlistDriftDetails() {
        // basic
        HttpRequestDef.Builder<ListDriftDetailsRequest, ListDriftDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDriftDetailsRequest.class, ListDriftDetailsResponse.class)
                .withName("ListDriftDetails")
                .withUri("/v1/governance/drift-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDriftDetailsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> listEnabledControls =
        genForlistEnabledControls();

    private static HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> genForlistEnabledControls() {
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
            f -> f.withMarshaller(ListEnabledControlsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> showComplianceStatusForAccount =
        genForshowComplianceStatusForAccount();

    private static HttpRequestDef<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> genForshowComplianceStatusForAccount() {
        // basic
        HttpRequestDef.Builder<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowComplianceStatusForAccountRequest.class,
                    ShowComplianceStatusForAccountResponse.class)
                .withName("ShowComplianceStatusForAccount")
                .withUri("/v1/governance/managed-account/{managed_account_id}/compliance-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForAccountRequest::getManagedAccountId, (req, v) -> {
                req.setManagedAccountId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse> showComplianceStatusForOrganizationUnit =
        genForshowComplianceStatusForOrganizationUnit();

    private static HttpRequestDef<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse> genForshowComplianceStatusForOrganizationUnit() {
        // basic
        HttpRequestDef.Builder<ShowComplianceStatusForOrganizationUnitRequest, ShowComplianceStatusForOrganizationUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowComplianceStatusForOrganizationUnitRequest.class,
                    ShowComplianceStatusForOrganizationUnitResponse.class)
                .withName("ShowComplianceStatusForOrganizationUnit")
                .withUri("/v1/governance/managed-organization-unit/{managed_organization_unit_id}/compliance-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForOrganizationUnitRequest::getManagedOrganizationUnitId,
                (req, v) -> {
                    req.setManagedOrganizationUnitId(v);
                }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForOrganizationUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlRequest, ShowControlResponse> showControl = genForshowControl();

    private static HttpRequestDef<ShowControlRequest, ShowControlResponse> genForshowControl() {
        // basic
        HttpRequestDef.Builder<ShowControlRequest, ShowControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowControlRequest.class, ShowControlResponse.class)
                .withName("ShowControl")
                .withUri("/v1/governance/controls/{control_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlRequest::getControlId, (req, v) -> {
                req.setControlId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> showControlOperate =
        genForshowControlOperate();

    private static HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> genForshowControlOperate() {
        // basic
        HttpRequestDef.Builder<ShowControlOperateRequest, ShowControlOperateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowControlOperateRequest.class, ShowControlOperateResponse.class)
                .withName("ShowControlOperate")
                .withUri("/v1/governance/operated-controls/{control_operate_request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_operate_request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlOperateRequest::getControlOperateRequestId, (req, v) -> {
                req.setControlOperateRequestId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlOperateRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse> showControlsForOrganizationUnit =
        genForshowControlsForOrganizationUnit();

    private static HttpRequestDef<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse> genForshowControlsForOrganizationUnit() {
        // basic
        HttpRequestDef.Builder<ShowControlsForOrganizationUnitRequest, ShowControlsForOrganizationUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowControlsForOrganizationUnitRequest.class,
                    ShowControlsForOrganizationUnitResponse.class)
                .withName("ShowControlsForOrganizationUnit")
                .withUri(
                    "/v1/governance/managed-organization-unit/{managed_organization_unit_id}/controls/{control_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForOrganizationUnitRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("control_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForOrganizationUnitRequest::getControlId, (req, v) -> {
                req.setControlId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForOrganizationUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckLaunchRequest, CheckLaunchResponse> checkLaunch = genForcheckLaunch();

    private static HttpRequestDef<CheckLaunchRequest, CheckLaunchResponse> genForcheckLaunch() {
        // basic
        HttpRequestDef.Builder<CheckLaunchRequest, CheckLaunchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckLaunchRequest.class, CheckLaunchResponse.class)
                .withName("CheckLaunch")
                .withUri("/v1/landing-zone/pre-launch-check")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckLaunchRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetupLandingZoneRequest, SetupLandingZoneResponse> setupLandingZone =
        genForsetupLandingZone();

    private static HttpRequestDef<SetupLandingZoneRequest, SetupLandingZoneResponse> genForsetupLandingZone() {
        // basic
        HttpRequestDef.Builder<SetupLandingZoneRequest, SetupLandingZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetupLandingZoneRequest.class, SetupLandingZoneResponse.class)
                .withName("SetupLandingZone")
                .withUri("/v1/landing-zone/setup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetupLandingZoneRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));
        builder.<SetupLandingZoneReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetupLandingZoneReqBody.class),
            f -> f.withMarshaller(SetupLandingZoneRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> showAvailableUpdates =
        genForshowAvailableUpdates();

    private static HttpRequestDef<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> genForshowAvailableUpdates() {
        // basic
        HttpRequestDef.Builder<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableUpdatesRequest.class, ShowAvailableUpdatesResponse.class)
            .withName("ShowAvailableUpdates")
            .withUri("/v1/landing-zone/available-updates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableUpdatesRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHomeRegionRequest, ShowHomeRegionResponse> showHomeRegion =
        genForshowHomeRegion();

    private static HttpRequestDef<ShowHomeRegionRequest, ShowHomeRegionResponse> genForshowHomeRegion() {
        // basic
        HttpRequestDef.Builder<ShowHomeRegionRequest, ShowHomeRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHomeRegionRequest.class, ShowHomeRegionResponse.class)
                .withName("ShowHomeRegion")
                .withUri("/v1/landing-zone/home-region")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHomeRegionRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> showLandingZoneConfiguration =
        genForshowLandingZoneConfiguration();

    private static HttpRequestDef<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> genForshowLandingZoneConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLandingZoneConfigurationRequest.class,
                    ShowLandingZoneConfigurationResponse.class)
                .withName("ShowLandingZoneConfiguration")
                .withUri("/v1/landing-zone/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLandingZoneConfigurationRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> showLandingZoneIdentityCenter =
        genForshowLandingZoneIdentityCenter();

    private static HttpRequestDef<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> genForshowLandingZoneIdentityCenter() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLandingZoneIdentityCenterRequest.class,
                    ShowLandingZoneIdentityCenterResponse.class)
                .withName("ShowLandingZoneIdentityCenter")
                .withUri("/v1/landing-zone/identity-center")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLandingZoneIdentityCenterRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> showLandingZoneStatus =
        genForshowLandingZoneStatus();

    private static HttpRequestDef<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> genForshowLandingZoneStatus() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLandingZoneStatusRequest.class, ShowLandingZoneStatusResponse.class)
            .withName("ShowLandingZoneStatus")
            .withUri("/v1/landing-zone/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLandingZoneStatusRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccountRequest, CreateAccountResponse> createAccount =
        genForcreateAccount();

    private static HttpRequestDef<CreateAccountRequest, CreateAccountResponse> genForcreateAccount() {
        // basic
        HttpRequestDef.Builder<CreateAccountRequest, CreateAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccountRequest.class, CreateAccountResponse.class)
                .withName("CreateAccount")
                .withUri("/v1/managed-organization/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));
        builder.<CreateManagedAccountRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManagedAccountRequest.class),
            f -> f.withMarshaller(CreateAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> deleteManagedOrganizationalUnits =
        genFordeleteManagedOrganizationalUnits();

    private static HttpRequestDef<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> genFordeleteManagedOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteManagedOrganizationalUnitsRequest.class,
                    DeleteManagedOrganizationalUnitsResponse.class)
                .withName("DeleteManagedOrganizationalUnits")
                .withUri("/v1/managed-organization/managed-organization-unit/{managed_organization_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManagedOrganizationalUnitsRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManagedOrganizationalUnitsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> deregisterOrganizationalUnit =
        genForderegisterOrganizationalUnit();

    private static HttpRequestDef<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> genForderegisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeregisterOrganizationalUnitRequest.class,
                    DeregisterOrganizationalUnitResponse.class)
                .withName("DeregisterOrganizationalUnit")
                .withUri(
                    "/v1/managed-organization/managed-organization-unit/{managed_organization_unit_id}/de-register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeregisterOrganizationalUnitRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeregisterOrganizationalUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedAccountsRequest, ListManagedAccountsResponse> listManagedAccounts =
        genForlistManagedAccounts();

    private static HttpRequestDef<ListManagedAccountsRequest, ListManagedAccountsResponse> genForlistManagedAccounts() {
        // basic
        HttpRequestDef.Builder<ListManagedAccountsRequest, ListManagedAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListManagedAccountsRequest.class, ListManagedAccountsResponse.class)
                .withName("ListManagedAccounts")
                .withUri("/v1/managed-organization/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getControlId, (req, v) -> {
                req.setControlId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> listManagedAccountsForParent =
        genForlistManagedAccountsForParent();

    private static HttpRequestDef<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> genForlistManagedAccountsForParent() {
        // basic
        HttpRequestDef.Builder<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedAccountsForParentRequest.class,
                    ListManagedAccountsForParentResponse.class)
                .withName("ListManagedAccountsForParent")
                .withUri(
                    "/v1/managed-organization/managed-organization-unit/{managed_organization_unit_id}/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> listManagedOrganizationalUnits =
        genForlistManagedOrganizationalUnits();

    private static HttpRequestDef<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> genForlistManagedOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedOrganizationalUnitsRequest.class,
                    ListManagedOrganizationalUnitsResponse.class)
                .withName("ListManagedOrganizationalUnits")
                .withUri("/v1/managed-organization/managed-organization-units")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getControlId, (req, v) -> {
                req.setControlId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> registerOrganizationalUnit =
        genForregisterOrganizationalUnit();

    private static HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> genForregisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RegisterOrganizationalUnitRequest.class,
                    RegisterOrganizationalUnitResponse.class)
                .withName("RegisterOrganizationalUnit")
                .withUri("/v1/managed-organization/organization-unit/{organization_unit_id}/register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterOrganizationalUnitRequest::getOrganizationUnitId, (req, v) -> {
                req.setOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterOrganizationalUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> showManagedAccount =
        genForshowManagedAccount();

    private static HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> genForshowManagedAccount() {
        // basic
        HttpRequestDef.Builder<ShowManagedAccountRequest, ShowManagedAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowManagedAccountRequest.class, ShowManagedAccountResponse.class)
                .withName("ShowManagedAccount")
                .withUri("/v1/managed-organization/managed-account/{managed_account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedAccountRequest::getManagedAccountId, (req, v) -> {
                req.setManagedAccountId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> showManagedCoreAccount =
        genForshowManagedCoreAccount();

    private static HttpRequestDef<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> genForshowManagedCoreAccount() {
        // basic
        HttpRequestDef.Builder<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowManagedCoreAccountRequest.class, ShowManagedCoreAccountResponse.class)
            .withName("ShowManagedCoreAccount")
            .withUri("/v1/managed-organization/managed-core-account")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedCoreAccountRequest::getAccountType, (req, v) -> {
                req.setAccountType(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedCoreAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> showManagedOrganizationalUnit =
        genForshowManagedOrganizationalUnit();

    private static HttpRequestDef<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> genForshowManagedOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowManagedOrganizationalUnitRequest.class,
                    ShowManagedOrganizationalUnitResponse.class)
                .withName("ShowManagedOrganizationalUnit")
                .withUri("/v1/managed-organization/managed-organization-unit/{managed_organization_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedOrganizationalUnitRequest::getManagedOrganizationUnitId, (req, v) -> {
                req.setManagedOrganizationUnitId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedOrganizationalUnitRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOperationRequest, ShowOperationResponse> showOperation =
        genForshowOperation();

    private static HttpRequestDef<ShowOperationRequest, ShowOperationResponse> genForshowOperation() {
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
            f -> f.withMarshaller(ShowOperationRequest::getOperationId, (req, v) -> {
                req.setOperationId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOperationRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateManagedAccountRequest, UpdateManagedAccountResponse> updateManagedAccount =
        genForupdateManagedAccount();

    private static HttpRequestDef<UpdateManagedAccountRequest, UpdateManagedAccountResponse> genForupdateManagedAccount() {
        // basic
        HttpRequestDef.Builder<UpdateManagedAccountRequest, UpdateManagedAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateManagedAccountRequest.class, UpdateManagedAccountResponse.class)
            .withName("UpdateManagedAccount")
            .withUri("/v1/managed-organization/managed-account/{managed_account_id}/update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateManagedAccountRequest::getManagedAccountId, (req, v) -> {
                req.setManagedAccountId(v);
            }));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateManagedAccountRequest::getXSecurityToken, (req, v) -> {
                req.setXSecurityToken(v);
            }));
        builder.<CreateManagedAccountRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManagedAccountRequest.class),
            f -> f.withMarshaller(UpdateManagedAccountRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
